package Arrays;

public class TwoPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[] =new int[] {1, 3, 5,6, 8};
ArrayReverse(arr);
for(int x:arr)
{
	System.out.println(x);
}

	}
		private static int[] ArrayReverse(int[] arr) {
			// TODO Auto-generated method stub
	int start=0;
	int end=arr.length-1;
	while(start<end)
	{
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;		
	}return arr;
		}

}
