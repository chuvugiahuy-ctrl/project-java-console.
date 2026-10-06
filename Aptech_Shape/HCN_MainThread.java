package Aptech_Shape;
import java.util.Scanner;
public class HCN_MainThread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        double number1 = scanner.nextDouble();
        System.out.println("Nhap chieu rong: ");
        double number2 = scanner.nextDouble();
        Rectangle rectangle = new Rectangle();
        double CVHCN = rectangle.ChuViHinhChuNhat(number1, number2);
        double DTHCN = rectangle.DienTichHinhChuNhat(number1, number2);
        System.out.println("Chu vi = " + CVHCN);
        System.out.println("Dien tich = " + DTHCN);
        scanner.close();
    }
}