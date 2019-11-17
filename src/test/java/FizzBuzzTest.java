import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class FizzBuzzTest {

    @Test
      public void testShouldSayFizzWhenNumberIsMultipleOfThree(){
          FizzBuzz fizzBuzz = new FizzBuzz();
          String resultOfThree = fizzBuzz.numberConverter(3);
          assertTrue("Should print Fizz when number is mutiple of 3","Fizz".equals(resultOfThree));
          String resultOfNine = fizzBuzz.numberConverter(9);
          assertTrue("Should print Fizz when number is mutiple of 3","Fizz".equals(resultOfNine));
      }

    @Test
    public void testShouldSayBuzzWhenNumberIsMultipleOfFive(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String resultOfFive = fizzBuzz.numberConverter(5);
        assertTrue("Should print Buzz when number is mutiple of 5","Buzz".equals(resultOfFive));
        String resultOfTen = fizzBuzz.numberConverter(10);
        assertTrue("Should print Buzz when number is mutiple of 5","Buzz".equals(resultOfTen));
    }

    @Test
    public void testShouldSayFizzBuzzWhenNumberIsMultipleOfFiveAndThree(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String resultOfFifteen = fizzBuzz.numberConverter(15);
        assertTrue("Should print FizzBuzz when number is mutiple of 5 and 3","FizzBuzz".equals(resultOfFifteen));
    }

    @Test
    public void testShouldSayNumberWhenNumberIsNotMultipleOfFiveOrThree(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String resultOfTwo = fizzBuzz.numberConverter(2);
        assertTrue("Should print number when number is not mutiple of 5 or 3","2".equals(resultOfTwo));
    }

    @Test
    public void testShouldSayFizzWhenNumberContainsThree(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String resultOfContainsThree = fizzBuzz.numberConverter(13);
        assertTrue("Should print Fizz when number contains 3","Fizz".equals(resultOfContainsThree));
    }

    @Test
    public void testShouldSayBuzzWhenNumberContainsFive(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String resultOfContainsFive = fizzBuzz.numberConverter(52);
        assertTrue("Should print Fizz when number contains 5","Buzz".equals(resultOfContainsFive));
    }

    @Test
    public void testShouldSayFizzBuzzWhenNumberIsMultipleOfFiveAndThreeOrContainsThreeAndFive(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String resultOf35 = fizzBuzz.numberConverter(35);
        assertTrue("Should print FizzBuzz when number is mutiple of 5 and 3 or contains 3 and 5","FizzBuzz".equals(resultOf35));
        String resultOf53 = fizzBuzz.numberConverter(53);
        assertTrue("Should print FizzBuzz when number is mutiple of 5 and 3 or contains 3 and 5","FizzBuzz".equals(resultOf53));
    }


    @Test
    public void testShouldSayFizzBuzzWhenNumberIsMultipleThreeAndContainsFive(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String resultOf51 = fizzBuzz.numberConverter(51);
        assertTrue("Should print FizzBuzz when number is mutiple of 1 and contains 5","FizzBuzz".equals(resultOf51));
    }

    @Test
    public void testShouldReturnErrorWhenLess0(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String resultOfLess = fizzBuzz.numberConverter(-1);
        assertTrue("Should print error when number is <= 1", "Error".equals(resultOfLess));
        String resultOfLess0 = fizzBuzz.numberConverter(0);
        assertTrue("Should print error when number is <= 1", "Error".equals(resultOfLess0));
    }


}
