package week1.day1;

public class ConvertPositiveToNegative {

	public static void main(String[]args)
	{
		int i = -20;
		
		if (i < 0)
		{
		i = i*-1;	
		System.out.println("Convertion of the given number is " + i );	
		}
		else if (i>0)
		{
		System.out.println("The given number is Positive");	
		}
		
		else 
		{
			System.out.println("The given number is Zero");
		}
	}
}
