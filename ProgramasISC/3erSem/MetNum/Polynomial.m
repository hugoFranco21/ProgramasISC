%
% This scriñt implements a linear regressiob to fit a linear model to set
% of points in the plane
%
% INPUT: 
% -data points
% Output
% -- linear model (y = mx + b)
% -- graph
% -- Prediction
% -- error analysis
%
clc
clear
close all
% Ask for data
DATA = [5 17;10 24;15 31;20 33;25 37;30 37;35 40;40 40;45 42;50 41]; %input(' Give me the 2-col matrix that contains the data points: ');
[p,q] = size(DATA);
if q == 2
    %Visualization of data:
    plot(DATA(:,1), DATA(:,2), 'o');
    hold on
    
    
    %System of normal equations
    %Matrix of coefficients
    A = [p sum(DATA(:,1));sum(DATA(:,1)) sum(DATA(:,1).^2)]
    b = [sum(DATA(:,2)); sum((DATA(:,1).*DATA(:,2)))]
 
    %Solve system
    a = A\b
    
    fprintf(' The linear model is Y = %f x + %f \n', a(2), a(1));
    x = linspace (min(DATA(:,1)-1),max(DATA(:,1) +1));
    y = a(2)*x + a(1);
    plot(x,y, 'r');
    
%     %Prediction: 
%     Q = input('Do you need a prediction? (Y/N): ');
%     if Q == 'Y'
%        xx = input('Give me the val where you need the prediction: ');
%        yy = a(2)*xx + a(1);
%        fprintf('The prediction for %f is %f',xx,yy);
%        plot(xx,yy, '*k');
%        hold on
%     else 
%         disp('bye');
%         
%     end
%     %Error analysis
%     %Calculate y by the model
%     DATA(:,3) = a(2)*DATA(:,1) + a(1);
%     %Sum of residuals
%     Sr= sum((DATA(:,2) - DATA(:,3)).^2);
%     %Standard error of the estimate
%     Syx= sqrt(Sr/(p-2));
%     
%     %Stansard deviation
%     St= sum((DATA(:,2) - (mean(DATA(:,2)))).^2);
%     
%     %Coefficient of determination
%     r2= ((St-Sr)/St)
%     %Coefficient of correlation
%     r = sqrt(r2);
%     %perc3entage of uncertainty explained by the model
%     PUEM = r2*100
    
    %cuadratic
    A = [p sum(DATA(:,1)) sum(DATA(:,1).^2); sum(DATA(:,1)) sum(DATA(:,1).^2) sum(DATA(:,1).^3); sum(DATA(:,1).^2) sum(DATA(:,1).^3) sum(DATA(:,1).^4)]
    b = [sum(DATA(:,2)); sum(DATA(:,1).*DATA(:,2)); sum((DATA(:,1).^2).*DATA(:,2))]
    a = A\b
    fprintf('The second grade polinomial i: %f x^2 + %f x + %f \n', a(3), a(2), a(1));
    y2 = a(3)*x.^2 + a(2)*x + a(1);
    plot(x,y2,'g')
    
    %Prediction: 
    Q = input('Do you need a prediction? (Y/N): ');
    if Q == 'Y'
       xx = input('Give me the val where you need the prediction: ');
       yy = a(3)*xx.^2 + a(2)*xx + a(1);
       fprintf('The prediction for %f is %f',xx,yy);
       plot(xx,yy, '*k');
       hold on
    else 
        disp('bye');
        
    end
    
     %Error analysis
    %Calculate y by the model
    DATA(:,3) = a(3)*DATA(:,1).^2 + a(2)*DATA(:,1) + a(1);
    %Sum of residuals
    Sr= sum((DATA(:,2) - DATA(:,3)).^2);
    %Standard error of the estimate
    Syx= sqrt(Sr/(p-3));
    
    %Stansard deviation
    St= sum((DATA(:,2) - (mean(DATA(:,2)))).^2);
    
    %Coefficient of determination
    r2= ((St-Sr)/St)
    %Coefficient of correlation
    r = sqrt(r2);
    %perc3entage of uncertainty explained by the model
    PUEM = r2*100
    
    
    
else
    disp('error: Not two col matrix');
    return
end
