package paints.recallers;

import paints.Buttons;
import paints.ColorFrame;
import paints.Sketch;
import paints.recallers.memories.RedoCareTaker;
import paints.recallers.memories.UndoCareTaker;

public class Redo implements RecallState {

	@Override
	public void recall() {
		
		UndoCareTaker undoTaker = UndoCareTaker.getInstance();
		RedoCareTaker redoTaker = RedoCareTaker.getInstance();
		
		ColorFrame.colorChange = true;
		
		if(redoTaker.mementos.isEmpty() == true)
			;
		else {
			if(redoTaker.mementos.peek() == null) {
				Sketch.start.push(Sketch.redoStart.pop());
				Sketch.end.push(Sketch.redoEnd.pop());
			}
			
			undoTaker.mementos.push(redoTaker.pop());
			
			Buttons.canvas.getSelectedComponent().repaint();
		}
	}

}
