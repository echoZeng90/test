package maven;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;


public class HelloTest {
	@Test
	public void testHello() {
		Hello h = new Hello();
		String str= h.sayHello("May");
		assertEquals("Hello,May!",str);
		
	}

}
