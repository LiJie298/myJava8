package pl.luwi.java8.demo.annotations;


public class ScheduleProcessor {

	public static void printSchedules(Class<?> c) {
		for (Schedule schedule : c.getAnnotationsByType(Schedule.class)) {
			System.out.println(schedule);
		}
	}
	
	public static void main(String[] args) {
		printSchedules(PeriodicJob.class);
	}
}
