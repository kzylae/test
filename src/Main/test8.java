package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test8 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        List<String> str = new ArrayList();
        while (true){

            String s = sc.nextLine();

            if (s.equals("")){
                break;
            }
            str.add(s);
        }

        int A=0;
        int B=0;
        int C=0;
        int D=0;
        int E=0;
        int W=0;
        int P=0;

        for (int i=0;i<str.size();i++){

            String[] test = str.get(i).split("~");


            String[] s1 = test[0].split("\\.");
            String[] s2 = test[1].split("\\.");
            String s = "";
            for (int j =0;j<4;j++){
                int value = 1 << 8 |Integer.valueOf(s2[j]);
                s = s + Integer.toBinaryString(value).substring(1);
            }

            if (s.indexOf("0")==-1||s.indexOf("0")!=s.lastIndexOf("1")+1||s.indexOf("1")==-1){
                W++;
                continue;
            }

            int first = Integer.valueOf(s1[0]);
            if (s1.length!=4||s2.length!=4){
                W++;
                continue;
            }
            if (first==0||first==127){
                continue;
            }

            int[] result = new int[4];

            for (int j=0;j<4;j++){
                if (s1[j].equals("")||s2[j].equals("")){
                    result[j] = 0;
                }else {
                    result[j] = Integer.valueOf(s1[j]) & Integer.valueOf(s2[j]);
                }

            }
            if (result[0]>=1&&result[0]<=126&&result[1]>=0&&result[1]<=255&&result[2]>=0&&result[2]<=255&&result[3]>=0&&result[3]<=255){
                A++;
            }else if (result[0]>=128&&result[0]<=191&&result[1]>=0&&result[1]<=255&&result[2]>=0&&result[2]<=255&&result[3]>=0&&result[3]<=255){
                B++;
            }else if (result[0]>=192&&result[0]<=223&&result[1]>=0&&result[1]<=255&&result[2]>=0&&result[2]<=255&&result[3]>=0&&result[3]<=255){
                C++;
            }else if (result[0]>=224&&result[0]<=239&&result[1]>=0&&result[1]<=255&&result[2]>=0&&result[2]<=255&&result[3]>=0&&result[3]<=255){
                D++;
            }else if (result[0]>=240&&result[0]<=255&&result[1]>=0&&result[1]<=255&&result[2]>=0&&result[2]<=255&&result[3]>=0&&result[3]<=255){
                E++;
            }
            if (result[0]==10&&result[1]>=0&&result[1]<=255&&result[2]>=0&&result[2]<=255&&result[3]>=0&&result[3]<=255){
                P++;
            }
            if (result[0]==172&&result[1]>=16&&result[1]<=31&&result[2]>=0&&result[2]<=255&&result[3]>=0&&result[3]<=255){
                P++;
            }
            if (result[0]==192&&result[1]==168&&result[2]>=0&&result[2]<=255&&result[3]>=0&&result[3]<=255){
                P++;
            }
        }
        System.out.print(A+" "+B+" "+C+" "+D+" "+E+" "+W+" "+P);
    }
}
