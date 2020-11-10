

package LabaII;
import java.util.Scanner;
import java.lang.Math;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author truel
 */
public class Z1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double[] x = new double[4];
        double[][] y = new double[4][4];
        for (int o = 0; o < 4; o++){
            x[o] = Math.random() * (10 - (-10)) + (-10);
        }
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if((x[i]>0)&(x[j]>0)){
                    y[i][j] = Math.log(x[i]+x[j]);
                    
                }
                else y[i][j] = Math.sin(x[i]+x[j]);
                System.out.print(y[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
