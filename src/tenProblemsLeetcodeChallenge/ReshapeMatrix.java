package tenProblemsLeetcodeChallenge;

public class ReshapeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat=new int[][] {{1,2},{3,4}};
		int r=1; int c=4;
		int row=0;
		int col=0;
		int[][] result=new int[r][c];
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				result[row][col]=mat[i][j];
			 col++;
			 if(col==c)
			 {
				 row++;
				 col=0;
			 }
			}
		}
		for(int i=0;i<result.length;i++)
		{
			for(int j=0;j<result[0].length;j++)
			{System.out.println(result[i][j]);
			}
		}
	}

}
