title: Primes
name: Lebedevhh 
Date : 2/25/2023 
Description : all primes number (2 to n) : https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes


```java
    static ArrayList<Integer> p(int n){
        ArrayList<Integer> l = new ArrayList<>();
        for (int r = 2; r <= n; r++){
            l.add(r);
        }
        int counter = 0;
        while (counter < (int) Math.sqrt(n)){
            int s = l.get(counter);
            int temp = s;
            for (int z = 0; z < l.size(); z++){
                s += temp;
                if (l.indexOf(s) != -1){
                    l.remove(l.indexOf(s));
                }
                else{
                    continue;
                }
            }
            counter ++;
        }
        return l;
    }
```