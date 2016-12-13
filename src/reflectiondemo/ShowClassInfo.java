package reflectiondemo;

import java.lang.reflect.Modifier;

public class ShowClassInfo {
//	Một số method quan trọng trong Reflection liên quan tới Class.
//	Ví dụ ghi ra các thông tin cơ bản của class như tên class, package, modifier, 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lấy ra đối tượng Class
		Class<ShowClassInfo> aClass = ShowClassInfo.class;
		//gi ra tên class + package
		System.out.println("Class name = " + aClass.getName());
		System.out.println("Class name = " + aClass.getSimpleName());
		System.out.println("Package: "+aClass.getPackage().getName());
		//Modifiers
		int modifiers = aClass.getModifiers();
		boolean isPublic = Modifier.isPublic(modifiers);
		System.out.println("is public: "+ isPublic);
	}
}
