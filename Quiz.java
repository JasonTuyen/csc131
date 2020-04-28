// package quizApp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.lang.Math;

class Quiz implements Iterable<Question> {

    // members
    ArrayList<Question> questions;
    ArrayList<Category> categories;  // should this be a hashmap? idk
    String[]            results;

    // Constructors
    public Quiz( File questionFile, File categoryFile ) throws FileNotFoundException {
        // read in the categories
        categories = new ArrayList<Category>();
        Scanner catReader = new Scanner(categoryFile);
        String name;
        int id = 1;
        while(catReader.hasNextLine()) {
            name = catReader.nextLine();
            if(name.contains("RESULTS"))
                break;
            categories.add(new Category(id, name, catReader));
            id++;
        }

        // read in the final results
        results = new String[(int)Math.pow(2, categories.size())];
        for (int i = 0; i < results.length; i++) {
            results[i] = catReader.nextLine();
        }
        catReader.close();

        // read in the questions
        Scanner questionReader = new Scanner(questionFile);
        questions = new ArrayList<Question>();
        int catId;
        String prompt;
        while(questionReader.hasNextInt()) {
            catId = questionReader.nextInt();
            prompt = questionReader.nextLine();
            // this next line is not great....I am so sorry :(
            questions.add(new Question(catId, prompt.stripLeading()));
        }
        questionReader.close();
    }

    // methods
    // implement an iterator here:
    /*
      The initializer should create an array of the same size as questions
      It should add all the idices 0..(length of questions) and then shuffle them
      Start at 0 in this new array and return the Question  at the given index
      to return all questions in randomized order
     */

    public Iterator<Question> iterator() {
        return new QuestionIterator();
    }

    private class QuestionIterator implements Iterator<Question> {

        private       int                 curr;
        private final ArrayList<Question> shuffledQuestions;

        public QuestionIterator() {
            curr = 0;  // should already be 0 but make this explicit

            // Shallow copy the questions list and shuffle the copy
            shuffledQuestions = new ArrayList<Question>(questions);
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
