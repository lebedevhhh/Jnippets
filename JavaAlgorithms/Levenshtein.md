title: levenshtein distance 
name: lebedevhh  
Date: 4/29/2023 
Description : find the number of actions to make two strings similar (wiki : https://en.wikipedia.org/wiki/Levenshtein_distance) (video : https://youtu.be/tG4IeY01-xw)

```java
    private static int getLevDistance(String str1, String str2, int n1, int n2, String[][] cache){
        if (cache[n1][n2] != null){
            return Integer.parseInt(cache[n1][n2]);
        }
        if (str1.length() == 0){
            cache[n1][n2]=String.valueOf(n1);
            return n1;
        }
        if (str2.length() == 0){
            cache[n1][n2]=String.valueOf(n2);
            return n2;
        }
        if (str1.charAt(str1.length()-1) == str2.charAt(str2.length()-1)){
            cache[n1][n2] = String.valueOf(getLevDistance(str1.substring(0, str1.length()-1), str2.substring(0, str2.length()-1), n1-1, n2-1, cache));
            return Integer.parseInt(cache[n1][n2]);
        }
        return 1 + min(getLevDistance(str1, str2.substring(0, str2.length()-1),n1, n2-1, cache),
                        getLevDistance(str1.substring(0, str1.length()-1), str2,n1-1, n2, cache),
                        getLevDistance(str1.substring(0, str1.length()-1), str2.substring(0, str2.length()-1),n1-1, n2-1, cache));
    }
    private static int min(int... numbers){
        int min = Integer.MAX_VALUE;
        for (int n : numbers){
            if (n < min){
                min = n;
            }
        }
        return min;
    }
    private static int levCached(String str1, String str2){
        String[][] cache=new String[str1.length()+1][str2.length()+1];
        return getLevDistance(str1, str2, str1.length(), str2.length(), cache);
    }
```