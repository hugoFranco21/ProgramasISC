%
% This script estimates de integral
% of a given set of points divided by
% cases
%
% Case 1: Trapezoidal method using 10 applications
%   INPUT
%        -- Lower limit
%        -- Upper limit
%        -- Number of applications
%
%   OUTPUT:
%       -- Integral (area)
%       -- Graph
%
% Case 2: Trapezoidal method using 5 applications
%   INPUT
%        -- Lower limit
%        -- Upper limit
%        -- Number of applications
%
%   OUTPUT:
%       -- Integral (area)
%       -- Graph
%
% Case 3: Simpson's 1/3 rule using 5 applications
%   INPUT
%        -- Lower limit
%        -- Upper limit
%        -- Number of applications
%
%   OUTPUT:
%       -- Integral (area)
%       -- Graph
%
% Case 4: Simpson's 1/3  using apps and Simpson's 3/8 rule using 8 apps
%   INPUT
%        -- Lower limit using simpson's 1/3
%        -- Upper limit using simpson's 1/3
%        -- Number of applications using simpson's 1/3
%        -- Lower limit using simpson's 3/8
%        -- Upper limit using simpson's 3/8
%        -- Number of applications using simpson's 3/8
%
%   OUTPUT:
%       -- Integral (area)
%       -- Graph
%
%   Hugo David Franco Ávila A01654856
%   Roberto Carlos Guzmán Cortés A01702388
%   Manuel Flores Ramírez A01703912

close all
clear all
clc
%----------Trapezoid rule 10 applications----------
a=0;
b=20;
n=10;
base = (b-a)/n;

%x = a:base:b;
x = [0 2   4 6 8 10 12 14  16  18  20];
%x = [0 4 8 12 16  20]
%y = fun(x);
y = [0 -1.8 -2 -4 -4 -6  -4  -3.6 -3.4 -2.8 0];
%y = [0 -2 -4 -4  -3.4 0]

%Area calculated using UNE application of the trapezoidal rule
%Integral = (b-a)*((fun(a)+fun(b))/2)

%Graph of the function:
figure(1);
%x1 = linspace(a,b);
x1=x;
%y1 = fun(x1);
y1=y;
plot(x1,y1)
hold on

%TRAMPA!!!
%Real = integral(fun, a, b)

I = zeros(n,1);

%Graph of the first left wall:
plot([a a],[0 y(1)], 'g')
hold on

for k= 1:n
    aveHeight = (y(k)+y(k+1))/2;
    I(k)= base * aveHeight;
    
    %Graph of each right wall:
    plot([x(k+1) x(k+1)],[0 y(k+1)],'g')
    hold on
    
    %Graph of each "roof"
    plot([x(k) x(k+1)],[y(k) y(k+1)],'g')
end

Integral = -1*sum(I);
fprintf('2a)The approximate value of the integral using 10 applications of the Trapezoid method is: %f\n',Integral);
%Error = abs((Real - Integral)/Real)*100




%----------Trapezoid rule 5 applications----------
a=0;
b=20;
n=5;
base = (b-a)/n;

%x = a:base:b;
%x = [0 2   4 6 8 10 12 14  16  18  20]
x = [0 4 8 12 16  20];
%y = fun(x);
%y = [0 -1.8 -2 -4 -4 -6  -4  -3.6 -3.4 -2.8 0]
y = [0 -2 -4 -4  -3.4 0];

%Area calculated using UNE application of the trapezoidal rule
%Integral = (b-a)*((fun(a)+fun(b))/2)

%Graph of the function:
figure(2);
%x1 = linspace(a,b);
x1=x;
%y1 = fun(x1);
y1=y;
plot(x1,y1)
hold on

%TRAMPA!!!
%Real = integral(fun, a, b)

I = zeros(n,1);

%Graph of the first left wall:
plot([a a],[0 y(1)], 'g')
hold on

for k= 1:n
    aveHeight = (y(k)+y(k+1))/2;
    I(k)= base * aveHeight;
    
    %Graph of each right wall:
    plot([x(k+1) x(k+1)],[0 y(k+1)],'g')
    hold on
    
    %Graph of each "roof"
    plot([x(k) x(k+1)],[y(k) y(k+1)],'g')
end

Integral = -1*sum(I);
fprintf('2a)The approximate value of the integral using 5 applications the of the Trapezoid method is: %f\n',Integral);
%Error = abs((Real - Integral)/Real)*100


%----------Simpson's 1/3 rule using 5 applications----------
a = 0;
b = 20;
n = 5;

h = (b-a)/(2*n);
base = 2*h;

%x = a:h:b;
x = [0  2    4  6  8  10  12  14   16   18  20];
%y = fun(x);
y = [0 -1.8 -2 -4 -4 -6  -4  -3.6 -3.4 -2.8 0];

I = zeros(n,1);

%Graph of the function:
figure(3);
%x1= linspace(a,b);
x1=x;
%y1= fun(x1);
y1 = y;
plot(x1,y1)
hold on

