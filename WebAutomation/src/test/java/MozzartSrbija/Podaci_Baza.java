package MozzartSrbija;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import MozzartSrbija.Login;
import resources.base;

public class Podaci_Baza extends base {

	   private Connection connection;
	   private static Statement statement;
	   private static ResultSet rs;
	   private String lc_member;
	   public String balance_after;
	   public static Integer balance_after1;

	    @BeforeClass
	    public void setUp() {
	            String databaseURL = "jdbc:oracle:thin:@192.168.179.101:1521:CSDB6";
	            String user = "telebet";
	            String password = "innovation789";
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
	    public void ID(){
	    	Login login = new Login();
	        try {
	            String query = "select * from lcmember where username = ? and ADDRESS = ?";
	            PreparedStatement statement = connection.prepareStatement(query);
	            statement.setString(1, login.username);
	            statement.setString(2, "Takovska 45");
	            rs = statement.executeQuery();
	            java.sql.ResultSetMetaData rsmd = rs.getMetaData();
	            String ID = rsmd.getColumnName(1);
	            String FirstName = rsmd.getColumnName(3);
	            String LastName = rsmd.getColumnName(4);
	            String BankAccount = rsmd.getColumnName(31);
	            
	            while(rs.next()){
	            	lc_member = rs.getString("ID");
	            	System.out.println(ID + " " + rs.getLong("ID"));
	            	System.out.println(FirstName + " " + rs.getString("FIRSTNAME"));
	            	System.out.println(LastName + " " + rs.getString("LASTNAME"));
	            	System.out.println(BankAccount + " " + rs.getString("BANKACCOUNT"));
	            }
	            
	        } catch (SQLException ex) {
	           ex.printStackTrace();
	        }
	    }
	    
	    @Test (priority = 1, dependsOnMethods={"ID"})
	    public void Balance() throws SQLException {
	    	 String query = "select * from (select * from WEBSUM.ACCOUNT_DOCS where LC_MEMBER_ID = ? order by DATE_OF DESC) where ROWNUM=1";
	    	 PreparedStatement statement = connection.prepareStatement(query);
	         statement.setString(1,lc_member);
	         rs = statement.executeQuery();
	         
	         java.sql.ResultSetMetaData rsmd = rs.getMetaData();
	         String Balance_after = rsmd.getColumnName(21);
	         while(rs.next()){
	        	balance_after = rs.getString("BALANCE_AFTER");
	            System.out.println(Balance_after + " " + rs.getString("BALANCE_AFTER"));
	            System.out.println(balance_after);
	            int balanse_after1 = Integer.parseInt((balance_after.replaceAll("[^0-9]", "")));
	            System.out.println("balans after 1 je " + balanse_after1);
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

	    

