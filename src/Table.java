import java.util.Random;

public class Table {
    private int n;
    private int m;
    private int[][] state;
    private boolean[][] visible;
    public Table(int n, int m, double p) {
        this.n = n;
        this.m = m;
        state = new int[n][m];
        visible = new boolean[n][m];
        Random generator = new Random();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
               visible[i][j] = false;
               double x = generator.nextDouble();
               if(p > x) {
                   state[i][j] = 9;
               }else{
                   state[i][j] = 0;
               }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++) {
                System.out.print(state[i][j]);
            }
            System.out.println();
        }
    }

}
