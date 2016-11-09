package topic5;

import java.util.Iterator;
import java.util.TreeSet;

public class Student implements Comparable<Student> {

	public String name;
	public int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	@Override
	public int compareTo(Student that) {
		// TODO Auto-generated method stub
		return this.score-that.score;
	}

	

}
