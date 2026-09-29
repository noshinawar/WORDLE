import java.util.*;
// this game works in the terminal only
public class Wordle{
    public static void main(String[] args){
        // correct word
        String word="APPLE";
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a five-letter word in all caps!");
        // for coloured backgrounds
        String green="\u001B[42m";
        String yellow="\u001B[43m";
        // to reset to default background colour
        String reset="\u001B[0m";
        // guessed word
        String guess="";
// 6 tries to get the correct word
        for(int i=0; i<6; i++){
            guess=sc.nextLine();
            // if word is less or more than 5 letters, retry
             if(guess.length()!=5){
               i--;
            System.out.println("The word MUST BE 5 letters! Try again :(");
              continue;
            }
            // if the guess matches the correct word, break
              if(guess.equals(word)){
                System.out.println(green+guess+reset);
                System.out.println("SUCCESS!!!");
                break;                
            }

            else{
                // check letter by letter, if correct letter exists in guessed word but not in right location, yellow
                // if correct letter in guessed word and in right location, green
                // if letter is not in the correct word, no change

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
        // if out of turns, run the program again
if(!guess.equals(word)){
    System.out.println("Out of turns </3 reload?");
  }

}

}
