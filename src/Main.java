import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random rand = new Random();

        ////Задача 1
        System.out.println("Задача 1");

        int[] mas = new int[]{1, 2, 3}; ////массив  целочиссленый

        double[] mas2 = new double[]{2.34, 5.4, 86.5, 165.9}; ////масив дробный

        int[] mas3 = new int[6]; //// масив для рандомного заполнения


        //// Задача 2
        System.out.println();
        System.out.println("Задача 2");

        for (int i = 0; i < mas.length; i++) { ////Вывод первого массива
            System.out.print(mas[i]);
            if (i != mas.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < mas2.length; i++) { ///вывод второго массива
            System.out.print(mas2[i]);
            if (i != mas2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < mas3.length; i++){ //// вывод трентьего массива
            mas3[i] = rand.nextInt(30);
            System.out.print(mas3[i]);
            if(i != mas3.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();

        //// Задача 3
        System.out.println();
        System.out.println("Задача 3");
        System.out.print("Первый масиив в обратном порядке: ");

        for(int i = mas.length - 1; i >= 0; i--){
            System.out.print(mas[i]);
            if(i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.print("Второй массив в обратном порядке: ");
        for(int i = mas2.length - 1; i >= 0; i--){
            System.out.print(mas2[i]);
            if(i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.print("Третий массив в обратном порядке: ");
        for(int i = mas3.length - 1; i >= 0; i--){
            System.out.print(mas3[i]);
            if(i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();

        /////Задача 4
        System.out.println();
        System.out.println("Задача 4");

        for(int i = 0; i < mas.length; i++){  /// все не четный заполняем четными
            if(mas[i] % 2 != 0){
                mas[i]++;
            }
        }
        System.out.println(Arrays.toString(mas));

    }
}