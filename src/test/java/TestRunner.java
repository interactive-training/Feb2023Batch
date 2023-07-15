import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/java/resources/test1.feature"}, //path
        glue = {"steps"} //package name
)
public class TestRunner extends AbstractTestNGCucumberTests  {


}
