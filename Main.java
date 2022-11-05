
import java.util.Scanner;
public class Main {
    
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
      Nhanvien a = new Truongphong();
       // a.Input();
      //  a.Output();
       // Truongphong t = (Truongphong) a;
      //  t.Input_HSTN();


        System.out.println("Nhap vao so luong NV: ");
        int n = sc.nextInt();
        Nhanvien[] array = new Nhanvien[n];
        for(int i=0; i<n; i++)
        {
            System.out.println("Chon NV can nhap: ");
            System.out.println("Truong phong: ");

            System.out.println("Tap vu: ");

            System.out.println("Nhan vien: ");
            int chon = sc.nextInt();
            switch(chon)
            {
                case 1:
                array[i] = new Truongphong();
                array[i].Input();
                
                Truongphong t = (Truongphong) array[i];
                t.Input_HSTN();
                t.Output_TP();
                break;

                case 2:
                array[i] = new TapVu();
                array[i].Input();
                array[i].Output();
                break;

                case 3:
                array[i] = new Nhanvien();
                array[i].Input();
                array[i].Output();
                break;

            }

        }
    }
    
}
