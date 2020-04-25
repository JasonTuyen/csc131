package quizApp;

import java.util.ArrayList;

protected class Quiz {

    // members
    ArrayList<Question> questions;
    ArrayList<Category> categories;  // should this be a hashmap? idk

    // Constructors
    Quiz(){
        
    }

    // methods
    // implement an iterator here:
    /*
      The initializer should create an array of the same size as questions
      It should add all the idices 0..(length of questions) and then shuffle them
      Start at 0 in this new array and return the Question  at the given index
      to return all questions in randomized order
     */
    // adding a question should be private or handled by constructor alone
    // 

} // Quiz class

protected class Category {

    // members
    final int    id;
    final String name;
    final String description;
    final String positiveName;
    final String positiveDescription;
    final String negativeName;
    final String negativeDescription;

    //constructor
    Category(){
        File file = new File("");
        try{
            Scanner scan = new Scanner(file);
            while(){
                //file hasn't been made yet
            }
        }
        catch(Exception e){
            System.out.println("File does not exist.");
        }    
    }

} // Category class
