import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Min {
    static class Person{
        int age; 
        String name;
        String gender;

        public Person(String name, int age, String gender){
            this.age=age;
            this.name=name;
            this.gender=gender;
        }

        public String getName(){return this.name;}

        public boolean isOld(){
            return (this.age >50) ? true : false;
        }
        public int  getAge(){
            return this.age;
        }
        public String getGender(){
            return this.gender;
        }
    }
    public static void main(String[] args){
        List<Person> persons=getPPL();
        //without the java streams
        //what we want : create a map of groups (by each gender)
        //without the java Streams
        Map<String, List<Person>> grpByGender = persons.stream().collect(Collectors.groupingBy(Person::getGender));       
    }

    private static List<Person> getPPL(){
        List<Person> persons=new ArrayList<>();
        persons.add(new Person("bob", 100, "male"));
        persons.add(new Person("rose", 60, "female"));
        persons.add(new Person("daemon", 77, "female"));
        persons.add(new Person("yam", 6, "male"));
        return persons;
    }
}
