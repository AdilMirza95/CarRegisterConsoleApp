
package Util;

import java.util.Scanner;

public class InputUtil {
    public static String TextAl(String basliq){
        Scanner scan = new Scanner (System.in);
        System.out.println(basliq);
        String cavab = scan.nextLine();
        return cavab;
    }
     public static int ededAl(String basliq){
        Scanner scan = new Scanner (System.in);
        System.out.println(basliq);
        int cavab = scan.nextInt();
        return cavab;
    }
}
