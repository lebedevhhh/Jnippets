import java.util.ArrayList;
import java.util.List;

public class noneMatch {
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
        //what we want : check if all don't meet the requirement (true if none, false if one or more) 
        //without the streams
        boolean isNone=true;
        for (Person p: persons){
            if (p.getAge()>10){
                isNone=false;
            }
        }
    
        //with the java streams
        boolean isNone2=persons.stream().noneMatch(p -> p.getAge()> 10);

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
