import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test() {
		Frame fr = new Frame(1, 4);
		int expected = 5;
		assertEquals(expected, fr.score());
	}

}
