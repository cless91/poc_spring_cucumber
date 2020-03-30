package com.baeldung;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles({"integration"})
public class StepDefsIntegrationTest{

    @Autowired
    private Toto toto;

    @Given("given")
    public void the_client_issues_GET_hello() throws Throwable {
        System.out.println("given1 "+toto.getAttribute1());
        System.out.println("given2 "+toto.getAttribute2());
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