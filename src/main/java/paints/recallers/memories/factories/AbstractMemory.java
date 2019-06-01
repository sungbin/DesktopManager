package paints.recallers.memories.factories;

import paints.recallers.memories.Memento;

public abstract class AbstractMemory {
	public abstract Memento createMemento();
	public abstract void RestorMemento(Memento memento);
	
}
