package paints.recallers.memories;

import java.util.Stack;

public class RedoCareTaker {
	public Stack<Memento> mementos = new Stack<>(); 
	private static RedoCareTaker careTaker = new RedoCareTaker();
	
	public void push(Memento memento) {
		mementos.add(memento);
	}
	
	public Memento pop() {
		return mementos.pop();
	}
	
	public Memento peek() {
		return mementos.peek();
	}
	
	private RedoCareTaker() {
		
	}
	
	public static RedoCareTaker getInstance() {
		return careTaker;
	}
}
