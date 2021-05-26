import java.util.Scanner;

public class Bai9 {
    static void Triangle(){
        Scanner scan = new Scanner(System.in);
        int hight;
        do {
            System.out.print("Nhập gía trị hight: ");
            hight = scan.nextInt();
        }
        while (hight <= 0);
        System.out.println("In hình tam giác sao");
        for (int i = 1; i<= hight; i++){
            for(int space = 1; space <= hight - i; space++) {
                System.out.print("  ");
            }
            for (int j = 0; j< 2*i-1; j++){
                //rec[i][j] = "*";
                System.out.print("* ");
            }
            System.out.println("");

        }
    }

}

