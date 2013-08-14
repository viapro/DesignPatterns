package designpatterns.adapter;

/**
 * ������ģʽ
 * @author dengdashuai
 *
 */
public class AdapterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * ��������
		Targetable targetable = new Adapter();
		targetable.method1();
		targetable.method2();
		*/
		
		/*
		 * ����������
		Source source = new Source();
		Wrapper wrapper = new Wrapper(source);
		wrapper.method1();
		wrapper.method2();
		*/
		
		SourceSub1 sourceSub1 = new SourceSub1();
		sourceSub1.method1();
		sourceSub1.method2();
		
		SourceSub2 sourceSub2 = new SourceSub2();
		sourceSub2.method1();
		sourceSub2.method2();
		
		
	}

}
