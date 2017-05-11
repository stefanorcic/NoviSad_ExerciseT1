import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private int score = 0;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		//to be implemented
		frames.add(frame);
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	// Returns the game score
	public int score(){
		//to be implemented: should return game score
		/*
		for (int i = 0; i < frames.size()-1; i++) {
			if(frames.get(i).isSpare()){
				score += frames.get(i).score();
				//score += frames.get(i).score() + frames.get(i+1).getFirstThrow();
			} else {
				//score += frames.get(i).score();
				score += frames.get(i).score() + frames.get(i+1).getFirstThrow();
			}
		}*/
		int i = 0;
		for (Frame frame : frames) {
			if (frame.isSpare() && i < 3) {
				frame.bonus = frames.get(i+1).getFirstThrow();
				score += frame.score() + frame.bonus;
				i++;
			} else {
				score += frame.score();
				i++;
			}
			
		}
		
		return score;
	}
}
