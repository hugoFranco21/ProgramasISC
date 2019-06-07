%
% Team members:
%   - Hugo David Franco Avila A01654856
%   - Roberto Carlos Guzman Cortes A01702388
%   - Manuel Flores Ramirez A01703912
%
% This script solves exercise 1 of practice 6
%
% INPUT:
% -- Function
% -- Limits of integration
%
% OUTPUT:
% -- Integral (area)
% -- Graph
%

clear all
close all
clc

% Ask for the function

fun = @(x) sqrt(x.^3+1);

% Limits
%a = input(' Lower limit: ');
%b = input(' Upper limit: ');
%n = input(' Number of applications: ');
a = -1;
b = 2;
n1 = 1;
base = (b-a)/n1;
x = a:base:b;
y = fun(x);

%figure(1);
%x1 = linspace(a,b);
%y1 = fun(x1);
%plot(x1,y1)
%hold on

%VALOR "REAL"
Real = integral(fun,a,b);

I = zeros(n1,1);
% Graph of the first left wall
%plot([a a], [0 y(1)], 'g')
%hold on

for i = 1:n1
    aveHeight = (y(i)+y(i+1))/2;
    I(i) = base * aveHeight;
    
    %plot([x(i+1) x(i+1)], [0 y(i+1)], 'g')
    %hold on
    
    %plot([x(i) x(i+1)], [y(i) y(i+1)], 'g')
    %hold on
    
end
%Integral = (b - a)*(fun(a) + fun(b))/2
Integral1 = sum(I);

Error1 = abs((Real - Integral1)/Real)*100;

% C
n2 = 89;
base = (b-a)/89;
x = a:base:b;
y = fun(x);

figure(1);
x1 = linspace(a,b);
y1 = fun(x1);
plot(x1,y1, 'b')
hold on

I = zeros(n2,1);
% Graph of the first left wall
plot([a a], [0 y(1)], 'g')
hold on

for i = 1:n2
    aveHeight = (y(i)+y(i+1))/2;
    I(i) = base * aveHeight;
    
    plot([x(i+1) x(i+1)], [0 y(i+1)], 'r')
    hold on
    
    plot([x(i) x(i+1)], [y(i) y(i+1)], 'r')
    hold on
    
end
%Integral = (b - a)*(fun(a) + fun(b))/2
Integral2 = sum(I);

Error2 = abs((Real - Integral2)/Real)*100;

% D
n = 1;
h = (b-a)/(2*n);
base = 2*h;

x = a:h:b;
y = fun(x);

I = zeros(n,1);



for k = 1:n
    aveHeight = (y(2*k-1) + 4*y(2*k) + y(2*k+1))/6;
    I(k) = base * aveHeight;
end
Integral3 = sum(I);
Error3 = abs((Real - Integral3)/Real)*100;

%E
n3 = 26;
h = (b-a)/(2*n3);
base = 2*h;

x = a:h:b;
y = fun(x);

I = zeros(n3,1);

%Graph of the function
figure(2)
x1 = linspace(a,b);
y1 = fun(x1);
plot(x1,y1)
hold on
% First left wall
plot([a a],[0 y(1)],'g')
hold on

for k = 1:n3
    aveHeight = (y(2*k-1) + 4*y(2*k) + y(2*k+1))/6;
    I(k) = base * aveHeight;
    %Central wall:
    plot([x(2*k) x(2*k)],[0 y(2*k)],'r--')
    hold on
    
    %Right wall:
    plot([x(2*k+1) x(2*k+1)],[0 y(2*k+1)],'g')
    
    %Ceiling
    DATA = [x(2*k-1) y(2*k-1); x(2*k) y(2*k); x(2*k+1) y(2*k+1)];
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

Integral4 = sum(I);
Error4 = abs((Real - Integral4)/Real)*100;

% F
h = (b-a)/3;
Integral5 = (b-a)*((fun(a) + 3*fun(a+h)+3*fun(a+2*h) + fun(b))/8);

Error5 = abs((Real - Integral5)/Real)*100;

% G

%%%%%%%%%
% H)
%%%%
%
% I)
a = -1;
b = 2;
h3 = (b-a)/51;
base = 2*h3;
n4 = 24;
x = a:h3:(b-3*h3);
y = fun(x);

I = zeros(n4,1);

%Graph of the function
x1 = linspace(a,b);
y1 = fun(x1);
figure(3)
plot(x1,y1)
hold on
% First left wall
plot([a a],[0 y(1)],'g')
hold on

