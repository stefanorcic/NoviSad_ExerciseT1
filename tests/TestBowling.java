import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void testFrame1()  throws BowlingException  {
		Frame fr = new Frame(1, 4);
		int expected = 5;
		assertEquals(expected, fr.score());
	}
	
	@Test
	public void testFrame2()  throws BowlingException  {
		Frame fr = new Frame(4, 5);
		int expected = 9;
		assertEquals(expected, fr.score());
	}
	
	@Test
	public void testGameFrame1() throws BowlingException {
		BowlingGame game = new BowlingGame();
		Frame fr = new Frame(1, 4);
		game.addFrame(fr);
		int expected = 5;
		assertEquals(expected, game.score());
	}
	

}
