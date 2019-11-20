import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzWithDesignPatternTest {
    private Rule fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzzWithDesignPattern();
    }

    @Test
    public void testShouldSayFizzWhenNumberIsMultipleOfThree(){
        String resultOfThree = fizzBuzz.numberConverter(3);
        assertTrue("Should print Fizz when number is mutiple of 3","Fizz".equals(resultOfThree));
        String resultOfNine = fizzBuzz.numberConverter(9);
        assertTrue("Should print Fizz when number is mutiple of 3","Fizz".equals(resultOfNine));
    }

    @Test
    public void testShouldSayBuzzWhenNumberIsMultipleOfFive(){
        String resultOfFive = fizzBuzz.numberConverter(5);
        assertTrue("Should print Buzz when number is mutiple of 5","Buzz".equals(resultOfFive));
        String resultOfTen = fizzBuzz.numberConverter(10);
        assertTrue("Should print Buzz when number is mutiple of 5","Buzz".equals(resultOfTen));
    }

    @Test
    public void testShouldSayFizzBuzzWhenNumberIsMultipleOfFiveAndThree(){
        String resultOfFifteen = fizzBuzz.numberConverter(15);
        assertTrue("Should print FizzBuzz when number is mutiple of 5 and 3","FizzBuzz".equals(resultOfFifteen));
    }

    @Test
    public void testShouldSayNumberWhenNumberIsNotMultipleOfFiveOrThree(){
        String resultOfTwo = fizzBuzz.numberConverter(2);
        assertTrue("Should print number when number is not multiple of 5 or 3","2".equals(resultOfTwo));
    }

    @Test
    public void testShouldSayFizzWhenNumberContainsThree(){
        String resultOfContainsThree = fizzBuzz.numberConverter(13);
        assertTrue("Should print Fizz when number contains 3","Fizz".equals(resultOfContainsThree));
    }

    @Test
    public void testShouldSayBuzzWhenNumberContainsFive(){
        String resultOfContainsFive = fizzBuzz.numberConverter(52);
        assertTrue("Should print Fizz when number contains 5","Buzz".equals(resultOfContainsFive));
    }

    @Test
    public void testShouldSayFizzBuzzWhenNumberIsMultipleOfFiveAndThreeOrContainsThreeAndFive(){
        String resultOf35 = fizzBuzz.numberConverter(35);
        assertTrue("Should print FizzBuzz when number is mutiple of 5 and 3 or contains 3 and 5","FizzBuzz".equals(resultOf35));
        String resultOf53 = fizzBuzz.numberConverter(53);
        assertTrue("Should print FizzBuzz when number is mutiple of 5 and 3 or contains 3 and 5","FizzBuzz".equals(resultOf53));
    }


    @Test
    public void testShouldSayFizzBuzzWhenNumberIsMultipleThreeAndContainsFive(){
        String resultOf51 = fizzBuzz.numberConverter(51);
        assertTrue("Should print FizzBuzz when number is mutiple of 1 and contains 5","FizzBuzz".equals(resultOf51));
    }

    @Test
    public void testShouldReturnErrorWhenLess0(){
        String resultOfLess = fizzBuzz.numberConverter(-1);
        assertTrue("Should print error when number is <= 1", "Error".equals(resultOfLess));
        String resultOfLess0 = fizzBuzz.numberConverter(0);
        assertTrue("Should print error when number is <= 1", "Error".equals(resultOfLess0));
    }

    @Test
    public void testPrint(){
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz.numberConverter(i));
        }

    }
}
