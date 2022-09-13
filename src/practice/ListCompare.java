package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCompare {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
        measureTime(linkedList); // 122 милисек
        measureTime(arrayList);// 57 милисек!! быстрее
    }

    private static void measureTime (List<Integer> list){
    long start = System.currentTimeMillis();
    for (int i = 0; i<1000000; i++){
        list.add(i);
    }
    long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}