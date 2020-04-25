package quizApp;

import java.util.ArrayList;
import java.util.Iterator;
import java.io.File;
import java.util.Collections;

protected class Quiz implements Iterable<Question> {

    // members
    ArrayList<Question> questions;
    ArrayList<Category> categories;  // should this be a hashmap? idk

    // Constructors
    public Quiz( File questionFile, File categoryFile ){
        
    }

    // methods
    // implement an iterator here:
    /*
      The initializer should create an array of the same size as questions
      It should add all the idices 0..(length of questions) and then shuffle them
      Start at 0 in this new array and return the Question  at the given index
      to return all questions in randomized order
     */
    private class QuestionIterator implements Iterator<> {

        private       int                 curr;
        private final ArrayList<Question> shuffledQuestions;

        public QuestionIterator() {
            curr = 0;  // should already be 0 but make this explicit

            // Shallow copy the questions list and shuffle the copy
            shuffledQuestions = new ArrayList<Questions>(questions);
            Collections.shuffle(shuffledQuestions);
        }

        public boolean hasNext() {
            return curr < shuffledQuestions.size();
        }

        public Question next() {
            Question item = shuffledQuestions.get(curr);
            curr++;
            return item;
        }

    } // QuestionIterator class

    // adding a question should be private or handled by constructor alone

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
