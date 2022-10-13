package BTH2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        int[] arrInt=arrExample.createdRandom();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ban muon tim phan tu thu bao nhieu");
        int choice=0;
        System.out.println("Ban muon tim gia tri cua chi so :");
        try {
            choice=Integer.parseInt(scanner.nextLine());
            System.out.printf("Gia tri cua chi so thu %d ban can tim la %d",choice,arrInt[choice]);
        }catch (IndexOutOfBoundsException exception){
            System.err.println("Vui long chi nhap tu 0-99!");
        }
    }
}
