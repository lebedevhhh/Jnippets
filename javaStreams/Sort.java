import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.smartcardio.CommandAPDU;

public class Sort{
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
        //what we want : to sort by their by their age 
        //without the streams
        //use the quicksort algo to sort the array
        
        //with the java streams (using method inference)
        List<Person> sorted= persons.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
        //we can also use this to sort according to name 
        List<Person> sorted2= persons.stream().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());
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