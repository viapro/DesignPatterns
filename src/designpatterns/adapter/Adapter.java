package designpatterns.adapter;

/**
 * ��������
 * @author dengdashuai
 *
 */
public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("this is targetable method2");
	}

	
}
