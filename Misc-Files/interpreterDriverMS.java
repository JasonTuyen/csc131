import java.io.*; 
import java.util.*;
//Manh Sy iterative pattern

public class interpreterDriverMS{
   public static void main(String[] args)throws FileNotFoundException{
      interpreter inter= new interpreter("question.txt");
      //returns multi-dimensional array with questions that corresponds to its categories
      //visual based on sean's file, which can't be Arrays.deepToString because it looks too ugly .-.
      
      //definition         instruction       strong typing     weak typing     control            ease of use
      
      //i often find..     act diagram..     i am the person.. chaos is..      program is more... it is more important...
      //it is imp to..     good code...      strict rules...   formality..     all program must.. the web is where...
      //i prefer data..    it is ok..        i'hv had...       real program..  writing desktop ...i jump right...
      //impl is trivial..  is the debugger.. i would prefer..  the compiler..  i am very comfy..  idea are the most...
   }
}

class interpreter{
   String[][] cat;
   interpreter(String filename)throws FileNotFoundException{
      cat = new String[5][6];

      Scanner scan = new Scanner(new File(filename));
      while(scan.hasNext()){
         int num;
         
         String name = determindCategory(scan.nextInt());
         int column = addToAr(name);
         addQuestion(column, scan.nextLine());

      }
   }
   int addToAr(String value){
      for(int i = 0; i < 6; i++){
         if(cat[0][i]==value){
            return i;
         }else if(cat[0][i]==null){
            cat[0][i]=value;
            return i;
         }else{
            continue;
         }
      
      }
      return -1;
   }
   void addQuestion(int col,String question){
      for(int i = 1; i < 5; i++){
         if(cat[i][col]==null){
            cat[i][col] = question;
            break;
         }else{
            continue;
         }
      }
      
   }
   
   String determindCategory(int value){
      switch(value){
         case 1:
            return "Definition";
         case -1:
            return "Instruction";
          case 2:
            return "String Typing";
         case -2:
            return "Weak Typing";
         case 3:
            return "Control";
         case -3:
            return "Ease of Use";
         default:
            return"";
      }
   }
}