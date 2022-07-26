package CTCI_Chapter_one;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(stringCompression("aabcccccaaa"));
	}

	private static String stringCompression(String string) {
		// TODO Auto-generated method stub
	int count=0;
	String compression="";
	for(int i=0;i<string.length();i++)
	{count++;
		if(i+1>=string.length() || (string.charAt(i)!=string.charAt(i+1))) 
		
				{
			compression+=""+string.charAt(i)+count;
			count=0;}
	}return compression;
	}

}
