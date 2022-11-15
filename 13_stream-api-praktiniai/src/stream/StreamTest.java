package stream;

import org.junit.Test;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.*;


public class StreamTest {
	 @Test
	    public void shouldMapStringsToUpperCase() {
	        List<String> input = asList("This", "is", "java", "8");
	        List<String> result = StreamPraktiniai.mapToUpperCase(input);
	        assertThat(result, contains("THIS", "IS", "JAVA", "8"));
	    }

	    @Test
	    public void shouldReturnSquareRoot() {
	        List<Integer> numbers = asList(1, 4, 16, 256);
	        List<Integer> squares = StreamPraktiniai.returnSquareRoot(numbers);
	        assertThat(squares, is(equalTo(asList(1, 2, 4, 16))));
	    }

	    @Test
	    public void shouldReturnAgeFromUser() {
	        List<User> users = User.getUsersWithAge(18, 20);
	        List<Integer> ageFromUsers = StreamPraktiniai.getAgeFromUsers(users);
	        assertThat(ageFromUsers, is(equalTo(asList(18, 20))));
	    }

	    @Test
	    public void shouldReturnFirstTwo() {
	        List<User> users = User.getUsersWithAge(18, 20, 21, 22, 23);
	        users = StreamPraktiniai.getLimitedUserList(users, 2);
	        assertThat(users, is(equalTo(Arrays.asList(users.get(0), users.get(1)))));
	    }

	    @Test
	    public void shouldReturnNumberOfUsersOlderThen25() {
	        List<User> users = User.getUsersWithAge(18, 20, 21, 22, 23, 24, 25, 26);
	        Integer count = StreamPraktiniai.countUsersOlderThen25(users);
	        assertTrue(count == 1);
	    }

	    @Test
	    public void shouldReturnDistinctAges() {
	        List<User> users = User.getUsersWithAge(18, 20, 20, 21, 22, 22, 23, 24, 25, 26);
	        List<Integer> distinctAges = StreamPraktiniai.getDistinctAges(users);
	        assertThat(distinctAges, is(equalTo(asList(18, 20, 21, 22, 23, 24, 25, 26))));
	    }

	    @Test
	    public void shouldSumIntegersInCollection() {
	        List<Integer> integers = asList(1, 2, 3, 4, 5);
	        Integer result = StreamPraktiniai.sum(integers);
	        assertThat(result, equalTo(1 + 2 + 3 + 4 + 5));
	    }

	    @Test
	    public void shouldSkipInCollection() {
	        List<Integer> integers = asList(1, 2, 3, 4, 5);
	        List<Integer> result = StreamPraktiniai.skip(integers, 2);
	        assertThat(result, equalTo(asList(3, 4, 5)));
	    }

	    @Test
	    public void shouldReturnFirstNames() {
	        List<String> names = asList("Homer Simpson", "Marge Simpson", "Bart Simpson", "Kent Brockman");
	        List<String> result = StreamPraktiniai.getFirstNames(names);
	        assertThat(result, equalTo(asList("Homer", "Marge", "Bart", "Kent")));
	    }

	    @Test
	    public void shouldReturnDistinctLetters() {
	        List<String> names = asList("Homer Simpson", "Marge Simpson", "Bart Simpson", "Kent Brockman");
	        List<String> result = StreamPraktiniai.getDistinctLetters(names);
	        assertThat(result, equalTo(asList("H", "o", "m", "e", "r", " " , "S", "i", "p", "s", "n", "M", "a", "g", "B", "t", "K", "c", "k")));
	    }

	    @Test
	    public void shouldSeparateNamesByComma() {
	        List<User> input = asList(
	                new User("Homer"),
	                new User("Maggie"),
	                new User("Bart"));
	        String result = StreamPraktiniai.separateNamesByComma(input);
	        assertThat(result, equalTo("Homer, Maggie, Bart"));
	    }

	    @Test
	    public void shouldPerformCalculations(){
	        List<User> users = User.getUsersWithAge(10, 20, 30);
	        assertThat(StreamPraktiniai.getMinAge(users), equalTo(10));
	        assertThat(StreamPraktiniai.getMaxAge(users), equalTo(30));
	        assertThat(StreamPraktiniai.getAverageAge(users), equalTo((double)(10+20+30)/3));
	    }

	    @Test
	    public void shouldPartitionByGender() {
	        User homer = new User("Homer", true);
	        User bart = new User("Bart", true);
	        User maggie = new User("Maggie",false);
	        User lisa = new User("Lisa", false);
	        List<User> input = asList(homer, bart, maggie, lisa);
	        Map<Boolean, List<User>> result = StreamPraktiniai.partionUsersByGender(input);
	        assertThat(result.get(true), containsInAnyOrder(homer, bart));
	        assertThat(result.get(false), containsInAnyOrder(maggie, lisa));
	    }

	    @Test
	    public void shouldGroupByAge() {
	        User homer = new User("Homer", 50);
	        User bart = new User("Bart", 12);
	        User maggie = new User("Maggie",2);
	        User lisa = new User("Lisa", 8);
	        List<User> input = asList(homer, bart, maggie, lisa);
	        Map<Integer, List<User>> result = StreamPraktiniai.groupByAge(input);
	        assertThat(result.get(50), containsInAnyOrder(homer));
	        assertThat(result.get(12), containsInAnyOrder(bart));
	        assertThat(result.get(8), containsInAnyOrder(lisa));
	        assertThat(result.get(2), containsInAnyOrder(maggie));
	    }

