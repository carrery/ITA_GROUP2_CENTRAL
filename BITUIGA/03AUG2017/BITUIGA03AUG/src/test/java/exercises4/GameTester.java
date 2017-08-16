package exercises4;

import static org.junit.Assert.*;

import org.junit.Test;

import com.oocl.day4.exer1.GuessTheNumber;

public class GameTester {

	@Test
	public void test() {
		GuessTheNumber gTester;
		int ctr = 0;
		test : for(int i = 0; i < 100; i++) {
			gTester = new GuessTheNumber();
			gTester.theNum = i;
			int j=0;
			game : while(!gTester.ifCorrect) {
				gTester.compareNumbers(j);
				j++;
			}
			if(gTester.ifCorrect) ctr++;
		}
		System.out.println(ctr);
		assertEquals(100, ctr);
		
	}

}
