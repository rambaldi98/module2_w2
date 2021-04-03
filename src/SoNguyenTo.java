import java.util.Scanner;

public class SoNguyenTo {
    public static boolean checkSNT(int n) {
        if(n <= 1) return false;
        if(n <= 3) return true;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(checkSNT(num)) {
            System.out.println(num + " la so nguyen to");
        } else {
            System.out.println(num + " khong la so nguyen to");
        }
    }

}
