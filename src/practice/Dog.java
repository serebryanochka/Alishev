package practice;

public class Dog extends Animal{ // собака наследует класс Animal теперь собака может исп методы есть, спать
public void bark(){
    System.out.println("i am barking ");
}
public void eat(){
    System.out.println("Dog is eating"); // переопределили метод eat
}
public void showName(){
    System.out.println(name);
}
}
