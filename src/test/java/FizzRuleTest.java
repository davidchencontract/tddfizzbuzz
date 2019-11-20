import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzRuleTest {
    private FizzRule rule;

    @Before
    public void setUp() {
        rule = new FizzRule();
    }

    @Test
    public void testShouldSayFizzWhenNumberIsMultiplesOfThree()  {

        final String result = rule.numberConverter(6);
        assertThat(result, is("Fizz"));
    }

    @Test
    public void testShouldSayFizzWhenNumberContainsThree() {

        final String result = rule.numberConverter(13);
        assertThat(result, is("Fizz"));
    }

    @Test
    public void testShouldSayNothingWhenNumberIsNotMultiplesOfThreeOrNotContainsThree() {
        final String result = rule.numberConverter(2);
        assertThat(result, is(""));
    }
}
