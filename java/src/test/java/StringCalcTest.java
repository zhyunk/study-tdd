import org.junit.jupiter.api.*;

import java.util.Arrays;

@DisplayName("StringCalc_클래스의_테스트")
public class StringCalcTest {
    static StringCalc calc;

    @BeforeAll
    static void setup() {
        calc = new StringCalc();
    }

    @Nested
    class Case1 {
        static String expression = "12+13-55*2";

        @Test
        @DisplayName("CASE 1 : 숫자 잘 분리 되었는지_확인")
        public void nums1() {
            System.out.println(Arrays.toString(calc.getNums(expression)));
        }

        @Test
        @DisplayName("CASE 1 : 연산자 잘 분리 되었는지_확인")
        public void signs1() {
            System.out.println(Arrays.toString(calc.getSigns(expression)));
        }
    }

    @Nested
    class Case2 {
        static String expression = "321321231+654678-321321";

        @Test
        @DisplayName("CASE 2 : 숫자 잘 분리 되었는지_확인")
        public void nums2() {
            System.out.println(Arrays.toString(calc.getNums(expression)));
        }

        @Test
        @DisplayName("CASE 2 : 연산자 잘 분리 되었는지_확인")
        public void signs2() {
            System.out.println(Arrays.toString(calc.getSigns(expression)));
        }
    }

    @Disabled
    @RepeatedTest(5)
    public void repeatTest() {
        System.out.println((int)(Math.random()*10));
    }

    @AfterAll
    static void end() {
        System.out.println("StringCalc 클래스 테스트 끝 ======================================");
    }
}
