package channel_api.step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java8.En;

public class LoginStepDefinition implements En {

    public LoginStepDefinition() {


        Given("^a registered customer$", () -> {
            System.out.println("start test");

        });


        When("^they log in with the correct username and password$", () -> {
            // Write code here that turns the phrase above into concrete actions
        });


        Then("^the login is sucessful$", () -> {

        });

        Then("^the login is failure$", () -> {
            // Write code here that turns the phrase above into concrete actions
        });


    }





}
