%
%
% This script implements the Simpson's 1/3 rule
%
% Input:
% -- Function
% -- a
% -- b
%
% Output:
% --
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
n = input(' Number of steps: ');
h = (b-a)/(2*n);
base = 2*h;

x = a:h:b;
y = fun(x);

I = zeros(n,1);

%Graph of the function
x1 = linspace(a,b);
y1 = fun(x1);
plot(x1,y1)
hold on
% First left wall
plot([a a],[0 y(1)],'g')
hold on

for k = 1:n
    aveHeight = (y(2*k-1) + 4*y(2*k) + y(2*k+1))/6;
    I(k) = base * aveHeight;
    %Central wall:
    plot([x(2*k) x(2*k)],[0 y(2*k)],'r--')
    hold on
    
    %Right wall:
    plot([x(2*k+1) x(2*k+1)],[0 y(2*k+1)],'g')
    
    %Ceiling
    DATA = [x(2*k-1) y(2*k-1); x(2*k) y(2*k); x(2*k+1) y(2*k+1)]
    x2 = linspace(x(2*k-1),x(2*k+1));
    	y2 = zeros(1,100);
    	for p= 1:100
       	 
         	L = ones(3,1);
   	 
        	for i=1:3
            	for j=1:3
                	if i~=j
                    	L(i) = L(i)*((x2(p) - DATA(j,1))/(DATA(i,1)-DATA(j,1)));
                	end
            	end
        	end
        	y2(p) = sum(L.*DATA(:,2));
    	end
    	plot(x2, y2, 'm')
        hold on
end

Integral = sum(I)
Real = integral(fun,a,b);
APRE = abs((Real - Integral)/Real)*100