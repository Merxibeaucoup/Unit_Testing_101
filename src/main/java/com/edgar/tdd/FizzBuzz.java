package com.edgar.tdd;

public class FizzBuzz {
    
    public String compute(int x){

        StringBuilder sb = new StringBuilder();

        if(x%3==0){
            sb.append("Fizz");
        }
        if (x%5==0){
            sb.append("Buzz");
        }
        if(sb.isEmpty()){
            sb.append(x);
        }

        return sb.toString();
    }

    // public String compute(int x){

        // Same as above method

    //     String output;

    //     if (x%3 ==0 && x%5 ==0){
    //         output="FizzBuzz";
    //     }
    //    else  if(x%3 ==0){
    //         output="Fizz";
    //     }
    //     else if (x%5 ==0){
    //         output="Buzz";
    //     }
       
    //     else output = x +"";

    //     return output;
    // }
}
