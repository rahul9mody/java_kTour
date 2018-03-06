/*
 * Rahul Mody
 */

public class KnightsTour
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		KnightsTour tour1 = new KnightsTour(8);
		
		if(tour1.kTour(0,0))
		{
			tour1.printBoard();
		}
		
		else
		{
			System.out.println("no solution");
		}
		
	}
	
	public KnightsTour (int size)
	{
		initBoard(size);
		len = size;
	}
	
	/**
	 * It will initialize an empty board of length stored on len. 
	 * @param len provides the dimensions of an empty chess board. 
	 */
	public void initBoard(int len)
	{
		board = new int[len][len];
		
		for(int i = 0; i < board.length; ++i)
		{
			for (int j = 0; j < board.length; ++j)
			{
				board[i][j] = 0;
			}
		}
	}
	
	
	/**
	 * returns true if current position is a legal position on the chess board and if the position was not visited before. False otherwise  
	 * @param x is the x index of the board
	 * @param y is the y index of the board
	 * @return true or false depending on the outcome of conditional statements. 
	 */
	public boolean isPossible(int x, int y)
	{
		if (x < board.length && x > -1 && y < board.length && y > -1)
		{
			if (board[x][y] == 0)
				
				return true;
		}
		
		return false; 
	}
	
	/**
	 * Returns true if the knight is able to visit all the places on the board without repeating any one of them. False otherwise
	 * @param x provides the initial x coordinate of the piece on the board.
	 * @param y provides the initial y coordinate of the piece on the board.
	 * @return returns the true if the tour is completed. 
	 */
	public boolean kTour(int x, int y)
	{
		board[x][y] = position;
		position++;
		
		if (position == (len * len ))
		{
			return true;
		}

		if(isPossible(x-1,y-2))
		{
			if(kTour(x-1,y-2))
			{
				return true;
			}
		}
		
		if(isPossible(x-2,y-1))
		{
			if(kTour(x-2,y-1))
			{
				return true;
			}
		}
		
		if(isPossible(x-2,y+1))
		{
			if(kTour(x-2,y+1))
			{
				return true;
			}
		}
		
		if(isPossible(x-1,y+2))
		{
			if(kTour(x-1,y+2))
			{
				return true;
			}
		}
		
		if(isPossible(x+1,y+2))
		{
			if(kTour(x+1,y+2))
			{
				return true;
			}
		}
		
		if(isPossible(x+2,y+1))
		{
			if(kTour(x+2,y+1))
			{
				return true;
			}
		}
		
		if(isPossible(x+2,y-1))
		{
			if(kTour(x+2,y-1))
			{
				return true;
			}
		}
		
		if(isPossible(x+1,y-2))
		{
			if(kTour(x+1,y-2))
			{
				return true;
			}
		}
		
		board[x][y] = 0;
		position--;
		return false;
	}
	
	/**
	* prints the board with its final results
	*/
	public void printBoard()
	{
		for(int i = 0; i < board.length; ++i)
		{
			for (int j = 0; j < board.length; ++j)
			{
				System.out.printf("%3d", board[i][j]);
				//System.out.print(board[i][j] + " ");
				//System.out.print("  ");
			}
			
			System.out.println();
		}
	}
	
	public int[][] board ;
	public int len;
	public int position = 0;

}

/*
 *Output
  2 19  4  9  0 11  6 63
 21 24  1 18  5  8 45 12
 26  3 20 23 10 17 62  7
 55 22 25 16 29 44 13 46
 36 27 54 43 50 15 30 61
 53 56 37 28 33 42 47 14
 38 35 58 51 40 49 60 31
 57 52 39 34 59 32 41 48

 * 
 */
 

