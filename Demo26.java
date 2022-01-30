package ExceptionHandling;

public class Demo26 
{
    public static void main(String[] args) 
    {
       System.out.println(checkName("",""));

    }
    public static String checkName(String firstName,String lastName)
    {
        try 
        {
         if(firstName.isEmpty() || lastName.isEmpty()) 
          {
            throw new MyException();
          }
        else 
          {
             String name = firstName.trim() + lastName.trim();
             return name;
          }
        }
     catch(MyException ex) 
        {
            return"you have to enter a name";
        }
     }
}
class MyException extends Exception
{
    
    MyException()
    {
        
    }
}



