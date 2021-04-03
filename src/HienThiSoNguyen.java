public class HienThiSoNguyen {
    public static boolean checkSNT(int n) {
        if(n <= 1)
            return false;
        if(n <= 3)
            return true;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static void hienThi(int n){

        if(n <= 0)
            System.out.println("-1");
        else {
            int i = 0;
            int j = 1;
            while(i < n){
                if(checkSNT(j)) {
                    System.out.print(j + " ");
                    i++;
                }
                j++;
            }
        }
    }

    public static void main(String[] args) {
        hienThi(1);
    }
}
