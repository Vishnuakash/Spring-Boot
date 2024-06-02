package springBoot.springBoot.DBMigration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "NoSQLConnection", value = "enable", havingValue = "true", matchIfMissing = false)
public class NoSQLConnection {

	/***
	 * In application.properties file a key is created : NoSQlConnection.enable
	 * with whatever the value you passed is matched with havingValue is
	 * matchIfMissing is true.
	 * 
	 * matchIfMissing = true means in application.properties file if this key 
	 * (NoSQlConnection.enable) is missing then also match.
	 * 
	 * */
	public NoSQLConnection() {
		System.err.println("Eager : NoSQLConnection initialized");
	}
}
