package Utilities;

import com.github.javafaker.Faker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties = new Properties();
    static Faker faker = new Faker(new Locale("en-US"));

    static {
        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String keyword) {

        return properties.getProperty(keyword);
    }

    public static int getIntProperty(String key) {
        return Integer.parseInt(properties.getProperty(key));
    }

    public static void updateProperty(String keyword) {

        switch (keyword) {
            case "countryCode":
                String countryCode = faker.address().countryCode() +faker.number().digits(5);
                properties.setProperty(keyword, countryCode);
                break;
            case "stateName":
                String stateName = faker.address().state();
                properties.setProperty(keyword, stateName);
                break;
            case "shortName":
                String shortName = faker.name().nameWithMiddle();
                properties.setProperty(keyword, shortName);
                break;
            case "company":
                String company = faker.company().name();
                properties.setProperty(keyword, company);
                break;
            case "city":
                String city = faker.address().cityName();
                properties.setProperty(keyword, city);
                break;
            case "phoneNumber":
                String phoneNumber = faker.phoneNumber().cellPhone();
                properties.setProperty(keyword, phoneNumber);
                break;
            case "postalCode":
                String postalCode = faker.address().zipCode();
                properties.setProperty(keyword, postalCode);
                break;
        }

        FileOutputStream outputFile = null;
        try {
            outputFile = new FileOutputStream("configuration.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            properties.store(outputFile, null);
            outputFile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
