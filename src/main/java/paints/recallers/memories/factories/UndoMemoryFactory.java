package paints.recallers.memories.factories;

import paints.recallers.memories.Memento;

public class UndoMemoryFactory extends AbstractMemoryFactory {

	@Override
	public UndoMemory createMemory(Memento memento) {
		return new UndoMemory(memento.getMemory(), memento.getColorMemory(), memento.getThicknessMemory());
	}
	
}
