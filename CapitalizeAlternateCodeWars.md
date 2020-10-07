# Capitalizing Alternate from Code Wars

### by Janine Parham 

``` java
    class Solution{
      public static String[] capitalize(String s){
      
        char[] even = s.toCharArray();
        char[] odd = s.toCharArray();
      
        for(int i = 0; i < even.length; i++ ){
           if( i % 2 == 0 || i == 0){
            even[i] = Character.toUpperCase(even[i]);
           }
        }
      
        for(int i = 0; i < odd.length; i++ ){
          if( i % 2 != 0){
            odd[i] = Character.toUpperCase(odd[i]);
          }
        }
      
        String a = String.valueOf(even);
        String b = String.valueOf(odd);
      
        String[] capital = new String[2];
      
        capital[0] = a;
        capital[1] = b;
      
       return capital;
    }
  }
```
