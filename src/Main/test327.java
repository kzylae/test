package Main;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class test327 {


    public static void main (String[] args) throws  IOException{

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] arr = str.split(",");
        ArrayList result = new ArrayList();

        Queue q = new LinkedList();

        for (int i=0; i<arr.length;i++){

            if (!q.contains(arr[i])){
                q.offer(arr[i]);
            }

        }
        while (!q.isEmpty()) {
            result.add(q.poll());
        }
        for(int k = 0;k<result.size();k++){
            System.out.println(result.get(k));
        }
    }
}
