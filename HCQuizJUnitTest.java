import static org.junit.Assert.*;

import org.junit.Test;

public class HCQuizJUnitTest {

	//test to see if the Question constructor works correctly, this test can probably be repeated with the other constructors
	@Test
	public void testQuizClass() {
		int categoryId = 1;
		String prompt = "test";
		Question q1 = new Question(categoryId, prompt);
		
		assertNotNull(q1.categoryId());
		assertNotNull(q1.prompt());
	}

	//test to see if our files exists, idk if this is proper use
	public void testFiles() {
		File file = new File("ProgLanguageQuiz.txt");
		File file = new File("ProgLanguageCategories.txt");
	}

}
