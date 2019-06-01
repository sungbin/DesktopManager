package paints.recallers.memories.factories;

import paints.recallers.memories.Memento;

public class RedoMemoryFactory extends AbstractMemoryFactory {

	@Override
	public RedoMemory createMemory(Memento memento) {
		return new RedoMemory(memento.getMemory(), memento.getColorMemory(), memento.getThicknessMemory());
	}

}
