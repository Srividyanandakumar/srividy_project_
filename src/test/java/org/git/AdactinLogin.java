package org.git;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinLogin extends BaseClass{
		
	public AdactinLogin() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement textUsername;
	
	@FindBy(id="password")
	private WebElement textPassword;
	
	@FindBy(id="login")
	private WebElement loginButton;
	
	@FindBy(id="location")
	private WebElement txtLocation;
	
	@FindBy(id="hotels")
	private WebElement txtHotels;
	
	@FindBy(id="room_type")
	private WebElement txtRoom;
	
	@FindBy(id="room_nos")
	private WebElement txtnos;
	
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement txtcheckin;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement txtcheckout;

	@FindBy(id="adult_room")
	private WebElement adultRoom;
	
	@FindBy(id="child_room")
	private WebElement childRoom;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	
	@FindBy(xpath="//input[@type='radio']")
	private WebElement radioButton;
	
	@FindBy(id="continue")
	private WebElement txtContinue;
	
	@FindBy(xpath="//input[@name=\"first_name\"]")
	private WebElement txtFirstname;
	
	@FindBy(xpath="//input[@name=\"last_name\"]")
	private WebElement txtLastname;
	
	@FindBy(id="address")
	private WebElement txtaddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCreditno;
	
	@FindBy(id="cc_type")
	private WebElement txtCredittype;
	
	@FindBy(id="cc_exp_month")
	private WebElement expireMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expireYear;
	
	@FindBy(id="cc_cvv")
	private WebElement creditccv;
	
	@FindBy(id="book_now")
	private WebElement txtBooknow;
	
	@FindBy(id="order_no")
	private WebElement txtorder;
	
	@FindBy(id="search_hotel")
	private WebElement txtsearch;
	
	public WebElement getTextUsername() {
		return textUsername;
	}

	public WebElement getTextPassword() {
		return textPassword;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getTxtLocation() {
		return txtLocation;
	}
	
	public WebElement getTxtHotels() {
		return txtHotels;
	}
	
	public WebElement getTxtRoom() {
		return txtRoom;
	}

	public WebElement getTxtnos() {
		return txtnos;
	}

	public WebElement getTxtcheckin() {
		return txtcheckin;
	}

	public WebElement getTxtcheckout() {
		return txtcheckout;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getTxtContinue() {
		return txtContinue;
	}

	public WebElement getTxtFirstname() {
		return txtFirstname;
	}

	public WebElement getTxtLastname() {
		return txtLastname;
	}

	public WebElement getTxtaddress() {
		return txtaddress;
	}

	public WebElement getTxtCreditno() {
		return txtCreditno;
	}

	public WebElement getTxtCredittype() {
		return txtCredittype;
	}

	public WebElement getExpireMonth() {
		return expireMonth;
	}

	public WebElement getExpireYear() {
		return expireYear;
	}

	public WebElement getCreditccv() {
		return creditccv;
	}

	public WebElement getTxtBooknow() {
		return txtBooknow;
	}

	public WebElement getTxtorder() {
		return txtorder;
	}

	public WebElement getTxtsearch() {
		return txtsearch;
	}

	
	
	
	
}
