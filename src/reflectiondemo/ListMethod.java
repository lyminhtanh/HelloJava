package reflectiondemo;

import java.lang.reflect.Method;
// lấy ra tất cả các methods trong 1 class
public class ListMethod {
	protected void info(){};
	public static void testMethod1(){
		
	}
	public void testMethod2(){
		
	}
	public static void main(String [] args){
		Method [] methods = ListMethod.class.getMethods();
		for (Method method:methods){
			System.out.println("Method "+ method.getName() );
		}
	}
}
