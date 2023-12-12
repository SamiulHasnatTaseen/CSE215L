
public class Task3 {

	public static void main(String[] args) {
		int array[][]= {
				{3,4,9},
				{2,9,11},
				{4,6,10}
	};
		System.out.println();
		//Sum  of elements in rows
		int row = array.length,col = array[0].length, totRow, totCol, totDiagonal1 = 0, totDiagonal2 = 0;
		for(int i =0;i<row;i++) {
			totRow=0;
			for(int j =0;j<col;j++) {
				totRow += array[i][j];
			}
		System.out.println("Sum of row "+ (i+1) + " : "+ totRow);
		};
		System.out.println();
		//Sum  of elements in columns
		for(int i =0;i<col;i++) {
			totCol=0;
			for(int j =0;j<row;j++) {
				totCol += array[j][i];
			}
		System.out.println("Sum of column "+ (i+1) + " : "+ totCol);
		};
		System.out.println();
		//Sum  of elements in diagonal 1
		for(int k =0;k<row;k++) {
			for(int l =0;l<col;l++) {
				if (k==l) {
					totDiagonal1 += array[k][l];
				}
				if ((k+l)==(array.length-1)) {
					totDiagonal2 += array[k][l];
				}
			}
			}
		System.out.println("Sum of diagonal1 : "+ totDiagonal1);
		System.out.println("Sum of diagonal2 : "+ totDiagonal2);
		System.out.println();
		}
}