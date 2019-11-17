public class FizzBuzz {
    public String numberConverter(final int number) {
        if(number<=0)
            return "Error";
        if (isMultipleOfNumber(number, 15))
            return "FizzBuzz";
        else if (isContainsNumber(number, "3") && isContainsNumber(number, "5"))
            return "FizzBuzz";
        else if(isMultipleOfNumber(number, 3) && isContainsNumber(number, "5"))
            return "FizzBuzz";
        else if(isMultipleOfNumber(number, 3))
            return "Fizz";
        else if(isMultipleOfNumber(number, 5))
            return "Buzz";
        else if(isContainsNumber(number, "3"))
            return "Fizz";
        else if(isContainsNumber(number, "5"))
            return "Buzz";
        else
            return String.valueOf(number);
    }

    private boolean isMultipleOfNumber(final int number, final int i) {
        return (number % i) == 0;
    }

    private boolean isContainsNumber(final int number, final String s) {
        return String.valueOf(number).contains(s);
    }

    public void printNumber(int printNumber){
        for(int i = 1; i<=printNumber; i++){
            System.out.println(numberConverter(i));
        }

    }

}
