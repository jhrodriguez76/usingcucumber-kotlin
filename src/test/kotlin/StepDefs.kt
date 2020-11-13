import io.cucumber.java8.En
import io.cucumber.java8.PendingException

class StepDefs : En{
    init {
        Given("Am I letter A") { throw PendingException() }

        When("I check the letter is A") { throw PendingException() }

        Then("That is the first letter ni alphabet") { throw PendingException() }
    }
}
