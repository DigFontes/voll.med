package med.voll.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;

import javax.sql.DataSource;

@Configuration
public class FlywayConfig {

    @Autowired
    private DataSource dataSource;

    @Bean
    public FlywayMigrationStrategy repairStrategy() {
        return flyway -> {
            flyway.configure()
                    .dataSource(dataSource) // Garante que o Flyway use o mesmo dataSource
                    .load()
                    .repair();
            flyway.migrate();
        };
    }
}