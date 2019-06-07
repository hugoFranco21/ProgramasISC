%
%
%  NAMES:   Hugo David Franco Ávila A01654856
%           Manuel Flores Ramírez A01703912
%           Roberto Carlos Guzmán Cortés A01702388
%     
%  GROUP #1   
%  DATE: 13 - Nov - 18    
%
% This script compares the Analytical solution to Euler and 
% some Runge-Kutta methods to find the numerical solution 
% of an Ordinary Differential Equation
%
% INPUT:
% -- ODE
% -- Interval
% -- Initial condition
%
% OUTPUT:
% -- Numerical solution to the ODE using different methods
% -- Graph
%
%

close all
clear all
clc

%Declare the function we'll be using:
der = @(x,y) y*sin(x).^3;

%Define the interval in which we'll do our calculations at:     
a = 0;
b = 3;

%Set the initial conditions:  
x0 = 0;
y0 = 1;

%define the step size:
h = .5;

% "x" values:
x = a:h:b;
x = x';

%  ----------  ANALYTICAL  ----------  
% Exact Solution: 
% This one only works for the class example, 
% you must change it for your practice:
%By solving the differential equation we got the following original
%function
fun = @(x) exp(-cos(x)+((cos(x).^3)/3)+(2/3));
yReal = fun(x);
plot(x,yReal,'r')%This is the plot of the original equation
hold on

%  -----------  EULER  -----------  
yEuler = zeros(size(x));
yEuler(1)=y0;

for i= 1:  length(x)-1
    slope = der(x(i), yEuler(i));%Calculation of the slope for a two variable function
    yEuler(i+1)= yEuler(i)+ slope * h;
end
plot(x, yEuler, 'b')%Plot of the Euler method
hold on 

%  -----------   HEUN  -----------  
yHeun = zeros(size(x));
yHeun(1)=y0;

for i= 1:  length(x)-1
    slopeL = der(x(i),yHeun(i));%This slope is the same as the one given by the Euler method
    slopeR = der(x(i)+h, yHeun(i)+h*der(x(i),yHeun(i)));%This is the slope in another point of the interval
    slope = (slopeL+slopeR)/2;%The average slope
    yHeun(i+1) = yHeun(i)+ slope * h;
end
plot(x, yHeun, 'g') %Plot of the Heun method
hold on 

%  ---------- MID POINT ----------  
yMid = zeros(size(x));
yMid(1)=y0;

for i= 1:  length(x)-1
    slope = der(x(i)+ h/2, yMid(i)+h/2*der(x(i),yMid(i)));%The slope is calculated with the point in the middle of the interval
    yMid(i+1)= yMid(i)+ slope * h;
end
plot(x, yMid, 'c') %Plot of the midpoint method
hold on 

%  ----------  RALSTON  ----------  
yRalston = zeros(size(x));
yRalston(1)=y0;
%Ralston estimates the slope by using special conditions
for i= 1:  length(x)-1
    k1 = der(x(i), yRalston(i));
    k2 = der(x(i) + 3*h/4 , yRalston(i)+3*h*k1/4);
    slope = (k1 + 2*k2)/3;
    yRalston(i+1)= yRalston(i)+ slope * h;
end
plot(x, yRalston, 'k') %Plot of the Ralston method
hold on 

%  ----------  BUTCHER  ----------  
yButcher = zeros(size(x));
yButcher(1)=y0;
%Butche uses many evaluations of the integral to get a more accurate result
for i= 1:  length(x)-1
    k1 = der(x(i), yButcher(i));
    k2 = der(x(i)+0.25*h, yButcher(i)+0.25*k1*h);
    k3 = der(x(i) + 0.25 * h, yButcher(i) + 0.125 * k1 * h + 0.125 * k2 * h);
    k4 = der(x(i) + 0.5 * h, yButcher(i) - 0.5 * k2 * h + k3 * h);
    k5 = der(x(i) + 0.75 * h, yButcher(i) + 0.1875 * k1 * h + 0.5625 * k4 * h);
    a1 = -3.0 / 7.0;
    a2 = 2.0/7.0;
    a3 = 12.0/7.0;
    a4 = 8.0/7.0; 
    delta = a1*k1*h + a2*k2*h + a3*k3*h - a3*k4*h + a4*k5*h;
    k6 = der(x(i) + h, yButcher(i) + delta);
    yButcher(i+1) = yButcher(i)+(1.0/90) * (7*k1 + 32*k3 + 12*k4 + 32*k5 + 7*k6) * h;
end
plot(x, yButcher, 'm') %Plot of the Butcher method
hold on 


%Table with solutions:
T = [x yReal yEuler yHeun yMid yRalston yButcher];
disp(' ')
%Table's titles:
disp('       x       yReal    yEuler    yHeun     yMid      yRalston  yButcher')
disp(T)
disp(' ')

%For the legend box in the graph:
legend('Analytical', 'Euler', 'Heun', 'Midpoint', 'Ralston', 'Butcher','Location','North')

%Write your conclussions:
disp(' ')
disp(' WRITE YOUR DISCUSSION ABOUT THE TOPIC HERE:')
fprintf('Knowing about these kind of methods to estimate the approximate value of a given\n');
fprintf('differential equation is very useful in engineering becuase of the real life applications\n');
fprintf('of them, like estimating the values of an oscillation, etc. Also because \n');
fprintf('at times, some equations cannot be easily integrated or solved, and this methods give us a good enough approximation\n');
fprintf('We have learned that according to the grade of the function we can use an specific\n');
fprintf('method that will give us an "exact" answer, for example, if the differential equation is first grade we can use Euler’s, if it\n');
fprintf('is second grade we can use Heun’s, Ralston’s or the Midpoint method and if it is of fifth\n');
fprintf('grade or not a polynomial we can use Butcher’s method. \n');
fprintf('Finally, we have noticed that Butcher’s method is the most accurate of the seen methods, however, because\n');
fprintf('Butcher’s method is mostly focused on fifth grade or not polynomic functions, we will probably use\n');
fprintf('any of the second grade methods more often\n');