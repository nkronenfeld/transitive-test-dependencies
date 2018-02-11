package foo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class BbbTest extends TestCase {
	public BbbTest (String name) {
		super(name);
	}
	public static Test suite() {
		return new TestSuite(BbbTest.class);
	}
	public void testApp () {
		TestBbb bbb = new TestBbb();
		System.out.println("Test AAA is " + bbb.test_aaa());
		System.out.println("AAA is " + bbb.aaa());
		System.out.println("BBB is " + bbb.bbb());
	}
}
