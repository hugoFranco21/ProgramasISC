%
%Hugo David Franco Ávila A01654856
%Manuel Flores Ramírez A01703912
%Roberto Carlos Guzmán Cortés A01702388%
%
% This scrpit implements Lagrage's interpolating polynomial
% in order to calculate an estimation ("y") given a new "x" value.
%
% INPUT:
% -- Data points as 2-column matrix
% -- Value where the estimation is needed
%
% OUTPUT:
% -- Estimation
% -- Graph
%
%Matrix data [1 800;3 2310; 5 3090; 7 3940; 13 4755]
close all
clc

% Ask for data
DATA = input( 'Gime the 2-column matrix with the data points: ' )
[m,n]= size(DATA);

if n==2
	plot (DATA(:,1), DATA(:,2), 'o')
	hold on
	x = input( 'Gime the value where you need the estimation: ' );
	if(x>min(DATA(:,1)) && x<max(DATA(:,1)))
    	L = ones(m,1);
   	 
    	for i=1:m
        	for j=1:m
            	if i~=j
                	L(i) = L(i)*((x- DATA(j,1))/(DATA(i,1)-DATA(j,1)));
            	end
        	end
    	end
   	 
    	y = sum(L.*DATA(:,2))
    	plot(x,y, '*r')
    	hold on
   	 
    	x1 = linspace(min(DATA(:,1)), max(DATA(:,1)));
    	y1 = zeros(1,100);
    	for k= 1:100
       	 
         	L = ones(m,1);
   	 
        	for i=1:m
            	for j=1:m
                	if i~=j
                    	L(i) = L(i)*((x1(k) - DATA(j,1))/(DATA(i,1)-DATA(j,1)));
                	end
            	end
        	end
        	y1(k) = sum(L.*DATA(:,2));
    	end
    	plot(x1, y1, 'g')
        hold on
   	 
	else
    	disp(' Error: value out of range, we can not make an extrapolation' )
    	return
	end
else
	disp(' The matrix does not have 2 columns. ')
	return  
end


