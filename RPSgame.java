import java.util.Random;
import java.util.Scanner;

class RPSgame{
    public static void main(String[] args){
        String rps[] = {"r","p","s"};
        String computerMove =rps[ new Random().nextInt(rps.length)];
        try (Scanner scanner = new Scanner(System.in)) {
            String playerMove;
            while(true){
                System.out.print("Enter your Move: ");
                playerMove= scanner.nextLine();
                if(playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")){
                    break;
                }
                System.out.println(playerMove+" is not a valid move");   
            }
            System.out.println("The computer move is "+computerMove);
            if(computerMove.equals(playerMove)){
                System.out.println("The match is try");
            }
            else if(playerMove.equals("r")){
                if(computerMove.equals("p")){
                    System.out.println("You Losse!!!!");
                }
                else if(computerMove.equals("s")){
                    System.out.println("You Win!!!!!");
                }
            }
            else if(playerMove.equals("s")){
                if(computerMove.equals("r")){
                    System.out.println("You Loose!!!!");
                }
                else if(computerMove.equals("p")){
                    System.out.println("You Win!!!!!");
                }
            }
            else if(playerMove.equals("p")){
                if(computerMove.equals("r")){
                    System.out.println("You Win!!!!");
                }
                else if(computerMove.equals("s")){
                    System.out.println("You Loose!!!");
                }
            }
        }

    }
}