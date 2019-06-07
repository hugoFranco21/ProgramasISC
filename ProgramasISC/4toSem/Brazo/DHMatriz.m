function [DH] = DHMatriz(anz,anx,a,d)
    DH=[cosd(anz),-sind(anz)*cosd(anx),sind(anz)*sind(anx),a*cosd(anz);
        sind(anz),cosd(anz)*cosd(anx),-sind(anz)*cosd(anx),a*sind(anz);
        0,sind(anx),1,d;
        0,0,0,1];
end

