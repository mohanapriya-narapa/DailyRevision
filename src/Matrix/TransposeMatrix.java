package Matrix;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		int[][] mat=new int[][] {{0,1,2}, {2,3,4}, {5,6,7}};
		int[][] result=TransposeMatrix(mat);
		for(int i=0;i<result.length;i++)
		{
			for(int j=0;j<result[0].length;j++)
			{
				System.out.println(result[i][j]);
			}
		}
	}

	private static int[][] TransposeMatrix(int[][] mat) {
		// TODO Auto-generated method stub
		int[][] res=new int[mat[0].length][mat.length];
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[0].length;j++)
			{
				res[i][j]=mat[j][i];
			}
		}
		return res;
	}

}
