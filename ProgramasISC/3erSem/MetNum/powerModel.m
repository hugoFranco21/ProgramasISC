%
% Regression Power Model
%
%
clear all
clc

% Original data
ORI = [1 2 3 4 5; 0.5 1.7 3.4 5.7 8.4]
figure(1)
plot(ORI(:,1), ORI(:,2),'o')
axis('equal')
hold on

DATA = ORI;
%Transform the x values
DATA(:,1) = log10(ORI(:,1));
%Transform the y values
DATA(:,2) = log10(ORI(:,2));
DATA

%Graph of the transformed data
figure(2)
plot(DATA(:,1), DATA(:,2), 'o')
hold on

[n, q] = size(DATA);

%System of normal equations
%Define the matrix of coefficients
A = [n sum(DATA(:,1)); sum(DATA(:,1)) sum(DATA(:,1).^2)]
%Define vector of constants
b = [sum(DATA(:,2));sum(DATA(:,1).*DATA(:,2))];

%Solve the system
a = A\b;

fprintf(' The linear regression model for your transfromed data is %i', a)

%Graph the line
x1 = linspace(0,1);
y1 = a(1) + a(2)*x1;
plot(x1,y1, 'r')
hold on
xlabel('log(x)')
ylabel('log(y)')
title('Linealization')

%Graph of the power model
figure(1)
x2 = linspace(0,6);
y2 = 10^a(1)*x2.^a(2);
plot(x2,y2, 'r')
hold on
xlabel('x')
ylabel('y')
title('Original data and power model')

%Quantification of the error
%Standard error of the estimate
DATA(:,3) = a(1) + a(2)*DATA(:,1);
Sr = sum((DATA(:,2) - DATA(:,3)).^2);
Syx = sqrt(Sr/(n-2));

%Coefficient of determination
St = sum((DATA(:,2) - mean(DATA(:,2))).^2)
r2 = (St - Sr)/St

%Coefficent of correlation
r = sqrt(r2)

%Percentage of uncertainty explained by the model
PUEM = r2*100







