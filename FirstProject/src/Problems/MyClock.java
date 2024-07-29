package Problems;

public class MyClock {
	
	private int hours;
	private int minutes;
	private int seconds;
	

	
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}


	// constructor with three parameters:
	public MyClock(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	//Default constructor
	
	public MyClock() {
		this.hours = 12;
		this.minutes = 0;
		this.seconds = 0;
	}
	
	public MyClock(int totalsec) {
		setClock(totalsec);
	}

	public void setClock(int totalsec) {
		hours = (totalsec / 3600) % 24;
		minutes = (totalsec / 3600) / 60;
		seconds = totalsec / 60;
	}

	public void tick() {
		setClock((hours*3600 + minutes*60 + seconds+1)%86400);
	}
	
	public void tickDown() {
		setClock((hours*3600 + minutes*60 + seconds-1)%86400);
	}
	
	 public void addClock(MyClock otherclock) {
	        int sec1 = this.hours * 3600 + this.minutes * 60 + this.seconds +
	        		otherclock.getHours()*3600 + otherclock.getMinutes() * 60 + otherclock.getSeconds();
	        setClock(sec1 % 86400);
	    }
	
	public MyClock subtractClock(MyClock otherclock) {
		int sec1 = this.hours*3600 + this.minutes*60 + this.seconds;
		int sec2 = otherclock.getHours()*3600 + otherclock.getMinutes() * 60 + otherclock.getSeconds();
		int sec3 = (sec1 - sec2)%86400;
		return otherclock;
	}
	
	@Override
	public String toString() {
		return "MyClock [hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds + "]";
	}

}
