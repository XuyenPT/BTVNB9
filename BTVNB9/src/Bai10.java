import java.util.Scanner;
public class Bai10 {
    static void Rectangle(){
        Scanner scan = new Scanner(System.in);
        int hight, weight;
        do {
            System.out.print("Nhập gía trị hight: ");
            hight = scan.nextInt();
        }
        while (hight <= 0);
        do {
            System.out.print("Nhập giá trị weight: ");
            weight = scan.nextInt();
        }
        while (weight <= 0);
        //String [][]rec = new String[hight][weight];
        System.out.println("In hình chữ nhật sao");
        for (int i = 0; i< hight; i++){
            for (int j = 0; j< weight; j++){
                //rec[i][j] = "*";
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

}
