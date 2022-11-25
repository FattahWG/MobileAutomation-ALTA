package com.example.app.properties;

import java.io.InputStream;
import org.yaml.snakeyaml.Yaml;

public class PropertiesReader {

  public PropertiesData readProperties(){
    Yaml yaml = new Yaml();
    InputStream inputStream = this.getClass()
        .getClassLoader()
        .getResourceAsStream("configuration.yaml");
    PropertiesData data = yaml.load(inputStream);
    return data;
  }

}
