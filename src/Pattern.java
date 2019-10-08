/*
    pyramid reverse
    author : Sameer Saini
 */

import java.util.Scanner;

public class Pattern {
    static Scanner in = new Scanner(System.in);
    public static void main(String args[]){
        System.out.print("enter : ");
        int var = in.nextInt();
        for(int x=0;x<var;x++){
            for(int y=0;y<var-x;y++){
                System.out.print(" ");
            }
            for(int y=x;y>0;y--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

}
