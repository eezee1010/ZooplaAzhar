package com.page.object.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginsPage {
	public LoginsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@class='ui-button-primary ui-cookie-accept-all-medium-large']")
	private WebElement acceptcookies;
	
	@FindBy(xpath = "//*[@class='button button--tertiary-dark account-link__text']")
	private WebElement signin;
	
	@FindBy(xpath="//*[@id='signin_email']")
	private WebElement email;
	
	@FindBy(xpath="//*[@name='signin_password']")
	private WebElement passwrd;
	
	@FindBy(xpath="//*[@id='signin_submit']")
	private WebElement login;

	public WebElement getAcceptcookies() {
		return acceptcookies;
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPasswrd() {
		return passwrd;
	}

	public WebElement getLogin() {
		return login;
	}		
	
}
