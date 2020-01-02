import java.beans.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

public class OperationDb {

	private Connection connection = null;
	private Statement st = null;
	private PreparedStatement prSt = null;
	private static OperationDb operationDb;
	
	
	private OperationDb() {
		
		String url = "jdbc:mysql://" + database.host + ":" + database.port  + "/" + database.db_name + "?useUnicode=true&characterEncoding=utf8&useSSL=false";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try {
			
			connection = DriverManager.getConnection(url,database.username,database.password);
			System.out.println("Connection success!");
		}
		catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public static OperationDb getOperationDb() {
		
		if(operationDb == null) {
			
			System.out.println("");
			return new OperationDb();
		}
		else {
			
			return null;
		}
	}
	
	
	
	public void addCheck(String masa_adi, String icerik, double fiyat) {
		String sorgu ="INSERT INTO checks (masa_adi,icerik,fiyat) VALUES(?,?,?)";
		try {
			prSt = connection.prepareStatement(sorgu);
			
			prSt.setString(1, masa_adi);
			prSt.setString(2, icerik);
			prSt.setDouble(3, fiyat);
			
			prSt.executeUpdate();
		}
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
public void registerAdmin(String username, String password) {
	
	String sorgu = "INSERT INTO Admins (username,password) VALUES (?,?)";
			
	try {
		
		prSt = connection.prepareStatement(sorgu);
		
		prSt.setString(1, username);
		prSt.setString(2, password);
		
		prSt.executeUpdate();
		
	}
	catch (SQLException e) {
		
		e.printStackTrace();
	}
}

public boolean isLogin(String username, String password) {
	
	String sorgu = "SELECT * FROM Admins WHERE username = ? AND password = ?";
	
	try {
		
		prSt = connection.prepareStatement(sorgu);
		
		prSt.setString(1, username);
		prSt.setString(2, password);
		
		ResultSet rs = prSt.executeQuery();
		
		return rs.next();
	}
	catch (SQLException e) {
		
		e.printStackTrace(); 
		return false;
	}
	
}

public double getFullPrice(String masa_adi) {
	String sorgu ="SELECT  *FROM checks Where masa_adi = ?";
	double price=0.0;
	
	try {
		prSt = connection.prepareStatement(sorgu);
		prSt.setString(1, masa_adi);
		ResultSet rs = prSt.executeQuery();
		
		
		while(rs.next()) {
			
			price += rs.getDouble(4);
			
		}
		System.out.println(price);
		return price;
		
	}
	catch(SQLException e) {
		e.printStackTrace();
		return 0.0;
	}
}

public ListModel<Object> getIcerik(String masa_adi) {
	
	String sorgu = "SELECT * FROM checks WHERE masa_adi = ?";
	DefaultListModel<Object> dlm = new DefaultListModel<Object>();
	
	try {
		
		prSt = connection.prepareStatement(sorgu);
		prSt.setString(1, masa_adi);
		ResultSet rs = prSt.executeQuery();
		
		while(rs.next()) {
			
			String icerik = rs.getString("masa_adi") + " " + rs.getString("icerik") + " " + rs.getDouble("fiyat") + " TL\n";
			dlm.addElement(icerik);
		}
		return dlm;
	}
	catch (SQLException e) {
		
		e.printStackTrace();
		return null;
	}
}

public void payCheck(String masa_adi) {
	
	String sorgu = "DELETE FROM checks WHERE masa_adi = ?";
	
	try {
		
		prSt = connection.prepareStatement(sorgu);
		
		prSt.setString(1, masa_adi);
		
		prSt.execute();
	}
	catch (SQLException e) {
		
		e.printStackTrace(); 
	}
}
}
