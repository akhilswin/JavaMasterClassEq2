package yaksha;

import static yaksha.TestUtils.businessTestFile;
import static yaksha.TestUtils.currentTest;
import static yaksha.TestUtils.yakshaAssert;
import org.junit.jupiter.api.Test;

class MainClassTest {
	@Test
	void testAddSquareCube() throws Exception {
		// Test will pass
		int numberArray1[] = new int[] { 2, 6, 3, 4, 5 };
		NumberList numberList1 = new NumberList(numberArray1);
		yakshaAssert(currentTest(), (MainClass.addSquareCube(numberList1) == 208 ? "true" : "false"), businessTestFile);
	}
}