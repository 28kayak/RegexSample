
public class Test {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String line = "public void getName(int i, String s)";
		String [] arr = line.split("[\\(\\),]");
		for(int i =0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}

	}

}
