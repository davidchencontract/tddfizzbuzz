import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BuzzRuleTest {
    private BuzzRule rule;

    @Before
    public void setUp(){
        rule = new BuzzRule();
    }

    @Test
    public void testShouldSayBuzzWhenNumberIsMultiplesOfFive() {
        final String result = rule.numberConverter(10);
        assertThat(result, is("Buzz"));
    }

    @Test
    public void testShouldSayBuzzWhenNumberContainsFive() {
        final String result = rule.numberConverter(52);
        assertThat(result, is("Buzz"));
    }

    @Test
    public void testShouldSayNothingWhenNumberIsNotMultiplesOfFiveOrNotContains5() {
        final String result = rule.numberConverter(1);
        assertThat(result, is(""));
    }
}
