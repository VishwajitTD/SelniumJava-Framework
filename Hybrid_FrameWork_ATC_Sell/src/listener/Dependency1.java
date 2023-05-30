package listener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency1 {
	@Test
	public void test1() {
		System.out.println("Bangalore");
	}
	@Test
	public void test2() {
		System.out.println("Karnataka");
		Assert.fail();
	}
	@Test(dependsOnMethods = "test2")
	public void test3() {
		System.out.println("India");
	}

}
