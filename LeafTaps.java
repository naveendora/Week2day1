package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver Driver = new ChromeDriver();
		
		Driver.manage().window().maximize();
		
		//Launch URL
		Driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Enter Username and password
		
		Driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		Driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on Login Button
		
		Driver.findElement(By.className("decorativeSubmit")).click();
	
		//Click on CRM/SFA Link
		
		Driver.findElement(By.linkText("CRM/SFA")).click();
		
		Driver.findElement(By.linkText("Leads")).click();
		
		Driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter all the text fields 
		
		Driver.findElement(By.id("createLeadForm_companyName")).sendKeys("RanaIndustries");
		
		Driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rana");
		
		Driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Dev");
		
		Driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Employee");
		
		Driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("Car and Driver");
		
		Driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("RDS");
		
		Driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("03/12/1997");
		
		Driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Dubakoor");
		
		Driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ECE");
		
		Driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("4,00,000");
		
		Driver.findElement(By.id("createLeadForm_currencyUomId")).sendKeys("INR - Indian Rupee");
		
		Driver.findElement(By.id("createLeadForm_industryEnumId")).sendKeys("General Services");
		
		Driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("40");
		
		Driver.findElement(By.id("createLeadForm_ownershipEnumId")).sendKeys("S-Corporation");
		
		Driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("SO98");
		
		Driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("T345fhf");
		
		Driver.findElement(By.id("createLeadForm_description")).sendKeys("The industry belongs to Ranadev");
		
		Driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("No comments");
		
		// Enter all the text fields in Contact information
		
Driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		
		Driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		
		Driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("43800198");
		
		Driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("23456");
		
		Driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("navan");
		
		Driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("naveenchandar@gmail.com");
		
		Driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.Devindustries.com");
		
		// Enter all the text fields in primary address
		
		Driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Preethika");
		
		Driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Chandar");
		
		Driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No.32, 23rd street 1st Block");
		
		Driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys(" Muzthamil nagar kodungaiyur");
		
		Driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		
		Driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("TAMILNADU");
		
		Driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600118");
		
		Driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		
		Driver.findElement(By.className("smallSubmit")).click();
		

	}

}
