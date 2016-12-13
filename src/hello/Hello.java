package hello;
import java.util.*;
import InheritanceDemo.*;
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "cuocsongso";
		str1+= "147";
		String str2 = str1.concat("125");
		char c = str1.charAt(3);
		int cmp = str1.compareTo("Cuocsongso147125");
		int cmp2 = str1.compareToIgnoreCase("Cuocsongso147125");
		StringBuffer strbuff = new StringBuffer("cuocsong");
		boolean b = str1.contentEquals(strbuff);
		int [] ar = new int[10];
		java.util.Arrays.fill(ar, 15);
		for(int ii:ar){
			System.out.println(ii+" ");
		}
		Arrays.fill(ar, 1);
		Mouse mouse = new Mouse("Jerry",6);
		
	}

}
