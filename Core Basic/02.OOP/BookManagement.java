import java.util.Scanner;

class date {
    private int day, month, year;

    public date() {this(0, 0, 0);}

    public date(int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public int getDay() {return day;}
    public int getMonth() {return month;}
    public int getYear() {return year;}
    public void setDay(int d) {this.day = d;}
    public void setMonth(int m) {this.month = m;}
    public void setYear(int y) {this.year = y;}
    
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter day: ");
        this.day = sc.nextInt();
        System.out.print("\nEnter month: ");
        this.month = sc.nextInt();
        System.out.print("\nEnter year: ");
        this.year = sc.nextInt();
    }
}

class author {
    private String name;
    private date dateOfBirth;

    public author() {this("", new date());}

    public author(String name, date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {return name;}
    public date getDateOfBirth() {return dateOfBirth;}
    public void setName(String name) {this.name = name;}
    public void setDateOfBirth(date dateOfBirth) {this.dateOfBirth = dateOfBirth;}
    
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter name: ");
        this.name = sc.nextLine();
        System.out.print("\nEnter date of birth: ");
        this.dateOfBirth.inputData();;
    }
}

public class BookManagement {
    private String name;
    private author author;
    private date dateOfPublish;
    private double price;

    public BookManagement() {this("", new author(), new date(), 0);}

    public BookManagement(String name, author author, date dateOfPublish, double price) {
        this.name = name;
        this.author = author;
        this.dateOfPublish = dateOfPublish;
        this.price = price;
    }

    public String getName() {return name;}
    public author getAuthor() {return author;}
    public date getDateOfPublish() {return dateOfPublish;}
    public double getPrice() {return price;}
    
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter book name: ");
        this.name = sc.nextLine();
        System.out.print("\n- Author information -");
        this.author.inputData();
        System.out.print("\nEnter date of publish: ");
        this.dateOfPublish.inputData();
        System.out.print("Enter price: ");
        this.price = sc.nextDouble();
    }

    public String toString() {
        return "\nBook name: " + this.name +
                "\nAuthor name: " + this.author.getName() +
                "\nDate of publish: " + this.dateOfPublish.getDay() + "/" + this.dateOfPublish.getMonth() + "/"
                + this.dateOfPublish.getYear() +
                "\nPrice: " + this.price;
    }
    
    public boolean checkYearPublish(BookManagement otherBook) {
        return this.dateOfPublish.getYear() == otherBook.dateOfPublish.getYear();
    }

    public double afterDiscount(double x) {
        return this.price - (this.price * x / 100);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of books: ");
        int n = sc.nextInt();

        BookManagement book1[] = new BookManagement[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n- Book " + (i + 1) + " -");
            book1[i] = new BookManagement();
            book1[i].inputData();
        }

        for (BookManagement book : book1) {
            System.out.println(book.toString());
        }
        
        System.out.println("\n\t- Check the year of publication of the first and last book on the list -");
        if(book1[0].checkYearPublish(book1[n - 1]))
            System.out.println("\nThe year of publication of the first book is the same as the year of publication of the last book.");
        else
            System.out.println("\nThe year of publication of the first book is not the same as the year of publication of the last book.");
        
        System.out.print("How much do you want the book to discount: ");
        double x = sc.nextDouble();

        for (int i = 0; i < n; i++) {
            System.out.println("\nBook " + (i + 1) + " after discount : " + book1[i].afterDiscount(x));
        }
    }
}
