package play.question01;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnswerTest {
	/**
	 *  Question
	 *  整数a(1),a(2),…,a(n)が与えられます。
	 *  その中からいくつか選び、
	 *  その和をちょうどkにすることがきるかを判定しなさい。
	 *  
	 *  *制約
	 *  ・   1  <=  n   <=20
	 *  ・-10^8 <= a(i) <= 10^8
	 *  ・-10^8 <=  k   <=10^8
	 */
	@Test
	public void testPrint() {
		int[] a = {1,2,4,7};
		int n = a.length;
		Answer answer = new Answer();
		for (int k=0; k<100; k++) {
			answer.start(n, a, k);
			if (k < 15) {
				assertEquals("Yes", answer.print());
			}
			else {
				assertEquals("No", answer.print());
			}
		}
	}

}
