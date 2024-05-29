
import java.util.*;
public class Meenu
{
public static void main(String[] args)
{
		String strReverse = "Meenakshi";
		char[] arr = strReverse.toCharArray();
		String sAfterReverse= "";
		
		
		for(int i = arr.length-1; i>=0; i--)
		{
			sAfterReverse = sAfterReverse + arr[i];
		}
		
}
}