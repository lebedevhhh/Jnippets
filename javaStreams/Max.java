import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Max {
    static class Person{
        int age; 
        String name;
        public Person(String name, int age){
            this.age=age;
            this.name=name;
        }

        public String getName(){return this.name;}

        public boolean isOld(){
            return (this.age >50) ? true : false;
        }
        public int  getAge(){
            return this.age;
        }
    }
    public static void main(String[] args){
        List<Person> persons=getPPL();
        //without the java streams
        //what we want : get the max age of persons
        //with java streams 
        //returns an optional , so we use the if Present methods and print the result if there's 
        persons.stream().max(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);
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
