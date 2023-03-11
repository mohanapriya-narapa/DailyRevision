package TwoPointer;

public class ReversePrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(reversePrefix("abcdefd", 'd'));
	}

	private static String reversePrefix(String word, char ch) {
		// TODO Auto-generated method stub
        int ind=-1;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
ind=i;
break;
            }
        }
        if(ind!=-1)
            return reverse(0,ind,word );
        
        return word;

    }
    public static String reverse(int begin, int end, String word)
    {char[] ch=word.toCharArray();
while(begin<end)
{
char temp=ch[begin];
ch[begin]=ch[end];
ch[end]=temp;
begin++;
end--;
}return (new String(ch));
	}

}
