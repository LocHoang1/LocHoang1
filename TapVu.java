import java.util.Scanner;

public class TapVu extends Nhanvien {
    protected Double sogiolamthem;
    Scanner sc = new Scanner(System.in);

    public TapVu()
    {
        super();
        sogiolamthem=(double) 0;
    }
    public TapVu(String manv, String Hoten, Double Hesoluong, Double LuongCB, Double sogiolamthem)
    {
        super(manv, Hoten, Hesoluong, LuongCB);
        this.sogiolamthem=sogiolamthem;
    } 
    public Double getSogiolamthem() {
        return sogiolamthem;
    }
    public void setSogiolamthem(Double sogiolamthem) {
        this.sogiolamthem = sogiolamthem;
    }
    public void Input_TapVu()
    {
        super.Input();
    }
    public void Input_SHLT()
    {
        System.out.println("Nhap vao so gioi lam them : ");
        sogiolamthem=sc.nextDouble();
    }
    public void Output_TapVu()
    {
        super.Output();
        System.out.println("So gio lam them la : "+sogiolamthem);
        System.out.println("Luong Truong phong: "+Tinhluong());
    }
    public Double Tinhluong()
    {
        return super.Tinhluong() + sogiolamthem;
    }
}