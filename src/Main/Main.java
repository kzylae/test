package Main;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){

        int[][] test = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        out(test);

    }

    public static  void out (int[][] in ){

        int[][] out = in;
        for (int i =0;i<out.length;i++){
            for(int j =out.length-1;j>i;j--){
                if (out[j][0]>out[j-1][0]) {
                    int[] k = out[j-1];
                    out[j-1] = out[j];
                    out[j] = k;

                }

            }
        }
        for (int i =0;i<out.length;i++){
            for(int j =out.length-1;j>i;j--){
                if (out[j][1]<out[j-1][1]) {
                    int[] k = out[j-1];
                    out[j-1] = out[j];
                    out[j] = k;

                }

            }
        }
        for (int i=0;i<out.length;i++){

                System.out.print(out[i][0]+","+out[i][1]+" ");

        }
    }
}
