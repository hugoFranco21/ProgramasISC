%
%
%Hugo David Franco Ávila A01654856
%Manuel Flores Ramírez A01703912
%Roberto Carlos Guzmán Cortés A01702388
%
% This script implements a linear interpoletion in order to calculate
% an estimate on a new input
%
% INPUT:
% -- Data points (2 columns matrix)
% -- New input
%
% OUTPUT:
% -- Estimation
% -- Graph
%
%
%Table 1 [12 2.48490665; 8 2.079441542; 14 2.63905733; 6 1.791759469]
%Table 2 [11 2.397895273; 8 2.079441542; 12 2.48490665; 9 2.197224577]
clear
close all
clc

% Ask for data
DATA = input('Give me the data points as a 2 column matrix ');
[m,n] = size(DATA);
if n == 2
    %Order the data
    DATA = sortrows(DATA);
    % Graph of the points
    plot(DATA(:,1),DATA(:,2), 'o')
    hold on
    % Graph of the interpolation
    plot(DATA(:,1),DATA(:,2))
    hold on
    
    x = input(' Where do you need the estimation? ');
    if(x > max(DATA(:,1)) || x < min(DATA(:,1)))
        disp(' ERROR: Sorry, we can not make an extrapolation')
        return
    else
        pos = sum(x>DATA(:,1));
        x0 = DATA(pos,1);
        y0 = DATA(pos,2);
        x1 = DATA(pos+1,1);
        y1 = DATA(pos+1,2);
        
        y = y0 +((y1-y0)/(x1-x0))*(x-x0)
        plot(x,y,'*r')
        hold on
    end
    
else
    disp('ERROR: Matrix does not have 2 columns')
    return
end