	    @Test
	    public void shouldGroupByGenderAndAge() {
	        User homer = new User("Homer", 50, true);
	        User bart = new User("Bart", 12, true);
	        User maggie = new User("Maggie",2, false);
	        User lisa = new User("Lisa", 8, false);
	        List<User> input = asList(homer, bart, maggie, lisa);
	        Map<Boolean, Map<Integer, List<User>>> result = StreamPraktiniai.groupByGenderAndAge(input);
	        assertThat(result.get(true).get(50), containsInAnyOrder(homer));
	        assertThat(result.get(true).get(12), containsInAnyOrder(bart));
	        assertThat(result.get(false).get(8), containsInAnyOrder(lisa));
	        assertThat(result.get(false).get(2), containsInAnyOrder(maggie));
	    }

	    @Test
	    public void shouldCountGender() {
	        User homer = new User("Homer", 50, true);
	        User bart = new User("Bart", 12, true);
	        User maggie = new User("Maggie",2, false);
	        User lisa = new User("Lisa", 8, false);
	        List<User> input = asList(homer, bart, maggie, lisa);
	        Map<Boolean, Long> result = StreamPraktiniai.countGender(input);
	        assertThat(result.get(true), equalTo(2L));
	        assertThat(result.get(false), equalTo(2L));
	    }

	    @Test
	    public void shouldMatchAge(){
	        List<User> users = User.getUsersWithAge(10, 20, 30);
	        assertTrue(StreamPraktiniai.anyMatch(users, 10));
	    }

	    @Test
	    public void shouldNoneMatchAge(){
	        List<User> users = User.getUsersWithAge(10, 20, 30);
	        assertTrue(StreamPraktiniai.noneMatch(users, 40));
	    }

	    @Test
	    public void shouldFindAnyUser(){
	        User homer = new User("Homer", true);
	        User bart = new User("Bart", true);
	        User maggie = new User("Maggie",false);
	        User lisa = new User("Lisa", true);
	        List<User> users = asList(homer, bart, maggie, lisa);
	        Optional<User> user = StreamPraktiniai.findAny(users, "Homer");
	        assertTrue(user.isPresent());
			Optional<User> gj = StreamPraktiniai.findAny(users, "GJ");
			assertFalse(gj.isPresent());
	    }

	    @Test
	    public void shouldSortByAge(){
	        User homer = new User("Homer", 50);
	        User bart = new User("Bart", 12);
	        User maggie = new User("Maggie",2);
	        User lisa = new User("Lisa", 8);
	        List<User> users = asList(homer, bart, maggie, lisa);
	        List<User> sorted = StreamPraktiniai.sortByAge(users);
	        assertThat(sorted, contains(maggie, lisa, bart, homer));
	    }

	    @Test
	    public void shouldFindOldest(){
	        User homer = new User("Homer", 50);
	        User bart = new User("Bart", 12);
	        User maggie = new User("Maggie",2);
	        User lisa = new User("Lisa", 8);
	        List<User> users = asList(homer, bart, maggie, lisa);
	        User oldest = StreamPraktiniai.findOldest(users);
	        assertThat(oldest, equalTo(homer));
	    }

	    @Test
	    public void shouldSumAgeAsInt(){
	        User homer = new User("Homer", 50);
	        User bart = new User("Bart", 12);
	        User maggie = new User("Maggie",2);
	        User lisa = new User("Lisa", 8);
	        List<User> users = asList(homer, bart, maggie, lisa);
	        int sumAge = StreamPraktiniai.sumAge(users);
	        assertThat(sumAge, equalTo(50+12+2+8));
	    }

	    @Test
	    public void shouldGenerateAgeSummaryStatistics(){
	        User homer = new User("Homer", 50);
	        User bart = new User("Bart", 12);
	        User maggie = new User("Maggie",2);
	        User lisa = new User("Lisa", 8);
	        List<User> users = asList(homer, bart, maggie, lisa);
	        IntSummaryStatistics statistics = StreamPraktiniai.ageSummaryStatistics(users);
	        assertThat(statistics.getAverage(), equalTo((double)(50+12+2+8)/4));
	        assertThat(statistics.getCount(),equalTo(4L));
	        assertThat(statistics.getMax(),equalTo(50));
	        assertThat(statistics.getMin(),equalTo(2));
	    }

	    @Test
	    public void shouldConvertToBoxedStream(){
	        List<Integer> numbers = asList(1, 2, 3);
	        IntStream intStream = numbers.stream().mapToInt(value -> value);
	        Stream<Integer> boxedStream = StreamPraktiniai.getBoxedStream(intStream);
	        assertTrue(boxedStream.count() == 3);
	    }

	  

	    @Test
	    public void shouldGenerateFirstPrimeNumbers(){
	        List<Integer> primeNumbers = StreamPraktiniai.generateFirst10PrimeNumbers();
	        assertThat(primeNumbers, contains(2,3,5,7,11,13,17,19,23,29));
	    }

	    @Test
	    public void shouldGenerate10RandomNumbers(){
	        List<Integer> randomNumbers = StreamPraktiniai.generate10RandomNumbers();
	        assertTrue(randomNumbers.size()==10);
	    }

	    
}