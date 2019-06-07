%
% Name: Hugo David Franco Ávila
% Date:  14 - Aug - 2018
% 
%
%This scripts implements the bisection method to find the root
%of a nonlinear equation
%
%INPUT:
%-- function(continuous)
%-- Interval: [a,b](function must have opposite signs on the extremes)
%-- tolerance
%
%OUTPUT:
%-- Approximation to the root
%-- Number of steps
%-- APRE

clc
clear all

%Tolerance:
tol = 0.005;
old = 0;
APRE = 100;

%ask for function
name = input(' Give me the function: ');
fun = inline(name);
%'((9.81*68.1)./x).*(1-exp(-(x./68.1).*10))-40'
%ask for the interval
a = input(' Give me the lower limit: ');
b = input(' Give me the upper limit: ');

%Evaluate
u = fun(a);
v = fun(b);

if u*v < 0
    n = 0;
    while APRE >= tol
        n = n+1
        x = (a+b)/2
        w = fun(x);
        APRE = abs((x-old)/x)*100
        old = x
        if w == 0
            disp(' Congrats! The root has been found!!')
            disp(x)
            return
        else
           if u*w < 0
               b = x;
               v = w;
           else
               a = x;
               u = w;
           end
        end
    end
else
   disp(' ERROR: The function does not have opposite signs on the extremes of the intervals' )
   return
end
