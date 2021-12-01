package starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(Temperatura.class)
@EnableConfigurationProperties(TemperaturaProperties.class)
public class TemperaturaAutoconfigure {

	private final TemperaturaProperties properties;
	
	public TemperaturaAutoconfigure(TemperaturaProperties properties) {
		this.properties= properties;
	}
	
	@Bean
	public Temperatura temp() {
		System.out.println("Idioma: "+properties.getTemp());
		return new Temperatura(properties.getTemp());
	}
}
