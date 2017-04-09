package br.com.ifactory.solid;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8 {
	
	public static void main(String[] args) {
		
		List<String> linhas = new ArrayList<>();
		linhas.add("sa");
		linhas.add("b");
		
		Stream<Function<String, String>> functions = Stream.of();
		
		linhas.stream().reduce("a", (s, b) -> s.concat(b));
		
		System.out.println(linhas.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
		
	}
}
