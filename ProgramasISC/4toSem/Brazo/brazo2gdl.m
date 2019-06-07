function brazo2gdl(UI,ejeI,ejeII)
joints=[ejeI,ejeII;
    0,0;
    150,150;
    0,0]

DH01=DHMatriz(joints(1,1),joints(2,1),joints(3,1),joints(4,1))
%disp(DH01); 
DH12=DHMatriz(joints(1,2),joints(2,2),joints(3,2),joints(4,2))
%disp(DH12);
DH02=DH01*DH12
%disp(DH02);
X=[0,DH01(1,4),DH02(1,4)]
Y=[0,DH01(2,4),DH02(2,4)]
%disp(X);
%print
%dis
plot(UI,X,Y,'-ok')
end

