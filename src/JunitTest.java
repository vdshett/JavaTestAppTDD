import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

import java.util.Date;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JunitTest {

	private Observatory observatory;

	@Before
	public void setUp() throws Exception {
		observatory = mock(Observatory.class);
	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void TestDayWeather() {

		// Given
		String expectedWeatherStatus = "Day";
		Date date = new Date(2008, 8, 6, 12, 0, 0);
		Climate climate = new Climate(date, "");
		given(observatory.getClimate()).willReturn(climate);

		// When
		Forecast forecast = new Forecast(observatory);
		String actualWeatherStatus = forecast.getWeatherStatus();

		// Then
		Assert.assertEquals(expectedWeatherStatus, actualWeatherStatus);

	}

	@Test
	public void TestNightWeather() {

		// Given
		String expectedWeatherStatus = "Night";
		Date date = new Date(2008, 8, 6, 3, 0, 0);
		Climate climate = new Climate(date, "");
		given(observatory.getClimate()).willReturn(climate);

		// When
		Forecast forecast = new Forecast(observatory);
		String actualWeatherStatus = forecast.getWeatherStatus();

		// Then
		Assert.assertEquals(expectedWeatherStatus, actualWeatherStatus);

	}

	@Test
	public void TestDayAndCloudyWeather() {

		// Given
		String expectedWeatherStatus = "Day & Cloudy";
		Date date = new Date(2008, 8, 6, 13, 0, 0);
		Climate climate = new Climate(date, "Cloudy");
		given(observatory.getClimate()).willReturn(climate);

		// When
		Forecast forecast = new Forecast(observatory);
		String actualWeatherStatus = forecast.getWeatherStatus();

		// Then
		Assert.assertEquals(expectedWeatherStatus, actualWeatherStatus);

	}

	@Test
	public void TestDayAndSunnyWeather() {

		// Given
		String expectedWeatherStatus = "Day & Sunny";
		Date date = new Date(2008, 8, 6, 13, 0, 0);
		Climate climate = new Climate(date, "Sunny");
		given(observatory.getClimate()).willReturn(climate);

		// When
		Forecast forecast = new Forecast(observatory);
		String actualWeatherStatus = forecast.getWeatherStatus();

		// Then
		Assert.assertEquals(expectedWeatherStatus, actualWeatherStatus);

	}

}
