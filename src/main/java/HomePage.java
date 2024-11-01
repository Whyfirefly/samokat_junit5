import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.HashMap;

public class HomePage {
  private final WebDriver driver;

  // Локаторы вопросов с 1 - 8 из раздела "Вопросы о важном":
  public final static By Question_1 = By.id("accordion__heading-0");
  public final static By Question_2 = By.id("accordion__heading-1");
  public final static By Question_3 = By.id("accordion__heading-2");
  public final static By Question_4 = By.id("accordion__heading-3");
  public final static By Question_5 = By.id("accordion__heading-4");
  public final static By Question_6 = By.id("accordion__heading-5");
  public final static By Question_7 = By.id("accordion__heading-6");
  public final static By Question_8 = By.id("accordion__heading-7");

  // Локаторы ответов с 1 - 8 на вопросы из раздела "Вопросы о важном":
  private final static By Answer_1 = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[1]/div[2]/p");
  private final static By Answer_2 = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[2]/div[2]/p");
  private final static By Answer_3 = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[3]/div[2]/p");
  private final static By Answer_4 = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[4]/div[2]/p");
  private final static By Answer_5 = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[5]/div[2]/p");
  private final static By Answer_6 = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[6]/div[2]/p");
  private final static By Answer_7 = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[7]/div[2]/p");
  private final static By Answer_8 = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[8]/div[2]/p");

  // Ключ: значение (вопрос: ответ):
  static HashMap<By, By> map = new HashMap<>();
  static {
    map.put(Question_1, Answer_1);
    map.put(Question_2, Answer_2);
    map.put(Question_3, Answer_3);
    map.put(Question_4, Answer_4);
    map.put(Question_5, Answer_5);
    map.put(Question_6, Answer_6);
    map.put(Question_7, Answer_7);
    map.put(Question_8, Answer_8);
  }

  public HomePage(WebDriver driver) {
    this.driver = driver;
  }
}
