import java.util.HashSet;
import java.util.Set;




public class Schedule {
	private Set<Seance> schedule = new HashSet<Seance>(); 
	public Schedule() {
	}

	public Set<Seance> getSchedule() {
		return schedule;
	}

	public void setSchedule(Set<Seance> schedule) {
		this.schedule = schedule;
	}

	public void printSchedule() {
		for (Seance seance : schedule) {
			System.out.println(seance);
		}
	}

	public void addSeance(Seance seance) {
		
		schedule.add(seance);
	};

	public void removeSeance(String title) {

	 schedule.removeIf(o -> (o.getMovie().getTitle().equalsIgnoreCase(title)));
	}

	@Override
	public String toString() {
		return "Schedule" + schedule + "\n";
	};
	
}
