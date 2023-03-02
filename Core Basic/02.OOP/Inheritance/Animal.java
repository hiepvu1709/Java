package Inheritance;

class Dog extends Animal {
    public Dog(String name) {super("Dog");}

    @Override
    public void eat() {System.out.println("Toi an xuong!");}

    @Override
    public void makeSound() {System.out.println("Gau gau gau!");}
}

class Cat extends Animal {
    public Cat(String name) {super("Cat");}

    @Override
    public void eat() {System.out.println("Toi an ca!");}

    @Override
    public void makeSound() {System.out.println("Meo meo meo!");}
}

class Bird extends Animal {
    public Bird(String name) {super("Bird");}

    @Override
    public void eat() {System.out.println("Toi an sau!");}

    @Override
    public void makeSound() {System.out.println("liu lo!");}
}
public class Animal {
    protected String name;

    public Animal(String name) {
        super();
        this.name = name;
    }
        
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public void eat() {System.out.println("Toi dang an!");}
    public void makeSound() {System.out.println(".................");}
    public void sleep() {System.out.println("zzzzzzzzzzzzzzzz");}

    public static void main(String[] args) {
        System.out.println("- Dog -");
        Dog d = new Dog("dog");
        d.eat();
        d.makeSound();
        d.sleep();

        System.out.println("-----------");
        System.out.println("- Cat -");
        Cat c = new Cat("cat");
        c.eat();
        c.makeSound();
        c.sleep();

        System.out.println("-----------");
        System.out.println("- Bird -");
        Bird b = new Bird("bird");
        b.eat();
        b.makeSound();
        b.sleep();
    }
}
