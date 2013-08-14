package designpatterns.facade;

/**
 * ���ģʽ
 * @author dengdashuai
 *
 */
public class User {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startUp();
		computer.shutDown();
		
	}
}
