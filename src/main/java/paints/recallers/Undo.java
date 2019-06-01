package paints.recallers;

import paints.Buttons;
import paints.ColorFrame;
import paints.Sketch;
import paints.recallers.memories.RedoCareTaker;
import paints.recallers.memories.UndoCareTaker;

public class Undo implements RecallState {

	@Override
	public void recall() {
		
		UndoCareTaker undoTaker = UndoCareTaker.getInstance();
		RedoCareTaker redoTaker = RedoCareTaker.getInstance();
		
		ColorFrame.colorChange = true;
		
		if(undoTaker.mementos.isEmpty() == true);
		else {
			if(undoTaker.mementos.peek() == null) {
				Sketch.redoStart.push(Sketch.start.pop());
				Sketch.redoEnd.push(Sketch.end.pop());
			}
			
			
			redoTaker.push(undoTaker.pop());
			
			Buttons.canvas.getSelectedComponent().repaint();
		}
		
	}

}
