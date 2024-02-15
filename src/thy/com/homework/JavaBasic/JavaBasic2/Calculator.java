package thy.com.homework.JavaBasic.JavaBasic2;

public class Calculator {
//    public int songuyen1;
//    public int songuyen2;
//    public float sothuc1;
//   public float sothuc2:

    public static int tong2songuyen(int int1, int int2){
        return int1+int2;
    }
    public static float tong2sothuc(float float1,float float2){
        return float1+float2;
    }

    public static void main(String[] args) {
        System.out.println("Tong hai so nguyen la: "+tong2songuyen(3,4));
        System.out.println("Tong hai so thuc la: "+tong2sothuc(3.3F,4.4F));
    }
}
