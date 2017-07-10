import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {

	@Test
	public void testAdd() {
		Hello hello = new Hello();
		assertEquals(3, hello.add(1, 2));
		assertEquals(3, hello.add(2, 1));
		assertEquals(-1, hello.add(-2, 1));
	}

}
