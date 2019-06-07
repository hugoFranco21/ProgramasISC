%
%
%
%   This scripts implements a linear regression
%   to fit a linear model to a set of points in
%   the plane (2D).
%
%   INPUT:
%   -- Data points
%
%   OUTPUT:
%   -- Linear model ( y = mx + b )
%   -- Graph
%   -- Prediction
%   -- Error Analysis
%

clear
clc
close all
%Ask for the data:
%DATA = input ('Give the 2-columns matrix that contains the data points: ');
DATA= [420 1000000;550 100000;625 10000;800 1000;925 100;1000 10;1100 1];
[p,q]=size(DATA);

if q==2
    %Visualization of data:  
    plot(DATA(:,1),DATA(:,2),'o')
    hold on
    %System of normal equations
    %Matrix of coeficients:
    A=[p sum(DATA(:,1)) ; sum(DATA(:,1)) sum(DATA(:,1).^2)]
    %Vector of constants
    b = [sum(DATA(:,2));sum(DATA(:,1).*DATA(:,2))]
    %Solve the system
    a=A\b
    
    fprintf(' The linear model is: Y = %f X + %f \n', a(2), a(1))
    %Graph of the model
    x = linspace(min(DATA(:,1))-1,max(DATA(:,1))+1)
    y = a(2)*x + a(1);
    plot(x,y,'r')
    hold on
    
    %Prediction
    Q = input(' Do you need a prediction? (Y/N)')
    if Q=='Y'
        xx = input( 'Gime the value where you need the prediction: ' )
        yy = a(2)*xx + a(1);
        fprintf( ' The prediction for %f is %f \n',xx,yy)
        plot(xx,yy,'*k')
    else
        disp(' Bye!!')
    end
    
    %Error analysis: 
    %Calculate the "y" given by the model:
    DATA(:,3) = a(2)*DATA(:,1) + a(1)
    %Sum of the residuals:
    Sr = sum((DATA(:,2) - DATA(:,3)).^2)
    %Estandard error of the estimate:
    Syx = sqrt(Sr/(p-2))
    %
    St = sum((DATA(:,2) - mean(DATA(:,2))).^2)
    %Coefficient of determintation
    r2 = (St - Sr)/St
    %Coefficient of correlation
    r = sqrt(r2)
    %Percentage of uncertancy explained by the model:
    PUEM = r2*100
    
    
    %POWER   MODEL
    %DATA= [420 1000000;550 100000;625 10000;800 1000;925 100;1000 10;1100 1];
    %Data ya tiene estos valores iniciales
    
    %Transformar datos
    DATAt= DATA
    [pt,qt] = size(DATAt)
    
    %Visualization of data:  
    %plot(DATAt(:,1),DATAt(:,2),'o')
    %hold on
    %Transform de x and y values
    DATAt(:,1)=log10(DATA(:,1));
    DATAt(:,2)=log10(DATA(:,2));
    %System of normal equations
    %Matrix of coeficients:
    At=[pt sum(DATAt(:,1)) ; sum(DATAt(:,1)) sum(DATAt(:,1).^2)]
    %Vector of constants
    bt = [sum(DATAt(:,2));sum(DATAt(:,1).*DATAt(:,2))]
    %Solve the system
    at=At\bt
    
    beta=at(2);
    alfa=10^at(1);
    fprintf(' The power model is: Y = %f X ^ %f \n', alfa, beta)
    %Graph of the model
    xt = linspace(min(DATA(:,1))-1,max(DATA(:,1))+1)
    yt = alfa*xt.^beta;
    plot(xt,yt,'g')
    hold on
    
    %Prediction
    Qt = input(' Do you need a prediction? (Y/N)')
    if Qt=='Y'
        xxt = input( 'Gime the value where you need the prediction: ' )
        yyt = alfa*xxt.^beta;
        fprintf( ' The prediction for %f is %f \n',xxt,yyt)
        plot(xxt,yyt,'*k')
    else
        disp(' Bye!!')
    end
    
    %Error analysis: 
    %Calculate the "y" given by the model:
    DATAt(:,3) = at(2)*DATAt(:,1) + at(1)
    %Sum of the residuals:
    Srt = sum((DATAt(:,2) - DATAt(:,3)).^2)
    %Estandard error of the estimate:
    Syxt = sqrt(Srt/(pt-2))
    %
    Stt = sum((DATAt(:,2) - mean(DATAt(:,2))).^2)
    %Coefficient of determintation
    r2t = (Stt - Srt)/Stt
    %Coefficient of correlation
    rt = sqrt(r2t)
    %Percentage of uncertancy explained by the model:
    PUEMt = r2t*100
    
else
   disp(' ERROR: the matrix does not have 2 columns.') 
   return
end
