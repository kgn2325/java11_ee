package sec2;
// 스케쥴링 : 선점형과 비선점형이 있다.
// 선점(Preemption) : 해당 프로세스가 처리되다가 다른 프로세스에게 CPU를 양도될 수 있는 스케쥴링
// 비선점(Non-Preemption) : 해당 프로세스가 모두 완료될 때까지 다른 프로세스에게 CPU를 양도될 수 없는 스케쥴링
// FCFS(First Come First Service) : 선착순
// LeastJob : 요구 시간이 가장 작은 것부터 진행(스케줄링) => SCJ(Short time Job)
// SRT(Short Remain Time Job) : 남은  시간이 가장 작은 것 부터 진행
//A	3시간
//B	2시간
//C	4시간
//D	3시간
//E 	2시간
//총시간 : 14시간
//선탁순으로 A,B,C,D,E 의 프로세스가 있다
// B->E->A->D->C
// 아래와 같이 5개의 프로세스가 CPU 에서 처리되고자 한다면 

//A		08:00	3시간
//B		09:00	2시간
//C		10:00	4시간
//D		14:00	3시간
//E 	14:00	2시간
//총시간 : 14시간
// 8~11	9,11~13   10, 13~14     14~16        16~19       14, 19~22
// A ->   B ->         C->        E      ->    C     ->    D      
public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("LeastJob getNextCall");
		
	}

	@Override
	public void sentCallToAgent() {
		System.out.println("LeastJob sentCallToAgent");
		
	}
	
}
