package com.belatrix.connect.page;

import com.belatrix.connect.framework.ParentPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class EventsPage  extends ParentPage {

    public EventsPage(AppiumDriver driver) {
        super(driver);
    }

    By HALLOWEEN_EVENT = By.xpath("(//android.widget.ImageView[@content-desc=\"Profile image\"])[1]");

    //UI elements
    By UPCOMING_EVENTS = By.id("com.belatrixsf.connect:id/event_container_upcoming");
    By LOCAL_EVENTS = By.id("com.belatrixsf.connect:id/event_container_local");
    By OTHER_EVENTS = By.id("com.belatrixsf.connect:id/event_container_other");


    public void clickHalloweenEvent(){
        handlingWaitToElement(HALLOWEEN_EVENT);
        click(HALLOWEEN_EVENT);
    }

    //TODO LAYOUT
    public void verifyElementsDisplayed(){
        handlingWaitToElement(UPCOMING_EVENTS);
        handlingWaitToElement(LOCAL_EVENTS);
        handlingWaitToElement(OTHER_EVENTS);
    }




}
