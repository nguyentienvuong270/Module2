package codegymMD2.TruuTuong;

// Khai báo lớp trừu tượng:
public abstract class Animal {
    public  String name;

    public Animal(String name){
        this.name = name;
    }

    public void makeSound(){
        System.out.println("u i a u i a");
    }

    public abstract void go();

    public  abstract String eat();


}
