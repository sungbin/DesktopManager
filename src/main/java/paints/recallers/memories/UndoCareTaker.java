package paints.recallers.memories;

import java.util.Stack;

public class UndoCareTaker {
	public Stack<Memento> mementos = new Stack<>(); 
	private static UndoCareTaker careTaker = new UndoCareTaker();
	
	public void push(Memento memento) {
		mementos.add(memento);
	}
	
	public Memento pop() {
		return mementos.pop();
	}
	
	public Memento peek() {
		return mementos.peek();
	}
	
	private UndoCareTaker() {
		
	}
	
	public static UndoCareTaker getInstance() {
		return careTaker;
	}
}
