package main;
import java.sql.*;


public class TestDriver {
	public static void main(String[] arg) {
		DriverManager.drivers().forEach(
			driver -> System.out.println(driver.toString())
		);
		
		for(Driver d: DriverManager.drivers().toList()) {
			System.out.println(d.toString());
		}
	}
}
