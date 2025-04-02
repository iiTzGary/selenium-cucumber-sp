package runners;



import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.ConfigurationParameters;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;



@Suite
@SelectClasspathResource("features")
@ConfigurationParameters({
        @ConfigurationParameter(key  = "cucumber.glue",value = "steps_definition"),
        @ConfigurationParameter(key = "cucumber.plugin", value = "pretty, html:target/cucumber-report/cucumber.html"),
        @ConfigurationParameter(key = "cucumber.filter.tags",value = "@Profile")
})
public class Runner {
}
