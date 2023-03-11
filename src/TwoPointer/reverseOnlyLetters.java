package TwoPointer;

public class reverseOnlyLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(reverseOnlyLetters("ab-cd"));
	}

	private static String reverseOnlyLetters(String s) {
		// TODO Auto-generated method stub
	       char[] str=s.toCharArray();
	       int low=0;
	       int high=s.length()-1;
	       while(low<high)
	       {
	 while(!Character.isLetter(str[low])  && low<high)
	 {
	low++;
	 } 
	  while(!Character.isLetter(str[high])  && low<high)
	 {
	high--;
	 } 
	            char temp=str[low];
	            str[low]=str[high];
	            str[high]=temp;
	            low++;
	            high--;
	       }
	      return new String(str);
	}

}
