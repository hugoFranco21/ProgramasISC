%
% This script implements the Gauss-Seidel method to solve a system
% of linear equations.
% 
% INPUT: 
% -- Matrix of coeficients
% -- Vector of constants
% -- Tolerance (optional)
%
% Matrix of coefficients exercise 5b: [4, 3, 2; 1, 3, 1; 2, 1,3]
% Vector of constants 5b: [960;510;610]
%
% Matrix of coefficients exercise 5c: [15, -3, -1; -3, 18, -6; -4, -1, 12]
% Vector of constants 5c: [3800;1200;2350]
%
%
% OUTPUT:
% -- Solution (vector of unknowns)
% -- APRE
% -- Number of steps (iterations)
% -- Error message (when necessary)
%
% Written by:
% Hugo Franco A01654856
% Manuel Flores A01703912
% Roberto Guzmán A01702388
%
%

%Ask for the matrix:
A = input(' Give me the matrix of coefficients ')
[m , n] = size(A);
if m == n
    d = det(A);
    if d ~= 0
        %continue
        b = input(' Give me the vector of constants ')
        [p,q] = size(b);
        if(p == n && q == 1)
            %initialize
            x = zeros(n,1);
            APRE = 100*ones(n,1);
            tol = 0.005;
            old = x;
            count = 0;
            while sum(APRE >= tol) > 0 %&& count < 30
            for i = 1:n
                s = 0;
                for j = 1:n
                    if i ~= j
                        s = s + A(i,j)*x(j);
                    end
                end
                x(i) = (b(i) - s)./A(i,i)
                APRE(i) = abs((x(i) - old(i))/x(i))*100;
                old(i) = x(i);
                count = count + 1;
            end
            disp([x APRE])
            disp("Number of iterations = " + count)
            end
        else
            disp(' Error! Matrix and vector dimensions do not agree')
            return
        end
    else
        disp(' Error! The matrix is singular ')
        return
    end
        
else
    disp(' Error! The matrix is not square ' )
end
