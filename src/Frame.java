public class Frame {
	private int firstThrow;
	private int secondThrow;
	public int bonus = 0;
	
	public Frame(int firstThrow, int secondThrow) throws BowlingException {
		if(firstThrow>10 || secondThrow>10){
			throw new BowlingException();
		} else {
			this.firstThrow = firstThrow;
			this.secondThrow = secondThrow;
		}
		
		
	}
	
	public int getFirstThrow() {
		return firstThrow;
	}

	public int getSecondThrow() {
		return secondThrow;
	}

	//returns the score of a single frame
	public int score(){
		//to be implemented
		int prvi = getFirstThrow();
		int drugi = getSecondThrow();
		return prvi + drugi + bonus;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		//to be implemented
		return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		//to be implemented
		if(firstThrow + secondThrow == 10) {
			return true;
		} else {
			return false;
		}
	}
}
