package by.htp.objcomp.run;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {

	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println();
	}

	public static void print(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println();
	}
	
	public static void print(Person[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].toString());
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] array = new int[] { 9, 8, 1, 15, 9, 25, 3 };

		Arrays.sort(array);

		print(array);

		String[] strings = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		Arrays.sort(strings);

		print(strings);

		Person[] persons = new Person[7];
		
		
		Person p1 = new Person( 33, "РЎР°С€Р°", 1000 );
		Person p2 = new Person( 40, "Р’Р°СЃСЏ", 566 );
		Person p3 = new Person( 55, "РўРѕР»РёРє", 1000000000 );
		Person p4 = new Person( 30, "РџР°С€Р°", 900 );
		Person p5 = new Person( 21, "РљРѕР»СЏРЅ", 5000 );
		Person p6 = new Person( 15, "Р“РµРЅР°", 5001 );
		Person p7 = new Person( 22, "Р“РѕС€Р°", 5000 );
		Person p8 = new Person( 103, "РљР°Р»РёСЃС‚СЂР°С‚", 44444 );
		Person p9 = new Person( 103, "Р�РЅРѕРєРµРЅС‚РёР№", 44444 );

		persons[0] = p1;
		persons[1] = p2;
		persons[2] = p3;
		persons[3] = p4;
		persons[4] = p5;
		persons[5] = p6;
		persons[6] = p7;

		
		Arrays.sort(persons);
		print( persons );
		
		HashSet <Person> hashPerson = new HashSet<Person>();
		hashPerson.add(p1);
		hashPerson.add(p2);
		hashPerson.add(p3);
		hashPerson.add(p4);
		hashPerson.add(p5);
		hashPerson.add(p6);
		hashPerson.add(p7);
		hashPerson.add(p8);
		hashPerson.add(p9);
		
		LinkedHashSet<Person> linkedPerson = new LinkedHashSet<Person>();
		linkedPerson.add(p1);
		linkedPerson.add(p2);
		linkedPerson.add(p3);
		linkedPerson.add(p4);
		linkedPerson.add(p5);
		linkedPerson.add(p6);
		linkedPerson.add(p7);
		linkedPerson.add(p8);
		linkedPerson.add(p9);
		
		TreeSet <Person> treePerson = new TreeSet<Person>(new PersonAgeAmountComparator() /*PersonAgeComparator()*/);
		treePerson.add(p1);
		treePerson.add(p2);
		treePerson.add(p3);
		treePerson.add(p4);
		treePerson.add(p5);
		treePerson.add(p6);
		treePerson.add(p7);
		treePerson.add(p8);
		treePerson.add(p9);
		
		for( Person p: hashPerson ){
			System.out.println(p + " " + p.hashCode());
		}
		
		System.out.println();
	}
}

class Person /*implements Comparable<Person>*/{

	private int age;
	private String name;
	private int bankAmount;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int age) {
		super();
		this.age = age;
	}
	

	public Person(int age, int bankAmount) {
		super();
		this.age = age;
		this.bankAmount = bankAmount;
	}

	public Person(int age, String name, int bankAmount) {
		super();
		this.age = age;
		this.name = name;
		this.bankAmount = bankAmount;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the bankAmount
	 */
	public int getBankAmount() {
		return bankAmount;
	}

	/**
	 * @param bankAmount the bankAmount to set
	 */
	public void setBankAmount(int bankAmount) {
		this.bankAmount = bankAmount;
	}



	


	/*public int compareTo(Object o) {
		Person p = (Person)o;
		int result = this.getAge() - p.getAge();

		return result;
	}*/

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", bankAmount=" + bankAmount + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + bankAmount;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (bankAmount != other.bankAmount)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equalsIgnoreCase(other.name))
			return false;
		return true;
	}

	public int compareTo(Person p) {
		return this.getAge() - p.getAge();
	}

}

class PersonAgeComparator implements Comparator <Person>{

	@Override
	public int compare(Person p1, Person p2) {
		
		return p2.getAge() - p1.getAge();
	}
}

class PersonAgeAmountComparator implements Comparator <Person>{

	@Override
	public int compare(Person o1, Person o2) {
		if ( (o1.getAge() - o2.getAge()) == 0 &&
				(o1.getBankAmount() - o2.getBankAmount()) == 0 ) {
			return 0;
		}
		else if ( ( o1.getBankAmount() - o2.getBankAmount() ) == 0 &&
				(o1.getAge() - o2.getAge()) > 0 ){
			return 1;
		}
		else if ( ( o1.getBankAmount() - o2.getBankAmount() ) > 0 ) {
			return 1;
		}
		return -1;
	}
	
}

class PersonAgeAmountName implements Comparator <Person>{

	@Override
	public int compare( Person o1, Person o2 ) {
		if ( ( o1.getBankAmount() - o2.getBankAmount() ) == 0 &&
				( o1.getAge() - o2.getAge() ) == 0 &&
				(o1.getName().compareToIgnoreCase(o2.getName() ) == 0)){
			return 0;
		}
		else if ( (o1.getBankAmount() - o2.getBankAmount()) == 0 &&
				(o1.getAge() - o2.getAge()) == 0 &&
				( o1.getName().compareTo(o2.getName()) > 0 ) ){
			return 1;
		}
		else if ( (o1.getBankAmount() - o2.getBankAmount()) == 0 &&
				(o1.getAge() - o2.getAge() ) >0 ){
			return 1;
		}
		else if ( (o1.getBankAmount() - o2.getBankAmount()) > 0 ){
			return 1;
		}
		return -1;
	}
	
}
