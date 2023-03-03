package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TryCloud_FilePage {

    public TryCloud_FilePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement filesModule;

@FindBy(id = "user")
public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "submit-form")
    public WebElement loginBtn;

    public void login(){
        username.sendKeys("User1");
        password.sendKeys("Userpass123");
        loginBtn.click();
    }

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement plusSign;

    @FindBy(xpath = "//label[@for='file_upload_start']")
    public WebElement uploadFileBtn;


    //span[.="Upload file"]

}
