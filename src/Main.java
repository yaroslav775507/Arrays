import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = Integer.parseInt(s.nextLine());
        int y = Integer.parseInt(s.nextLine());
        String[] b = s.nextLine().split(" ");
        int [][] arr = new int[x][y];
        int min = Integer.MAX_VALUE;
        boolean check = true;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j]=Integer.parseInt(b[i*y+j]);
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
            }
        }
        for (int i = 0; i < x; i++) {
            check = true;
            for (int j = 0; j < y; j++) {
                if(check){
                    System.out.print(arr[i][j]);
                    check = false;
                }else {
                    System.out.print(" "+ arr[i][j]);
                }
            }
            System.out.println();
        }
        System.out.print(min);

    }
}