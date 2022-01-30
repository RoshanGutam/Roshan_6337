package CollectionD;

import java.util.*;

class Employee implements Comparable<Employee> {
	// implementing Comparable interface

	private int e_id;
	private String name;
	private int age;

	public Employee(int e_id, String name, int age) {
		this.e_id = e_id;
		this.name = name;
		this.age = age;
	}

	public int get_id() {
		return e_id;
	}

	public void set_id(int e_id) {
		this.e_id = e_id;
	}

	public String getname() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Employee e) {
		// defining compareTo() method
		return this.age - e.getAge();
	}

}

public class JavaComparableExample {
	// defining driver class
	static void details(Employee emp) {
		System.out.println(emp.get_id() + " - " + emp.getname() + " - " + emp.getAge());
	}

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(002, "Justin", 17));
		list.add(new Employee(001, "Tyler", 18));
		list.add(new Employee(004, "Josh", 15));
		list.add(new Employee(003, "Robert", 16));

		System.out.println("----------Original List: ---------------");
		for (int i = 0; i < list.size(); i++) {
			details(list.get(i));
		}
		Collections.sort(list);
		System.out.println();

		System.out.println("----------Sorted by age-----------");
		for (int i = 0; i < list.size(); i++) {
			details(list.get(i));
		}
	}
}
