
public class SwapNumber
{
	public static void main(String[] args)
	{
		SwapNumber(3,5);
		System.out.println("Test");
	}
	
	public static void SwapNumber(int i, int j)
	{
		System.out.println("Before swapping, first number is " + i + " and Second Number is " + j);
		int a = 0;
		a = j;
		j=i;
		i=a;
		System.out.println("Numbers are swapped. Now first number is " + i + " and Second Number is " + j);
	}
}