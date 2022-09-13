package practice;

public class Lesson23 {
    public static void main(String[] args) {
        String x = "hello";
        // x.toUpperCase(Locale.ROOT); так не сработает
        x = x.toUpperCase();
        System.out.println(x);

        System.out.printf("This is a string ,%s \n", "NICE"); //%d - ожидает цифру,%f -число с плав.точкой, %10d - выводит число 10 символов в длину

        System.out.printf("String %10d \n",343);
        System.out.printf("String %10d \n",34);
        System.out.printf("String %10d \n",76868678);
        System.out.printf("String %10d \n",356780000);
        System.out.printf("String %2f \n",45.67800); // 2 цифры после запятой +округление
    }
}