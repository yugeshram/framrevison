package org.day2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junitt {
	
@BeforeClass
public static void add1() {
	System.out.println("@BeforeClass");

}
@AfterClass
public static void add6() {
	
	System.out.println("@AfterClass");
}
@Before
public void add2() {
System.out.println("@before");	

}
@Test
public void add3() {
System.out.println("@test");	

}
@After
public void add4() {
	System.out.println("@After");

}
@Test
public void add5() {
	System.out.println("@Test1");

}
}
