
public class Seance {
Movie movie;
Time startTime;
Time endTime;
public Seance(Movie movie, Time startTime) {
	this.movie = movie;
	this.startTime = startTime;
	this.endTime=new Time(startTime.getHour()+movie.getDuration().getHour(), startTime.getMin()+movie.getDuration().getMin());
}
public Movie getMovie() {
	return movie;
}
public void setMovie(Movie movie) {
	this.movie = movie;
}
public Time getStartTime() {
	return startTime;
}
public void setStartTime(Time startTime) {
	this.startTime = startTime;
}
public Time getEndTime() {
	return endTime;
}
@Override
public String toString() {
	return "\n\t\t " + movie + ", startTime=" + startTime + ", endTime=" + endTime + "";
}


}
