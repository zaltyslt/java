package lt.vtmc.praktiniai.stream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPraktiniai {

    public static List<Integer> returnSquareRoot(List<Integer> numbers){
    	try {
    		return numbers.stream().map(n-> (int)Math.sqrt(n)).collect(Collectors.toList());
		} catch (Exception e) {
			 throw new UnsupportedOperationException("Not implemented");
		} 
       
    }

    public static List<Integer> getAgeFromUsers(List<User> users){
        try {
			return users.stream().map(u->u.getAge()).collect(Collectors.toList());
		} catch (Exception e) {
			throw new UnsupportedOperationException("Not implemented");
		}
    }

    public static List<Integer> getDistinctAges(List<User> users){
        try {
        	return users.stream().map(u->u.getAge()).distinct(). collect(Collectors.toList());
		} catch (Exception e) {
			throw new UnsupportedOperationException("Not implemented");
		}
    }

    public static List<User> getLimitedUserList(List<User> users, int limit){
        return users.stream().limit(limit).toList();
    }

    public static Integer countUsersOlderThen25(List<User> users){
   	
    	return (int) users.stream().filter(u->u.getAge() > 25).count(); 
    }

    public static List<String> mapToUpperCase(List<String> strings){
//        return strings.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
         	return strings.stream().map(w -> w.split("")).
         			flatMap(Arrays::stream)
    	           .distinct()
    	           .collect(Collectors.toList());
    }

    public static Integer sum(List<Integer> integers){
       return integers.stream().reduce(0, Integer::sum);
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip){
    	return integers.stream().skip(toSkip).toList();
    }

    public static List<String> getFirstNames(List<String> names){
        return names.stream().map(s-> s.split(" ")).map(ar -> ar[0]).toList();
    }

    public static List<String> getDistinctLetters(List<String> names){
       
    	return names.stream().map(s-> s.split("")).flatMap(s->Stream.of(s)).distinct().toList();
    	 
    }


    public static String separateNamesByComma(List<User> users){
        return users.stream().map(s->{String.join(",", s)} ).
    }


    public static double getAverageAge(List<User> users){
        throw new UnsupportedOperationException("Not implemented");
    }

    public static Integer getMaxAge(List<User> users){
        throw new UnsupportedOperationException("Not implemented");
    }

    public static Integer getMinAge(List<User> users) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public static boolean anyMatch(List<User> users, int age){
        throw new UnsupportedOperationException("Not implemented");
    }

    public static boolean noneMatch(List<User> users, int age){
        throw new UnsupportedOperationException("Not implemented");
    }

    public static Optional<User> findAny(List<User> users, String name){
        throw new UnsupportedOperationException("Not implemented");
    }

    public static List<User> sortByAge(List<User> users){
        throw new UnsupportedOperationException("Not implemented");
    }

    public static Stream<Integer> getBoxedStream(IntStream stream){
        throw new UnsupportedOperationException("Not implemented");
    }

    public static List<Integer> generateFirst10PrimeNumbers(){
        throw new UnsupportedOperationException("Not implemented");
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);
    }

    public static List<Integer> generate10RandomNumbers(){
        throw new UnsupportedOperationException("Not implemented");
    }

    public static User findOldest(List<User> users){
        throw new UnsupportedOperationException("Not implemented");
    }

    public static int sumAge(List<User> users){
        throw new UnsupportedOperationException("Not implemented");
    }

    //Pvz.:
    //Java 8 Streams API: Grouping and Partitioning a Stream 
    //https://www.javacodegeeks.com/2015/11/java-8-streams-api-grouping-partitioning-stream.html
    
    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users){
        throw new UnsupportedOperationException("Not implemented");
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users){
        throw new UnsupportedOperationException("Not implemented");
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users){
        throw new UnsupportedOperationException("Not implemented");
    }

    public static Map<Boolean, Long> countGender(List<User> users){
        throw new UnsupportedOperationException("Not implemented");
    }
        
    public static IntSummaryStatistics ageSummaryStatistics(List<User> users){
        throw new UnsupportedOperationException("Not implemented");
    }

}
