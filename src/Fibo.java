/*
    fibonacci series
    author : Sameer Saini
 */

import java.util.Scanner;

public class Fibo{
    static int x=0,y=1;
    public static void main(String args[]){
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("enter: ");
        a = input.nextInt();
        System.out.println(x+"\n"+y);
        fibo(a);
    }
    public static int fibo(int a){
        int b,c;
        c=x;
        x=y;
        y=x+c;
        System.out.println(y);
        if (a!=0) {
            a--;
            fibo(a);
        }
        else {
            return a;
        }
        return 0;
    }
}
