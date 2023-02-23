import java.util.Scanner;

public class io {
    public static void GPTB1(int a, int b) throws Exception {
        try {
            System.out.println("PT co nghiem: " + (-b / a));
        } catch (Exception e) {
            throw e;
        }
    }
    public static void main(String[] args) {
        try {
            int soDu, t = 123;
            while (t > 0) {
                soDu = t % 10;
                t = t / 10;
                System.out.println(soDu);
            }

            int w = 8;
            int y = 2;
            int z = w++ + ++y - 5;
            System.out.println(w + " " + y + " " + z);

            Scanner sc = new Scanner(System.in);

            System.out.print("Moi ban nhap vao mot chuoi: ");
            String chuoi = sc.nextLine();
            System.out.println(chuoi);

            String s = new Scanner(System.in).nextLine(); // nhap chuoi lien tuc co khoang trang
            System.out.println(s);
            
            System.out.println("Enter number a: ");
            int a = sc.nextInt();
            String nhiPhan = "";
            while (a > 0) {
                nhiPhan = (a % 2) + nhiPhan;
                a /= 2;
            }
            System.out.println("So nhi phan la: " + nhiPhan);
            
            GPTB1(0, 5);
        } catch (Exception e) {
            System.out.println("Co loi!");
            e.printStackTrace();
        }
        System.out.println("Cam on !");
    }
}

//? try..catch ,when run code, if have error that it will be not program to stop that run continue and error will chuyen vao catch . Exception la loi cua moi loi
//? Throw : khi sd throw thi neu co loi thi loi se duoc nem den noi no duoc goi ham . Trong ham main no goi GPTB1 cho nen loi se duoc nem vao try_catch cua ham main

// ! Luu y: su khac nhau giua static void method() va public void method()
/*
 * Static void method() la co the duoc goi khi khong tao doi tuong.
 * Public void method() la phai tao doi tuong roi moi goi duoc method nay
 */