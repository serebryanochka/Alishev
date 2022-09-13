package practice;

class Human {

    private String name;
    private int age;

    public Human() {
       this.name = "Имя по умолчанию";
       this.age = 36;

        }
public Human (String name){
        this.name = name;}
public Human (String name, int age){
    System.out.println("Привет из третьего конструктора");
    this.age = age;
    this.name = name;
}
        }
