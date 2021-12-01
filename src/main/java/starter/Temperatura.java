package starter;

public class Temperatura {
	
	private int temp;
	
	public Temperatura(int temp) {
		super();
		this.temp = temp;
	}

	public String mostrarCel() {
		return "Celcius";
	}
	
	public double celsiusAfahrenheit(int celsius) {
		return (celsius * 1.8f) + 32;

	}
	
	public double fahrenheitAcelsius(int fahrenheit) {
		return (fahrenheit - 32) / 1.8f;

	}
}
