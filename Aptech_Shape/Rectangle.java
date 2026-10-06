package Aptech_Shape;

import org.w3c.dom.css.Rect;

public class Rectangle {
    // Chu vi
    public double ChuViHinhChuNhat(double chieudai, double chieurong) {
        double CVHCN = (chieudai + chieurong) * 2;
        return CVHCN;
    }
    // Dien tich
    public double DienTichHinhChuNhat(double chieudai, double chieurong) {
        double DTHCN = chieudai * chieurong;
        return DTHCN;
    }
   
}