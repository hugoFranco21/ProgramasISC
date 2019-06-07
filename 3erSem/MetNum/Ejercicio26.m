%
% This script implements the area under the curve (integral)
% using the trapezoidal rule
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
%name = input(' Give me the function: ');
%fun = inline(name);
%fun = @(x) 0.2+25*x-200*x.^2+675*x.^3-900*x.^4+400*x.^5
%fun = @(x) sqrt(x.^3+1)

% Limits
%a = input(' Lower limit: ');
%b = input(' Upper limit: ');
%n = input(' Number of applications: ');
a = 0;
b = 20;
n = 10;
base = (b-a)/10;
x = a:base:b;
y = [-0 -1.8 -2 -4 -4 -6 -4 -3.6 -3.4 -2.8 0];


%x1 = linspace(a,b);
%y1 = fun(x1);
%plot(x1,y1)
%hold on

%VALOR "REAL"
%Real = integral(fun,a,b);

I = zeros(n,1);
% Graph of the first left wall
plot([a a], [0 y(1)], 'g')
hold on

for i = 1:n
    aveHeight = (y(i)+y(i+1))/2;
    I(i) = base * aveHeight;
    
    plot([x(i+1) x(i+1)], [0 y(i+1)], 'g')
    hold on
    
    plot([x(i) x(i+1)], [y(i) y(i+1)], 'g')
    hold on
    
end
%Integral = (b - a)*(fun(a) + fun(b))/2
Integral = abs(sum(I))

%Error = abs((Real - Integral)/Real)*100
