package tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

public class TextBoxTest extends TestBase {
    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    void fillTextBoxForm() {
        textBoxPage.openPage()
                .setFullName("Tom Wambsgans")
                .setUserEmail("TomWambsgans@RoyCo.com")
                .setCurrentAddress("1654 West Virginia, Charlston, LittleRock Street, 25")
                .setPermanentAddress("1591 Georgia, Cha-cha-cha, Washington Street, 07")
                .submit();

        textBoxPage.checkResult("Name", "Tom Wambsgans")
                .checkResult("Email", "TomWambsgans@RoyCo.com")
                .checkResult("Current Address", "1654 West Virginia, Charlston, LittleRock Street, 25")
                .checkResult("Permananet Address", "1591 Georgia, Cha-cha-cha, Washington Street, 07");
    }
}
