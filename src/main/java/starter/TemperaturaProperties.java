package starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("saludo.mensaje")
public class TemperaturaProperties {
	private int temp =20;

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

}