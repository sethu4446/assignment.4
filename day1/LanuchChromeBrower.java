package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LanuchChromeBrower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SethuMadhavan");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("N");
	    driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("tester");
	    driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("500000");
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Technical Lead");
	    driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10");
	    driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("1234567");
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("I am a Softare tester");
	    driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("I am good at automation tester");
	    driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
	    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("5/105");
	    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9578582944");
	    driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("345");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sethumadhavan5148@gmail.com");
	    driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("tester");
	    driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https.leadtaps.com");
	    driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("sethu");
	    driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("madhavan");
	    driver.findElement(By.className("generalAddress1")).sendKeys("Chennai");
	    driver.findElement(By.className("generalAddress2")).sendKeys("Aruppukottai");
	    driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
	    driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("626101");
	    driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("+91");
	    driver.findElement(By.name("SubitButton")).click();
	}

}
