import org.junit.jupiter.api.*;

@DisplayName("StringCalc_클래스의_테스트")
public class StringCalcTest {
    static StringCalc calc;

    @BeforeAll
    static void setup() {
        calc = new StringCalc();
    }

    @Test
    @DisplayName("숫자 잘 분리 되었는지_확인")
    public void sum_test() {
        calc.sum("12+13-55*2");
    }

    @RepeatedTest(5)
    public void repeatTest() {
        System.out.println((int)(Math.random()*10));
    }

    @AfterAll
    static void end() {
        System.out.println("StringCalc 클래스 테스트 끝 ======================================");
    }
}
