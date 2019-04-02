package Lab3;

import java.util.Arrays;
/**
 * 
 * @author GANGWAR
 *
 *
 */

public class Lab3_2 {
	
	public static String[] getSorted(String[] s) {
		int size=s.length;
		String []s1=new String[size];
	    Arrays.sort(s);
		for(int i=0;i<size;i++) {
			if(i<(size+1)/2) {
				s1[i]=s[i].toUpperCase();		
				}
			else {
				s1[i]=s[i].toLowerCase();
			}
		}
		return s1;	
	 }

	public static void main(String args[]) {
		String []s= {"Ajay","Sunny","lokesh","Ravi","Priyesh","Vishak","Hello","Hi"};
		String []sp=getSorted(s);
		for(int i=0;i<sp.length;i++) {
			System.out.println(sp[i]);
			}
	}

}
