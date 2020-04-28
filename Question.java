// package quizApp;

class Question {

    // members
    private final int    categoryId;
    private final String prompt;

    // Constructor
    Question( int categoryId, String prompt ) {
        this.categoryId = categoryId;
        this.prompt = prompt;
    }

    // getters only, no setters for this class
    public int categoryId() {
        return categoryId;
    }

    public String prompt() {
        return prompt;
    }

} // Question class
