package functional;

import static testutils.TestUtils.businessTestFile;
import static testutils.TestUtils.currentTest;
import static testutils.TestUtils.testReport;
import static testutils.TestUtils.yakshaAssert;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import testutils.AutoGrader;

public class FunctionalTest {

	// Provide the path to the IncrementDecrementOperatorsAssignment class file
	String filePath = "src/main/java/com/yaksha/assignment/IncrementDecrementOperatorsAssignment.java";

	@AfterAll
	public static void afterAll() {
		testReport();
	}

	@Test
	public void testVariableDeclarationsAndIncrementDecrementOperations() throws Exception {
		AutoGrader autoGrader = new AutoGrader();
		boolean result = autoGrader.testVariableDeclarationsAndIncrementDecrementOperations(filePath);
		yakshaAssert(currentTest(), result, businessTestFile);
	}
}
