package codegymMD2;

public class LTHDT {
        public static void main(String[] args) {
            Person person = new Person("Kai", 17);
            // đối tương của person
            System.out.println(person.name);
            System.out.println(person.age);

            person.study();

            int YoB = person.getYoB();
            System.out.println(YoB);
        }
    }

