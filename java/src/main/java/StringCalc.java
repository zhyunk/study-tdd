import java.util.Arrays;

public class StringCalc {
    int[] nums;
    String[] signs;

    StringCalc(){}
    StringCalc(String expression) {
        nums  = getNums(expression);
        signs = getSigns(expression);
    }

    public int[] getNums(String expression) {
        return Arrays.stream(expression.split("[+\\-/*]"))
                     .mapToInt(Integer::parseInt)
                     .toArray();
    }

    public String[] getSigns(String expression) {
        return expression.replaceAll("[0-9]", "")
                         .split("");
    }
}
