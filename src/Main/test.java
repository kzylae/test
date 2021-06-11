package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class test {
    public static int lmin(int[] a){
        int min=a[0];
        int k=0;
        for (int i=0;i<a.length;i++){
            if (min>a[i]){
                min = a[i];
                k=i;
            }
        }
        return k;
    }
    public static int max(int[] a){
        int max=a[0];
        for (int i=0;i<a.length;i++){
            if (max<a[i]){
                max = a[i];
            }
        }
        return max;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str1 = bf.readLine();
        String str2 =bf.readLine();
        String[] s1 = str1.split(" ");
        String[] s2 = str2.split(" ");
        int m = Integer.valueOf(s1[0]);
        int n = Integer.valueOf(s1[1]);
        int[] num = new int[n];
        int k;
        for (int i =0;i<n;i++){
            num[i] = Integer.valueOf(s2[i]);
        }
        for (int i=0;i<num.length-1;i++){
            for (int j = 0;j<num.length-1-i;j++){
                if (num[j]>num[j+1]){
                    k=num[j];
                    num[j] = num[j+1];
                    num[j+1]=k;
                }
            }
        }

        int[] min = new int[m];
        if (m>=n){
            System.out.print(max(num));
        }else {
            for (int j = 0; j < m; j++) {
                min[j] = num[j];
            }
            for (int i = m; i < n; i++) {

                int e = lmin(min);
                min[e] = min[e] + num[i];

            }
            System.out.print(max(min));
        }
    }
}
