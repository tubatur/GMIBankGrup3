package utilities;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReusableMethods {

    static Faker faker = new Faker();


// Rastgele, geçersiz e-posta adresleri oluşturma adımı

    public static void main(String[] args) {
        for (int i = 0 ;i<10; i++){

            String randomEmail = getRandomInvalidEmail(faker);

            System.out.println("Gecersiz e-posta adresi: " + randomEmail);
        }
    }


// Yardımcı metot: Rastgele, geçersiz e-posta adresi oluşturma

    public static String getRandomInvalidEmail(Faker faker) {

        String[] domains = {"com", "net", "org", "gov"};

        String email = faker.internet().emailAddress();


        // @ işaretinin rastgele bir pozisyonda olmasını sağlama

        int atIndex = faker.number().numberBetween(1, email.length() - 1);

        email = email.substring(0, atIndex) + "@" + email.substring(atIndex);


        // @ işaretinden sonra nokta (.) olmayan bir alan adı seçme

        String domain = domains[faker.number().numberBetween(0, domains.length - 1)];

        email = email.replaceFirst("@", "." + domain + "@");


        return email;

    }

    public static WebElement errorMessage ( int expectedIndex   ){

        String errorList = "(//div[@class='invalid-feedback'])["+expectedIndex+"]";
        WebElement error = Driver.getDriver().findElement(By.xpath(errorList));
        return error;
    }


}
