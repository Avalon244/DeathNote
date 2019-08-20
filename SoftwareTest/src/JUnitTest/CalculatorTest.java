package JUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator cal = new Calculator();
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testHandleBackspace() {
		cal.setResultText("1711111");
		cal.handleBackspace();
		assertEquals("171111.0", cal.getResultText());
	}


	@Test
	public void testHandleC() {
		cal.setResultText("1711111");
		cal.handleC();
		assertEquals("0.0", cal.getResultText());
	}


	@Test
	public void testGetNumberFromText() {
		cal.setResultText("1711111");
		assertEquals("1711111.0", String.valueOf(cal.getNumberFromText()));
	}
	
	@Test
	public void testHandleOperator()
	{
		cal.setResultNum(15.6);
		cal.setResultText("15.6");
		cal.handleOperator("+");		
		cal.handleOperator("=");
		assertEquals("31.2", String.valueOf(cal.getResultNum()));
	}

}
