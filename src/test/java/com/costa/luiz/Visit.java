package pcx.modules;


import org.junit.*;
import org.junit.Test;

import core.components.ComponentHandler;

public class Visit {
	
	public String data() {
		return "Bhai" ; 
	}
	
	@Before
	public void Visit() {
		System.out.println("Visit Done");
	}
	@After
	public void ends() {
		System.out.println("Exit");
	}
	
	@Test
	public void test() {
		System.out.println("Dhiman");
		System.out.println(data());
	}
	
	@Test
	public void test2() {
		System.out.println("Dhiman 2");
	}
	
	
}
