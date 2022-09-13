import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;

public class GetAndSet {
    public static void main(String[] args) {
        class Cat {
            private String name;
            private String color;
            private int age;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public int getAge() {
                return age;
            }
                        public void speak(){
                for (int i = 0; i<3; i++) {
                    System.out.println("Myao!!!");
                }
            }

        }

        Cat cat1 = new Cat();
        cat1.setName("Murka");
        cat1.setAge(9);
        System.out.println("Первую кошку зовут - " +cat1.getName() +", ей " +cat1.getAge() +" лет.");
        cat1.speak();

        Cat cat2 = new Cat();
        cat2.setName("Bella");
        cat2.setAge(5);
        System.out.println("Вторую кошку зовут - " +cat2.getName() +", ей " +cat2.getAge() +" лет.");
        cat2.speak();
    }

}

