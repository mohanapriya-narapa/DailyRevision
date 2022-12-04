package ctci_one;

public class isUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isUnique("mango"));
	}

	private static boolean isUnique(String str) {
		// TODO Auto-generated method stub
	boolean[] ch=new boolean[128];
	
		for(int i=0;i<str.length();i++)
		{
			
			if(ch[str.charAt(i)])
			{
				return false;
			}
			ch[str.charAt(i)]=true;
		}
		
		return true;
	}
}