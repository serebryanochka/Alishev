import javax.sound.midi.Soundbank;

public class Recursion {
    public static void main(String[] args) {
        //System.out.println(fac(4));
        num(3, 8);
        System.out.println("------------------------------\n");
        num(10,4);
        System.out.println(doubleExpression(1, 2, 3));
    }
   /* private static int fac(int n){ // найти факториал числа
        if (n==1)
            return 1;
        return n*fac(n-1);
    }*/

    // даны два числа а b вывести их на экран в порядке возрастания

    public static void num(int a, int b) {

        if (a == b) {
            System.out.print(a+" ");
            return;
        }
        if (a < b) {        //это условие по возрастанию
            num(a, b - 1);
            System.out.print(b+" ");
        } else {
            num(a-1, b);
            System.out.print(a+" ");
        }
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return a + b == c;
    }
    }


