package practice;

import java.util.Arrays;

public class MyLinkedList {
    private Node head; // допустим у нас есть такой список [1]-> [2]-> [3]   head ссылается на [1]
    private int size;
    public void add(int value) {
        //если это первое добавление
        if (head == null) {
            this.head = new Node(value);
        } else {
            Node temp = head; //создраем объект класса Node кот тоже ссылается на [1]
            while (temp.getNext()!= null){ //проходим по всему списку пока temp не станет на последнем месте
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
        }
        size++;
    }

    public String toString(){
        int [] result = new int[size];
        int idx = 0;
        Node temp = head;
        while (temp !=null){
            result[idx++] = temp.getValue();
            temp = temp.getNext();
        }
        return Arrays.toString(result);
    }
    private static class Node{
        private Node next; // ссылка на следующий узел

        public Node(int value) {
            this.value = value;
        }

        private int value; //значение, кот хранится в текущем узле


        public int getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setNext(Node next) {
            this.next = next;
        }

    }


}
