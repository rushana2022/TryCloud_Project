package com.tryCloud.step_definitions;

import com.tryCloud.pages.TryCloud_FilePage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TryCloud_StepDefinitions {

    TryCloud_FilePage tryCloud_filePage = new TryCloud_FilePage();

    @Given("user is already logged in to TryCloud application")
    public void user_is_already_logged_in_to_try_cloud_application() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        tryCloud_filePage.login();
    }


    @When("user click the Files module")
    public void user_click_the_files_module() {
        tryCloud_filePage.filesModule.click();
    }


    @Then("user click the + button")
    public void user_click_the_plus_button() {
        tryCloud_filePage.plusSign.click();
        BrowserUtils.sleep(2);
    }



   /*
   @Then("user click the Upload file button")
    public void user_click_the_upload_file_button() {

    }

    */


    @Then("user upload a file from the computer")
    public void user_upload_a_file_from_the_computer() {
        System.out.println("Before click");
        BrowserUtils.sleep(2);
        tryCloud_filePage.uploadFileBtn.sendKeys("C:/Users/Rushana/Desktop/Rushana User Story.png");
        System.out.println("After click");
        Driver.getDriver().navigate().refresh();
        //BrowserUtils.sleep(2);
    }


    @Then("user see the uploaded file in the list")
    public void user_see_the_uploaded_file_in_the_list() {

    }

}
