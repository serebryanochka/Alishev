package practice;

import java.util.Collections;
import java.util.*;

public class ComparableTest {
    public static void main(String[] args) {
List<Person> peopleList = new ArrayList<>();
Set<Person> peopleSet = new TreeSet<>();
addElements(peopleList);
addElements(peopleSet);
Collections.sort(peopleList);
        System.out.println(peopleList);
        System.out.println(peopleSet);
    }
    private static void addElements(Collection collection){
collection.add(new Person(4,"Ivan"));
collection.add(new Person(2,"Zahar"));
collection.add(new Person(3,"Maksim"));
collection.add(new Person(1,"Alevtina"));
    }
}
class Person implements Comparable<Person>{
    private int id;
    private String name;

    public Person(int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        if(this.id>o.getId()){
            return 1;
        } else if (this.id < o.getId()){
            return -1;
        } else {
            return 0;
        }
    }
}
