import java.util.*;
public class RPC {
        public static void main(String[] args) throws InterruptedException{
            Scanner sc = new Scanner(System.in);
            Random r = new Random();
            int random,playerWins=0,computerWins=0,ties=0;
            String rpc = " ",choice="";
            boolean valid=true;
           
             while (!choice.equals("Q")) {
                Thread.sleep(300);
                random = r.nextInt(1,4);
                 switch (random) {
               case 1 -> rpc = "R";
               case 2 -> rpc = "P";
               case 3 -> rpc = "S";
            }
                System.out.println("Enter Your Choice (R, P, S) (Q to Quit!): ");
             choice = sc.next().toUpperCase();
             if(!(choice.equals("R") || choice.equals("S") || choice.equals("P") || choice.equals("Q"))){
                System.out.println("Invalid Choice "+choice+"!"); 
                continue;
             }
             if(choice.equals("Q")){
                System.out.println("Quitting!");
                break;
             }
             else if(valid==true){
             System.out.println("You Chose "+choice);
             System.out.println("Computer Chose "+rpc);

             if((choice.equals("R") && rpc.equals("S")) || (choice.equals("S") && rpc.equals("P")) || (choice.equals("P") && rpc.equals("R"))){
                System.out.println("You Won! ");
                playerWins++;
             }
             else if((choice.equals("R") && rpc.equals("P")) || (choice.equals("S") && rpc.equals("R")) || (choice.equals("P") && rpc.equals("S"))){
                System.out.println("You Lost! ");
                computerWins++;
             }
             else if((choice.equals("R") && rpc.equals("R")) || (choice.equals("S") && rpc.equals("S")) || (choice.equals("P") && rpc.equals("P"))){
                System.out.println("Tie! ");
                ties++;
             }
             System.out.println("You : "+playerWins+" Computer : "+computerWins+" Ties : "+ties+"\n\n");
            }
                
             }

            sc.close();

    }
}
