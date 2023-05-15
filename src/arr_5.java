import java.util.Scanner;

public class arr_5 {
    public class Nextt {
        //Напишите программу, которая считывает размерность
        // (количество строк и столбцов) и элементы квадратной матрицы
        // и вычисляет ее определитель.

        //Функция для нахождения определителя второго порядка
        public static int det2(int[][] a) {
            return (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
        }

        //Функция для выделения минора
        public static int[][] getMinor(int size, int[][] a, int cc) {
            int[][] b = new int[size - 1][size - 1];
            // 12 13 14
            int i = cc / 10 - 1;
            int j = cc % 10 - 1;

            // 0 1
            for (int k = 0; k < size; k++) {
                for (int l = 0; l < size; l++) {

                    if ((k > i) && (l < j)) {         // +
                        b[k - 1][l] = a[k][l];
                    }
                    if ((k > i) && (l > j)) {  //+++
                        b[k - 1][l - 1] = a[k][l];
                    }
                }
            }
            return b;
        }

        //Рекурсивная функция поиска определителя
        public static int detA(int row, int[][] a) {
            int det = 0;
            if (row == 2) {
                return det2(a);
            }
            for (int i = 0; i < row; i++) {
                det = det + (((int) Math.pow(-1, i)) * a[0][i] * detA(row - 1, getMinor(row, a, 10 + i + 1)));
            }
            return det;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = Integer.parseInt(in.nextLine());
            int[][] a = new int[n][];
            for (int i = 0; i < n; i++) {
                String[] fill = in.nextLine().split(" ");
                a[i] = new int[n];
                for (int j = 0; j < n; j++) {
                    a[i][j] = Integer.parseInt(fill[j]);
                }
            }

            System.out.println(detA(n, a));
        }
    }
}

