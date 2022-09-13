package practice;

public class HelloIvan {
    public static void main(String[] args) {

        System.out.println(detName("Ivan"));

    }

    private static String detName(String name) {
        if (name == null) {
            return "Hello anonimous!";
        } else {
            return "Hello " + name + " !";
        }
    }
}