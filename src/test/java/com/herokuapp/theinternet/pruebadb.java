package com.herokuapp.theinternet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class pruebadb {
	private WebDriver driver;

//	@Parameters({ "browser" })
//	@BeforeMethod(alwaysRun = true)
	/*
	 * private void setUp(@Optional("chrome") String browser) { // Create driver
	 * switch (browser) { case "chrome":
	 * System.setProperty("webdriver.chrome.driver",
	 * "src/main/resources/chromedriver.exe"); driver = new ChromeDriver(); break;
	 * 
	 * case "firefox": System.setProperty("webdriver.gecko.driver",
	 * "src/main/resources/geckodriver.exe"); driver = new FirefoxDriver(); break;
	 * 
	 * default: System.out.println("Do not know how to start " + browser +
	 * ", starting chrome instead"); System.setProperty("webdriver.chrome.driver",
	 * "src/main/resources/chromedriver.exe"); driver = new ChromeDriver(); break; }
	 * 
	 * 
	 * // sleep for 3 seconds sleep(3000);
	 * 
	 * // maximize browser window driver.manage().window().maximize();
	 * 
	 * // implicit wait //driver.manage().timeouts().implicitlyWait(10,
	 * TimeUnit.SECONDS); }
	 */
	@Test
	public void positiveLoginTest() throws SQLException {
		System.out.println("Starting loginTest");

//		open test page
		// String url = "http://the-internet.herokuapp.com/login";
		// driver.get(url);
		// System.out.println("Page is opened.");

		String nombre = "";
		String estado = "";
		String puntuacion = "";
		String nota = "";
		String cadenaSerie = "";

		try {

			Connection conn = DriverManager.getConnection("jdbc:sqlite:‪C:\\Users\\Pau\\Documents\\test.db");
			Statement statement = conn.createStatement();

			conn.setAutoCommit(true);

			String sql = "INSERT INTO tableune (id) VALUES ('3')";
			statement.execute(sql);
			// sql = "SELECT * FROM KDRAMAS";
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {

				System.out.println("id: " + rs.getString("id"));
			}

			rs.close();
			statement.close();
			conn.close();

		} catch (SQLException e) {
			System.out.println("Error " + e.getMessage());

		}

	}

	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * @AfterMethod(alwaysRun = true) private void tearDown() { // Close browser
	 * driver.quit(); }
	 */

}