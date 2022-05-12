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
			System.out.println("\n���� : " + ScheduleArray[i].getDay() + "\n������ : " 
	                + ScheduleArray[i].getSchedule() + "\n��� : " + ScheduleArray[i].getPlace() + "\n");
		}}
		if(nullit) {
			System.out.println("\n�ش� ���ڿ� �������� �������� �ʽ��ϴ�.\n");
		}
	}	
	public abstract String[] getString(); 

}
