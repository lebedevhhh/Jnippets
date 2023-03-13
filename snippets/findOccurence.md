title: findOccurrence
name: Lebedevhh
Date : 3/13/2023
Description : find occurence of each word in a string (took code from : Mama Samba Braima AKA Nelson // amigosCode)

```java
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class match{

    public static Map<String, Integer> findOccurenceInWord(String  n){
        Map<String, Integer> map = new HashMap<>();
        String[] arr= n.split("");
        for (String str : arr){
            if (map.containsKey(str)){
                map.put(str, map.get(str)+1);
            }
            else{
                map.put(str, 1);
            }
        }
        return map;
    }

    public static void main(String[] args){
        String h = "Hello";
        System.out.println(findOccurenceInWord(h).size());
    }
}
```