package Main;

import java.util.*;

public class test9 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s0 = str.replace(":", "");
        String[] s = s0.split("");
        int[] arr = new int[4];
        String out = "";

        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.valueOf(s[i]);
        }
        if (getcolsest(arr, arr[3]) > 0) {
            out = s[0] + s[1] + ":" + s[2] + String.valueOf(arr[3] + getcolsest(arr, arr[3]));
        } else {
            if (getcolsest(arr, arr[2]) > 0 && getcolsest(arr, arr[2]) + arr[2] < 6) {
                out = s[0] + s[1] + ":" + String.valueOf(arr[2] + getcolsest(arr, arr[2])) + String.valueOf(min(arr));
            } else {
                if (getcolsest(arr, arr[1]) > 0 && arr[0] < 2) {
                    out = s[0] + String.valueOf(arr[1] + getcolsest(arr, arr[1])) + ":"
                            + String.valueOf(min(arr)) + String.valueOf(min(arr));
                } else if (getcolsest(arr, arr[1]) > 0 && getcolsest(arr, arr[1]) + arr[1] < 4 && arr[0] == 2) {
                    out = s[0] + String.valueOf(arr[1] + getcolsest(arr, arr[1])) + ":"
                            + String.valueOf(min(arr)) + String.valueOf(min(arr));
                } else {
                    out = String.valueOf(min(arr)) + String.valueOf(min(arr)) + ":"
                            + String.valueOf(min(arr)) + String.valueOf(min(arr));
                }
            }
        }
        System.out.println(out);
    }

    private static int getcolsest(int[] arr, int k) {

        int d = 999;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] - k > 0 && d > arr[i] - k) {
                d = arr[i] - k;
            }
        }
        if (d == 999) {
            d = 0;
        }
        return d;
    }

    private static int min(int[] arr) {
        int k = arr[0];
        for (int i = 0; i < arr.length; i++) {
            k = k < arr[i] ? k : arr[i];
        }
        return k;
    }
}


