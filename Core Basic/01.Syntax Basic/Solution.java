import java.util.Scanner;

public class Solution {
    /**
     * Giai phuong trinh bac 2: ax^2 +bx + x
     * @param a - he so a
     * @param b - he so b
     * @param c - he so c
     */
    public static void GiaiPTB2(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Phuong trinh tro thanh bac 1!");
            if (b == 0 && c == 0) {
                System.out.println("Phuong trinh vo so nghiem!");
            } else if (b == 0) {
                System.out.println("Phuong trinh vo nghiem!");
            } else {
                System.out.println("Phuong trinh co nghiem: " + (-c/b));
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem!");
            } else if (delta == 0) {
                System.out.println("Phuong trinh co nghiem kep la x1 = x2 = " + (-b/2*a));
            } else {
                double x1 = (-b - Math.sqrt(delta)) / 2 * a;
                double x2 = (-b + Math.sqrt(delta)) / 2 * a;
                System.out.println("Phuong trinh co hai nghiem phan biet la x1 =" + x1 + ", x2 = " + x2);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh bac 2!");
        try (Scanner sc = new Scanner(System.in)) {
            do{
                System.out.print("Moi ban nhap vao he so a: ");
                double a = sc.nextDouble();
                System.out.print("Moi ban nhap vao he so b: ");
                double b = sc.nextDouble();
                System.out.print("Moi ban nhap vao he so c: ");
                double c = sc.nextDouble();
                GiaiPTB2(a, b, c);
                System.out.println("Ban co muon tiep tuc khong (c/k): ");
                String line = new Scanner(System.in).nextLine();
                if (line.equalsIgnoreCase("k"))
                    break;
            } while (true);
        }
        System.out.println("Cam on ban da dung phan mem!");
    }
}
