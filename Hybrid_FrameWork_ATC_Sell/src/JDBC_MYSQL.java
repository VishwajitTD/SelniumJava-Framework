import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class JDBC_MYSQL {

	public static void main(String[] args) throws SQLException{

	String url="jdbc:mysql://localhost:3306/TestData";

	String un="root"; 
	
	String pwd="root";

	Connection con = DriverManager.getConnection (url, un, pwd); 
	java.sql.Statement stmt = con.createStatement();
	ResultSet res = stmt.executeQuery("select * from Authentication");
	
	while(res.next()) {

	String name=res.getString(1);

	String password=res.getString(2);
	System.out.println(name+" "+password);
	
	 }
}
}
