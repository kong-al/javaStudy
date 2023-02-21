
public class EX5_1 {
	public static void main(String[] args) {
		String str = "ABCD"   ;
		char ch = str.charAt(0);
		System.out.println("ch  :  " + ch);
		
		String str2 = str.substring(1,4);
		String str3 = str.substring(1,str.length());
		System.out.println("str2  :" + str2);
	}
}
