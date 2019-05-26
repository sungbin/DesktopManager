package paints.recallers;

public class Recaller {
	RecallState state;
	
	public void setState(RecallState state) {
		this.state = state;
	}
	public void recall() {
		state.recall();
	}
}
