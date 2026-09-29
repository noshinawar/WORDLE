import java.util.*;
public class Wordle{
    public static void main(String[] args){
        String word="APPLE";
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a five-letter word in all caps!");
        String green="\u001B[42m";
        String yellow="\u001B[43m";
        String reset="\u001B[0m";
        String guess="";

        for(int i=0; i<6; i++){
            guess=sc.nextLine();
             if(guess.length()!=5){
               i--;
            System.out.println("The word MUST BE 5 letters and all in capital! Try again :(");
              continue;
            }
              if(guess.equals(word)){
                System.out.println(green+guess+reset);
                System.out.println("SUCCESS!!!");
                break;                
            }

            else{

            for(int j=0; j<5; j++){
                if(word.substring(j,j+1).equals(guess.substring(j,j+1))){
                    System.out.print(green+guess.charAt(j)+reset);
                }

                else if(word.indexOf(guess.substring(j,j+1))>-1){
                    System.out.print(yellow+guess.charAt(j)+reset);
                }

                else{
                     System.out.print(guess.charAt(j));
                }
            

        }
        System.out.println("\ntry again?");
    }
}
if(!guess.equals(word)){
    System.out.println("Out of turns </3 reload?");
  }

}

}
