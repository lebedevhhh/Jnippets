//https://youtu.be/Q93JsQ8vcwY
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Filter{
    static class Person{
        int age; 
        String name;
        public Person(String name, int age){
            this.age=age;
            this.name=name;
        }

        public boolean isOld(){
            return (this.age >50) ? true : false;
        }
    }
    public static void  main(String[] args){
        List<Person> persons=getPPL();
        List<Person> oldPersons=new ArrayList<>();
        //without the java streams
        //what we want ; print the old people ( 50 ++ )
        for (Person p : persons){
            if (p.age > 50){
                oldPersons.add(p);
            }
        }
        //with the java streanms
        oldPersons =persons.stream().filter(Person::isOld).collect(Collectors.toList());
        //without the isOld method 
        oldPersons=persons.stream().filter(p -> p.age>50).collect(Collectors.toList());
    }   

    private static List<Person> getPPL(){
        List<Person> persons=new ArrayList<>();
        persons.add(new Person("bob", 100));
        persons.add(new Person("sam", 60));
        persons.add(new Person("daemon", 77));
        persons.add(new Person("yam", 6));
        return persons;
    }
}