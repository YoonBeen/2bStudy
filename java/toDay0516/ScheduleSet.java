package toDay0516;

public abstract class ScheduleSet implements IScheduleSet {
	private int count;
	
	public ScheduleSet(int count) {
		this.count = count;
	}
	
	@Override
	public Schedule[] makeSchedule() {
		Schedule[] s = new Schedule[count];
		
		for(int i = 0; i < count; i++) {
			String[] a = getString();
			s[i] = (a[2].isEmpty()) ? new Schedule(a[0], a[1]) : new Schedule(a[0], a[1] , a[2]);
				
		}
		return s;		
	}

	@Override
	public void sreachSchedule(Schedule[] ScheduleArray,String day) {
		boolean nullit = true;
		for(int i = 0; i < count; i++) {
			if(ScheduleArray[i].getDay().equals(day)) {
			nullit = false;
			System.out.println("\n일자 : " + ScheduleArray[i].getDay() + "\n스케줄 : " 
	                + ScheduleArray[i].getSchedule() + "\n장소 : " + ScheduleArray[i].getPlace() + "\n");
		}}
		if(nullit) {
			System.out.println("\n해당 일자에 스케줄이 존재하지 않습니다.\n");
		}
	}	
	public abstract String[] getString(); 

}
