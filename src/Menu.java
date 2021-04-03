import java.util.Scanner;

public class Menu {

    public static void drawRectangle(int width, int height) {
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j ++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    public static void drawSquare(int width) {

        for(int i = 0; i < width; i++){
            for(int j = 0; j < width; j ++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void drawTriangle(int width) {


        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                if (j < width - i)
                    System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void machine(){
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        machine();

        boolean key = true;
        while (key) {
            int a = scanner.nextInt();
            System.out.println("Enter your choice: ");
            switch (a) {
                case 0:
//                    System.exit(0);
                    key = false;
                    break;
                case 1 :
                    System.out.println("nhap canh tam giac vuong");
                    int width = scanner.nextInt();
                    drawTriangle(width);

                    break;

                case 2:
                    System.out.println("nhap canh hinh vuong");
                    int square = scanner.nextInt();
                    drawSquare(square);
                    break;
                case 3:
                    System.out.println("nhap chieu dai , chieu rong hinh chu nhat");
                    int dai = scanner.nextInt();
                    int rong = scanner.nextInt();
                    drawRectangle(rong,dai);
                    break;
                default:
                    System.out.println("no choice");
                    break;

            }



        }
    }
}
