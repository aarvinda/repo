package gradeBook;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	private GradeBook gb1;
	private GradeBook gb2;
	
	@BeforeEach
	void setUp() throws Exception {
		gb1 = new GradeBook(5);
	    gb2 = new GradeBook(5);

	    gb1.addScore(50.0);
	    gb1.addScore(55.0);
	    gb1.addScore(60.0);
	    gb1.addScore(65.0);

	    gb2.addScore(70.0);
	    gb2.addScore(80.0);
	    gb2.addScore(90.0);
	    gb2.addScore(100.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		gb1 = null;
	    gb2 = null;
	}

	@Test
	void testAddScore() {
		//For Debugging
		/* gb1.toString();
		System.out.println(gb1);
		gb2.toString();
		System.out.println(gb2);
		*/
		assertTrue(gb1.toString().equals("50.0 55.0 60.0 65.0 "));
		assertTrue(gb2.toString().equals("70.0 80.0 90.0 100.0 "));
	}

	@Test
	void testSum() {
		assertEquals(230, gb1.sum(), .0001);
		assertEquals(340, gb2.sum(), .0001);
	
	}

	@Test
	void testMinimum() {
		assertEquals(50, gb1.minimum(), .001);
		assertEquals(70, gb2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(180, gb1.finalScore(), .001);
		assertEquals(270, gb2.finalScore(), .001);
		
	}

}
