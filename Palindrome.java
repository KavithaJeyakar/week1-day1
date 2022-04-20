package week1.day1;

public class Palindrome {
	
	public static void main(String[]args)
	{
		String str = "level" , rev="";
		
		for(int i = (str.length()-1); i>=0; --i)
		{
		rev = rev + str.charAt(i);
		}
		
	if (str.equals(rev))
		{
			System.out.println("The given string "+ str + " is a palindrome");
		}
	else
		{
		System.out.println("The given string "+ str + " is not a palindrome");
		}
	}
}
