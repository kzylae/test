package Main;

import java.util.Scanner;

public class test7 {

    public static  void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] in = new int[a][b];
        for (int i =0;i<a;i++){
            for (int j = 0; j<b;j++){
                in[i][j] = sc.nextInt();
            }
        }
        int[][] result = new int[a][b];
        for (int i =0;i<b;i++){
            if (in[0][i]==1){
                result[0][i] =1;
            }
        }
        for (int i =0;i<a;i++){
            if (in[i][0]==1){
                result[i][0] =1;
            }
        }
        for (int i =1;i<a;i++){
            for (int j = 1; j<b;j++) {
                if (in[i][j]==1) {
                    result[i][j] = 1 + Math.min(Math.min(result[i][j - 1], result[i - 1][j]), result[i - 1][j - 1]);
                }else {
                    result[i][j] =0;
                }
            }
        }
        int l =0;
        for (int i =0;i<a;i++){
            for (int j = 0; j<b;j++){
                l = l>result[i][j]?l:result[i][j];
            }
        }
        System.out.print(l);
    }

}
