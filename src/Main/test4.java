package Main;


import java.util.Arrays;
import java.util.Scanner;

public class test4 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = str.substring(1,str.length()-1);
        String[] arr = s.split(",");
        int[] result = new int[3];
        int n  = arr.length;

        for (int i =0;i<n;i++){
            for (int j =i+1;j<n;j++){
                for (int k =j+1;k<n;k++){
                    if (Integer.valueOf(arr[i])+Integer.valueOf(arr[j])+Integer.valueOf(arr[k])==1){

                        result[0] = Integer.valueOf(arr[i]);
                        result[1] = Integer.valueOf(arr[j]);
                        result[2] = Integer.valueOf(arr[k]);
                        break;
                    }

                }
            }
        }


        Arrays.sort(result);
        System.out.print("[["+result[0]+", "+result[1]+", "+result[2]+"]]");


    }
}
