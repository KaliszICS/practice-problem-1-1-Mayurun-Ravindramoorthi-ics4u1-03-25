public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int sum2D(int[][] num2d){
		int c=0;
		for(int i = 0; i < num2d.length;i++){
			for(int j=0;j<num2d[i].length;j++){
				c += num2d[i][j];
			}
		}
		return c;
	}

	public static int sumRow(int[][] num2d, int d){
		int c= 0;
		for(int i=0;i<num2d[d].length;i++){
			c += num2d[d][i];
		}
		return c;
	}
	public static int sumColumn(int[][] num2d,int d){
		int c=0;
		for(int i=0;i<num2d.length;i++){
			c += num2d[i][d];
		}
		return c;
	}
}

