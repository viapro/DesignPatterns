package designpatterns.strategy;

public abstract class AbstractCalculator {
	public int[] split(String exp,String opt){
		//"2+8" \\+
        String array[] = exp.split(opt);  
        System.out.println(array[0]);
        System.out.println(array[1]);
        int arrayInt[] = new int[2];  
        arrayInt[0] = Integer.parseInt(array[0]);  
        arrayInt[1] = Integer.parseInt(array[1]);  
        return arrayInt;  
    }  
}
