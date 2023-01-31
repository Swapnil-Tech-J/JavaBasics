package string_operations;

public class Compareto {
       
	public static void main(String[] args) {
		String str1 = "ABCDE";
		String str2 = "aBCDE";
		String str3 = "Hello world";
		System.out.println(str1.compareTo(str2));
	System.out.println(str1.compareToIgnoreCase(str2));
	System.out.println(str1.matches(str2));
	System.out.println(str1.trim()+ str2);
	System.out.println(str1.trim()+str3);
	}
}
