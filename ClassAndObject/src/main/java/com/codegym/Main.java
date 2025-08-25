package com.codegym; // bản chất sẽ là folder luôn luôn khai báo ở đầu file

public class Main {
    public static void main(String[] args) {
        /*
        // Đối tượng của class Person
        Person person = new Person("Linh", 17); // gọi đến constructor có tham số phù hợp
        Person person1 = new Person("Phú", 21);
        Person person2 = new Person();
        Person person3 = new Person("Lâm");

        // Truy xuất thuộc của đối tượng
//        System.out.println(person.name);
        System.out.println(person1.age);
        System.out.println(person2.age);

        person.study();
        person3.study();

        int yearOfBirth = person1.getYearOfBirth();
        System.out.println(yearOfBirth);
        */


        StopWatch s = new StopWatch();
        s.setStartTime();
        long a = 0;
        for (int i = 0; i < 100000000; i++) {
            a++;
            a = a - i;
        }
        s.setEndTime();
        long time = s.getElapsedTime();
        System.out.println(time);
    }
}