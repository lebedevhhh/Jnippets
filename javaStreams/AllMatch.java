//https://youtu.be/Q93JsQ8vcwY
// package javaStreams;

import java.util.ArrayList;
import java.util.List;

public class AllMatch {
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
        //what we want : return boolean if all the persons match a certain criteria (name.length() > 10)
        //without the streams
        boolean isAllMatching=true;
        for (Person p : persons){
            if (p.name.length() < 10){
                isAllMatching=false;
            }
        }

        //with the java streams
        boolean isAllMatching2= persons.stream().allMatch(p -> p.age>10);

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
