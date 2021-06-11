package Main;

import java.util.*;

public class test5 {

    public  static  void main (String[] agrs){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr1 = new int[a];
        int[] arr2 = new int[b];
        for (int i =0;i<a;i++){
            arr1[i] = sc.nextInt();
        }
        for (int i =0;i<b;i++){
            arr2[i] = sc.nextInt();
        }

        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i<a;i++){
            result.add(arr1[i]);
        }
        for (int i = 0; i<b;i++){
            result.add(arr2[i]);
        }
        List<Integer> out = new ArrayList<Integer>();

        for (int i =0; i<result.size();i++){
            if (result.indexOf(result.get(i))==result.lastIndexOf(result.get(i))){
                out.add(result.get(i));
            }
        }
        Collections.sort(out);
        for (int i:out){

            System.out.print(i);
        }
    }
}
