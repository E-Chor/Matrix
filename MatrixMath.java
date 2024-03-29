import java.util.Arrays;
/**
 * Write a description of class MatrixMath here.
 *
 * @author ( Mr. Kim)
 * @version ((October 28. 1029)
 */
public class MatrixMath
{
    // instance variables - replace the example below with your own
    private int[][] data;

    /**
     * Constructor for objects of class MatrixMath
     */
    public MatrixMath(int[][] data)
    {
        // initialise instance variables
        this.data=data;
    }

    /**
     * Find the sum of all the elements in each row.
     * 
     *
     * @return    int[]
     */
    public int[] rowSum(int y)
    {
        int[] sum=new int[1];
        for(int x=0;x<=data[y].length-1;x++)
            {
                sum[0]=sum[0]+data[y][x];
            }
        System.out.println(Arrays.toString(sum));
        return sum;
    }
    
        /**
     * Find the average of all the values in each row
     *
     * @return    int[] 
     */
    public double[] rowAve(int y)
    {
        double[] sum=new double[1];
        for(int x=0;x<=data[y].length-1;x++)
            {
                sum[0]=sum[0]+data[y][x];
            }
        sum[0]=sum[0]/data[y].length;
        System.out.println(Arrays.toString(sum));
        return sum;
    }
    
        /**
     * Find the sum of all the numbers in column
     * 
     *
     * @return    int[] 
     */
    public int[] colSum(int y)
    {
        int [] sum=new int[1];
        for(int x=0; x<data.length;x++)
            {
                sum[0]=sum[0]+data[x][y];
            }
        System.out.println(Arrays.toString(sum));
        return sum;
    }
    
     /**
     * Find the average of all the values in each row
     *
     * @return    int[] 
     */
    public double[] colAve(int y)
    {
        double [] sum=new double[1];
        for(int x=0; x<data.length;x++)
            {
                sum[0]=sum[0]+data[x][y];
            }
        sum[0]=sum[0]/data.length;
        System.out.println(Arrays.toString(sum));
        return sum;
    }
    
}
