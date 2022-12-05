package stream;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.hamcrest.core.IsEqual;

import static java.util.stream.Collectors.partitioningBy;


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
        return users.stream().map(s->s.getName()).collect(Collectors.joining(", "));
        		}


    public static double getAverageAge(List<User> users){
    	 return users.stream().mapToInt(u->u.getAge()).average().orElse(0.0);
    }

    public static Integer getMaxAge(List<User> users){
    	return users.stream().mapToInt(u->u.getAge()).max().orElse(0);
    }

    public static Integer getMinAge(List<User> users) {
      	return users.stream().mapToInt(u->u.getAge()).min().orElse(0);
    }

    public static boolean anyMatch(List<User> users, int age){
    	return users.stream().anyMatch(u -> u.getAge() == age);
    }

    public static boolean noneMatch(List<User> users, int age){
    	return users.stream().noneMatch(u -> u.getAge() == age);
    }

    public static Optional<User> findAny(List<User> users, String name){
    	return users.stream().filter(u->u.getName().equalsIgnoreCase(name)).findAny()  ;
    	    
    }

    public static List<User> sortByAge(List<User> users){
     	return users.stream().sorted((u1,u2)->u1.getAge().compareTo(u2.getAge())).toList();
    }

    public static Stream<Integer> getBoxedStream(IntStream stream){

        return stream.boxed();
    }

    public static List<Integer> generateFirst10PrimeNumbers(){
        return IntStream.rangeClosed(2, Integer.MAX_VALUE-2)
                .filter(x -> isPrime(x)).boxed().limit(10)
                .toList();
    }
    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number/2).noneMatch(i -> number % i == 0);
    }

    public static List<Integer> generate10RandomNumbers(){
        return new Random(50).ints().boxed().limit(10).toList();
    }

    public static User findOldest(List<User> users){
        return users.stream().max(Comparator.comparing(User::getAge)).orElseThrow(NoSuchElementException::new);

    }

    public static int sumAge(List<User> users){
        return users.stream().mapToInt(User::getAge).sum();
    }

    //Pvz.:
    //Java 8 Streams API: Grouping and Partitioning a Stream 
    //https://www.javacodegeeks.com/2015/11/java-8-streams-api-grouping-partitioning-stream.html
    
    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users){
     return  users.stream().collect(Collectors.partitioningBy(User::isMale));
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users){
        return users.stream().collect(Collectors.groupingBy(User::getAge));
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users){
        Map<Integer, List<User>> tempList = users.stream().collect(Collectors.groupingBy(User::getAge));
        return tempList.entrySet().stream().collect(Collectors.partitioningBy(User::isMale));
	    //padaryti su cycle
        //dar vienas pakeitimas
    }

    public static Map<Boolean, Long> countGender(List<User> users){
        throw new UnsupportedOperationException("Not implemented");
    }
        
    public static IntSummaryStatistics ageSummaryStatistics(List<User> users){
        throw new UnsupportedOperationException("Not implemented");
    }

}
