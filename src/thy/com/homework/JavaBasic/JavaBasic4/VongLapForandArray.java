package thy.com.homework.JavaBasic.JavaBasic4;

public class VongLapForandArray {
    public static void main(String[] args) {
        // Cau 1, tao vong lap For in ra so chan tu 0-50
        System.out.println("-----------Cau 1, tao vong lap For in ra so chan tu 0-50------------");
        int mangluusochan[] = new int[51];
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                mangluusochan[i] = i; //tao mang de gan nhung so chan nay vao
                System.out.println(i);
            }
        }
        System.out.println("------------Duyet mang in ra ket qua sau khi gan--------------");
        for (int i = 1; i < mangluusochan.length; i++) {
            System.out.println(mangluusochan[i]);
        }
        System.out.println("------------------------END-----------------------------------");
    }
}

