package com.example.collection;

public class Delegate {
	
	private String id;
	private String name;
	private String age;
	private String orgaization;
	private String eventName;
	private String dob;
	
	// == and equals
	
	public Delegate() {
		super();
	}
	
	public Delegate(String id) {
		super();
		this.id = id;
	}

	public Delegate(String id, String name, String age, 
			String orgaization, String eventName, String dob) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.orgaization = orgaization;
		this.eventName = eventName;
		this.dob = dob;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getOrgaization() {
		return orgaization;
	}
	public void setOrgaization(String orgaization) {
		this.orgaization = orgaization;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	/*
	 	equals() and hashCode() are bound together by a joint contract that
		specifies if two objects are considered equal using the equals() method, 
		then they must have identical hashcode values. So to be truly safe, 
		your rule of thumb should be if you override equals(), override hashCode() as well. 
		So let's switch over to hashCode() and see how that method ties in to equals().
		
		
		Whenever it is invoked on the same object more than once during an execution of a 
		Java application, the hashCode() method must consistently return the same integer, 
		provided that no information used in equals() comparisons on the object is modified. 
		This integer need not remain consistent from one execution of an application to 
		another execution of the same application.

		If two objects are equal according to the equals(Object) method, then calling 
		the hashCode() method on each of the two objects must produce the same integer result.

		It is NOT required that if two objects are unequal according to the equals
		(java.lang.Object) method, then calling the hashCode() method on each of the 
		two objects must produce distinct integer results. However, the programmer should 
		be aware that producing distinct integer results for unequal objects may improve 
		the performance of hashtables.
		
	 
	 	Info: In real-life hashing, it's not uncommon to have more than one entry in a bucket. 
	 	Hashing retrieval is a two-step process.
	 	
	 	1. Find the right bucket (using hashCode())
	 	2. Search the bucket for the right element ( using equals() )
	 */
	
	@Override
	public int hashCode() {
		int value = 0;
		if (this.getId() != null && !this.getId().isEmpty()) {
			char [] letters = this.getId().toCharArray();
			for (int i = 0; i < letters.length; i++) {
				value = value + (int)letters[i];
			}
		}
		return value;
	}

	/*
	 
		It is reflexive. For any reference value x, x.equals(x) should return true.
		
		It is symmetric. For any reference values x and y, x.equals(y) should 
		return true if and only if y.equals(x) returns true.
	
		It is transitive. For any reference values x, y, and z, if x.equals(y) returns
		true and y.equals(z) returns true, then x.equals(z) must return true.
	
		It is consistent. For any reference values x and y, multiple invocations of
		x.equals(y) consistently return true or consistently return false, provided 
		no information used in equals() comparisons on the object is modified.
	
		For any non-null reference value x, x.equals(null) should return false.
	
	*/
	@Override
	public boolean equals(Object obj) {
		System.out.println("hey I am here in equals");
		if (obj != null)
			if ( obj instanceof Delegate ) {
				String objId = ((Delegate)obj).getId();
				if ( this.id != null && !objId.isEmpty() )
					if ( this.id.equals(objId) )
						return true;
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		return "Delegate [id=" + id +", name=" + name + ", age=" + age + ", orgaization=" + orgaization + ", eventName=" + eventName
				+ ", dob=" + dob + "]";
	}

	/*
	@Override
	public int hashCode() {
		return Objects.hash(age, dob, eventName, id, name, orgaization);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Delegate other = (Delegate) obj;
		return Objects.equals(age, other.age) && Objects.equals(dob, other.dob)
				&& Objects.equals(eventName, other.eventName) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(orgaization, other.orgaization);
	}

*/
	/*
	 * @Override public String toString() { // TODO Auto-generated method stub
	 * return this.name + super.toString(); }
	 */
	
	 
	


}
