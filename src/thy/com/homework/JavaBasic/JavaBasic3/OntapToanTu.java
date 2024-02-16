package thy.com.homework.JavaBasic.JavaBasic3;

public class OntapToanTu {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        System.out.println("Phep chia du b="+b+" cho a= "+a+ " voi so du= "+b%a);
        System.out.println("Phep Cong a+b= "+(a+b));
        System.out.println("Phep Tru b-a= "+(b - a));
        System.out.println("Phep Nhan b*a= "+(b*a));
        System.out.println("Phep Chia b/a= "+(b/a));

        if(a==c){
            System.out.println("a=c= "+a);
        }
        System.out.println("a<>c: a khac c");

        if(a==b&&b==c){
            System.out.println("Neu a=b va b=c, thi a=c= "+a);
        }
        System.out.println("a khac b khac c");
    }
}
