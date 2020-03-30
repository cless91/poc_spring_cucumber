package com.baeldung;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefsIntegrationTest extends SpringIntegrationTest {

    @Given("given")
    public void the_client_issues_GET_hello() throws Throwable {
        System.out.println("given");
    }

    @When("when")
    public void the_client_issues_POST_hello() throws Throwable {
        System.out.println("when");
    }

    @Then("then")
    public void the_client_receives_status_code_of() throws Throwable {
        System.out.println("then");
    }
}