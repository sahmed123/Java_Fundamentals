package coding_sandbox;

public class multiArrayPractice {
    public static void main (String[] args){

        //int[][] scores_multi = new int[5][3];

        //int[][] tables = {
        //        {67,45},
        //        {987, 234}
        //};

        int[][] twoDim = new int[4][7];

        for(int i = 0; i < twoDim.length; i++) {
            for (int j = 0; j < twoDim[i].length; j++) {
                twoDim[i][j] = i * j;
                System.out.print(twoDim[i][j] + " - ");
            }
            System.out.println();
        } 
    }
}
