# csc131
A repository for our csc131 group project. We use the SCRUM process and Java code to make a personality quiz based on coding languages. The cool thing is that you can add your own text files so that the program can run your own quiz questions as well.

**Team Hornet Corp**

* Aaron Baumgartner
* Chaz Cooper
* Jason Tuyen
* Manh Sy
* Ramon Mata
* Sean Strachan

## How to use

1. Make sure you have the two text files, one for questions and one for categories.
2. The text files can be replaced with your own files to run your own quizzes.
3. Commplie all the classes and run of the main class.
4. Respond to the statements/questions with a number 1-9 when 1 is Strongly Disagree and 9 is Strongly Agree.
5. Continue through until there are no more statements/questions and enjoy your results.

## Documentation of Functions
**CLI Class**
```java
class CLI{
}
```
<dl>
  <dt>Description</dt>
  <dd>This class holds the code that makes the interface for the quiz.</dd>
</dl>


**runQuiz Function**
```java
runQuiz(Quiz q)
```
<dl>
  <dt>Description</dt>
  <dd>A method from the CLI class. This method runs the quiz.</dd>

  <dt>Inputs</dt>
  <dd>q, An object of type Quiz from the Quiz class.</dd>
  
  <dt>Outputs</dt>
  <dd>The interface for the quiz.</dd>
</dl>

**Quiz Class**
```java
class Quiz{
}
```
<dl>
  <dt>Description</dt>
  <dd>This class holds code that interacts with the Quiz's questions and categories.</dd>
  
**Quiz Function**
```java
Quiz(File questionFile, File categoryFile)
```
<dl>
  <dt>Description</dt>
  <dd>The constructor for the Quiz class. The constructors also reads the final results and the quiz questions.<dd>

  <dt>Inputs</dt>
  <dd>questionFile, A text file that contains the quiz questions.</dd>
  <dd>categoryFile, A text file that contains the quiz categories.</dd>
  
  <dt>Outputs</dt>
  <dd>An object of type quiz.</dd>
</dl>

**QuestionIterator Class**
```java
class QuestionIterator{
}
```
<dl>
  <dt>Description</dt>
  <dd>This class takes the questions and shuffles them so that they come out in a random order.</dd>
</dl>

**QuestionIterator Function**
```java
QuestionIterator()
```
<dl>
  <dt>Description</dt>
  <dd>A method of the QuestionIterator class that shuffles the questions</dd>

  <dt>Inputs</dt>
  <dd>None</dd>
  
  <dt>Outputs</dt>
  <dd>The questions in random order.</dd>
</dl>

**Category Class**
```java
class Category{
}
```
<dl>
  <dt>Description</dt>
  <dd>This class reads our categories from a text file.</dd>
</dl>

**Category Function**
```java
Category(int id, String name, Scanner inf)
```
<dl>
  <dt>Description</dt>
  <dd>The constructor of the Category class that reads our text file and stores the categories.</dd>

  <dt>Inputs</dt>
  <dd>int id, an integer that identifies the category.</dd>
  <dd>String name, the name of the category.</dd>
  <dd>Scanner inf, a scanner to scan the text file.</dd>
  
  <dt>Outputs</dt>
  <dd>An object of type category containing the name and description of the category.</dd>
</dl>

**Question Class**
```java
class Question{
}
```
<dl>
  <dt>Description</dt>
  <dd>This class reads our questions from a text file.</dd>
</dl>

**Question Function**
```java
Question(int categoryId, String prompt)
```
<dl>
  <dt>Description</dt>
  <dd>The constructor of the quiz class that creates a question.</dd>

  <dt>Inputs</dt>
  <dd>int categoryId, the category id of the question.</dd>
  <dd>String prompt, the prompt of the question.</dd>
  
  <dt>Outputs</dt>
  <dd>An object of type question.</dd>
</dl>

**categoryId Function**
```java
categoryId()
```
<dl>
  <dt>Description</dt>
  <dd>A method of the Question class that returns the current category of the question</dd>

  <dt>Inputs</dt>
  <dd>None</dd>
  
  <dt>Outputs</dt>
  <dd>The category of the current question</dd>
</dl>

**prompt Function**
```java
prompt()
```
<dl>
  <dt>Description</dt>
  <dd>A method of the Question class that returns the prompt./dd>

  <dt>Inputs</dt>
  <dd>None</dd>
  
  <dt>Outputs</dt>
  <dd>The prompt of the current question</dd>
</dl>
