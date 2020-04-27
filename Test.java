package quizApp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.util.Collections;

protected class Quiz implements Iterable<Question> {

    // members
    ArrayList<Question> questions;
    ArrayList<Category> categories = new ArrayList();  // should this be a hashmap? idk

    // Constructors
    public Quiz( File questionFile ){
    	Category cat;
    	for (int i=1; i<4; i++) {
    		cat = new Category(i, "ProgLanguageCategories.txt");
    		categories.add(cat);
    	}
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
	// Implemented by Aaron Baumgartner 4/26/2020 8PM
	
		// members
	    int    id;
	    String name;
	    String description;
	    String positiveName;
	    String positiveDescription;
	    String negativeName;
	    String negativeDescription;

	    
	    //constructor
	    Category(int n, String fileName){
	    	// assign category id #
	    	id = n;
	    	
	    	// open file for reading
	        File file = new File(fileName);
	        String text;
	        try{
	            Scanner scan = new Scanner(file);
	            
	            // skip through the file until we reach the category we wish to read
	            for (int i=0; i<(n-1)*6; i++) {
	            	scan.nextLine();
	            }
	            
	            // read the 6 lines containing the category's information
	            for (int i=0; i<6; i++) {
	            	text = scan.nextLine();
	            	switch(i) {
	            	case 0:
	            		name = text;
	            		continue;
	            	case 1:
	            		description = text;
	            		continue;
	            	case 2:
	            		positiveName = text;
	            		continue;
	            	case 3:
	            		positiveDescription = text;
	            		continue;
	            	case 4:
	            		negativeName = text;
	            		continue;
	            	case 5:
	            		negativeDescription = text;
	            		continue;
	            		}
	            	}
	        }
	        catch(Exception e){
	            System.out.println("File does not exist.");
	        }
	    }
} // Category class

// Question Interpreter (Singleton Design Pattern)
protected class Interpreter {
	
	LinkedList<String> qList = new LinkedList<>();
	
	private Interpreter() {
		
		String t;
		File f = new File("ProgLanguageQuiz.txt");
		
		try {
			
			Scanner s = new Scanner(f);
			while (s.hasNextLine()) {
			   t = s.nextLine();
			   qList.add(t);
			}
			
		} catch (Exception e) {
			System.out.println("File Not Found");	   
		}
		
		sortCat();
		
	}
	
	private void sortCat() {
		Object[] q = qList.toArray();
		//Category Arrays
		String[] DVI = new String[20];
		String[] SVW = new String[20];
		String[] CVE = new String[20];
		
		String str;
		int x, y, z;     
		x = y = z = 0;
		
		int size = q.length;
		
		for (int i = 0; i < size; i++) {
			str = q[i].toString();
			
			if (str.charAt(0) == '1' || str.charAt(1) == '1') {
				DVI[x] = str;
				x++;			   
			} else if (str.charAt(0) == '2' || str.charAt(1) == '2') {
				SVW[y] = str;
				y++;
			} else if (str.charAt(0) == '3' || str.charAt(1) == '3' ) {
				CVE[z] = str;
				z++;
			}
		}		
	}
}



}
