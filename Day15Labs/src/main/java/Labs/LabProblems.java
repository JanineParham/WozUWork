package Labs;

public class LabProblems {

    public LabProblems(){}

    public String fizzBuzzStringMaker(int[] nums){
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < nums.length; i++){

            if(i % 15 == 0){
                sb.append("FizzBuzz, ");
            }

            else if (i % 3 == 0) {
                sb.append("Fizz, ");
            }

            else if(i % 5 == 0){
                sb.append("Buzz, ");
            }

            else {
                sb.append(i + ", ");
            }
        }

        return  sb.toString();
    }

    public static int[] getFibonacciArray(int[] ints){
        if(ints.length > 8 && ints.length < 50){
            for(int i = 1; i < ints.length; i++){
                if(i ==0 || i == 1){
                    ints[i] = i;
                }
                else {
                    ints[i] = ints[i - 1] + ints[i - 2];
                }
            }
        }
        return ints;
    }

}
