package com.skillspeed;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.skillspeed.categories.Mandatory;
import com.skillspeed.categories.Optional;
import com.skillspeed.jsf.helloworld.HelloWorld;

//Parameterized - This is a standard runnner that allows you to execute test cases with parameters

@RunWith(Parameterized.class)
@Category(Mandatory.class)
public class ParametrizedHelloWorldTestCase{
	
	// Define parametrized's properties
	//Various Parameters to be passed to the test case
	private String expected;
	private String actualValue;
	
	HelloWorld h = new HelloWorld();
	
	public ParametrizedHelloWorldTestCase(String expected, String actualValue) throws Throwable {
		// Set values
		this.expected = expected;
		this.actualValue = actualValue;
	}
	
	@Parameters
	public static Collection<Object []> dataParameters2(){
		return Arrays.asList(new Object[][] {
				{"Good Hello World!!","Hello World!!"} ,
				{"Good Hi World1","Hi World1"},
				{"Good Hi World1","Hi World1"},
				{"Good Good Lord1","Great Lord1"}
				});
	}
	
//	@Parameters
//	public static Collection<Object []> dataParameters(){
//		return Arrays.asList(new Object[][] {
//				{"Hello World","Hello World"} ,
//				{"Hi World","Hi World"},
//				{"Good Lord","Great Lord"}
//				});
//	}
	
	
	
	@Test
	public void testConcatenation(){
		// Print out instance reference and values passed
		System.out.println("Instance Reference :: "+this+" :: Expected :: "+this.expected +" :: ActualValue :: "+this.actualValue);
		
		assertEquals(this.expected, h.getInfo(this.actualValue));
	}

}
