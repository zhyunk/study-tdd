import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("includeTag")
public class TagTest {

    @Test
    void aTest() {
        System.out.println("a include ==========================");
    }

    @Test
    void bTest() {
        System.out.println("b include ==========================");
    }
}

@Tag("notInclude")
class TacTest {

    @Test
    void aTest() {
        System.out.println("not include a ==========================");
    }

    @Test
    void bTest() {
        System.out.println("not include b ==========================");
    }
}
