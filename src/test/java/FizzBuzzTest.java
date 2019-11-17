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
    public void testShouldSayFizzBuzzWhenNumberIsMultipleOfFiveOrThree(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String resultOfFifteen = fizzBuzz.numberConverter(15);
        assertTrue("Should print FizzBuzz when number is mutiple of 5 or 3","FizzBuzz".equals(resultOfFifteen));
    }

    @Test
    public void testShouldSayNumberWhenNumberIsNotMultipleOfFiveOrThree(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String resultOfTwo = fizzBuzz.numberConverter(2);
        assertTrue("Should print number when number is not mutiple of 5 or 3","2".equals(resultOfTwo));
    }





}
