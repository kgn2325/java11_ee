package sec2;

public class RemoteExam5 {

	public static void main(String[] args) {
		RemoteControl r1; 
		Screen s1;
		System.out.println("텔레비젼");
		r1 = new Television();
		RemoteControl.changeBattery();
		r1.turnOn();
		r1.setVolume(20);
		r1.setMute(true);
		r1.setMute(false);
		r1.turnOff();
		
		
		System.out.println();
		System.out.println("오디오");
		r1 = new Audio();
		RemoteControl.changeBattery();
		r1.turnOn();
		r1.setVolume(50);
		r1.setMute(true);
		r1.setMute(false);
		r1.turnOff();
		
		System.out.println();
		System.out.println("스크린");
		r1 = new Screen() {
			int volume;
			int lightness;
			int zoom;

			
			public void turnOff() {
				System.out.println("전원 OFF");
			
				}

	
			public void turnOn() {
				System.out.println("전원 ON");
			
			}

		
			public void setVolume(int volume) {
				if(volume > MAX)
				{
					this.volume = RemoteControl.MAX;
				} else if(volume < MIN) {
					this.volume = RemoteControl.MIN;
				}
				else
				{
					this.volume = volume;
				}
			
			}

		
			public int light() {
				System.out.println("밝게");
				if(this.lightness < 255 && this.lightness>0) {
					this.lightness++;
				}
				return this.lightness;
			}

	
			public int dark() {
				System.out.println("어둡게");
				if(this.lightness < 255 && this.lightness>0) {
					this.lightness--;
				}
				return this.lightness;
			}

		
			public int zoomin() {
				System.out.println("50% 확대");
				if(zoom >=-500 && zoom<=500)
				{
					zoom+=50;
				}
				return zoom;
			}

	
			public int zoomout() {
				System.out.println("50% 축소");
				if(zoom >=-500 && zoom<=500)
				{
					zoom-=50;
				}
				return zoom;
			}
		};
		
		RemoteControl.changeBattery();
		r1.turnOn();
		r1.setVolume(4);
		r1.setMute(true);
		r1.setMute(false);
		r1.turnOff();
		

	}

}
