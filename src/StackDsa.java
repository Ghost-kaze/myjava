/*
    stack using array
    author: Sameer saini
 */

import java.util.Scanner;

import static java.lang.System.exit;


public class StackDsa {
    static int top=-1;
    static int a = 3;
    static int b[] = new int[a];
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        String ch;
        int c;
        int x;
        do {
            System.out.println("1.push\n2.pop\n3.exit");
            c = in.nextInt();
            switch (c){
                case 1: {
                    System.out.println("enter the element: ");
                    x = in.nextInt();
                    push(x);
                    break;
                }
                case 2:{
                    pop();
                    break;
                }
                case 3: exit(0);
            }
            System.out.println("Wanna continue!!: ");
            ch = in.next();
        }while(ch.equalsIgnoreCase("y"));
    }
    public static boolean push(int x){
        if(top>=(a-1)){
            System.out.println("Stack overflow");
            return false;
        }
        else{
            b[(++top)] = x;
            System.out.println(x);
            return true;
        }
    }
    public static boolean pop(){
        if(top<0){
            System.out.println("stack underflow!!");
            return false;
        }
        else{
            System.out.println(b[top--]);
            return true;
        }
    }
}
