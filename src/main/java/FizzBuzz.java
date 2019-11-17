public class FizzBuzz {
    public String numberConverter(final int number) {
        if(number<=0)
            return "Error";
        if ((number%15)==0)
            return "FizzBuzz";
        else if (String.valueOf(number).contains("3") && String.valueOf(number).contains("5"))
            return "FizzBuzz";
        else if((number%3) == 0 && String.valueOf(number).contains("5"))
            return "FizzBuzz";
        else if((number%3) == 0)
            return "Fizz";
        else if((number%5)== 0 )
            return "Buzz";
        else if(String.valueOf(number).contains("3"))
            return "Fizz";
        else if(String.valueOf(number).contains("5"))
            return "Buzz";
        else
            return String.valueOf(number);
    }

    public void printNumber(int printNumber){
        for(int i = 1; i<=printNumber; i++){
            System.out.println(numberConverter(i));
        }

    }

}
