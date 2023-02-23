import java.util.Scanner;

public class maxDivisor {
    public static void UCLN_1(int a, int b) {
        for (int i = b; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println("\nUCLN la: " + i);
                break;
            }
        }
    }

    public static void UCLN_2(int a, int b) {
        if (a % b == 0) {
            System.out.println("UCLN = " + b);
        } else {
            for (int i = b / 2; i >= 1; i--) {
                if (b % i == 0 && a % i == 0) {
                    System.out.println("UCLN la: " + i);
                    break;
                }
            }
        }
    }

    public static void UCLN_3(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("UCLN la: " + a);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a, b;
            do {
                System.out.print("Nhap so nguyen duong a: ");
                a = sc.nextInt();
                if (a < 0) {
                    System.out.print("\nKhong hop le, moi nhap lai: ");
                }
            } while (a < 0);

            do {
                System.out.print("Nhap so nguyen duong b: ");
                b = sc.nextInt();
                if (b < 0) {
                    System.out.print("\nKhong hop le, moi nhap lai: ");
                }
            } while (b < 0);

            int Max = a > b ? a : b;
            int Min = a < b ? a : b;
            UCLN_1(Max, Min);
            UCLN_2(Max, Min);
            UCLN_3(Max, Min);
        }
    }
}