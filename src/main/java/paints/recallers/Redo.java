package paints.recallers;

import paints.Buttons;
import paints.ColorFrame;
import paints.Memory;
import paints.Sketch;

public class Redo implements RecallState {

	@Override
	public void recall() {
		ColorFrame.colorChange = true;
		
		if(Memory.redoMemory.isEmpty() == true)
			;
		else {
			if(Memory.redoMemory.peek() == null) {
				Sketch.start.push(Sketch.redoStart.pop());
				Sketch.end.push(Sketch.redoEnd.pop());
			}
			
			Memory.memory.push(Memory.redoMemory.pop());
			Memory.colorMemory.push(Memory.redoColorMemory.pop());
			Memory.thicknessMemory.push(Memory.redoThicknessMemory.pop());
			
			Buttons.canvas.getSelectedComponent().repaint();
		}
	}

}
