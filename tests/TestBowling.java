import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test_firstThrow_secondThrow_isSpare() throws BowlingException {
		
		Frame frame = new Frame(5,5);
		
		assertEquals ("First throw and second throw", "10", frame);
		
		
		
	}
	
	public void test_firstThrow_secontThrow_notSpare() throws BowlingException {
		Frame frame = new Frame(3,5);
		assertEquals ("First throw and second throw", "", frame);
		
	}
	@Test(expected=BowlingException.class)
	public void test_firstThrow_isStrike() throws BowlingException {
		
		Frame frame = new Frame(10,0);
		BowlingGame game = new BowlingGame();
		game.addFrame(frame);
		game.addFrame(frame);
		game.addFrame(frame);
		game.addFrame(frame);
		game.addFrame(frame);
		game.addFrame(frame);
		game.addFrame(frame);
		game.addFrame(frame);
		game.addFrame(frame);
		game.addFrame(frame);
		assertEquals ("First throw and second throw", "10-0", frame);
	}
	
	public void test_firstThrow_notStrike() throws BowlingException {
		
		Frame frame = new Frame(0,1);
		assertEquals ("First throw and second throw", "", frame);
	}
	
	
	
	
	
	

}
