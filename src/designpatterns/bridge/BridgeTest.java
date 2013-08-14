package designpatterns.bridge;

/**
 * �Ž�ģʽ
 * @author dengdashuai
 *
 */
public class BridgeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bridge bridge = new MyBridge();
		SourceSub1 sourceSub1 = new SourceSub1();
		bridge.setSourceable(sourceSub1);
		bridge.method();
		
		SourceSub2 sourceSub2 = new SourceSub2();
		bridge.setSourceable(sourceSub2);
		bridge.method();
	}

}