for k = 1:n4
    aveHeight = (y(2*k-1) + 4*y(2*k) + y(2*k+1))/6;
    I(k) = base * aveHeight;
    %Central wall:
    plot([x(2*k) x(2*k)],[0 y(2*k)],'r--')
    hold on
    
    %Right wall:
    plot([x(2*k+1) x(2*k+1)],[0 y(2*k+1)],'g')
    
    %Ceiling
    DATA = [x(2*k-1) y(2*k-1); x(2*k) y(2*k); x(2*k+1) y(2*k+1)];
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


af = b - 3*h3;
threeEight = (b-af)*((fun(af) + 3*fun(af+h3)+3*fun(af+2*h3) + fun(b))/8);
    %I(k) = base * aveHeight;
    % First left wall
plot([af af],[0 fun(af)],'k')
hold on
    %Central wall1:
    plot([af+h3 af+h3],[0 fun(af+h3)],'c--')
    hold on
    
    %Central wall2:
    plot([af+2*h3 af+2*h3],[0 fun(af+2*h3)],'c--')
    hold on
    
    %Right wall:
    plot([b b],[0 fun(b)],'k')
    
    %Ceiling
    DATA = [af fun(af); af+h fun(af+h3); af+2*h3 fun(af+2*h3); b fun(b)];
    x2 = linspace(af,b);
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
        
%Output
Integral6 = sum(I) + threeEight;
Error6 = abs((Real - Integral6)/Real)*100;

% Output
fprintf(' A) Integral = %0.4f\n\n', Real);
fprintf(' B) Integral = %0.4f\n APRE = %0.4f\n\n', Integral1, Error1);
fprintf(' C) Integral = %0.4f\n APRE = %0.4f\n Number of applications = %i\n Number of evaluations = %i\n\n', Integral2, Error2, n2, (n2+1));
fprintf(' D) Integral = %0.4f\n APRE = %0.4f\n\n', Integral3, Error3);
fprintf(' E) Integral = %0.4f\n APRE = %0.4f\n Number of applications = %i\n Number of evaluations = %i\n\n', Integral4, Error4, n3, (2*n3 + 1));
fprintf(' F) Integral = %0.4f\n APRE = %0.4f\n\n', Integral5, Error5);
romberg(fun,a,b,7);
fprintf(' H) Both graphs are displayed as figure 1 and figure 2\n\n');
fprintf(' I) For Simpson 1/3:\n Interval: [%0.4f,%0.4f]\n Size of subinterval: %0.4f\n Number of evaluations: %i\n\n', a,(b-3*h3),h3,(2*n4 + 1));
fprintf(' For Simpson 3/8:\n Interval: [%0.4f,%0.4f]\n Size of subinterval: %0.4f\n Number of evaluations: 3\n\n', (b-3*h3),b,h3);
fprintf(' Total evaluations: 52\n Integral = %0.4f\n APRE = %0.4f\n\n',Integral6,Error6);
fprintf(' Graph is shown as figure 3\n ');


function [Romberg,Error] = romberg(fun,a,b,n)

%disp('  Calculating the Integral using Romberg integration:')
%n = input('  Number of iterations:  ');
%fprintf('  For %d iterations of the method, up to %d trapezoids are being used.\n \n ',n,2^(n-1))

M = zeros(n,n);

%First column:
for i = 1:n
    M(i,1) = trapezoid(fun,a,b,2^(i-1));
end

%Columns 2 to last:
for j = 2:n
    for i = 1:n-(j-1)
        M(i,j) = (4^(j-1)*M(i+1,j-1) - M(i,j-1)) / (4^(j-1) - 1);
    end
end

%Integral (area) estimated with Romberg method:
Romberg = M(1,n);
pl = integral(fun,a,b);
%Error comparing Adaptative quadrature and Romberg:
Error = abs((pl - Romberg)/pl)*100;
fprintf(' G) Integral = %0.4f\n APRE = %0.4f\n', Romberg, Error);
fprintf(' For %d iterations of the method, up to %d trapezoids are being used.\n\n',n,2^(n-1));
end
function Integral = trapezoid(fun,a,b,n)


base = (b-a)/n;

x = a:base:b;
y = fun(x);

I = zeros(n,1);
for k = 1:n
    AverageHeight = (y(k) + y(k+1))/2;
    I(k) = base * AverageHeight;   
end

Integral = sum(I);
end