%
%Name: Hugo David Franco Ávila
%Date: 24 - Aug - 2018
%
%   This program implements the Secant Method
%   to find the root of a nonlinear equation
%
% INPUT:
%  -- Function(continuous)
%  -- First approximation
% 
% OUTPUT:
%  -- Approximation to the root
%  -- APRE
%  -- Number of steps
%

clc
clear all

tol = 0.005;
APRE = 100;
n = 0;

%Ask the user for the function
name = input(' Give me the function ');
fun = inline(name);

%Ask for the two starting approximations
x0 = input(' Give me an approximation to the root:  ');
x1 = input(' Give me another approximation to the root: ');

while APRE > tol && n < 50
    p1 = fun(x0);
    p2 = fun(x1);
    if p1 == 0 || p2 == 0
        disp(' You have found the root ')
        disp(x0)
        disp(x1)
        n = n + 1
        break;
    else
        x2 = x1 - (fun(x1))*(x0 - x1)/(fun(x0) - (fun(x1)));
        x0 = x1
        x1 = x2
        APRE = abs((x1 - x0)/x1)*100
        n = n + 1;
    end
end
