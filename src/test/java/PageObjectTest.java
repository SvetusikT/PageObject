import com.codeborne.selenide.Condition;
import org.junit.Test;
import pages.GaragePage;
import pages.HomePage;
import pages.Header;
import pages.SideBar;

public class PageObjectTest {

    @Test
    public void canLogin() {
        //Arrange
        HomePage homePage = new HomePage();

        //Act
        GaragePage garagePage = homePage.login("SvetusikT@gmail.com", "tmFlfh7BrPbiJ2I");

        //Assert
        garagePage.notifications.shouldHaveText("You have been successfully logged in");
    }

    @Test
    public void canAddCar() {
        //Arrange
        HomePage homePage = new HomePage();
        GaragePage garagePage = homePage.login("SvetusikT@gmail.com", "tmFlfh7BrPbiJ2I");

        //Act
        garagePage.addCar("BMW", "X5", 1.2);


        //Assert
        garagePage.notifications.shouldHaveText2("Car added");
    }

    @Test
    public void logOutHeader() {
        //Arrange
        HomePage homePage = new HomePage();
        GaragePage garagePage = homePage.login("SvetusikT@gmail.com", "tmFlfh7BrPbiJ2I");
        garagePage.addCar("BMW", "X5", 1.2);

        //Act
        Header.logOut();
        //Assert
        homePage.notifications.shouldHaveURL("https://guest:welcome2qauto@qauto.forstudy.space/");
    }

    @Test
    public void logOutSideBar() {
        //Arrange
        HomePage homePage = new HomePage();
        GaragePage garagePage = homePage.login("SvetusikT@gmail.com", "tmFlfh7BrPbiJ2I");
        garagePage.addCar("BMW", "X5", 1.2);

        //Act
        SideBar.logOutSB();
        //Assert
        homePage.notifications.shouldHaveURL("https://guest:welcome2qauto@qauto.forstudy.space/");
    }
}

