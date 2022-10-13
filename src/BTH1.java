import java.util.Scanner;

public class BTH1 {
    public static void main(String[] args) {
        System.out.println("**************TINH THUONG CUA HAI SO***********");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao gia tri cua so bi chia");
        int soBiChia=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao gia tri cua so chia:");
        int soChia=Integer.parseInt(scanner.nextLine());
        int thuong=soBiChia/soChia;
        System.out.println("Thuong la: "+thuong);
    }
}
