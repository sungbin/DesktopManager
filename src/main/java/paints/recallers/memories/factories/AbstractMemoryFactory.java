package paints.recallers.memories.factories;

import paints.recallers.memories.Memento;

public abstract class AbstractMemoryFactory {
	public abstract AbstractMemory createMemory(Memento memento);
}
