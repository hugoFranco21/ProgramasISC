%
% Team members:
%   - Hugo David Franco Avila A01654856
%   - Roberto Carlos Guzman Cortes A01702388
%   - Manuel Flores Ramirez A01703912
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

x = [0 0.12 0.22 0.32 0.36 0.40 0.44 0.54 0.64 0.7 0.8];
y = [0.2 1.309279 1.305241 1.743393 2.074903 2.456 2.842985 3.507929 3.181929 2.363 0.232];


%First set of points
    base = x(2) - x(1);
    aveHeight = (y(1)+y(2))/2;
    I = base * aveHeight;
    
    plot([x(1) x(1)], [0 y(1)], 'k')
    hold on
    
    plot([x(2) x(2)], [0 y(2)], 'k')
    hold on
    
    plot([x(1) x(2)], [y(1) y(2)], 'b')
    hold on
    
 % Second set of points

    aveHeight = (y(2) + 4*y(3) + y(4))/6;
    base = x(4) - x(2);
    I = I + base * aveHeight;
    %Central wall:
    plot([x(3) x(3)],[0 y(3)],'g')
    hold on
    
    %Right wall:
    plot([x(4) x(4)],[0 y(4)],'k')
    
    %Ceiling
    DATA = [x(2) y(2); x(3) y(3); x(4) y(4)];
    x2 = linspace(x(2),x(4));
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
    	plot(x2, y2, 'g')
        hold on

 % Third set of points
    
I = I + ((x(7)-x(4))*(y(4) + 3*y(5)+3*y(6) + y(7))/8);
    %I(k) = base * aveHeight;
    %Central wall1:
    plot([x(5) x(5)],[0 y(5)],'r')
    hold on
    
    %Central wall2:
    plot([x(6) x(6)],[0 y(6)],'r')
    hold on
    
    %Right wall:
    plot([x(7) x(7)],[0 y(7)],'k')
    
    %Ceiling
    DATA = [x(4) y(4); x(5) y(5); x(6) y(6); x(7) y(7)];
    x2 = linspace(x(4),x(7));
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
    	plot(x2, y2, 'r')
        hold on
        
% Fourth set of points
    aveHeight = (y(7) + 4*y(8) + y(9))/6;
    base = x(9) - x(7);
    I = I + base * aveHeight;
    %Central wall:
    plot([x(8) x(8)],[0 y(8)],'g')
    hold on
    
    %Right wall:
    plot([x(9) x(9)],[0 y(9)],'k')
    
    %Ceiling
    DATA = [x(7) y(7); x(8) y(8); x(9) y(9)];
    x2 = linspace(x(7),x(9));
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
    	plot(x2, y2, 'g')
        hold on

% Fifth set of points
    base = x(10) - x(9);
    aveHeight = (y(9)+y(10))/2;
    I = I + base * aveHeight;
     
    plot([x(10) x(10)], [0 y(10)], 'k')
    hold on
    
    plot([x(9) x(10)], [y(9) y(10)], 'b')
    hold on 
    
% Sixth set of points
    base = x(11) - x(10);
    aveHeight = (y(10)+y(11))/2;
    I = I + base * aveHeight
     
    plot([x(11) x(11)], [0 y(11)], 'k')
    hold on
    
    plot([x(10) x(11)], [y(10) y(11)], 'b')
    hold on 