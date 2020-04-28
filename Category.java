// package quizApp;

import java.util.Scanner;

class Category {

    // members
    final int id;
    final String name;
    final String description;
    final String positiveName;
    final String positiveDescription;
    final String negativeName;
    final String negativeDescription;

    // constructor
    Category( int id, String name, Scanner inf ) {
        this.id = id;
        this.name = name;

        // read in each part of a single entry
        description = inf.nextLine();

        positiveName = inf.nextLine();
        positiveDescription = inf.nextLine();

        negativeName = inf.nextLine();
        negativeDescription = inf.nextLine();
    }

} // Category class
