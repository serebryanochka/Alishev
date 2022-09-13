package practice;

import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 5; i < 20; i++){
            arrayList.add(i);
        }
        System.out.println(arrayList); //это наш динамичный массив

        System.out.print("Выводим массив: ");
       for (int i = 0; i<arrayList.size(); i++){ //1 способ Вывести на экран массив
        System.out.print(arrayList.get(i) + " ");
       }
        System.out.println();
       arrayList.remove(1); // удаляет элемент массива
        System.out.print("Выводим массив через for each: ");
       for (Integer x: arrayList){ // 2 способ вывести на экран массив
           System.out.print(x + " ");
       }
        System.out.println();
        System.out.println(arrayList.get(2)); // получить элемент массива по индексу

        System.out.println(arrayList.size()); //узнать размер массива

    }


}
