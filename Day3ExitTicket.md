# Top K Frequent Words 

## by Janine Parham 

```java
  //This is as far as I got in my solution. I would love to go over this is class.
    class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        //spilt the string words
        String s[] = str.split(" ");
        
        //make HashSet to remove duplicate words
        HashSet <String> filterStrings = new HashSet<>();
        for(String word : s){
            filterStrings.add(word);
        }
        
        //create new HashMap to add matched words and their counts to a list
        HashMap <String, int> order = new HashMap<>();
        
        //run a counter to search for each word in the HashSet 
        for(String match : filterStrings){
            int count = 0;
            for(int i = 0; i < s.length(); i++){
                if(match.equals(s[i])){
                    count++
                }
            }   
            return order.put(match, count);
        }
        
        
        //order String array by count highest to lowest
        
    }
}
```

# Two Sum 

## by Janine Parham

```java
    //I believe I am close to a solution, but I am getting an error regarding using "int" data type in the HashMap. 
    //I thought they could use any type. Is it only wrapper classes?
    
    class Solution {
    public int[] twoSum(int[] nums, int target) {
        //make HashMap with the int and index in nums array
        HashMap<int, int> addition = new HashMap<>();
        
        for(int num : nums){
            return addition.put(num, nums[i]);
        }
        
        //Loop through HashMap keys to determine two numbers that equal target number
        for(int i = 0; i < addition.size(); i++){
            for(int j = i + 1; j < addition.size(); j++ ){
                if(addition[i] + addition[j] == target){
                    int[] values = new int[] {addition.get(i), addition.get(j)};
                    return values;
                }
            }
        }
        
        //print the int[] to console
        System.out.println(Arrays.toString(values));
    }
}
```
