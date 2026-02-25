class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    void display() {
        super.sound();
        sound();
    }
}
public class SuperExample {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.display();
    }
}


