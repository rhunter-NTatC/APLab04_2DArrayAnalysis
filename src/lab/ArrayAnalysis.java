package lab;

/*
 * See the link for lab explanation
 * https://docs.google.com/document/d/1QGhcNy-QOFT-J1rOHgeXKv81b5yz0LfEpL_Dl3PPff8/edit#
 * 
 * 
 */

public class ArrayAnalysis {


	public static int[][] createRandom(int row, int column, int min, int max){
		
		int[][] nums = new int[row][column];  //create array with given dimensions
		
		for (int i = 0; i < row; i++) {  //iterate (traverse) through rows
			for (int j = 0; j < column; j++) {  //traverse through columns
				
				nums[i][j] = (int) (Math.random() * (max - min + 1)) + min; //set all spots to 1
				
			}
			
		}
		
		return nums;
	}
	
	
	public static void printArray(int[][] arr)  {
		
		for (int i = 0; i < arr.length; i++) {  //iterate (traverse) through rows
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%7d", arr[i][j]);
			}
			System.out.println();
		}
	
	}
	
	
	
	
	
	
	
	
	
}
