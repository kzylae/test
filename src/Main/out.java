package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class out {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        ArrayList<String> str = new ArrayList<>();
//        while (true){
//            String s = sc.nextLine();
//            str.add(s);
//            if (s.equals("")){
//                break;
//            }
//        }
//        for (String i: str) {
//            System.out.println(i);
//        }
//        }
        int value = 1 << 8 | 255;
        String bs = Integer.toBinaryString(value); //0x20 | 这个是为了保证这个string长度是6位数




        System.out.println(bs.substring(1));
}
    }

