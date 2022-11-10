package lambda;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LMain {//©KS

	public static <E> void main(String[] args) {
//		Printable lambdaPrintable = (s) -> {return "Meow " +s;};
//		print(lambdaPrintable);
//		print((s) -> {return "Meow " +s;});
		
		List<String> names = asList("Homer Simpson", "Marge Simpson", "Bart Simpson", "Kent Brockman");
		StringBuilder strB = new StringBuilder();
		String str = "";
//		List<String> 
//		List<String> arr = names.stream().map(w -> w ).flatMap(Arrays::stream) .distinct().collect(Collectors.toList()));
			System.out.println(	
					
					names.stream()
					.map(w->w.split(""))
//					.map(w1->w1.split(" "))
					.map(q->Arrays.deepToString(q))
					.distinct()
					.collect(
			                Collectors.toList()));
		          
	}
	
	public static void print(Printable thing) {
		thing.print("mine");
	}

}
//public interface Printable {
//String print(String suffix);
//}
