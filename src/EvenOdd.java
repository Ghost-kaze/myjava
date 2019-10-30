/*
    Even-Odd
    author: Sameer saini
 */
 import java.util.* ;

public class EvenOdd {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Let's play Even Odd!!");
        System.out.print("What is your name?\n--> ");
        String name = input.next();
        System.out.print("Hi "+name+", which do you choose? (O)dds or (E)vens : \n--> ");
        String choice = input.next();
        if(choice.equalsIgnoreCase("o")) System.out.println(name+" chooses Odds! computer picks Evens!!");
        else if(choice.equalsIgnoreCase("E")) System.out.println(name+" chooses Evens! computer picks Odds!!");
        for(int i=0;i<20;++i) System.out.print("-");

        System.out.println();

        System.out.print("How many fingers do you wish to play with!! \n--> ");
        int Pfingers = input.nextInt();
        Random rand = new Random();
        int Cfingers = rand.nextInt(6);
        System.out.println("The computer plays with "+Cfingers+" \"fingers\"!!");
        for(int i=0;i<20;++i) System.out.print("-");

        System.out.println();

        int Sumfingers = Pfingers + Cfingers;
        System.out.println(Pfingers+" + "+Cfingers+" = "+Sumfingers);
        System.out.print(Sumfingers+" is ...");

        if(Sumfingers%2==0){
            System.out.println("Even");
            if(choice.equalsIgnoreCase("E")) System.out.println(name+" Wins!!");
            else System.out.print("Computer Wins!!");
        }
        else {
            System.out.println("Odd");
            if(choice.equalsIgnoreCase("O")) System.out.println(name+" Wins!!");
            else System.out.print("Computer Wins!!");
        }
        for(int i=0;i<20;++i) System.out.print("-");
    }
}
