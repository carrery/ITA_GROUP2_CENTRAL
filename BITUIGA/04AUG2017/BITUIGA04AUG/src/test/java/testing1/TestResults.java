package testing1;

import static org.junit.Assert.*;

import org.junit.Test;

import com.oocl.exam.Exam;

public class TestResults {

	@Test
	public void test() {
		Exam exm = new Exam();
		int a = 0;
		
		String[] expected = {
				"onetwodefault"
				,"8"
				,"26"
				,"4"
				,"5"
				,"10.5"
				,"Main before p1: 10Main before p2: 100Main at the end: 20-----Main before p1: 30Main before p2: 600Main at the end: 120"
				,"*****"
				,"true, false, falsetrue, true, falsefalse, true, falsefalse, false, false"
				,"cartcartoon"
		};
		
		for(int i = 1; i < 11 ; i++) {	
			assertEquals(expected[a] ,exm.getQuest(i));
			a++;
		}
	}

}