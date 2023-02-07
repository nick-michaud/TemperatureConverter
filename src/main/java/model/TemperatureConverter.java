package model;

public class TemperatureConverter {
	private int finalTemp;
	private double celcius;
	private int fahrenheit;

	public TemperatureConverter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TemperatureConverter(int finalTemp) {
		super();
		this.finalTemp = finalTemp;
		
	}

	public double getFinalTemp() {
		finalTemp = ((finalTemp - 32)*5)/9;
		return finalTemp;
	}

	public void setFinalTemp(int finalTemp) {
		this.finalTemp = finalTemp;
		
	}

	public double getCelcius() {
		return celcius;
	}

	public void setCelcius(double celcius) {
		this.celcius = celcius;
	}

	public int getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(int fahrenheit) {
		this.fahrenheit = fahrenheit;
	}


	

	@Override
	public String toString() {
		return "TemperatureConverter [finalTemp=" + finalTemp + ", celcius=" + celcius + ", fahrenheit=" + fahrenheit
				+ "]";
	}

}
