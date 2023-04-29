import java.util.Arrays;

public class StringCalc {
    public int sum(String expression) {
        String[] nums = expression.split("[+\\-/*]");
        System.out.println(Arrays.toString(nums));
        return 0;
    }
}
