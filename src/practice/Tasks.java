package practice;
import java.util.Random;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        int s = 0;
        while (s < 10) {
            System.out.print("JAVA ");
            s++;
        }


        int year = 1980;
        while (year <= 2020) {
            System.out.println("Олимпиада " + year + " года");
            year += 4;
        }
        System.out.println(" ");

        int i;
        for (i = 1980; i <= 2020; i += 4) {
            System.out.println("Олимпиада " + i + " года");
        }

        int k = 5;
        int res;
        for (i = 1; i <= 9; i++) {
            res = i * k;
            System.out.println(i + "*" + k + "=" + res);
        }

        System.out.println("Введите число: количество этажей в здании ");
        Scanner Sc = new Scanner(System.in);
        int floor = Sc.nextInt();
        if (floor>=1 && floor<=4) {
            System.out.println("Малоэтажный дом");}
            if (floor>=5 && floor<=8){
                System.out.println("Среднеэтажный дом");}
                if (floor>=9){
                    System.out.println("Высокоэтажный дом");}
            if (floor<1){
                System.out.println("Ошибка ввода");}

        System.out.print("Введите два числа: ");
        Scanner Sca = new Scanner(System.in); //Для получения из консоли двух чисел, разделенных пробелом, можно использовать метод nextInt() вызвав его дважды.
        int n1 = Sca.nextInt();
        int n2 = Sca.nextInt();
        if (n1>=n2){
            System.out.println("Некорректный ввод");}
        for (i = n1 + 1; i < n2; i++) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.println(i);
            }
        }

        System.out.print("Введите два числа: ");
        Scanner Scan = new Scanner(System.in);
        int m1 = Scan.nextInt();
        int m2 = Scan.nextInt();
        if (m1 >= m2) {
            System.out.println("Некорректный ввод");
        }
        while (m1<m2){
            m1++;
            if (m1 % 5 == 0 && m1 % 10 != 0) {
                System.out.println(m1);
              }
        }

        System.out.print("Введите число x: ");
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y;
        while (x>=5) {
            y = (x*x-10)/(x+7);
            System.out.println(y);
        break;}
            while (x>-3 && x<5) {
                y = (x+3)*(x*x-2);
                System.out.println(y);
                break;}
        while (x<=-3) {
            System.out.println(420);
            break;
        }

        System.out.print("Введите название города: ");
        Scanner scann = new Scanner(System.in);
        String city = scann.nextLine();

        switch (city){
            case  "Минск":
            case  "Витебск":
            case  "Гродно":
                System.out.println("Беларусь");
                break;
                case "Рим":
                    case "Милан":
                case "Турин":
        System.out.println("Италия");
        break;
            default:
                System.out.println("Неизвестная страна");
            case "stop":
                break;
        }


        for (i=0; i<5; i++) {
            System.out.print("Введите делимое и делитель через пробел: ");
            Scanner scanne = new Scanner(System.in);// проигнорировать часть кода (оператор continue)
            double q = scanne.nextDouble();
            double q2 = scanne.nextDouble();
            double resu = q/q2;
            if (q2==0){
                System.out.println("Деление на 0");
                continue;
            }
    System.out.println(resu);
}


        System.out.print("Введите число n (размер массива): ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr [] = new int [n]; // заполнить его случайными числами от 0 до 10 (включительно) = [0,11)
        for (int r=0; r<n; r++) {

            arr[r] = ((int) (Math.random() * 11));
            System.out.print(arr[r]+ " ");
                    }
        System.out.println();


        int count = 0;
        for (int b = 0; b < arr.length; b++) {
            if (arr[b] > 8) {
                count++;
                }
        }
            System.out.println("Количество чисел больше 8: " + count);

        int coun = 0;
        for (int b = 0; b < arr.length; b++) {
            if (arr[b] == 1) {
                coun++;
            }
        }
        System.out.println("Количество чисел равных 1: " + coun);

        int cou = 0;
        for (int b = 0; b < arr.length; b++) {
            if (arr[b] %2 ==0) {
                cou++;
            }
        }
        System.out.println("Количество четных чисел: " + cou);

        int array [] = new int [100]; //( Math.random() * (b-a) ) + a
        for (int f=0; f<array.length; f++) {
            array[f] = ((int) (Math.random() * 10001));
        }
            int numberMax = array[0];
            for (int a : array) {
                if (a > numberMax) {
                    numberMax = a;
                }
            }
            System.out.println("Наибольший элемент массива: " + numberMax);

        int arra [] = new int [10]; //( Math.random() * (b-a) ) + a
        for (int f=0; f<arra.length; f++) {
            arra[f] = ((int) (Math.random() * 101));
        }
        int numbMax = arra[0];
        for (int g = 0; g<=arra.length; g++) {
            if (g > numbMax) {
                numbMax = g;
            }
        }
        System.out.println("Наибольший элемент массива: " + numberMax);

        int[][] mas = new int[12][8];

        for (int g = 0; g < 12; g++) {
            for (int h = 0; h < 8; h++) {
                mas[g][h] = ((int) (Math.random() * 5));// тут он просто заполняется рандомно
            }
        }
                for (int g = 0; g < 12; g++) {
            for (int h = 0; h < 8; h++){

                System.out.print(mas[g][h]+" "); }
            System.out.println();
        }
                int sumMax = 0;
                int indMax = 0;
                for (int g = 0; g < 12; g++) {
                    int sum1 = 0; //нужно вывести строку массива, которая имеет наибольшую сумму
                    for (int h = 0; h < 8; h++) {
                        sum1 += mas[g][h];
                    }

                    if (sum1 > sumMax) {
                        sumMax = sum1;
                        indMax = g;
                    }
                }
            System.out.println("Максимальная сумма "+sumMax + ", Индекс строки " +indMax);


        int newArray [] = new int [10]; //( Math.random() * (b-a) ) + a
        Random random = new Random();
        for (int r = 0; r < newArray.length; r++) {
            newArray[r] = random.nextInt(100);
        }

        int Max1 = newArray[0];
        for (int r = 0; r<=newArray.length; r++) {
            if (r > Max1) {
                Max1 = r;
            }
        }

                System.out.println(Max1 +" " );
        }
    }
