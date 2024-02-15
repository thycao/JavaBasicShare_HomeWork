package thy.com.homework.JavaBasic.JavaBasic1;

public class SinhVien {
    static int iD = 123456;
    private int tuoi;
    public String diaChi;

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void diachi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void Showtuoivadiachi() {
        System.out.println("Tuoi Sinh Vien (Bien Instance): " + tuoi);
        System.out.println("Dia Chi Sinh Vien (Bien Instance): " + diaChi);
    }

    public void BienlocalSinhVien() {
        String TenSinhVien = "Hoang Thanh";
        System.out.println("Ten Sinh Vien (Bien Local): " + TenSinhVien);

    }

    public static void main(String[] args) {
        System.out.println("ID (Bien Static): " + iD);
        SinhVien tensv = new SinhVien();
        tensv.BienlocalSinhVien();
        tensv.setTuoi(22);
        tensv.diachi("Sai Gon");
        tensv.Showtuoivadiachi();
        System.out.println("                                       ");
        System.out.println("---------------------------------------");
        System.out.println("Lay Du Lieu O Class Thong Tin in ra");
        ThongTin.getinfo();

    }
}
