import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class JavaSyntax 
{
	public static void main(String[] args)
	{
		String try1 = "String i = Class.method();";
		String try2 = "Class.method(i, s);";
		String try3 = "instance.f(s);";
		String try4 = "i = Class.method();";
		String try5 = "i = Class.method(s ,);";// should be error 
		isFunctionCall(try1);
		isFunctionCall(try2);
		isFunctionCall(try3);
		isFunctionCall(try4);
		isFunctionCall(try5);
		String i = try1 + '\"' + try2;
		System.out.println("i is "+ i);
	}
	static boolean isFunctionCall(String line)
	{
		boolean varidity = false;
		String functionCall = "((private|public|protected)?"//Accessibility 
				+ "(String|float|double|boolean|int)?\\s+\\w+\\s+(=)?)?"//returned type + " " variable + = ?
				+ "\\s*((([A-Z]{1})?\\w+)\\.)?"//class or instance.
				+ "\\w+"//method name
				+ "\\s*\\("//the start of parm
				+ "(\\s*\\w+\\s*(,\\s*\\w+\\s*)?)*"//arguments 
				+ "\\);";//the end of param
		Pattern p = Pattern.compile(functionCall);
		System.out.println(p.toString());
		Matcher m = p.matcher(line);
		if(m.find())
		{//yes, find
			System.out.println("Yes it is OK function call " + line);
			varidity = true;
		}
		else
		{
			System.out.println("No it is wrong function call " + line);
			varidity = false;
		}
		
		return varidity;
	}
	static boolean isLoop(String line)
	{
		boolean varidity = false;
		/*String whileReg = "while\\s*"//while 
				+ "\\("//start of condition
				+ "\\s*\\w+(\\s*==(\\s*(\\d|\\w+)\\s*)"
				+ "|"//or
				+ "(\\.(equles\\(\\s*\\w+\\s*\\))))"
				+ "\\)\\s*"//end of condition
				+"\\{";
		*/
		
		
		return varidity;
	}
	static boolean isIf(String line)
	{
		boolean varidity = false;
		String if_satetment = "if\\s*\\(\\s*(!\\s*)?\\w+(\\s*(=|\\!)=(\\s*(\\d|\\w+)\\s*)|(\\.(equles\\(\\s*\\w+\\s*\\))))\\)\\s*\\{";
		
		return varidity;
	}

	
}//class

