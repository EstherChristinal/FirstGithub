package org.tesng;

import org.testng.annotations.Test;

public class ClassC {

	@Test(groups = "classgroup")
	private void sysout() {
    System.out.println("class C");
	}
	
	@Test(groups="group1")
	private void print1() {
		 System.out.println(" group1 ");
	}
	
	@Test(groups="group2")
	private void print2() {
		System.out.println(" group2");

	}
	@Test(groups="group1")
	private void print3() {
		System.out.println(" group1");

	}
	@Test(groups="group2")
	private void print4() {
		System.out.println(" group2 ");
	}
}
