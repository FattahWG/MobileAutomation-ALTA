package helper;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;

public class PropertiesReader {

    public PropertiesData readProperties() {
        Yaml yamlFile = new Yaml();
        InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream("configuration.yaml");
        return yamlFile.load(inputStream);
    }
}
