package br.com.rsinet.hub_tdd.screenObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_tdd.manager.DriverFactory;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class CadastroScreen {

	private WebDriver driver;

	public CadastroScreen(WebDriver driver) {
		this.driver = driver;
	}

	private MobileElement encontraUserName() {
		MobileElement userName = (MobileElement) driver.findElement(
				By.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextUserName']/android.widget.EditText"));
		return userName;
	}

	private MobileElement encontraEmail() {
		MobileElement email = (MobileElement) driver.findElement(
				By.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextEmail']/android.widget.EditText"));
		return email;
	}

	private MobileElement encontraPassword() {
		MobileElement password = (MobileElement) driver.findElement(
				By.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextPassword']/android.widget.EditText"));
		return password;
	}

	private MobileElement encontraConfirmPassword() {
		MobileElement confirmPassword = (MobileElement) driver.findElement(By.xpath(
				"//*[@resource-id='com.Advantage.aShopping:id/AosEditTextConfirmPassword']/android.widget.EditText"));
		return confirmPassword;
	}

	private MobileElement encontraFirstName() {
		MobileElement firstName = (MobileElement) driver.findElement(By
				.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextFirstName']/android.widget.EditText"));
		return firstName;
	}

	private MobileElement encontraLastName() {
		MobileElement lastName = (MobileElement) driver.findElement(
				By.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextLastName']/android.widget.EditText"));
		return lastName;
	}

	private MobileElement encontraPhoneNumber() {
		MobileElement phoneNumber = (MobileElement) driver.findElement(By.xpath(
				"//*[@resource-id='com.Advantage.aShopping:id/AosEditTextPhoneNumber']/android.widget.EditText"));
		return phoneNumber;
	}

	private MobileElement encontraCountry() {
		MobileElement country = (MobileElement) driver
				.findElement(By.id("com.Advantage.aShopping:id/linearLayoutCountry"));
		return country;
	}

	private MobileElement encontraState() {
		MobileElement state = (MobileElement) driver.findElement(
				By.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextState']/android.widget.EditText"));
		return state;
	}

	private MobileElement encontraAddress() {
		MobileElement address = (MobileElement) driver.findElement(
				By.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextStreet']/android.widget.EditText"));
		return address;
	}

	private MobileElement encontraCity() {
		MobileElement city = (MobileElement) driver.findElement(
				By.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextCity']/android.widget.EditText"));
		return city;
	}

	private MobileElement encontraPostalCode() {
		MobileElement postalCode = (MobileElement) driver.findElement(
				By.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextZip']/android.widget.EditText"));
		return postalCode;
	}

	private MobileElement encontraCheckOffers() {
		MobileElement checkOffers = (MobileElement) driver
				.findElement(By.id("com.Advantage.aShopping:id/checkBoxRecieveOffers"));
		return checkOffers;
	}

	private MobileElement encontraRegister() {
		MobileElement btRegister = (MobileElement) driver
				.findElement(By.id("com.Advantage.aShopping:id/buttonRegister"));
		return btRegister;
	}

	public MobileElement encontraMsgPassword() {
		MobileElement tvPassword = (MobileElement) driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.TextView"));
		return tvPassword;
	}

	public void preencheUserName(String et_UserName) {
		encontraUserName().click();
		encontraUserName().sendKeys(et_UserName);
	}

	public void preencheEmail(String et_Email) {
		encontraEmail().click();
		encontraEmail().sendKeys(et_Email);
	}

	public void preenchePassword(String et_Password) {
		encontraPassword().click();
		encontraPassword().sendKeys(et_Password);
	}

	public void preencheConfirmPassword(String et_ConfirmPassword) {
		encontraConfirmPassword().click();
		encontraConfirmPassword().sendKeys(et_ConfirmPassword);
	}

	public void preencheFirstName(String et_FirstName) {
		encontraFirstName().click();
		encontraFirstName().sendKeys(et_FirstName);
	}

	public void preencheLastName(String et_LastName) {
		encontraLastName().click();
		encontraLastName().sendKeys(et_LastName);
	}

	public void preenchePhoneNumber(String et_PhoneNumber) {
		encontraPhoneNumber().click();
		encontraPhoneNumber().sendKeys(et_PhoneNumber);
	}

	public void clicaCountry() {
		encontraCountry().click();
	}

	public void clicaBrazil(@SuppressWarnings("rawtypes") AndroidDriver driver, String visibleText) {
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"" + visibleText + "\")"))
				.click();
	}

	public void preencheState(String et_State) {
		encontraState().click();
		encontraState().sendKeys(et_State);
	}

	public void preencheAddress(String et_Address) {
		encontraAddress().click();
		encontraAddress().sendKeys(et_Address);
	}

	public void preencheCity(String et_City) {
		encontraCity().click();
		encontraCity().sendKeys(et_City);
	}

	public void preenchePostalCode(String et_Postalode) {
		encontraPostalCode().click();
		encontraPostalCode().sendKeys(et_Postalode);
	}

	public void clicaCheckOffers() {
		encontraCheckOffers().click();
	}

	public void clicaRegister() {
		encontraRegister().click();
	}

	@SuppressWarnings("rawtypes")
	public void scroll(double inicio, double fim) throws Exception {
		Dimension size = DriverFactory.getDriver().manage().window().getSize();

		int x = size.width / 2;
		int start_y = (int) (size.height * inicio);
		int end_y = (int) (size.height * fim);
		new TouchAction((PerformsTouchActions) DriverFactory.getDriver()).press(PointOption.point(x, start_y))
				.waitAction((WaitOptions.waitOptions(Duration.ofMillis(500))))//
				.moveTo(PointOption.point(x, end_y))//
				.release().perform();
	}

	public void scrollCountry(@SuppressWarnings("rawtypes") AndroidDriver driver, String visibleText) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ visibleText + "\").instance(0))");
	}

}
