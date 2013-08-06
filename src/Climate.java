import java.util.Date;


public class Climate {
	public Date date;
	public String weather;	
	
	public Climate(Date date, String weather) {
		this.date = date;
		this.weather = weather;
	}

	public Date getDate() {
		return date;
	}
	
	public String getWeather() {
		return weather;
	}
	
}
