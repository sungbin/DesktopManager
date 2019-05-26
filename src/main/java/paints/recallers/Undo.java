package paints.recallers;

import paints.Buttons;
import paints.ColorFrame;
import paints.Memory;
import paints.Sketch;

public class Undo implements RecallState {

	@Override
	public void recall() {
		ColorFrame.colorChange = true;
		
		if(Memory.memory.isEmpty() == true)
			;
		else {
			if(Memory.memory.peek() == null) {
				Sketch.redoStart.push(Sketch.start.pop());
				Sketch.redoEnd.push(Sketch.end.pop());
			}
			
			Memory.redoMemory.push(Memory.memory.pop());
			Memory.redoColorMemory.push(Memory.colorMemory.pop());
			Memory.redoThicknessMemory.push(Memory.thicknessMemory.pop());
			
			Buttons.canvas.getSelectedComponent().repaint();
		}
		
	}

}
