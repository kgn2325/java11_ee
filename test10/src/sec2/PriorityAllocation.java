package sec2;
//PriorityAllocation(우선순위 할당)
public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("PriorityAllocation getNextCall()");
		
	}

	@Override
	public void sentCallToAgent() {
		System.out.println("PriorityAllocation sentCallToAgent()");
		
	}
	

}
