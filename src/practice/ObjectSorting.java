package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ObjectSorting {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("bird");
        animals.add("elephant");
        animals.add("horse");
        Collections.sort(animals,new StringLengthComparator()); //статический метод sort, который сортирует лист animals согласно естественному порядку
        System.out.println(animals);
    }
}
class StringLengthComparator implements Comparator<String> { // чтобы реализовать метод Интерфейс нам нужно реализовать метод compare

    @Override
    public int compare(String o1, String o2) {
        if(o1.length()>o2.length()){
            return 1;
        } else if(o1.length()<o2.length()){
            return -1;
        } else{
            return 0;
        }

    }
}