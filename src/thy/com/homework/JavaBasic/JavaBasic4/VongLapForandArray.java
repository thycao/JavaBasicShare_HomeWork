package thy.com.homework.JavaBasic.JavaBasic4;

public class VongLapForandArray {
    public static void main(String[] args) {
        // Cau 1, tao vong lap For in ra so chan tu 0-50
        System.out.println("--------------Cau 1, tao vong lap For in ra so chan tu 0-50----------------");
        int sochan[] = new int[51];
        int mangluusochan[] = new int[51];
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                sochan[i] = i;
                System.out.println(sochan[i]);
                // Cau 2, Tao mang de luu nhung so chan do vao
                mangluusochan[i] = sochan[i];
            }

        }
        System.out.println("--------------In ra mang luu so chan vua tao de duyet xem ket qua----------------");
        for (int i = 0; i < mangluusochan.length; i++) {
            System.out.println(mangluusochan[i]);
        }
        System.out.println("---------------END---------------");
    }
}

