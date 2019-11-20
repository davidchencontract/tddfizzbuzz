public class FizzRule implements Rule {
    @Override
    public String numberConverter(int number) {
        return number % 3 == 0 || String.valueOf(number).contains("3") ? "Fizz" : "";
    }
}
