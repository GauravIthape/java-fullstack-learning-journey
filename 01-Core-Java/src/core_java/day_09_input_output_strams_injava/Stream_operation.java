package day_09_input_output_strams_injava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_operation {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,2,3,4,3,434,3,4,4,0,3,4,6,76,78,9,0,6,6,6);
		List<Integer> filterList = list.stream().filter(x->x%2==0)
				.map(x->x/2)
				.distinct()
				.sorted((a,b)->(b-a))
				.limit(4)
				.skip(1)
				.collect(Collectors.toList());
		System.out.println(filterList);
		//List<Integer> map =filterList.stream().map(x->x/2).collect(Collectors.toList());
		//System.out.println(map);
		
		List<Integer> collect = Stream.iterate(0, x->x+1)
				.limit(101)
				.skip(10)
				.filter(x->x%2==0)
				.map(x->x/10)
				.peek(x->System.out.println(x))
				.collect(Collectors.toList());
		System.out.println("__________________________________");
		Integer integer= Stream.iterate(0, x->x+1)
				.limit(101)
				.skip(10)
				.filter(x->x%2==0)
				.map(x->x/10)
				.distinct()
				.peek(System.out::println)
				.max((a,b)->b-a).get();
		
		System.out.println(integer);
		
	}

}
