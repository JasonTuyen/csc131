import static org.junit.Assert.*;
import org.junit.Test;
import java.io.File;

public class HCQuizJUnitTest {
	public class Question {
	    private String prompt;
		private int categoryId;

		Question( int categoryId, String prompt ) {
	        this.categoryId = categoryId;
	        this.prompt = prompt;
	    }

	    public int categoryId() {
	        return categoryId;
	    }

	    public String prompt() {
	        return prompt;
	    }
	}

	@Test
	//test to see if our files exists
	public void testFiles() {
		File file1 = new File("ProgLanguageQuiz.txt");
		File file2 = new File("ProgLanguageCategories.txt");
		assertNotNull(file1);
		assertNotNull(file2);
	}
	
	@Test
	//test to see if the Question constructor works correctly, same test can be run with other constructors
	public void testQuestionClass() {
		int categoryId = 1;
		String prompt = "test";
		Question q1 = new Question(categoryId, prompt);
		
		assertNotNull(q1.categoryId());
		assertNotNull(q1.prompt());
	}
}
