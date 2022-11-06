//Diagonal_Sum
public class Main
{
    public static int Diagonal_Sum(int matrix[][]) {
        int sum=0;
        //Unoptimized method
       /* for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                //primary Diagonal_Sum
                if(i==j) {
                    sum+=matrix[i][j];
                }
                  //secondary Diagonal_Sum
                else if(i+j==matrix.length-1) {
                    sum+=matrix[i][j];
                }
                
            }
            
        } */
        //Optimized method
        for(int i=0;i<matrix.length;i++) {
            sum+=matrix[i][i];
            if(i!=matrix.length-1-i) {
                sum+=matrix[i][matrix.length-1-i];
            } }
       return sum;
    } 
    
	public static void main(String[] args) {
		int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
         System.out.print(Diagonal_Sum(matrix));
	}
}
