package id.ac.amikom.day02.shortsearch;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HumanTest {
	public static void main(String[] args) {
		List<Human> humans = new ArrayList<>();
		humans.add(new Human("Sarah", 12));
		humans.add(new Human("Sarah", 10));
		humans.add(new Human("Zack", 17));
		humans.add(new Human("Anton", 22));
		humans.add(new Human("Joni", 24));
		
		System.out.println("Tanpa sorting");
		System.out.println(humans);
		
		System.out.println("Sorting menggunakan attribute age");
		humans.sort((Human o1, Human o2)->o1.getAge()-o2.getAge());
		System.out.println(humans);
		
		System.out.println("Sorting menggunakan attribute nama");
		humans.sort((o1, o2)->o1.getName().compareTo(o2.getName()));
		System.out.println(humans);
		
		System.out.println("Sorting menggunakan attribute nama reverse");
		Comparator<Human> nameComp = 
			((o1, o2)->o1.getName().compareTo(o2.getName()));
		humans.sort(nameComp.reversed());
		System.out.println(humans);		
		
		System.out.println("Filter, case: mencari human age > 20");
		List<Human> olderHuman = 
			humans.stream()
				.filter(u -> u.getAge() > 20)
				.collect(Collectors.toList());
		System.out.println(olderHuman);
		olderHuman.forEach(p->System.out.println(p));
		for (Human human : olderHuman) {
			System.out.println(human);
		}
	}
}
