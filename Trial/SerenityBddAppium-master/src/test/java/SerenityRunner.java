import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        stepNotifications = true,
        features = "src/test/resources/features",
        tags = "@ScrollToText"
)
public class SerenityRunner {
}
