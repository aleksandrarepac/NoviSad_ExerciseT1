import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time: 0
// Student ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private int bonusGame =0;
	private int score=0;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame) throws BowlingException
	{
		if(frames.size()==10)
			throw new BowlingException();
		else
			frames.add(frame);
			
		//to be implemented
		
		
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
		for(int i=0; i<10; i++)
			if(frames.get(i).isSpare())
			{
				bonus= frames.get(i+1);
				bonusGame+=bonus.score();
			}
			else if(frames.get(i).isStrike())
			{
				bonus = frames.get(i+1);
				bonusGame+=bonus.score();
				
			}
	}
	
	// Returns the game score
	public int score(){
		//to be implemented: should return game score 
		for(int i=0; i<10; i++)
		{
			score= frames.get(i).score();
		}
		
		
		return score + bonusGame;
	}
}
