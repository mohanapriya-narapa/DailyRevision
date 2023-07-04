package Backtrack;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer[]> res=new ArrayList<Integer[]>();
		Integer[] board=new Integer[4];
		Backtracking(res,board, 0);
		for(Integer[] list:res)
		{
			for(int x:list)
			{
				System.out.print(x);
			}
			System.out.println(" ");
		}
		
	}

	private static void Backtracking(List<Integer[]> res, Integer[] board, int row) {
		// TODO Auto-generated method stub
		if(row==board.length)
		{
			res.add((Integer [])board.clone());
		}
		else
		{
			for(int col=0;col<board.length;col++)
{
	if(isValid(row,col,board)) {
		board[row]=col;
		Backtracking(res,board,row+1);
	}
}
		}
	}

	private static boolean isValid(int row, int col, Integer[] board) {
		// TODO Auto-generated method stub
		for(int rowOld=0;rowOld<row;rowOld++)
		{
			Integer colOld=board[rowOld];
			if(colOld==col)
				return false;
			int rowDis=row-rowOld;
			int colDis=Math.abs(col-colOld);
			if(rowDis==colDis)return false;		}
		return true;
	}

}
