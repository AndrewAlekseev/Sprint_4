package scootertests;
import com.example.scooters.OrderScooter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



@RunWith(Parameterized.class)
public class OrderScooterTest extends TestBaseScooter {
    OrderScooter objOrderScooter;


    public OrderScooterTest(String username, String surname, String address, String phonenumber) {
        super(username, surname, address, phonenumber);
    }



    @Test
    public void openDriver(){
        objOrderScooter.open();
    }

    @Test
    public void orderCreateHappyPathTest() {
        objOrderScooter.clickOrderButtonHeader();
        createOrder();
    }

    @Test
    public void orderPositiveMiddleButton() {
                objOrderScooter.clickOrderButtonMiddle();
                createOrder();
    }




    private void createOrder() {
        objOrderScooter.checkOrderContentContainerDisplayed();
        objOrderScooter.confirmCookies();
        objOrderScooter.setUserName(username);
        objOrderScooter.setSurname(surname);
        objOrderScooter.setAdress(address);
        objOrderScooter.setMetro();
        objOrderScooter.setPhoneNumber(phonenumber);
        objOrderScooter.clickNextButton();
        objOrderScooter.setDeliveryDate();
        objOrderScooter.setDurationOrder();
        objOrderScooter.clickOrderScooterButton();
        objOrderScooter.clickYesOnThisPanel();
        objOrderScooter.checkOrderModalDisplayed();
        objOrderScooter.isPanelVisible();
        objOrderScooter.checkCheckStatusButtonDisplayed();
    }

}