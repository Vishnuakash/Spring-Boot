package springBoot.springBoot.DBMigration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "MySQLConnection", value = "enable", havingValue = "true", matchIfMissing = false)
public class MySQLConnection {

	public MySQLConnection() {
		System.err.println("Eager : MySQlConnection initialized");
	}
}
