import java.util.ArrayList;
import java.util.List;


public class FizzBuzzWithDesignPattern implements Rule {
    private static List<Rule> rules = new ArrayList<>();

    static {
        rules.add(new FizzRule());
        rules.add(new BuzzRule());
    }

    @Override
    public String numberConverter(int number) {
        if(number <=0)
            return "Error";
        String result = "";
        for (Rule rule : rules) {
            result += rule.numberConverter(number);
        }
        return result.length() == 0 ? String.valueOf(number) : result;
    }

}
