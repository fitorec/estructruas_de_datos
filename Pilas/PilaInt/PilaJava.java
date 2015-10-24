import java.util.Stack;

public class PilaJava {
	public static void printStack(Stack p) {
		while(!p.empty()) {
			System.out.println(p.pop());
		}
	}
	//p.peek()

	public static void main(String args[]) {
		Stack<Integer> pe = new Stack<Integer>();
		pe.push(5);
		pe.push(3);	
		PilaJava.printStack(pe);
		//
		Stack<String> ps = new Stack<String>();
		ps.push("hola");
		ps.push("pila strings");
		PilaJava.printStack(ps);
		// Es un error el intentar guardar
		// un tipo de dato simple
		// Stack<int> pi = new Stack<int>();
	}
} 
