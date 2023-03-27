package javaStreams;

import java.util.ArrayList;
import java.util.List;

public class AnyMatch {
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
        //what we want : return boolean if at least one the persons match a certain criteria (name.length() > 10)
        //without the streams
        boolean isAnyMatching=false;
        for (Person p : persons){
            if (p.age > 10){
                isAnyMatching=true;
            }
        }
        //with the streams 
        boolean isAnyMatching2= persons.stream().anyMatch(p -> p.age>10);
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
