
import java.util.Arrays;

public class Task1 {
	// add 2 matrices
	public static int[][] add(int[][] a, int[][] b) {
		// TODO
		if (a.length == b.length && a[0].length == b[0].length) {
			int[][] res = new int[a.length][a[0].length];
			for (int row = 0; row < a.length; row++) {
				for (int col = 0; col < a[row].length; col++) {
					res[row][col] = a[row][col] + b[row][col];
				}
			}
			return res;
		} else {
			throw new IllegalArgumentException("Nhap lai mang");
		}

	}

	// subtract 2 matrices
	public static int[][] subtract(int[][] a, int[][] b) {
		// TODO
		if (a.length != b.length && a[0].length != b[0].length) {
			throw new IllegalArgumentException("Nhap lai mang");
		} else {
			int[][] res = new int[a.length][a[0].length];
			for (int row = 0; row < a.length; row++) {
				for (int col = 0; col < a[row].length; col++) {
					res[row][col] = a[row][col] - b[row][col];
				}
			}
			return res;
		}

	}

	// multiply 2 matrices
	public static int[][] multiply(int[][] a, int[][] b) {
		// TODO
		if (a[0].length != b.length) {
			throw new IllegalArgumentException("Nhap lai mang");
		} else {
			int[][] res = new int[a.length][b[0].length];
			for (int row = 0; row < res.length; row++) {
				for (int col = 0; col < res[row].length; col++) {
					for (int i = 0; i < a[0].length; i++) {
						res[row][col] += (a[row][i] * b[i][col]);
					}
				}

			}
			return res;
		}

	}

	// tranpose a matrix
	public static int[][] transpose(int[][] a) {
		// TODO
		int[][] res = new int[a[0].length][a.length];
		for (int row = 0; row < a[0].length; row++) {
			for (int col = 0; col < a.length; col++) {
				res[row][col] = a[col][row];
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[][] a = { { 7, 2 }, { 5, 3 } };
		int[][] b = { { 2, 1 }, { 3, 1 } };
		System.out.println(Arrays.deepToString(add(a, b)));
		int[][] a1 = { { 7, 2, 3, 4 }, { 5, 3, 4, 2 } };
		int[][] b1 = { { 2, 1, 4 }, { 3, 1, 5 }, { 3, 5, 7 }, { 1, 5, 7 } };
		System.out.println(Arrays.deepToString(subtract(a, b)));
		System.out.println(Arrays.deepToString(multiply(a1, b1)));
		System.out.println(Arrays.deepToString(transpose(a1)));
	}
}
