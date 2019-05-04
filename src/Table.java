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
    }
    public String toString(){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++) {
                result.append(state[i][j]);
            }
            result.append('\n');
        }
        return result.toString();
    }
    public boolean OpenCell(int i,int j){
       if(state[i][j] == 9){
           return false;
       }else{
           //TODO
       }
       return true;
    }
    public boolean IsFinished(){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(state[i][j] != 9 && visible[i][j] == false){
                    return false;
                }
            }
        }
        return true;
    }
}
