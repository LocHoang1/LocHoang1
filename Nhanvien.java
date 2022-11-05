import java.util.Scanner;

public class Nhanvien {
    protected String manv;
    protected String Hoten;
    protected Double Hesoluong;
    protected Double LuongCB;
    Scanner sc = new Scanner(System.in);

    public Nhanvien()
    {
        manv=null;
        Hoten=null;
        Hesoluong=(double) 0;
        LuongCB=(double) 0;
        
    }
    public Nhanvien(String manv, String Hoten, Double Hesoluong, Double LuongCB) 
    {
        this.manv = manv;
        this.Hoten = Hoten;
        this.Hesoluong = Hesoluong;
        this.LuongCB=LuongCB;
    }
    public String getManv() {
        return manv;
    }
    
    public void setManv(String manv) {
        this.manv = manv;
    }
    public String getHoten() {
        return Hoten;
    }
    public void setHoten(String hoten) {
        Hoten = hoten;
    }
    public Double getHesoluong() {
        return Hesoluong;
    }
    public void setHesoluong(Double hesoluong) {
        Hesoluong = hesoluong;
    }
    public Double getLuongCB() {
        return LuongCB;
    }
    public void setLuongCB(Double luongCB) {
        LuongCB = luongCB;
    }

    public void Input()
    {
        System.out.println("Nhap vao ma NV: ");
        manv =sc.nextLine();
        System.out.println("Nhap vao Ho Ten NV: ");
        Hoten= sc.nextLine();
        System.out.println("Nhap luong co ban: ");
        LuongCB  = sc.nextDouble();
        System.out.println("Nhap vao he so luong ");
        Hesoluong= sc.nextDouble();

    }
    public Double Tinhluong()
        {
             return Hesoluong*LuongCB;
        }
    
    public void Output()
    {
        System.out.println("Ma Nhan Vien: "+manv);
        System.out.println("Ho & Ten NV: "+Hoten);
        System.out.println("He so luong lam viec: "+Hesoluong);
        System.out.println("Luong cua NV: "+Tinhluong());
        
    }
    
    

    
    
}