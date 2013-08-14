package designpatterns.visitor;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Visitor visitor = new MyVisitor();  
        Subject sub = new MySubject();  
        sub.accept(visitor); 
	}

}
