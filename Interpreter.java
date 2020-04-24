/*****************
 * Jason Tuyen
 * Interpreter for Quiz
 * Singleton Design Pattern
 ****************/

import java.io.*;
import java.util.*;

//Question Interpreter using the Singleton Design Pattern
public class Interpreter{

    private static Interpreter firstInstance = null;
    LinkedList<String> questions = new LinkedList<String>();

    //private to prevent the creation of the Interpreter class more than once
    private Interpreter(){
        String text;
        File file = new File("ProgLanguageQuiz.txt");
        try{
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                text=scan.nextLine();
                questions.add(text);
            }
        }
        catch(Exception e){
            System.out.println("File does not exist.");
        }      
        sortCategories();
        
        //below is test to see if questions were added
        /*********************************************
        *System.out.print(questions);
        *Object[] q = questions.toArray();
        *for(int i=0; i<questions.size(); i++){
        *    System.out.println(q[i]);
        *}
        *********************************************/
    }

    //this is only way to create or access the single instance object
    public static Interpreter getInstance(){
        if(firstInstance == null){
            firstInstance = new Interpreter();
        }
        return firstInstance;
    }

    //there's a more efficient way to sort, but 2am isnt the time for it
    private void sortCategories(){
        Object[] q = questions.toArray();

        //array for the 3 categories
        String[] dvi = new String[20];
        String[] svw = new String[20];
        String[] cve = new String[20];
        //necessary variables
        String str; 
        int x = 0;
        int y = 0;
        int z = 0;

        for(int i=0; i<questions.size(); i++){
            str = q[i].toString(); 
            if(str.charAt(0) == '1' || str.charAt(1)=='1'){
                dvi[x] = str;
                x++;
            }else if(str.charAt(0) == '2' || str.charAt(1)=='2'){
                svw[y] = str;
                y++;
            }else if(str.charAt(0) == '3' || str.charAt(1)=='3'){
                cve[z] = str;
                z++;
            }
        }
    }
}
