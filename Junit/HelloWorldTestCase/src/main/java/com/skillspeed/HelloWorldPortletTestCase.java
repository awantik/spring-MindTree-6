package com.skillspeed;

import net.sourceforge.jwebunit.junit.JWebUnit;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HelloWorldPortletTestCase {
	
	@Before
	public void prepareBaseURL(){
		// Set base URL that JWebUnit will start from
		JWebUnit.setBaseUrl("http://localhost:8080");
	} 
	
	@Test
	public void atestBaseUrl(){
		// Begin a conversation
		JWebUnit.beginAt("/greeting/");
	}
	
	@Test
	public void utestBaseUrl(){
		// Begin a conversation
		JWebUnit.beginAt("/greeting/");
	}
	/*
	@Test
	public void testBaseUrl(){
		// Begin a conversation
		JWebUnit.beginAt("/");
	}
	*/
	@Test
	public void testShowingAndPopulatingLoginScreen(){
		
		// Assert if login screen is displayed, so that username and password field would be shown
		
		JWebUnit.assertTextFieldEquals("name", "");	
		
		// Populating login screen with the required values
		JWebUnit.setTextField("name", "awantik");
		
		// Assert populating is done properly
		JWebUnit.assertTextFieldEquals("name", "awantik");
		
		// Login Into Portal
		JWebUnit.clickButtonWithText("Submit");
	}
	
	@Test
	public void wtestNavigateIntoHelloWorldPortalPage(){
		// Check if HelloWorld Portal page is exist or not
		JWebUnit.assertTextPresent("Hello");
		
		
	}
/*
	@Test
	public void testDoActualNavigationIntoHelloWorldPortalPage(){
		// Navigate into HelloWorld Portal page
		
		JWebUnit.clickLinkWithExactText("HelloWorld");
		// Check of the Render has executed message
		JWebUnit.assertTextPresent("Lord");
		
		
	}
*/	
//	
//	@Test
//	public void testInitiateActionRequestUponHelloWorldPortlet(){
//		// Check if the submit button is exist
//		JWebUnit.assertButtonPresent("submit");
//		
//		// Click submit against HelloWorld Portlet
//		JWebUnit.clickButton("submit");
//	}
//
//	
//	@Test
//	public void testMessagesAfterActionRequestUponHelloWorldPortlet(){
//		// Check of the Render has executed message
//		JWebUnit.assertTextPresent("Render has executed 2");
//		
//		// Check of the Action has executed message
//		JWebUnit.assertTextPresent("Action has executed 1");
//	}
}
