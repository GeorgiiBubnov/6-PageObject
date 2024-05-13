package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;


public class RegistrationPageTest extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillFormTest() {
        registrationPage.openPage()
                .setFirstName("Tom")
                .setLastName("Wambsgans")
                .setUserEmail("TomWambsgans@RoyCo.com")
                .setGender("Male")
                .setUserNumber("1685456485")
                .setDateOfBirth("19", "November", "1991")
                .setSubjectInput("Maths")
                .setHobbies("Sports")
                .setUserPicture("207.png")
                .setCurrentAddress("1654 West Virginia, Charlston, LittleRock Street, 25")
                .choiceStateMenu()
                .setState("NCR")
                .setCity("Delhi")
                .pressSubmit()

                .checkResult("Student Name", "Tom Wambsgans")
                .checkResult("Student Email", "TomWambsgans@RoyCo.com")
                .checkResult("Gender", "Male")
                .checkResult("Mobile", "1685456485")
                .checkResult("Date of Birth", "19 November,1991")
                .checkResult("Subjects", "Maths")
                .checkResult("Hobbies", "Sports")
                .checkResult("Picture", "207.png")
                .checkResult("Address", "1654 West Virginia, Charlston, LittleRock Street, 25")
                .checkResult("State and City", "NCR Delhi");

    }

    @Test
    void minimalFillFormTest() {
        registrationPage.openPage()
                .setFirstName("Tom")
                .setLastName("Wambsgans")
                .setUserEmail("TomWambsgans@RoyCo.com")
                .setGender("Male")
                .setUserNumber("1685456485")
                .setDateOfBirth("19", "November", "1991")
                .pressSubmit()

                .checkResult("Student Name", "Tom Wambsgans")
                .checkResult("Student Email", "TomWambsgans@RoyCo.com")
                .checkResult("Gender", "Male")
                .checkResult("Mobile", "1685456485")
                .checkResult("Date of Birth", "19 November,1991");
    }

    @Test
    void negativeFillFormTest() {
        registrationPage.openPage()
                .setFirstName("Tom")
                .setLastName("Wambsgans")
                .setUserEmail("_")
                .setGender("Male")
                .setUserNumber("1685456485")
                .setDateOfBirth("19", "November", "1991")
                .pressSubmit()
                .verifyEmailFieldIsRed();

    }

}
