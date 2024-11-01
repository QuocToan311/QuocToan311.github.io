
public class TicTacToe {
	private static final char EMPTY = ' ';
	private char[][] board;

	public TicTacToe(char[][] board) {
		super();
		this.board = board;
	}

	/*
	 * this method checks all rows and returns true if any of them are marked with
	 * all of a single player's markers. Otherwise, returns false.
	 */
	public boolean checkRows() {
		// TODO
		for (int i = 0; i < board.length; i++) {
			char c = board[i][0];
			if (c != EMPTY) {
				int count = 0;
				for (int j = 1; j < board.length; j++) {
					if (c == board[i][j])
						count++;
				}
				if (count == board.length - 1)
					return true;
			}
		}
		return false;
	}

	/*
	 * this method checks all columns and returns true if any of them are marked
	 * with all of a single player's. Otherwise, returns false.
	 */
	public boolean checkColumns() {
		// TODO
		for (int i = 0; i < board[0].length; i++) {
			char c = board[0][i];
			if (c != EMPTY) {
				int count = 0;
				for (int j = 1; j < board[i].length; j++) {
					if (c == board[j][i])
						count++;
				}
				if (count == board.length - 1)
					return true;
			}
		}
		return false;
	}

	/*
	 * this method checks both diagonals and returns true if any of them are marked
	 * with all of a single player's markers. Otherwise, returns false.
	 */
	public boolean checkDiagonals() {
		// Check top-left to bottom-right
		// TODO
		// Check bottom-left to top-right
		// TODO
		char c = board[0][0];
		if (c != EMPTY) {
			int count = 0;
			for (int i = 1; i < board.length; i++) {
				if (c == board[i][i])
					count++;
			}
			if (count == board.length - 1)
				return true;
		}
		char c1 = board[0][board.length - 1];
		if (c1 != EMPTY) {
			int count = 0;
			for (int i = 1; i < board.length; i++) {
				if (c1 == board[i][board.length - 1 - i])
					count++;
				if (count == board.length - 1)
					return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		char[][] xo = { { 'x', ' ', 'x' }, { ' ', 'x', ' ' }, { 'x', ' ', ' ' } };
		char[][] xo1 = { { 'x', 'x', 'x', ' ' }, { 'x', 'x', ' ', 'x' }, { 'x', ' ', 'x', ' ' },
				{ 'x', ' ', ' ', 'x' } };
		TicTacToe t = new TicTacToe(xo);
		TicTacToe t1 = new TicTacToe(xo1);
		
		System.out.println(t.checkRows());
		System.out.println(t.checkColumns());
		System.out.println(t.checkDiagonals());
		System.out.println(t1.checkColumns());
		System.out.println(t1.checkDiagonals());
	}
}
