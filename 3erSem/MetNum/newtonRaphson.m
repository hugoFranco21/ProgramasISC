%
%Name: Hugo David Franco Ávila
%Date: 21 - Aug - 2018
%
%   This program implements the Newton-Raphson's Method
%   to find the root of a nonlinear equation
%
% INPUT:
%  -- Function(derivable)
%  -- Derivative of the function
%  -- First approximation
% 
% OUTPUT:
%  -- Approximation to the root
%  -- APRE
%  -- Number of steps
%

clc
clear all

%Ask the user for the function
name = input(' Give me the (derivable) function ');
fun = inline(name);
%Ask for the derivative
name2 = input(' Give me the derivative ');
der = inline(name2);
%Ask for the first approximation
x0 = input(' Give me the first approximation to the root:  ');

tol = 10e-6;
APRE = 100;
n = 0;

while APRE>=tol 
    %Evaluate
    fx = fun(x0)
    dx = der(x0);

    if dx == 0
        disp(' ERROR: A flat point has been reached ')
        return
    else
        %pause
        n = n+1
        xnew = x0 -fx/dx
        APRE = abs((xnew-x0)/xnew)*100
        x0 = xnew;
        fx
    end
end

