package utilities;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import java.time.Duration;

import java.util.Random;

public class ReusableMethods {
    public static final Wait<WebDriver> wait = new FluentWait<>(Driver.getDriver())
            .withTimeout(Duration.ofMillis(5000))
            .pollingEvery(Duration.ofMillis(1000))
            .ignoring(NoSuchElementException.class);

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


    //Random SSN üreten method
    public static String creatSSN(){

        Random random = new Random();
        int randomNum = random.nextInt(1000000000);

        String formattedSSN = String.format("%09d", randomNum);
        String SSNWithDashes = formattedSSN.substring(0, 3) + "-"
                + formattedSSN.substring(3, 5) + "-" + formattedSSN.substring(5);
        String SSN = SSNWithDashes;

        return SSN;
    }

    public static void waitAndClick(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

    }

}
