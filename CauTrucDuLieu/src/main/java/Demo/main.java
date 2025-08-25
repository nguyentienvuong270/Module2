package Demo;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Vuong", 24);
        Student s2 = new Student(2,"Long",27);
        Student s3 = new Student(3,"Lam",21);
        Student s4 = new Student(4,"Lan",19);
        Student s5 = new Student(5,"Van",16);

        List<Student> arr = new ArrayList<>();
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);
        arr.add(s5);

        for(Student s:arr){
            System.out.println(s);
        }

        int removeIndex = -1;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).getId() == 1){
                removeIndex = i;
                break;
            }
        }
        arr.remove(removeIndex);
        System.out.println("Danh sach sau khi xoa: ");
        for (Student s:arr){
            System.out.println(s);
        }

        System.out.println("Danh sach sinh vien co ten chua chu 'a': ");
        String key = "a";
        key = key.toLowerCase();
        for (Student s:arr){
            if(s.getName().toLowerCase().contains("a")){
                System.out.println(s);
            }
        }


    }
}
