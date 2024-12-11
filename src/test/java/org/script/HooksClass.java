package org.script;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class HooksClass {
@Before
public void before() {
	System.out.println("@Before");
}
@After
public void after() {
	System.out.println("@After");
}
@BeforeStep
public void beforestep() {
	System.out.println("@Beforestep");
}
@AfterStep
public void afterstep() {
	System.out.println("@Afterstep");
}
}
