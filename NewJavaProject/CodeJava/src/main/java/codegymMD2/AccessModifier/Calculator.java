package codegymMD2.AccessModifier;

// Nạp trồng phương thức: là các phương cùng tên, khác tham số truyền vào cùng class( không liên quan kế thừa)
public class Calculator {
    int getTotal(){
        return 1;
    }

    int getTotal(int a, int b){
        return a+b;
    }

    double getTotal(double a, double b, double c){
        return a+b-c;
    }
}
