package designpatterns.mediator;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mediator mediator = new MyMediator();  
        mediator.createMediator();  
        mediator.workAll();  
	}

}
