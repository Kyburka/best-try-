import java.util.*;
public class Lab1 {
    static final int E_LENGTH = 7;
    static final int X_LENGTH = 19;
    static final int MIN_RANDOM = -13;
    static final int MAX_RANDOM = 13;
    static final int E1_ROWS = 7;
    static final int E1_COLS = 19;
    public static void main(String[] args) {
        int[] e = new int[E_LENGTH];
        Random random = new Random();
        int start = 4, counter = 0;
        while(start <= 16){
            if(start%2 == 0) {
                e[counter] = start;
                counter++;
            }
            start++;
        }
        double[] x = new double[X_LENGTH];
        for(int i = 0; i<X_LENGTH; i++) {
            x[i] = (MAX_RANDOM-MIN_RANDOM)*random.nextDouble()+MIN_RANDOM;
        }
        double e1[][] = new double[E1_ROWS][E1_COLS];
        for(int i = 0; i<E1_ROWS; i++) {
            for(int j = 0;j<E1_COLS; j++) {
                if(e[i] == 12) {
                    e1[i][j] = Math.cos(Math.log(Math.acos(x[j]/26.0)));
                }
                else if((e[i] == 8) || (e[i] == 14) || (e[i] == 16)) {
                    e1[i][j] = Math.log(Math.exp(Math.atan(Math.cos(x[j]))));
                }
                else {
                    e1[i][j] = Math.atan(Math.exp(Math.pow((-Math.pow(((Math.pow((2*Math.abs(x[j])), x[j]))/(Math.PI)), 2.0)), (1.0/3.0))));
                }
            }
        }
        for(int i = 0; i<E1_ROWS; i++) {
            for(int j = 0; j<E1_COLS; j++) {
                System.out.printf("%-10.4f", e1[i][j]);
            }
            System.out.println();
        }
    }
}