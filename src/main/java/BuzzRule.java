public class BuzzRule implements Rule {
    @Override
    public String numberConverter(int number) {
        return number % 5 == 0 || String.valueOf(number).contains("5")? "Buzz" : "";
    }
}
