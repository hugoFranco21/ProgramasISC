%
%
%   This script implements a linear regression to fit a linear model to
%   a set of points in the plane(2D).
%
%   INPUT:
% -- Data Points
% 
%
%
%
%   OUTPUT:
% -- Linear Model (y = mx + b)
% -- Graph
% -- Pediction
% -- Error Analysis
%
clc
clear all
close all
% Ask for data
DATA = [0.75, 0.8;2,1.3;2.5,1.2;4,1.6;6,1.7;8,1.8;8.5,1.7]%input('Give the 2-columns matrix that contains the data points: ');
[p, q] = size(DATA);
if q == 2
    % Visualization of the data
    figure(1)
    plot(DATA(:,1), DATA(:,2), 'o')
    hold on
    % System of normal equations
    % Matrix of coefficients
    A = [p sum(DATA(:,1));sum(DATA(:,1)) sum(DATA(:,1).^2)];
    % Vector of constants
    b = [sum(DATA(:,2)); sum(DATA(:,1).*DATA(:,2))];
    % Solve the system
    a = A\b;
    
    fprintf('The linear model is: Y = %fX + %f \n', a(2), a(1))
    % Graph of the model
    x = linspace(min(DATA(:,1)) - 1, max(DATA(:,1)) + 1);
    y = a(2)*x + a(1);
    plot(x,y, 'r')
    axis([min(x) max(x) 0.7 max(y)])
    hold on
    
    % Prediction:
    %Q = input('Do you need a prediction? (Y/N)');
    %if Q == 'Y'
     %   xx = input('Give me the value where you need the prediction : ')
      %  yy = a(2)*xx + a(1);
       % fprintf('The prediction for %f is %f \n', xx, yy)
        %plot(xx, yy, '*k')        
    %else
        %disp('BYE')
    %end
    
    % Error analysis
    % Calculate the "y" given by the model:
    DATA(:,3) = a(2)*(DATA(:,1)) + a(1)
    % Sum of the residuals
    Sr = sum((DATA(:,2)-DATA(:,3)).^2);
    % Standard error of the estimate
    Syx = sqrt(Sr/(p-2))
    
    St = sum((DATA(:,2) - mean(DATA(:,2))).^2);
    % Coefficient of determination
    r2 = (St - Sr)/St;
    % Coefficient of correlation
    r = sqrt(r2)
    PUEM = r2*100
    
    %Fitting a population growth model
    T = 1./DATA
    figure(2)
    plot(DATA(:,1), DATA(:,2), 'o')
    hold on
    % System of normal equations
    % Matrix of coefficients
    At = [p sum(T(:,1));sum(T(:,1)) sum(T(:,1).^2)]
    % Vector of constants
    bt = [sum(T(:,2)); sum(T(:,1).*T(:,2))]
    % Solve the system
    at = At\bt
    alfa = 1/at(1)
    beta = alfa*at(2)
    
    fprintf('The population growth model is: Y = %f(x/(%f +x)) \n', alfa, beta)
    % Graph of the model
    x_t = linspace(min(DATA(:,1)) - 1, max(DATA(:,1)) + 1);
    y_t = alfa*(x./(beta + x));
    plot(x_t,y_t, 'r')
    axis([min(x_t) max(x_t) min(y_t) max(y_t)])
    hold on
    xx = 3.5;
    yy = alfa*(xx/(beta + xx));
    fprintf('The prediction for %f is %f \n', xx, yy)
    plot(xx, yy, '*k')
    % Error analysis
    % Calculate the "y" given by the model:
    T(:,3) = alfa.*(DATA(:,1)./(beta + DATA(:,1)))
    % Sum of the residuals
    Sr_t = sum((DATA(:,2)-T(:,3)).^2);
    % Standard error of the estimate
    Syx_t = sqrt(Sr_t/(p-2))
    
    St_t = sum((DATA(:,2) - mean(DATA(:,2))).^2);
    % Coefficient of determination
    r2_t = (St_t - Sr_t)/St_t;
    % Coefficient of correlation
    r_t = sqrt(r2_t)
    PUEM_t = r2_t*100
    
else
    disp('ERROR: The matrix does not have two columns.')
    return
end
    
    
    