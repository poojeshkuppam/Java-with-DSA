interface Animal {
    void makeSound();

    default void sleep() {
        System.out.println("Zzz...");
    }
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class Abstractionusinginterface {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound(); 
        dog.sleep();     

        cat.makeSound(); 
        cat.sleep();     
    }
}