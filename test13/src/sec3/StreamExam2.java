package sec3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExam2 {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("이연정");
		lst.add("조우진");
		lst.add("박은성");
		lst.add("강민우");
		lst.add("장인범");
		lst.add("박범수");
		
		//ArrayList의 Stream
		Stream<String> stream = lst.stream();
		System.out.println("정렬 전");

		stream.forEach(n->System.out.println(n));
		System.out.println("\n정렬 후");

		lst.stream().sorted().forEach(s->System.out.println(s));
		//요소의 수 출력
		System.out.println("\n요소의 수 : " +lst.stream().count());

	}

}
