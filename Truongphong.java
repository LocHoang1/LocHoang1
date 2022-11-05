import java.util.Scanner;
public class Truongphong extends Nhanvien {
    
    protected Double Hesotrachnhiem;
    Scanner sc = new Scanner(System.in);

    public Truongphong()
    {
        super();
        Hesotrachnhiem=(double) 0;
    }
    public Truongphong(String manv, String Hoten, Double Hesoluong, Double LuongCB, Double Hesotrachnhiem)
    {
        super(manv, Hoten, Hesoluong, LuongCB);
        this.Hesotrachnhiem=Hesotrachnhiem;
    }
    public Double getHesotrachnhiem() {
        return Hesotrachnhiem;
    }
    public void setHesotrachnhiem(Double hesotrachnhiem) {
        Hesotrachnhiem = hesotrachnhiem;
    }
    
    public void Input_TP()
    {
        super.Input();
    }
    
    public void Input_HSTN()
    {
        System.out.println("Nhap vao HSTN: ");
        Hesotrachnhiem = sc.nextDouble();
    }
    public void Output_TP()
    {
        super.Output();
        System.out.println("He so Trach Nhiem la: "+Hesotrachnhiem);
        System.out.println("Luong Truong phong: "+Tinhluong());
    }
    public Double Tinhluong()
    {
        return super.Tinhluong() + Hesotrachnhiem;
    }
    
}    
