package com;

import java.io.*;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("data.csv"); // k có nhiệm vụ đọc ghi dữ liệu, chỉ đại cho file có pathname tương ứng
        // Ghi dữ liệu
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("1,Linh,18,10");
        bufferedWriter.write("\n2,Ning,17,10");
        bufferedWriter.write("\n3,Ning,17,10");
        bufferedWriter.close();


        // Đọc dữ liệu
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        while ((line = bufferedReader.readLine()) != null) { //  null != null (false)
            System.out.println(line);
        }
        bufferedReader.close();


//        int i;
//        while ((i = fileReader.read()) != -1) { // i = 72 != -1
//            System.out.print((char) i); // (char) 72 = H
//        }


//        System.out.println("File exists: " + file.exists());
//        System.out.println("Is File: " + file.isFile());
//
//        System.out.println("==========================");
//        File fileV2 = new File("data2.txt");
//        // fileV2.mkdir(); // lệnh tạo folder
//        fileV2.createNewFile();
//        System.out.println("Folder exists: " + fileV2.exists());
//        System.out.println("Is Folder: " + fileV2.isDirectory());


    }
}