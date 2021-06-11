package Main;

import java.util.Scanner;

public class test6 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] in = str.toCharArray();
        for (int i=0; i<in.length;i++){
            if (in[i]>='a'&&in[i]<='z'){
                in[i] = (char)(in[i]-32);
            }else if (in[i]>='A'&&in[i]<='Z'){
                in[i] = (char)(in[i]+32);
            }
        }
        String out = String.valueOf(in);
        System.out.print(out);
    }
}
