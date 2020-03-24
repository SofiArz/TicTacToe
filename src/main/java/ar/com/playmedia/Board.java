package ar.com.playmedia;

public class Board{
    public static void print(String[] inputs) {
     
      System.out.println("_ 0 _|_ 1 _|_ 2 _");
      System.out.println("     |     |     ");
  
      System.out.println(String.format("  %s  |  %s  |  %s  ",inputs[0] ,inputs[1],inputs[2]));
  
      System.out.println("_ 3 _|_ 4 _|_ 5 _");
      System.out.println("     |     |     ");
  
      System.out.println(String.format("  %s  |  %s  |  %s  ",inputs[3] ,inputs[4],inputs[5]));
  
      System.out.println("_ 6 _|_ 7 _|_ 8 _");
      System.out.println("     |     |     ");
      
      System.out.println(String.format("  %s  |  %s  |  %s  ",inputs[6] ,inputs[7],inputs[8]));
      
      System.out.println("     |     |     ");
  
  
    }
  
    //symbol could be X or O
    public static boolean  checkVictory(String[] inputs, String symbol){
  
      if (inputs[0].equals(symbol) && inputs[1].equals(symbol) && inputs[2].equals(symbol)){
  
        return true;
  
      }else if (inputs[3].equals(symbol) && inputs[4].equals(symbol) && inputs[5].equals(symbol)){
  
        return true;
  
      }else if (inputs[6].equals(symbol) && inputs[7].equals(symbol) && inputs[8].equals(symbol)){
  
        return true;
  
      }else if (inputs[0].equals(symbol) && inputs[3].equals(symbol) && inputs[6].equals(symbol)){
  
        return true;
  
      }else if (inputs[1].equals(symbol) && inputs[4].equals(symbol) && inputs[7].equals(symbol)){
  
        return true;
  
      }else if (inputs[2].equals(symbol) && inputs[5].equals(symbol) && inputs[8].equals(symbol)){
  
        return true;
  
      }else if (inputs[0].equals(symbol) && inputs[4].equals(symbol) && inputs[8].equals(symbol)){
  
        return true;
  
      }else if (inputs[2].equals(symbol) && inputs[4].equals(symbol) && inputs[6].equals(symbol)){
  
        return true;
        
      }else{
  
        return false;
      }
    } 
  
    public static boolean checkEmptyCell(String [] cells, Integer position){
      if(cells[position]!=" ")
        return false;
      else return true;    
    }
  
    public static boolean checkAvaibleCells(String [] cells){
      return false;
    }
  
  }