interface Animal {
    void makeSound();
}
class Lion implements Animal {
    public void makeSound() {
        System.out.println("Lion roars");
    }
}
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog bow-bow");
    }
}
public class LiskovSubPrinciple {
    public static void main(String[] args) {
        Animal a1 = new Lion();
        Animal a2 = new Dog();
        a1.makeSound();
        a2.makeSound();
    }
}