package control;

import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class HistorialComandos {

	private Stack<Comando> listadoComandos = new Stack<>();
	
	private final Set<Integer> pressedKeys = new HashSet<>();
	
	public void push(KeyEvent e) {
		pressedKeys.add(e.getKeyCode());
	}
	
	public void pop(KeyEvent e) {
		pressedKeys.remove(e.getKeyCode());
	}
	
	public boolean isEmpty() { 
		return pressedKeys.isEmpty(); 
	}
	
	public Set<Integer> getPressedKeys(){
		return pressedKeys;
	}
	
	
//	public void push(Comando c) {
//		listadoComandos.push(c);
//	}
//	
//	public Comando pop() {
//		return listadoComandos.pop();
//	}
//	
//	public boolean isEmpty() { 
//		return listadoComandos.isEmpty(); 
//	}
}
