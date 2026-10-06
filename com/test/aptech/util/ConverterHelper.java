package com.test.aptech.util;
public class ConverterHelper {
    // Tinh Do F sang C
    public double TinhDoC(double DoF) {
        double DoC = (DoF - 32) * 5 / 9;
        return DoC;
    }
    //Tinh inch sang Met
    public double TinhInch(double Inch){
        double met = Inch * 0.0254;
        return met;
    }
    //Tinh Met sang inch
    public double TinhMet(double Met){
        double Inch = Met / 0.0254;
        return Inch;
    }
}

