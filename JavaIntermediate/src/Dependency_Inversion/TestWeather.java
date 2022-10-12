package Dependency_Inversion;


public class TestWeather {
	public static void main(String[] args) {
		WeatherTracker  Tracker = new WeatherTracker();
		Email e= new Email();
		e.alertWeatherConditions(null);
		Mobile p= new Mobile();	
		p.alertWeatherConditions(null);
		
		Tracker.setConditions("sunny");
		
		System.out.println(Tracker.getConditions());
		
		
		
	}

}
