package steps;

import java.util.List;

import org.testng.Assert;

import cucumber.api.java.en.And;
//import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarSearchPageActions;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.JustEat;
import utils.SeleniumDriver;


public class LaunchEatSteps {
	
	
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	CarSearchPageActions carSearchPageActions= new CarSearchPageActions();
	JustEat justEat = new JustEat();


	@Given("^I am on the Home Page \"([^\"]*)\" of Launch$")
	public void i_am_on_the_Home_Page_of_CarsGuide_Website(String webSiteURL)  {
			System.out.println();	    
	}
	
	@And("^I want food in \"([^\"]*)\"$")
	public void orderFood(String areaCode) throws Exception
	{
		justEat.enterAreaCode(areaCode);
	}
	
	@When("^I search for restaurants$")
	public void clickOnSearchButton() throws Exception
	{
		justEat.clickOnSearch();
	}
	

}
