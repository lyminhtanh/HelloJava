package reflectiondemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ShowClassCatInfo {
	//Ví dụ ghi ra thông tin của class Cat, như tên class, và các Interface mà class này thi hành
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		// TODO Auto-generated method stub
		Class<Cat> aClass = Cat.class;
		System.out.println("Class name: " +aClass.getName());
		System.out.println("package: " + aClass.getPackage().getName());
		//get superclass
		Class<?> sClass = aClass.getSuperclass();
		System.out.println("super class: "+sClass.getName());
		//get interface
		Class<?>[] aInterfaces = aClass.getInterfaces();
		for(Class<?> itf:aInterfaces){
			System.out.println("interface: "+ itf.getName());
		}
//		Ví dụ lấy ra thông tin các constructor, method, field của class (Chỉ public), 
//		bao gồm cả các public method, public field, thừa kế từ các class cha, và các interace.
		//get constructors
		Constructor<?>[] cClass = aClass.getConstructors();
		for(Constructor<?> cons: cClass){
			System.out.println("constructor: "+cons.getName());
		}
		Method[] methods = aClass.getMethods();
		for(Method method:methods){
			System.out.println("method "+ method.getName());
		}
		Field[] fields = aClass.getFields();
		for(Field field: fields){
			System.out.println("field " + field.getName());	
		}
		//Ví dụ lấy ra một  cấu tử với các tham số chỉ định trước.
		//Và ghi ra thông tin về cấu tử (constructor) này.
		Constructor<?> dcons = aClass.getConstructor(String.class, int.class);
		//get info kiểu tham số của cấu tử
		Class<?>[] paramClasses = dcons.getParameterTypes();
		 // Khởi tạo đối tượng Cat theo cách của reflect.
		//Cat tom = (Cat) dcons.newInstance("tom",2);
		//Truy cap private field
		Field private_field = aClass.getDeclaredField("name");
		private_field.setAccessible(true);
		
		Method private_method = aClass.getDeclaredMethod("setName", String.class);
		private_method.setAccessible(true);
		Cat tom = new Cat("tom",4);
		
		private_method.invoke(tom, "tom2");
		System.out.println("new tom " + tom.getName());
		private_field.set(tom, "tom3");
		System.out.println("new name 2: "+tom.getName());
		
	}

}
