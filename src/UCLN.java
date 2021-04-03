import java.util.Scanner;

public class UCLN {
    public static int UCLN1(int a, int b){
        if(a==b)
            return a;
        else if(a > b)
            return UCLN1(a-b,b);
        else
            return UCLN1(a,b-a);
    }

    public static int UCLN2(int a, int b) {
        if(a <= 0 || b <= 0)
            return -1;
        else if(a == b)
                return a;
        while(a != b) {
            if(a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }


    public static int BCNN1(int a,int b) {

        if(a == b) return a;
        int i ;
        if(a > b)
            i = a;
        else
            i = b;
        while(i > 0) {
            if((i % a == 0) && (i % b == 0))
                return i;
            i++;
        }
        return i;
    }

    public static int BCNN2(int a, int b) {
        if(a == 0 || b == 0)
            return -1;
        return (a*b)/UCLN2(a,b);
    }

    public static void main(String[] args) {
//        System.out.println(BCNN1(3,60));
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
//        int c = BCNN2(a,b);
        System.out.println(UCLN2(a,b));
    }
}
