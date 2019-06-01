package paints.recallers.memories.factories;


import java.awt.Color;
import java.util.Stack;

import paints.recallers.memories.Memento;

public class RedoMemory extends AbstractMemory{
	private Object memotry;
	private Color colorMemory;
	private Integer thicknessMemory;
	
	public RedoMemory(Object memotry, Color colorMemory, Integer thicknessMemory) {
		super();
		this.memotry = memotry;
		this.colorMemory = colorMemory;
		this.thicknessMemory = thicknessMemory;
	}
	
	public Memento createMemento() {
		return new Memento(memotry,colorMemory,thicknessMemory);
	}
	
	public void RestorMemento(Memento memento)         //Memento를 복원합니다 (상태복원)
    {
		this.memotry = memento.getMemory();
		this.colorMemory = memento.getColorMemory();
		this.thicknessMemory = memento.getThicknessMemory();
    }

	public void setMemotry(Object memotry) {
		this.memotry = memotry;
	}

	public void setColorMemory(Color colorMemory) {
		this.colorMemory = colorMemory;
	}

	public void setThicknessMemory(Integer thicknessMemory) {
		this.thicknessMemory = thicknessMemory;
	}
	
}
