import java.util.regex.*;

public class Main
{
  public static void main(String[] args)
  {
	 // try{
		    String input  =  "public class Test {";
		    String input1 = "abstract public class Animal {";
		    String input2 = "Public class Test1";//P should not be caps 
		    String input3 = "fin class ";//missing class name 
		    String input4 = "   final class TestAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA               {";
		
		   int i = - (1 -1 );
		    //Pattern p = Pattern.compile("(public\\s|abstract\\s|fin\\s)?\\s*(class)\\s+(\\w+)");
		    //String regex = "\\s*(public\\s|abstract\\s|final\\s)?\\s*(class)\\s+(\\w+)\\s*";
		    String Classregex = "\\s*(public\\s|abstract\\s|final\\s)?\\s*(class)\\s+(\\w+)\\s*\\{";
		    //one or zero of public or abstract or final + 0 or more number of space + "class" + 1 or more number of space + 1 or more number of letters 
		    Pattern p = Pattern.compile(Classregex);
		    System.out.println(p.toString());
		    String class_name = "";
		    boolean m = Pattern.matches(Classregex, input); 
		    boolean m1 = Pattern.matches(Classregex, input1);
		    boolean m2 = Pattern.matches(Classregex, input2);
		    boolean m3 = Pattern.matches(Classregex, input3);
		    boolean m4 = Pattern.matches(Classregex, input4);

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
		    
		    //Contractor checking 
		    if(!class_name.equals(""))
		    {
		    	String constructorRegex = "\\s*(public\\s|private\\s|protected\\s)?"+class_name+"\\s*\\((.*)\\)\\s*";
		    	//0 or more num of space + 1 or 0 num of public or private or protected + class_name + 0 or more space + ( + 
		    	boolean b = Pattern.matches(constructorRegex, input);
		    	Pattern p1 = Pattern.compile(constructorRegex);
				System.out.println(p1.toString());
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
  		//System.out.println("splited: " + classDeclaration[i]);
  		if(classDeclaration[i].equals("class"))
  		{
  			class_name = classDeclaration[i+1];
  			//System.out.println("FUNC: class name is " + class_name);
  		}
  	}
  	return class_name;
  }//getClassName
  
  
}