package BTH2;

import java.util.Random;

public class ArrayExample {
    public int[] createdRandom(){
        Random random=new Random();
        int[] arrInt=new int[100];
        System.out.println("Cac phan tu co trong mang la:");
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i]= random.nextInt(100);
            System.out.print("\t"+arrInt[i]);
        }
        return arrInt;
    }
}
