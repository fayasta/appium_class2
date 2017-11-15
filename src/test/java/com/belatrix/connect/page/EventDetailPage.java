package com.belatrix.connect.page;

import com.belatrix.connect.framework.ParentPage;
import io.appium.java_client.AppiumDriver;
import org.apache.bcel.generic.NEW;
import org.openqa.selenium.By;

public class EventDetailPage extends ParentPage {

    public EventDetailPage(AppiumDriver driver) {
        super(driver);
    }

    By REGISTER_BUTTON = By.id("com.belatrixsf.connect:id/btn_register");
    By YES_CONFIRMATION_MESSAGE = By.xpath("//android.widget.Button[@text='Yes']");
    By REGISTER_MESSAGE = By.xpath("//android.widget.TextView[@text='Do you want register this event?']");
    //By UNREGISTER_MESSAGE = By.xpath("//android.widget.Button[@text='Do you want unregister this event?']");
    By REGISTRATION_CONFIRMED_MESSAGE = By.xpath("//android.widget.TextView[@text='Event registration confirmed']");
    By GOTIT_BUTTON = By.xpath("//android.widget.Button[@text='Got it!']");


    //UI Elements
    By TITLE_EVENT = By.id("com.belatrixsf.connect:id/title");
    By DESCRIPTION_EVENT = By.id("com.belatrixsf.connect:id/description");
    By ABOUT_BUTTON = By.xpath("//android.widget.TextView[@text='About']");
    By NEWS_BUTTON = By.xpath("//android.widget.TextView[@text='News']");

    //BACK BUTTON
    By BACK_BUTTON = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");

    public void clickRegisterButton(){
        handlingWaitToElement(REGISTER_BUTTON);
        click(REGISTER_BUTTON);
    }

    public void backToEventPage(){
        handlingWaitToElement(BACK_BUTTON);
        click(BACK_BUTTON);
    }

    public void confirmationMessage(){
        handlingWaitToElement(REGISTER_MESSAGE);
          }


    public void acceptFirstConfirmationMessage(){
        handlingWaitToElement(YES_CONFIRMATION_MESSAGE);
        click(YES_CONFIRMATION_MESSAGE);
    }


    public void verifyConfirmationMessageIsDisplayed(){
        handlingWaitToElement(REGISTRATION_CONFIRMED_MESSAGE);
    }

    public void reconfirmationMessage(){
        handlingWaitToElement(GOTIT_BUTTON);
        click(GOTIT_BUTTON);
    }


    public void verifyElementsDisplayed(){
        handlingWaitToElement(TITLE_EVENT);
        handlingWaitToElement(DESCRIPTION_EVENT);
        handlingWaitToElement(ABOUT_BUTTON);
        handlingWaitToElement(NEWS_BUTTON);
    }







}
