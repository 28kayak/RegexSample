import java.util.regex.Pattern;


public class Test {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String line = "public void getName(int i, String s)";
		String [] arr = line.split("[\\(\\),]");
		for(int i =0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		//String line1 = "(char)\\s+\\w+\\s*(;?|((=\\s*\\'[A-Za-z\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\-\\~\\=\\+\\/"
					//+"\""+ "\\']?)"+ "\\s*));";
		String input = "String a = " +  " AAA" +";"; 
		String input1 = "String s;";
		System.out.println(input);
		String regex = "(String)\\s+\\w+\\s*(;?|((=\\s*(\\p{Punct}|\\p{Alnum})+)+)\\s*)";
		Pattern p = Pattern.compile(regex);
		if(Pattern.matches(regex, input))
		{
			System.out.println("TRUE");
	
		}
		else
		{
			System.out.println("Flase");
			
		}
		if(Pattern.matches(regex, input1))
		{
			System.out.println("TRUE");
	
		}
		else
		{
			System.out.println("Flase");
			
		}
	}

}
