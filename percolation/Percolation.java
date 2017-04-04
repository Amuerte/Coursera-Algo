import java.util.Arrays;

public class Percolation {
	
	private final int n;
	
	private int nbOpen;
	
	private int[][] grid;
	
	/**
	 * Create n-by-n grid, with all sites blocked
	 * 
	 * @param n
	 */
	public Percolation(int n) {
		if (n <= 0) {
			throw new IllegalArgumentException();
		}
		
		int[][] newGrid = new int[n][n];
		for (int[] row : newGrid) {
			Arrays.fill(row, 1);
		}
		
		this.n = n;
		this.grid = newGrid;
		this.nbOpen = 0;
	}

	/**
	 * open site (row, col) if it is not open already
	 * 
	 * @param row
	 * @param col
	 */
	public void open(int row, int col) {
		if (n <= 0) {
			throw new IllegalArgumentException();
		}

	}

	/**
	 * is site (row, col) open.
	 * 
	 * @param row
	 * @param col
	 * @return
	 */
	public boolean isOpen(int row, int col) {
		if (row <= 0 || col <= 0) {
			throw new IllegalArgumentException();
		}

		return grid[row-1][col-1] == 0;
	}

	/**
	 * is site (row, col) full?
	 * 
	 * @param row
	 * @param col
	 * @return
	 */
	public boolean isFull(int row, int col) {
		if (row <= 0 || col <= 0) {
			throw new IllegalArgumentException();
		}
		
		return !isOpen(row, col);
	}

	/**
	 * Number of open sites
	 * 
	 * @return
	 */
	public int numberOfOpenSites() {
		return 0;
	}

	/**
	 * Does the system percolate
	 * 
	 * @return
	 */
	public boolean percolates() {
		return false;
	}

	/**
	 * test client (optional)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Percolation test3 = new Percolation(3);
		System.out.println("tto");
	}
}
