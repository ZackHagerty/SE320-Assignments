package assignment;

public class Person {
	private String firstName;
	private String lastName;
	
	public boolean equals(Object obj) {
		if (!(obj instanceof Person)) return false;
		Person that = (Person) obj;
		return this.lastName.toUpperCase().contentEquals(that.lastName.toUpperCase());
	}
	
	public int hashCode()
	{
		return this.firstName.toUpperCase().hashCode() == this.lastName.toUpperCase().hashCode() ? 1 : 0;
	}
}
