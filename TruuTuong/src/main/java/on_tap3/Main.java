package on_tap3;

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        System.out.println(a.makeSound());
        a = new Cat();
        System.out.println(a.makeSound());
    }
}
