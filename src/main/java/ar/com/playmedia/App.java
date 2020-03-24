package ar.com.playmedia;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        String[] inputs = new String[]{" "," "," "," "," "," "," "," "," "};
    
        Scanner keyboard = new Scanner(System.in);
        String symbol = "X";   

        for(Integer i=0;i<9;i++){
        Console.clearScreen();
        Board.print(inputs);

        if(i%2==0) //player 1
            symbol = "X";
    
        else //player 2
            symbol = "O";   
        
        System.out.println("Jugador " + symbol);
        System.out.print("Ingrese posición: ");

        Integer playerChoice = keyboard.nextInt();
        inputs[playerChoice] = symbol;

        if(Board.checkVictory(inputs,symbol)){
            Console.clearScreen();
            Board.print(inputs);
            System.out.println("Ganaste jugador " + symbol+ " !!!");
            break;
        }

    
        }
        keyboard.close();
    }
}
