package com.test.aptech.util;
public class MainThread {
public static void main(String[] args) {
    // Do C
    ConverterHelper converterHelper = new ConverterHelper();
    double result = converterHelper.TinhDoC(100);
    System.out.println("100 Do F = " + result + " Do C");
    // Inch sang Met
    double result1 = converterHelper.TinhInch(3636);
    System.out.println("3636 Inch = " + result1 + " Met");
    // Met sang Inch
    double result2 = converterHelper.TinhMet(369);
    System.out.println("369 Met = " + result2 + " Inch");
}
}
