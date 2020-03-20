package ua.lviv.lgs.hw24;

import java.util.ArrayList;
import java.util.TreeMap;

public class Cinema {
	TreeMap<Days, Schedule> schedules = new TreeMap<>();
	ArrayList<Movie> moviesLibrary = new ArrayList<>();
	Schedule shed1 = new Schedule();
	Schedule shed2 = new Schedule();
	Schedule shed3 = new Schedule();
	Schedule shed4 = new Schedule();
	Schedule shed5 = new Schedule();
	Schedule shed6 = new Schedule();
	Schedule shed7 = new Schedule();
	

	public void addMovie(Movie movie) {
		moviesLibrary.add(movie);
	}

	public void addSeance(Seance seans, String day) {

		switch (day.toLowerCase()) {
		case "monday":
			shed1.addSeance(seans);
			schedules.put(Days.MONDAY, shed1);
			break;
		case "tuesday":
			shed2.addSeance(seans);
			schedules.put(Days.TUESDAY, shed2);
			break;
		case "wednesday":
			shed3.addSeance(seans);
			schedules.put(Days.WEDNESDAY, shed3);
			break;
		case "thursday":
			shed4.addSeance(seans);
			schedules.put(Days.THURSDAY, shed4);
			break;
		case "friday":
			shed5.addSeance(seans);
			schedules.put(Days.FRIDAY, shed5);
			break;
		case "saturday":
			shed6.addSeance(seans);
			schedules.put(Days.SATURDAY, shed6);
			break;
		case "sunday":
			shed7.addSeance(seans);
			schedules.put(Days.SUNDAY, shed7);
			break;
			
		default:
			System.out.println("Нема такого дня!");
			break;
		
		}

	}

	public void removeMovie(Movie movie) {
		moviesLibrary.remove(movie);
	}

	public void removeSeance(Seance seans, String day) {
		switch (day.toLowerCase()) {
		case "MONDAY":
			shed1.removeSeance(seans);
			schedules.put(Days.MONDAY, shed1);
			break;
		case "TUESDAY":
			shed2.removeSeance(seans);
			schedules.put(Days.TUESDAY, shed2);
			break;
		case "WEDNESDAY":
			shed3.removeSeance(seans);
			schedules.put(Days.WEDNESDAY, shed3);
			break;
		case "THURSDAY":
			shed4.removeSeance(seans);
			schedules.put(Days.THURSDAY, shed4);
			break;
		case "FRIDAY":
			shed5.removeSeance(seans);
			schedules.put(Days.FRIDAY, shed5);
			break;
		case "SATURDAY":
			shed6.removeSeance(seans);
			schedules.put(Days.SATURDAY, shed6);
			break;
		case "SUNDAY":
			shed7.removeSeance(seans);
			schedules.put(Days.SUNDAY, shed7);
			break;
	
		}
	}
}
