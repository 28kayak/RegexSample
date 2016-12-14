import java.util.regex.*;

class Main
{
  public static void main(String[] args)
  {
    String input  =  "public class Test";
    String input1 = "abstract class Animal";
    String input2 = "Public class Test1";//P should not be caps 
    String input3 = "fin class ";//missing class name 
    String input4 = "   final class TestAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";

   
    //Pattern p = Pattern.compile("(public\\s|abstract\\s|fin\\s)?\\s*(class)\\s+(\\w+)");
    String regex = "\\s*(public\\s|abstract\\s|final\\s)?\\s*(class)\\s+(\\w+)\\s*";
    //public or abstract or fin in one or zero + 0 or more number of space + "class" + 1 or more number of space + 1 or more number of letters 
    Pattern p = Pattern.compile(regex);
    System.out.println(p.toString());
    String class_name = "";
    boolean m = Pattern.matches(regex, input); 
    boolean m1 = Pattern.matches(regex, input1);
    boolean m2 = Pattern.matches(regex, input2);
    boolean m3 = Pattern.matches(regex, input3);
    boolean m4 = Pattern.matches(regex, input4);
    if(m)
    {
    	System.out.println("M is Matches!" );
    	class_name = getClassName(input);
    	System.out.println("IF: class name is " + class_name);
    	
    	
    	
    }
    else
    {
    	System.out.println("M is Something wrong");
    }
    
    if(m1)
    {
    	System.out.println("Matches!");
    	class_name = getClassName(input1);
    	System.out.println("IF: class name is " + class_name);
    	
    }
    else
    {
    	System.out.println("Something wrong");
    }
    if(m2)
    {
    	System.out.println("Matches!");
    	class_name = getClassName(input2);
    	System.out.println("IF: class name is " + class_name);
    }
    else
    {
    	System.out.println("Something wrong");
    }
    if(m3)
    {
    	System.out.println("Matches!");
    	class_name = getClassName(input3);
    	System.out.println("IF: class name is " + class_name);
    }
    else
    {
    	System.out.println("Something wrong");
    }
    if(m4)
    {
    	System.out.println("Matches!");
    	class_name = getClassName(input4);
    	System.out.println("IF: class name is " + class_name);
    }
    else
    {
    	System.out.println("Something wrong");
    }
    
    
   
  }//main
  /*
   * precondition: class declaration is ensured as correct 
   * param: input is original line 
   * */
  static String getClassName(String input)
  {
	 String class_name = "";
	//after ensuing class declaration is correct 
  	String[] classDeclaration = input.split("\\s+");
  	for(int i = 0; i< classDeclaration.length; i++)
  	{
  		if(classDeclaration[i].equals("class"))
  		{
  			class_name = classDeclaration[i+1];
  			//System.out.println("FUNC: class name is " + class_name);
  		}
  	}
  	return class_name;
  }//getClassName
  
}