import java.util.Scanner;

public class arr_3 {
    //Напишите программу, которая считывает размерность
    // (количество строк и столбцов) и элементы квадратной матрицы.
    // После чего дублирует значения верхней треугольной матрицы на
    // нижнюю треугольную матрицу (относительно главной диагонали) и выводит результат на экран.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j){
                    array[i][j] = array[j][i];
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
