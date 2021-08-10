package moodpanda;

import static com.codeborne.selenide.Selenide.$;

import lombok.extern.log4j.Log4j;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

//@Log4j
public class LoginPage {

  private Logger log = LogManager.getLogger(LoginPage.class);
  private static final String EMAIL_INPUT = "#ContentPlaceHolderContent_TextBoxEmail";
  private static final String PASSWORD_INPUT = "#ContentPlaceHolderContent_TextBoxPassword";
  private static final String LOGIN_BUTTON = "#ContentPlaceHolderContent_ButtonLogin";

  public HomePage login(String email, String password) {
    log.info(String.format("Login attempt with credentials: %s / %s", email, password));
    $(EMAIL_INPUT).sendKeys(email);
    $(PASSWORD_INPUT).sendKeys(password);
    $(LOGIN_BUTTON).click();
    return new HomePage();
  }
}