import java.util.regex.*;

class Main
{
  public static void main(String[] args)
  {
    String input="public class Test";
    String input1 = "abstract class Animal";
    String input2 = "Public class Test1";//P should not be caps 
    String input3 = "fin class ";//missing class name 
    String input4 = "fin class Test";

    /*String re1="((?:[a-z][a-z]+))";	// Word 1
    String re2="(\\s+)";	// White Space 1
    String re3="((?:[a-z][a-z]+))";	// Word 2
    String re4="(\\s+)";	// White Space 2
    String re5="((?:[a-z][a-z]+))";	// Word 3*/
    //Pattern p = Pattern.compile("(public\\s|abstract\\s|fin\\s)?\\s*(class)\\s+(\\w+)");
    String regex = "(public\\s|abstract\\s|fin\\s)?\\s*(class)\\s+(\\w+)";
    //Pattern p = Pattern.compile(re1+re2+re3+re4+re5,Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
    boolean m = Pattern.matches(regex, input); 
    boolean m1 = Pattern.matches(regex, input1);
    boolean m2 = Pattern.matches(regex, input2);
    boolean m3 = Pattern.matches(regex, input3);
    boolean m4 = Pattern.matches(regex, input4);
    if(m)
    {
    	System.out.println("M is Matches!" );
    }
    else
    {
    	System.out.println("M is Something wrong");
    }
    
    if(m1)
    {
    	System.out.println("Matches!");
    }
    else
    {
    	System.out.println("Something wrong");
    }
    if(m2)
    {
    	System.out.println("Matches!");
    }
    else
    {
    	System.out.println("Something wrong");
    }
    if(m3)
    {
    	System.out.println("Matches!");
    }
    else
    {
    	System.out.println("Something wrong");
    }
    if(m4)
    {
    	System.out.println("Matches!");
    }
    else
    {
    	System.out.println("Something wrong");
    }
    
    /*if (m.find())
    {
        String word1=m.group(1);
        String ws1=m.group(2);
        String word2=m.group(3);
        String ws2=m.group(4);
        String word3=m.group(5);
        System.out.print("("+word1.toString()+")"+"("+ws1.toString()+")"+"("+word2.toString()+")"+"("+ws2.toString()+")"+"("+word3.toString()+")"+"\n");
    }*/
  }
}