package ex06;

public class TV {
	private boolean power;
	private int volume;
	private int channel;
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public void power(boolean on) {
		power = on;
	}
	
	public void channel(int channel) {
		this.channel = channel;
	}
	
	public void channel(boolean up) {
		if( up ) {
			channel++;
		} else {
			channel--;
		}
	}
	
	public void volume(int volume) {
		this.volume = volume;
	}
	
	public void volume(boolean up) {
		if( up ) {
			volume++;
		} else {
			volume--;
		}
	}
	
	public void status() {
		System.out.println("[" + power + "," + volume + "," + channel + "]");
	}
}
