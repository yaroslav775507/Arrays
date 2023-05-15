import java.util.Scanner;

public class arr_2 {
    //Программа получает на вход количество данных от билетного
    // кассира, а затем в отдельных строках номер поезда, номер вагона,
    // количество пассажиров, которые поедут в соответствующем вагоне.
    // Программа должна получить номер поезда
    // и вывести сумму всех пассажиров в этом поезде или «Error»,
    // если информации по такому поезду нет.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = Integer.parseInt(s.nextLine());
        String[][] arr = new String[h][];
        int e = 0;
        for (int i = 0; i < h; i++) {
            String l = s.nextLine();
            String[] p = l.split(" ");
            arr[i]= p;
        }
        int z = Integer.parseInt(s.nextLine());
        int k =0;
        for (int i = 0; i < arr.length; i++) {
            if(Integer.parseInt(arr[i][0])==z){
                e+=Integer.parseInt(arr[i][2]);
                k++;
            }
        }
        if(k!=0){
            System.out.println(e);
        } else{
            System.out.println("Error");
        }
    }
}
