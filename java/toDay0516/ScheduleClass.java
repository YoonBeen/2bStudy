package toDay0516;

import java.util.Scanner;

public class ScheduleClass extends ScheduleSet {
	
	public ScheduleClass(int count) {
		super(count);
	}

	@Override
	public String[] getString() {
		Scanner sc = new Scanner(System.in);
		String[] s = new String[3];
		
		for(int i=0; i < s.length; i++) {
			switch (i) {

			case 0:	
				System.out.println("������:");
				s[i]=sc.nextLine();
				break;
			case 1:	
				System.out.println("���:	");
				s[i]=sc.nextLine();
				break;
			case 2:	
				System.out.println("�ð�:");
				s[i]=sc.nextLine();
				break;
		}
	}
	System.out.println();
	return s;
	}
}
