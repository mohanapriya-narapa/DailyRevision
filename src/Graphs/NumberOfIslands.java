package Graphs;

public class NumberOfIslands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid= new int[][] { {0, 0, 1, 1, 0}, {1, 0, 1, 1, 0}, {0, 1, 0, 0, 0}, {0, 0, 0, 0, 1}};
		System.out.println(NumberOfIslands(grid));
	}

	private static int NumberOfIslands(int[][] grid) {
		// TODO Auto-generated method stub
		if(grid.length==0 || grid[0].length==0)
		{
			return 0;
		}
		int r=grid.length;
		int c=grid[0].length;
		int count=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(grid[i][j]==1)
				{
					count++;
					dfs(grid, i, j);
				}
			}
		}
		return count;
	}

	private static void dfs(int[][] grid, int i, int j) {
		// TODO Auto-generated method stub
		int r=grid.length;
		int c=grid[0].length;
		if(i<0 || i>=r || j<0 || j>=c || grid[i][j]==0)
		{
			return;
		}
		grid[i][j]=0;
		dfs(grid, i-1, j);
		dfs(grid, i+1, j);
		dfs(grid, i, j-1);
		dfs(grid, i, j+1);
		
	}

}