%Gráficar pared izquierda
plot([a a],[0 y(1)], 'g')
hold on

for k=1:n 
    %n must be n/2 due to the Array bound is exceeded
    
    aveHeight = (y(2*k-1) + 4*y(2*k) + y(2*k+1))/6;
    I(k) = base * aveHeight;
    
    %Central wall:
    plot([x(2*k) x(2*k)],[0 y(2*k)],'y--')
    %Right wall:
    plot([x(2*k+1) x(2*k+1)],[0 y(2*k+1)], 'g')
    hold on
    
    %Roof:
    DATA = [x(2*k-1) y(2*k-1); x(2*k) y(2*k); x(2*k+1) y(2*k+1)];
    x2 = linspace(DATA(1,1),DATA(3,1));
    y2 = zeros(1,100);
    for p = 1:100

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
    plot(x2, y2, 'm')
    hold on
end

%Real = integral(fun,a,b)
Integral = -1*sum(I);
fprintf('2c)The approximate value of the integral using Simpsons 1/3 rule is: %f\n',Integral);
%Error = abs((Real-Integral)/Real)*100

%---------- Simpson's 1/3 and Simpson's 3/8 rule

% This script use a combination of two methods


a = 0;
b = 20;
n = 10;
%n=5;
h = (b-a)/n;
x = a:h:b;
base=2*h;

y=[0 -1.8 -2 -4 -4 -6 -4 -3.6 -3.4 -2.8 -0];
I=zeros(5,1);


% Graph of the first left wall
figure(4);
plot([a a],[0, y(1)],'r');
hold on;


% Using multiple applications
for k=1:2
   
    aveHeight=(y(2*k-1)+4*y(2*k)+y(2*k+1))/6;
    I(k)=base*aveHeight;
    
    
    % Graph Central Wall
    plot([x(2*k) x(2*k)],[0, y(2*k)],'y--');
    hold on;
    
    % Graph Right Wall
    plot([x(2*k+1) x(2*k+1)],[0, y(2*k+1)],'r');
    hold on;
    
    %Roof
    DATA=[x(2*k-1) y(2*k-1);x(2*k) y(2*k);x(2*k+1) y(2*k+1)];
    x2 = linspace(DATA(1,1),DATA(3,1));
        y2 = zeros(1,100); % 1,100 porque tiene que tener el mismo tam que linspace que es un vector con 1 fila y 100 columnas
        for p = 1:100
            L = ones(3,1);
        
            for i=1:3 %for from 1 to m
                for j=1:3 %for from 1 to j
                    if i~=j %solo que la i sea diferente de j
                        L(i) = L(i)*((x2(p)-DATA(j,1))/(DATA(i,1)-DATA(j,1))); % j es el valor del indice j de las x e i el de las xi
                   
                    end
                end
            end
        % Calculate Li
        y2(p) = sum(L.*DATA(:,2));
        end
        plot(x2,y2,'m');
        hold on;
end

base=x(8)-x(5);
averageHeight=(y(5)+3*y(6)+3*y(7)+y(8))/8;
Integral1=base*averageHeight;

% Graph of the central walls
plot([x(6) x(6)],[0, y(6)],'y--');
hold on;
plot([x(7) x(7)],[0, y(7)],'y--');
hold on;

% Graph of the right wall
plot([x(8) x(8)],[0, y(8)],'r');
hold on;

% Graph the roof
DATA=[x(5) y(5); x(6) y(6); x(7) y(7);x(8) y(8)];
x2=linspace(DATA(1,1),DATA(4,1));
y2=zeros(1,100);       
for k=1:100
   L=ones(4,1);
   for i=1:4
       for j=1:4
           if i~=j
               L(i)=L(i)*((x2(k)-DATA(j,1))/(DATA(i,1)-DATA(j,1)));
           end
       end
   end
   y2(k)=sum(L.*DATA(:,2));
end
plot(x2,y2,'m');
hold on;

base=x(11)-x(8);
averageHeight=(y(8)+3*y(9)+3*y(10)+y(11))/8;
Integral2=base*averageHeight;

% Graph of the central walls
plot([x(9) x(9)],[0, y(9)],'y--');
hold on;
plot([x(10) x(10)],[0, y(10)],'y--');
hold on;

% Graph of the right wall
plot([x(11) x(11)],[0, y(11)],'r');
hold on;

% Graph the roof
DATA=[x(8) y(8); x(9) y(9); x(10) y(10);x(11) y(11)];
x2=linspace(DATA(1,1),DATA(4,1));
y2=zeros(1,100);       
for k=1:100
   L=ones(4,1);
   for i=1:4
       for j=1:4
           if i~=j
               L(i)=L(i)*((x2(k)-DATA(j,1))/(DATA(i,1)-DATA(j,1)));
           end
       end
   end
   y2(k)=sum(L.*DATA(:,2));
end
plot(x2,y2,'m');
hold on;

Integral=sum(I)+Integral1+Integral2;

fprintf('2f)The approximate value of the integral using Simpsons 1/3 and 3/8 rule is: %f\n',-1*Integral);