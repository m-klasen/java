import java.util.EmptyStackException;


public class StackClass<String> implements Stack<String>{
	
	private String[] top;
	private int size;
	
	public StackClass(){
		top = null;
		size=0;
	}
	
	
	public Stack<String> push(String ele) {
			
		return null;
	}

	public String pop() {
		if (top== null) throw new EmptyStackException();
		
		String ele = ;
		return null;
	}

}
