package com.ruitech.learncucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {


@Given("the user is in the <loginPage>")
public void the_user_is_in_the_login_page() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("the user is in the login page");
    //throw new io.cucumber.java.PendingException();
}

@When("^the user gives \"([^\"]*)\" and \"([^\"]*)\"$")
public void the_user_gives_and(String userName, String password) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("user log in with " + userName + " and password: "+password );

//    throw new PendingException();
}

@When("^the user click \"([^\"]*)\" button$")
public void the_user_click_button(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("the user click the button " + arg1);
  //  throw new PendingException();
}


@Then("the credential is checked")
public void the_credential_is_checked() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("doing the credential check");
  //  throw new io.cucumber.java.PendingException();
}

@When("the credential is valid")
public void the_credential_is_valid() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("if the credential is valid, ");
	// throw new io.cucumber.java.PendingException();
}

@Then("the user is redirected to <operationPage>")
public void the_user_is_redirected_to_operation_page() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("the user is directed to the operation page.");
   // throw new io.cucumber.java.PendingException();
}

@When("the credential is not valid")
public void the_credential_is_not_valid() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("the credential is not valid, then...");
   // throw new io.cucumber.java.PendingException();
}

@Then("the user is redirected to <loginPage> with a error message")
public void the_user_is_redirected_to_login_page_with_a_error_message() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("the user is redirected to the login page. again");
   // throw new io.cucumber.java.PendingException();
}
}
