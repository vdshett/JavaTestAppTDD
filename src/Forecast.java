import java.util.Date;


public class Forecast {
	
	private Observatory observatory;

	public Forecast(Observatory observatory) {
		this.observatory = observatory;
	}


	public String getWeatherStatus() {
		
	    Climate climate = observatory.getClimate();
		
	    if ((climate.getDate().getHours() >= 6) && climate.getDate().getHours() <=18) {
	    	return "Day" + (climate.weather == "" ? "" : " & " + climate.weather);
	    }
	    else {
	    	return "Night" + (climate.weather == "" ? "" : " & " + climate.weather);
	    }
		
	}

}
