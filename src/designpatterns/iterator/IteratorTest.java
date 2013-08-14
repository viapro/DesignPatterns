package designpatterns.iterator;

public class IteratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection collection = new MyCollection();  
        Iterator it = collection.iterator();  
          
        while(it.hasNext()){  
            System.out.println(it.next());  
        }   
	}

}
