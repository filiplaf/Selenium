package MozzartMalta;

import java.io.FileWriter;
import java.io.IOException;
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

import net.minidev.json.JSONObject;
import resources.base;

public class IzvlacenjePonude extends base {
public static Logger log = LogManager.getLogger(base.class.getName());

	   private Connection connection;
	   private static ResultSet rs;
	   public long id;
	   public String mecevi;

	    @BeforeClass
	    public void setUp() {
	            String databaseURL = "jdbc:oracle:thin:@192.168.179.101:1521/CSDB6";
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
	    public void maxIdKola() {
	        try {
	            String query = "select max(ID) from ROUND ";
	            PreparedStatement statement = connection.prepareStatement(query);
	            rs = statement.executeQuery();
	            java.sql.ResultSetMetaData rsmd = rs.getMetaData();
	            String ID = rsmd.getColumnName(1);
	            
	            while(rs.next()){
	            	id = rs.getLong("MAX(ID)");
	            	System.out.println(ID + " je " + id);
	            	
	            }
	            
	        } catch (SQLException ex) {
	           ex.printStackTrace();
	        }
	    }
	    
	    @Test (priority = 1, dependsOnMethods={"maxIdKola"})
	    public void meceviID() throws SQLException, IOException {
	    	 String query = "select wm_concat(id) from MATCH where ROUNDID = ? and IS_GERMANIA_MATCH=0";
	    	 PreparedStatement statement = connection.prepareStatement(query);
	         statement.setLong(1, id);
	         rs = statement.executeQuery();
	         java.sql.ResultSetMetaData rsmd = rs.getMetaData();
	         String meceviId = rsmd.getColumnName(1);
	         while(rs.next()){
	        	 // Izvlacim iz baze meceve za to kolo
	        	mecevi = rs.getString("WM_CONCAT(ID)");
	        	log.info(meceviId + " su " + mecevi);
	            }
	    	}
	    
	    @Test(priority = 2)
	   public void upisMecevauJson() throws IOException {
	    	JSONObject obj = new JSONObject();
			obj.put("idMeceva", mecevi);
			try(FileWriter file = new FileWriter("C:\\Git workspace\\Selenium\\WebAutomation\\src\\main\\java\\resources\\meceviMalta.json")) 
			{
				file.write(obj.toJSONString());
				file.flush();
				file.close();
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

	    

