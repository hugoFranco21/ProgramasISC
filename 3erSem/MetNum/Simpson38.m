%
%
% This script implements the Simpson's 3/8 rule
%
% Input:
% -- Function
% -- a
% -- b
%
% Output:
% -- Integral
% -- Error(compared to Adaptive Quadrature)
% -- Graph
%

close all
clear all
clc

%Ask for the function
%name = input(' Give me the function: ');
%fun = str2func(name);
%fun = @(x) 0.2+25*x-200*x.^2+675*x.^3-900*x.^4+400*x.^5
fun = @(x) sqrt(x.^3+1)
% Ask for limits
a = input(' Lower limit: ');
b = input(' Upper limit: ');

%Estimation of the integral using one application of the Simpson's rule
% Integral = (b-a)*((fun(a) + 4*fun((a+b)/2) + fun(b))/6)
%n = input(' Number of steps: ');
h = (b-a)/3;
%base = 2*h;

%x = a:h:b;
%y = fun(x);

%I = zeros(n,1);

%Graph of the function
x1 = linspace(a,b);
y1 = fun(x1);
plot(x1,y1)
hold on
% First left wall
plot([a a],[0 fun(a)],'g')
hold on

Integral = (b-a)*((fun(a) + 3*fun(a+h)+3*fun(a+2*h) + fun(b))/8)
    %I(k) = base * aveHeight;
    %Central wall1:
    plot([a+h a+h],[0 fun(a+h)],'r--')
    hold on
    
    %Central wall2:
    plot([a+2*h a+2*h],[0 fun(a+2*h)],'r--')
    hold on
    
    %Right wall:
    plot([b b],[0 fun(b)],'g')
    
    %Ceiling
    DATA = [a fun(a); a+h fun(a+h); a+2*h fun(a+2*h); b fun(b)];
    x2 = linspace(a,b);
    	y2 = zeros(1,100);
    	for p= 1:100
       	 
         	L = ones(4,1);
   	 
        	for i=1:4
            	for j=1:4
                	if i~=j
                    	L(i) = L(i)*((x2(p) - DATA(j,1))/(DATA(i,1)-DATA(j,1)));
                	end
            	end
        	end
        	y2(p) = sum(L.*DATA(:,2));
    	end
    	plot(x2, y2, 'm')
        hold on
%end

%Integral = sum(I)
Real = integral(fun,a,b);
APRE = abs((Real - Integral)/Real)*100