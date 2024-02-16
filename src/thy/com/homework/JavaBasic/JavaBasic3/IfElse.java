package thy.com.homework.JavaBasic.JavaBasic3;

import java.sql.SQLOutput;

public class IfElse {
    static int number = 100;

    public static void hamTruyenThamSo(int n) {
        if (n == number) {
            System.out.println("TH1: So truyen vao " + n + " = so co dinh " + number);
        } else if (n < number) {
            System.out.println("TH2: So truyen vao " + n + " < so co dinh " + number);
        } else {
            System.out.println("TH3: So truyen vao " + n + " > so co dinh " + number);

        }
    }

    public static void main(String[] args) {
        hamTruyenThamSo(20);
        hamTruyenThamSo(102);
        hamTruyenThamSo(100);
        hamTruyenThamSo(-1);


    }

}
