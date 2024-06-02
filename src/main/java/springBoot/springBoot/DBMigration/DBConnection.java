package springBoot.springBoot.DBMigration;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class DBConnection {

	/**
	 * By default require is true in @Autowired.
	 * 
	 * If we are not using @Component on DbConnection class then init
	 * is not call because spring does not create bean for this DBConnection class
	 * So, after injecting dependency mySQLConnection and noSQLConnection init is called.
	 * 
	 * init is only called once mySQLConnection and noSQLConnection dependency resolved 
	 * or mySQLConnection and noSQLConnection instance is initialized.  
	 * 
	 * **/
	@Autowired(required = false)
	MySQLConnection mySQLConnection;
	
	@Autowired(required = false)
	NoSQLConnection noSQLConnection;
	
	public DBConnection() {
          System.err.println("Eager : DBConnection initialized");
	}
	
	@PostConstruct
	public void init() {
		System.err.println("DBConnection created.....");
		System.err.println("noSQLConnection instance is null ??"+Objects.isNull(noSQLConnection));
		System.err.println("mySQLConnection instance is null ??"+Objects.isNull(mySQLConnection));
	}
}
