package practice;

public class Lesson21 {
    public static void main(String[] args) {
        Humann h1 = new Humann("Bob",30);
        h1.setName("Bobby");
Humann.description = "nice";
Humann.getDescription();
        Humann.description = "bad";
        Humann.getDescription();
        h1.printFields();
    }
}
class Humann {

    private String name;
    private int age;
    public static String description;

    public Humann(String name, int age){
this.age = age;
this.name = name;
    }

    public void setName(String name){this.name = name;}
    public void setAge(int age){this.age = age;}
public static void getDescription(){System.out.println(description);}
    public  void printFields(){System.out.println(name+","+age);}
}