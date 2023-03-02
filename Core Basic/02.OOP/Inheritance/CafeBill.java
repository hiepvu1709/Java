package Inheritance;
import java.util.Scanner;

public class CafeBill {
    private String coffeeType;
    private double price, quantity;
    private int day, month, year;

    public CafeBill() {
        this("", 0, 0, 0, 0, 0);
    }

    public CafeBill(String name, double cost, double qty, int d, int m, int y) {
        this.coffeeType = name;
        this.price = cost;
        this.quantity = qty;
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coffee type: ");
        this.coffeeType = sc.nextLine();
        System.out.print("Enter price: ");
        this.price = sc.nextDouble();
        System.out.print("Enter quantity: ");
        this.quantity = sc.nextDouble();
        System.out.print("Enter day: ");
        this.day = sc.nextInt();
        System.out.print("Enter month: ");
        this.month = sc.nextInt();
        System.out.print("Enter year: ");
        this.year = sc.nextInt();
    }

    public double totalCost() {
        return this.price * this.quantity;
    }

    public boolean checkQTY(double qty) {
        return this.quantity > qty;
    }

    public boolean checkTotal() {
        return this.totalCost() > 500;
    }

    public int getDay() {return this.day;}
    public int getMonth() {return this.month;}
    public int getYear() {return this.year;}
    
    
    // Method of comparing two objects with each other
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final CafeBill other = (CafeBill) obj;
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price))
            return false;
        if (Double.doubleToLongBits(this.quantity) != Double.doubleToLongBits(other.quantity))
            return false;
        if (this.day != other.day)
            return false;
        if (this.month != other.month)
            return false;
        if (this.year != other.year)
            return false;
        return true;
    }

    public String toString() {
        return "\n\t\tPayment invoice information:" +
                "\n\tCoffee Type: " + this.coffeeType +
                "\n\tPrice: " + this.price +
                "\n\tQuantity: " + this.quantity +
                "\n\tDate: " + this.day + "/" + this.month + "/" + this.year;
    }

    public void print() {
        System.out.println("\n\t\tPayment invoice information: ");
        System.out.println("\tCoffee Type: " + this.coffeeType);
        System.out.println("\tPrice: " + this.price);
        System.out.println("\tQuantity: " + this.quantity);
        System.out.printf("\tDate: %d/%d/%d\n", this.day, this.month, this.year);
    }
    
    public static void main(String[] args) {
        CafeBill bill = new CafeBill();
        CafeBill bill1 = new CafeBill("Latte", 500, 1, 1, 1, 2020);
        Scanner sc = new Scanner(System.in);
        bill.inputData();
        while (true) {
            System.out.println(
                    "\n\t\tMENU" +
                            "\n\t1. Compare the two bills" +
                            "\n\t2. Print the bills" +
                            "\n\t3. Compare the quantity of the bill with another quantity" +
                            "\n\t4. Compare total amounts greater than 500" +
                            "\n\t5. Exit" +
                            "\nEnter your choice: ");
            int choose = sc.nextInt();
            if (choose == 1) {
                if (bill.equals(bill1))
                    System.out.println("Bill equals to Bill1");
                else
                    System.out.println("Bill not equals to Bill1");
            }
            if (choose == 2) {
                bill.print();
                System.out.println(bill1.toString());
            }
            if (choose == 3) {
                System.out.print("Enter quantity: ");
                double x = sc.nextDouble();
                if (bill.checkQTY(x))
                    System.out.println("Quantity greater than " + x);
                else
                    System.out.println("Quantity less than " + x);
            }
            if (choose == 4) {
                if (bill.checkTotal()) {
                    System.out.println("Total cost is greater than 500");
                } else {
                    System.out.println("Total cost is less than 500");
                }
            }
            if (choose == 5) {
                System.out.println("Thank you for using the software!");
                System.exit(0);
            }
        }
    }
}
