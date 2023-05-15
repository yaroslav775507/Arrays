import java.util.Scanner;

public class arr_4 {
    public static void main(String[] args) {
        //Напишите программу, которая считывает элементы квадратной матрицы и вычисляет ее определитель.
        Scanner in = new Scanner(System.in);
        int[][] array = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = in.nextInt();
            }
        }
        System.out.print((array[0][0] * array[1][1]) - (array[0][1] * array[1][0]));
    }
}


