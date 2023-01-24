package scootertests;

import com.example.scooters.HomePageScooter;
import org.junit.Assert;
import org.junit.Test;


public class DropdownTextTest extends TestBase {

    @Test
            public void acceptCookie(){
        HomePageScooter homePageScooter = new HomePageScooter(driver);
        homePageScooter.clickAcceptCookie();
        Assert.assertTrue(objHomePage.isPanelVisible());
    }
    @Test
    public void checkHowMuch() {
        objHomePage.clickPanel();
        Assert.assertTrue(objHomePage.isPanelVisible());
    }

    @Test
    public void checkMoreScooters() {
        objHomePage.clickPanel();
        Assert.assertTrue(objHomePage.isPanelVisible());
    }

    @Test
    public void checkTimeRent() {
        objHomePage.clickPanel();
        Assert.assertTrue(objHomePage.isPanelVisible());
    }

    @Test
    public void checkRentScootersNow() {
        objHomePage.clickPanel();
        Assert.assertTrue(objHomePage.isPanelVisible());
    }

    @Test
    public void checkExtendScooter() {
        objHomePage.clickPanel();
        Assert.assertTrue(objHomePage.isPanelVisible());
    }

    @Test
    public void checkGiveChargeWithScooters() {
        objHomePage.clickPanel();
        Assert.assertTrue(objHomePage.isPanelVisible());
    }

    @Test
    public void checkCancelOrder() {
        objHomePage.clickPanel();
        Assert.assertTrue(objHomePage.isPanelVisible());
    }

    @Test
    public void checkILiveBehindMkhad() {
        objHomePage.clickPanel();
        Assert.assertTrue(objHomePage.isPanelVisible());
    }


}
