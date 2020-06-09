package com.hrms.steps;

import com.hrms.testbase.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

//will happen before and after each scenario


public class Hooks {
@Before
public void start() {
	BaseClass.setUp();
}

@After
public void end() {
	BaseClass.tearDown();
}

}
