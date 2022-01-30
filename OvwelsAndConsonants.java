package DoSelectAssmts;

import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Alphabet 
{
	int vCount = 0;
	int cCount = 0;

	public int uniqueVowel(String Str) 
	{
		for (int i = 0; i < Str.length(); i++) 
		{
			if (Str.charAt(i) == 'a' || Str.charAt(i) == 'e' || Str.charAt(i) == 'i' || Str.charAt(i) == 'o'
					|| Str.charAt(i) == 'u') 
			{
				vCount++;
			}

		}
		return vCount;
	}

	public int uniqueConsonant(String Str) 
	{
		for (int i = 0; i < Str.length(); i++) 
		{
			if (Str.charAt(i) != 'a' && Str.charAt(i) != 'e' && Str.charAt(i) != 'i' && Str.charAt(i) != 'o'
					&& Str.charAt(i) != 'u' && Str.charAt(i) != ' ') 
			{

				++cCount;
			}
		}
		return cCount;
	}

}

public class OvwelsAndConsonants 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// Scanner num=new Scanner(System.in);
		String Str = "abacab";
		Alphabet obj = new Alphabet();

		String res = "";
		for (int i = 0; i < Str.length(); i++) 
		{
			int j;
			for (j = i + 1; j < Str.length(); j++)
				if (Str.charAt(i) == Str.charAt(j))
					break;
			if (j == Str.length()) 
			{
				res = res + Str.charAt(i);
			}
		}
		System.out.println(obj.uniqueVowel(res));
		System.out.println(obj.uniqueConsonant(res));
	}

}
