package JumpStatement;

public class Continue {
	public static void main(String args[])
	{   int i=1;
		for(i=1;i<=10;i++)
		{
			if(i%2==0) {
				continue;
			}
			System.out.println("\n"+i);
		}
	}

}
