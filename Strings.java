package String;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="roshan";
		String s2="   DINESH   ";
		System.out.println(s1.charAt(2));
	    System.out.println(s1.toUpperCase());
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.equals(s2));
	    System.out.println(s1==s2);
		System.out.println(s1.indexOf("o"));
		System.out.println(s2.lastIndexOf("D"));
		System.out.println(s1.endsWith("an"));
		System.out.println(s2.startsWith("sh"));
		System.out.println(s2.toLowerCase());
		System.out.println(s2.trim());
	    System.out.println(s1.length());  // this is lenth method,to fid the length we use this method
	   // System.out.println(s1.replace("Replacing s in s1 with k:");
	    System.out.println("Replace s in s1 with k  : "+ s1.replace("s","k"));
	}

}
