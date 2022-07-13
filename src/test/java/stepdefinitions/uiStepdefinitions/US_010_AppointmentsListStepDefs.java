package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.*;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_010_AppointmentsListStepDefs {

    DoctorPage doctorPage = new DoctorPage();
    LoginPage loginPage = new LoginPage();
    MyPagesAppointmentPage myPagesAppointmentPage = new MyPagesAppointmentPage();
    US_010_AppointmentsListPage appointmentsListPage = new US_010_AppointmentsListPage();
    TimeSlots timeSlots=new TimeSlots();
    Actions actions = new Actions(Driver.getDriver());
    public String patientID;

    @Given("doctor navigates to medunna.com")
    public void doctor_navigates_to_medunna_com() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
    }

    @Given("doctor clicks on the user icon button")
    @Then("doctor clicks on the Sign in button")
    public void doctor_clicks_on_the_Sign_in_button() throws InterruptedException{
        loginPage.signInLocation.click();
        Thread.sleep(2);
    }

    @Given("doctor writes a valid username")
    public void doctor_writes_a_valid_username() {
        ReusableMethods.waitFor(2);
        ReusableMethods.waitForPageToLoad(7);
        myPagesAppointmentPage.firstSignIn.click();
        myPagesAppointmentPage.signIn.click();
        loginPage.usernameBox.sendKeys(ConfigurationReader.getProperty("validDoctorUsername"));
    }

    @Given("doctor writes a valid password")
    public void doctor_writes_a_valid_password() {
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("validDoctorPassword"));
    }

    @And("doctor clicks on Sign in button")
    public void doctor_clicks_on_Sign_in_button() throws InterruptedException{
        loginPage.signInLocation.click();
        Thread.sleep(2);
    }

    @Given("doctor clicks on My Pages button")
    public void doctor_clicks_on_my_pages_button() throws InterruptedException{
        ReusableMethods.waitFor(2);
        myPagesAppointmentPage.myPages.click();
    }

    @Given("doctor clicks on Appointments button")
    public void doctor_clicks_on_Appointments_button() throws InterruptedException{
        ReusableMethods.waitFor(2);
        myPagesAppointmentPage.myPages.click();
    }

    @Given("doctor selects Appointment date from datefrom and dateto")
    public void doctor_selects_appointment_date_from_datefrom_and_dateto() {
        Assert.assertTrue(Driver.waitForVisibility(myPagesAppointmentPage.startDate,1).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(myPagesAppointmentPage.endDate,1).isDisplayed());
    }

    @Given("doctor should see Appointments list and time slots")
    public void doctor_should_see_appointment_list_and_time_slots() {
        Assert.assertTrue(doctorPage.timeSlot.isDisplayed());
        Assert.assertTrue(doctorPage.appointmentList.isDisplayed());
        }


}
