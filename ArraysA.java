
import java.util.Arrays;
import java.util.Scanner;

class ArraysА {
    public static void main(String[] args) {
        int[] matrice = {1, 2, 3, 4, 5, 6};
        System.out.println(matrice[1] + matrice[2]);

        int[][] matrice1 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        System.out.println(matrice1[0][1]);

        String[][] s = new String[3][3];
        s[0][0] = "I";
        s[1][1] = "love";
        s[2][2] = "you!";
        System.out.print(s[0][0] + " ");
        System.out.print(s[1][1] + " ");
        System.out.println(s[2][2]);


        int[] array;  // Для веществ: ( Math.random() * (b-a) ) + a   Для целых: (int)(( Math.random() * (b - a + 1) + a)
        array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 31)); // заполнение числами от [0, 30)
            System.out.print(array[i] + " ");
        }

        double[] arrays = new double[]{1.2, 3.3, 5, 0.2, 10, 7.8};
        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays));

String[] S = new String[6];
S[0] = "Mon";
S[1] = "Tue";
S[2] = "Wed";
S[3] = "Thu";
S[4] = "Fri";
S[5] = "Weekend";
        System.out.println(S[5]);

        int count = 0;
        int [] a = {1,9,11,10,5};
                for (int i = 0; i < a.length; i++) {
            if (a[i] > 8) {
                count++;
            }
        }
        System.out.println("Количество чисел больше 8: " + count);

        System.out.print("Введите число n (размер массива): ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr [] = new int [n]; // заполнить его случайными числами от 0 до 10 (включительно) = [0,11)
        for (int r=0; r<n; r++) {

            arr[r] = ((int) (Math.random() * 11));
            System.out.print(arr[r]+ " ");
        }
        System.out.println();

        int even = 0;
        int countMoreOne = 0;
        int countMoreEight = 0;
        for (int b = 0; b < arr.length; b++) {
            if (arr[b] > 8) {
                countMoreEight++;
            }
            if (arr[b] == 1) {
                countMoreOne++;
            }
            if (arr[b] %2 == 0) {
                even++;
            }
        }
        System.out.println("Количество чисел больше 8: " + countMoreEight);
        System.out.println("Количество чисел равных 1: " + countMoreOne);
        System.out.println("Количество четных чисел: " + even);

    }
}