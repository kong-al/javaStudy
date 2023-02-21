import java.util.Arrays;

public class EX5_2 {
	public static void main(String[] args) {
	int[] arr = {0,1,2,3,4};
	int[][] arr2D = {{11,12},{21,22}};
	
	System.out.println(Arrays.toString(arr));
	System.out.println(Arrays.deepToString(arr2D));
	
	String[][] str2D = {{"aaa","bbb"},{"AAA","BBB"}};
	String[][] str22D = {{"aaa","bbb"},{"AAA","BBB"}};
	
	System.out.println(str2D.equals(str22D));
	System.out.println(Arrays.deepEquals(str2D, str22D));
	
	int[] arr2 = Arrays.copyOf(arr, arr.length);
	}
}
