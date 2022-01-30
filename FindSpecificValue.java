package Assignement;
/* 3. Write a Java Program to check if see if Array contains a specific value.
 *  [Solution: Program : To check if Array contains an specific element. (Primitive value)]*/
public class FindSpecificValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,5,6,7,8,9};     // declaring an array 
		int find=2;                         // value to check
		
		boolean check=false;
		
		for(int element: arr)               //here we iterate every element of an array
		{
			if(element==find)                //if both are equal, it becomes true, and out of the loop.
			{
				check = true;
				break;
			}
		}
		if(check)
		{
			System.out.println(find +" is found");
		}
		else
		{
			System.out.println(find +" is not found");
		}
	}

}
