package Assignement5;
//Write a Java program to calculate the sum of the numbers appear in a given string
public class SumApperingInTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="it 15 is25 a 20string";
		String num=" ";
		
		
		for(int i=0;i<a.length();i++)
		{
			if(Character.isDigit(a.charAt(i)))
			{
				num=num+a.charAt(i);
			}
		}
		System.out.println(num);
		

	}

}
