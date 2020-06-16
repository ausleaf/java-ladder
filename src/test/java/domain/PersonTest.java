package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PersonTest {

    @Test
    public void 사람이름은_5글자를_넘으면_안된다() {
        String IllegalName = "abcdef";

        assertThrows(IllegalArgumentException.class, () -> {
            new Person(IllegalName);
        });

    }

    @Test
    public void 이름은_5글자기준으로_여백을두어_출력한다() {
        String name = "abc";

        assertThat(new Person(name).toString()).isEqualTo(" abc ");
    }

    @Test
    public void 다섯글자_이름은_여백이_없다() {
        String name = "abcde";

        assertThat(new Person(name).toString()).isEqualTo("abcde");
    }
}