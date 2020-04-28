// package quizApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class CLI {

    public static void runQuiz(Quiz quiz) {
        System.out.println("Welcome to the Quiz App by Hornet Corp!\n");
        System.out.println(
                "For each of the following questions or statements please enter a number from 1 to 9 when 1 is Strong Disagree and 9 is Strongly Agree.");

        int[] catScores = new int[quiz.categories.size()];
        Scanner userIn = new Scanner(System.in);
        int choice=0;

        for (Question q : quiz) {
            System.out.println(q.prompt());
            do {
            	System.out.print("> ");
                boolean keepgoing = true;
                
                while(keepgoing){
                  
                	if (userIn.hasNextInt()) {
                        choice = userIn.nextInt();
                        while(choice>9 || choice<1){
                           keepgoing = true;
                           try{
                              System.out.println("please only input numbes 1-9");
                              choice = userIn.nextInt();
                           }catch(Exception e){
                              System.out.print("no letters, ");
                              userIn.next();
                           }
                        }
                        keepgoing = false;
                        
                        
                         
                      }else {
                      System.out.println("no letters, please only input numbes 1-9");
                      userIn.next();
                      keepgoing = true;
                   }
                }
                
            } while (choice < 1 || choice > 9);
            choice -= 5;
            catScores[Math.abs(q.categoryId()) - 1] += Math.signum(q.categoryId()) * choice;
            System.out.println();
        }

        int overallResult = 0;
        for (int i = 0; i < quiz.categories.size(); i++) {
            overallResult += ((int)Math.pow(2,i)) * ((catScores[i] > 0) ? (0) : (1));
        }
        System.out.format("The result of your quiz is: %s!\n\n", quiz.results[overallResult]);
        int i = 0;
        for (Category c: quiz.categories) {
            System.out.format("Category %d is %s.", i+1, c.name);
            System.out.println(c.description);
            if(catScores[i] == 0) {
                System.out.println("Your test results show that you do not have a strong preference in this category.");
            } else if (catScores[i] > 0) {
                System.out.format("Your test results show that you prefer %s!\n", c.positiveName);
                System.out.println(c.positiveDescription);
            } else {
                System.out.format("Your test results show that you prefer %s!\n", c.negativeName);
                System.out.println(c.negativeDescription);
            }
            System.out.println();
            i++;
        }

        userIn.close();
    }

} // CLI class

class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File questionFile = new File("ProgLanguageQuiz.txt");
        File categoryFile = new File("ProgLanguageCategories.txt");

        Quiz progLangQuiz = new Quiz(questionFile, categoryFile);

        CLI.runQuiz(progLangQuiz);
    }
} // Main class
