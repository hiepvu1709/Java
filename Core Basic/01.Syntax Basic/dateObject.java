import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class dateObject {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        int yearNow = cal.get(Calendar.YEAR);
        System.out.println(yearNow);

        int month = cal.get(Calendar.MONTH);
        System.out.println(month + 1);

        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        Date t = cal.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf.format(t));

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(sdf2.format(t));

        System.out.println("\n\tMoi ban nhap nam sinh(dd/MM/yyyy): ");
        String ns = new Scanner(System.in).nextLine();
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date birthday = sdf3.parse(ns);
            // doi ngay thang nam
            cal.setTime(birthday);
            int yearNS = cal.get(Calendar.YEAR);
            
            int tuoi = yearNow - yearNS;
            System.out.println("Ban " + tuoi + " tuoi.");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

// SimpleDateFormat : dung de dinh dang cach hien thi ngay thang , chuyen chuoi qua ngay thang

// Calendar cal = Calendar.getInstance();  lay ngay thang nam hien tai

// parse : dung de truyen du lieu vao 1 phuong thuc nao do

// import java.util.*; de import toan bo cac lop trong java.util packages