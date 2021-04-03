

import java.util.Scanner;

public class HienThiSoNguyen2 {

    public static void main(String[] args) {

        HienThiSoNguyen soNguyen = new HienThiSoNguyen();
        int n = 1;
        while(n < 100){
            if(soNguyen.checkSNT(n)){
                System.out.print(n +" ");
            }
            n++;
        }

    }

}
