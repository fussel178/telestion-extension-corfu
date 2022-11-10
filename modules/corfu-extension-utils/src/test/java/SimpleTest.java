import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SimpleTest {
	@Test
	void shouldCalculateRight() {
		assertThat(2 + 2, is(4));
	}
}
