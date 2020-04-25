package quizApp;

protected class Question {

    // members
    private final int    categoryId;
    private final String prompt;

    // Constructor
    Question( Category category, String prompt ) {
        //this.category = category();
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
