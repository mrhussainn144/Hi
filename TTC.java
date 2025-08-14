import java.util.*;
public class TTC {
    static char[][] Board = new char[3][3]; 
    static char player = 'X';
    public static boolean isFull(){
     for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            if(!(Board[i][j] == 'X' || Board[i][j]=='O')){
                return true;
            }
        }
     }
     return false;

    }
    public static void display(){
     for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               
                System.out.print(Board[i][j]+"  ");
            }
            System.out.println();
           
        }
    }
    public static boolean isWon(){
        int i=0;
        while(i<3){
            if((Board[i][0]==player && Board[i][1]==player && Board[i][2]==player) || (Board[0][i]==player && Board[1][i]==player && Board[2][i]==player)) {
                return true;
            }
            i++;
        }
        if((Board[0][0]==player && Board[1][1]==player && Board[2][2]==player) || (Board[0][2]==player && Board[1][1]==player && Board[2][0]==player)){
        return true;
    }
    return false;
}
public static void playGame() throws ArrayIndexOutOfBoundsException,NoSuchElementException,InputMismatchException{
Scanner sc = new Scanner(System.in);
 int row, col;
        boolean tie=true,isLegalMove=true;
       display();
        do{
             
             System.out.println("Player "+player+"s Turn!");
        System.out.print("Enter Row : ");
        row = sc.nextInt()-1;
        System.out.print("Enter Column : ");
        col= sc.nextInt()-1;
         if((row<1||row>3)){
            System.out.println("Invalid Row!");
            tie = false;
            isLegalMove = false;  
        }
             else if(col<1||col>3){
                 System.out.println("Invalid Column!");
                 tie = false;
                 isLegalMove = false;  
            }
        else if(Board[row][col] == 'X' || Board[row][col]=='O'){
                System.out.println("Place Already Occupied!");
                tie= false;
                isLegalMove = false;
                
            }

            else{
                Board[row][col] = player;
                isLegalMove = true;
                display();
            }
            if(isWon()){
                System.out.println("Player "+ player + " Won!");
                break;
            }
            if(isLegalMove){
             player = (player=='X') ? 'O' : 'X';
            }
           
        }while(isFull());
             display();

     if(tie){
         System.out.println("Tie!!!");
       }
    sc.close();
            
       
}
    public static void main(String[] args) {
       try{ playGame();}
       catch(ArrayIndexOutOfBoundsException e){
        System.out.println(e.getMessage());
       }
       catch(NoSuchElementException e){
        System.out.println(e.getMessage());
       }
       
    }

        
}
