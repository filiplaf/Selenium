package MozzartGermania;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import MozzartGermania.Login;
import resources.base;

public class Podaci_Baza extends base {
public static Logger log = LogManager.getLogger(base.class.getName());

	   private Connection connection;
	   private static ResultSet rs;
	   private String lc_member;
	   public int balance_after;

	    @BeforeClass
	    public void setUp() {
	            String databaseURL = "jdbc:oracle:thin:@192.168.179.121:1521:sgermania";
	            String user = "mozzart";
	            String password = "12innovation13";
	            connection = null;
	            try {
	                Class.forName("com.mysql.jdbc.Driver");
	                System.out.println("Connecting to Database...");
	                connection = DriverManager.getConnection(databaseURL, user, password);
	                if (connection != null) {
	                    System.out.println("Connected to the Database...");
	                }
	            } catch (SQLException ex) {
	               ex.printStackTrace();
	            }
	            catch (ClassNotFoundException ex) {
	               ex.printStackTrace();
	            }
	    }

	    @Test (priority = 0)
	    public void id(){
	    	Login login = new Login();
	        try {
	            String query = "select * from lcmember where username = ?";
	            PreparedStatement statement = connection.prepareStatement(query);
	            statement.setString(1, login.username);
	            rs = statement.executeQuery();
	            java.sql.ResultSetMetaData rsmd = rs.getMetaData();
	            String ID = rsmd.getColumnName(1);
	            String FirstName = rsmd.getColumnName(3);
	            String LastName = rsmd.getColumnName(4);
	            
	            while(rs.next()){
	            	lc_member = rs.getString("ID");
	            	System.out.println(ID + " " + rs.getLong("ID"));
	            	System.out.println(FirstName + " " + rs.getString("FIRSTNAME"));
	            	System.out.println(LastName + " " + rs.getString("LASTNAME"));
	            	
	            }
	            
	        } catch (SQLException ex) {
	           ex.printStackTrace();
	        }
	    }
	    
	    @Test (priority = 1, dependsOnMethods={"id"})
	    public void baseBalance() throws SQLException, IOException {
	    	 String query = "select * from (select * from WALLET.CUSTOMER_BALANCE where CUSTOMER_ID = ? order by ID) where ROWNUM=1";
	    	 PreparedStatement statement = connection.prepareStatement(query);
	         statement.setString(1,lc_member);
	         rs = statement.executeQuery();
	         
	         java.sql.ResultSetMetaData rsmd = rs.getMetaData();
	         String Balance_after = rsmd.getColumnName(9);
	         while(rs.next()){
	        	 // Izvlacim iz baze int iz kolone BALANCE da bih mogao posle da uporedjujem!!
	        	balance_after = rs.getInt("BALANCE");
	            log.info(Balance_after + " u bazi je " + rs.getString("BALANCE"));
	            }
	    	}	
	    
	    @Test(priority = 2)
	    public void testBalance() {
			try {
				FileInputStream fstream = new FileInputStream("C:\\Git workspace\\Selenium\\WebAutomation\\src\\main\\java\\resources\\balansGermania.txt");
				DataInputStream in = new DataInputStream(fstream);
				BufferedReader br = new BufferedReader(new InputStreamReader(in));
				String srtLine;
				while ((srtLine = br.readLine()) !=null) {
				int num1 = Integer.parseInt(srtLine.replaceAll("[^0-9]", ""));
				if(num1==balance_after) {
					log.info("Balans na webu je isti kao i balans u bazi");
				}
				else {
					log.info("Balansi se ne poklapaju");
				}
				}
				in.close();
			}
			catch (Exception e) {
				System.out.println("Error");
			}
	    }
	   
	    	    
	    @AfterClass
	    public void tearDown() {
	      if (connection != null) {
	                try {
	                    System.out.println("Closing Database Connection...");
	                    connection.close();
	                } catch (SQLException ex) {
	                    ex.printStackTrace();
	                }
	            }
	    }
	}

	    

