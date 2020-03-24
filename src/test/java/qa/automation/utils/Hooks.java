package qa.automation.utils;

import cucumber.api.java.Before;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Hooks {

    public static Properties properties;

    @Before
    public void getConfigProperties() throws IOException {
        properties = new Properties();
        FileInputStream inputStream = new FileInputStream("src/test/resources/config.properties");
        properties.load(inputStream);
    }
}

