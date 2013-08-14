package designpatterns.singleton;

public class TestSingleton {

	public static void main(String[] args) {
        System.out.print(Singleton.getInstance()==Singleton.getInstance());
    }

}
