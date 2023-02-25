package Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums1= {1,2,3,0,0,0};
int[] nums2= {2,5,6};
merge(nums1, nums2, 3, 3);
for(int x:nums1)
{
	System.out.println(x);
}
	}

	private static void merge(int[] nums1, int[] nums2, int m, int n) {
		// TODO Auto-generated method stub
int i1=m-1; int i2=n-1; int i3=m+n-1;
while(i1>=0 && i2>=0)
{
	nums1[i3--]= nums1[i1]>nums2[i2]?nums1[i1--]:nums2[i2--];
}
while(i2>=0)
{
	nums1[i3--]=nums2[i2--];
}
	}

}
