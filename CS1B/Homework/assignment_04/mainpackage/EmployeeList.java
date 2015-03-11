package assignment_04.mainpackage;

/**
 * Creates and manages an array containing Employee objects
 */
public class EmployeeList implements Cloneable {
	private Employee[] employeeArray;
	private int allocatedSpace;
	private int location = 0;

	/**
	 * Creates an employee object array with an assigned amount of space
	 */
	public EmployeeList(int requestedSpace) {
		allocatedSpace = requestedSpace;
		employeeArray = new Employee[allocatedSpace];
	}

	/**
	 * Adds an employee object to the end of employeeArray
	 */
	public void add(Employee inputEmployee) {
		try {
			employeeArray[location] = inputEmployee;
			location++;
		} catch (ArrayIndexOutOfBoundsException arrayException) {
			System.out.println("Error: array has been filled!");
		}
	}

	/**
	 * Prints out EmployeeList array as a string, ends when last element of list is reached
	 */
	public String toString() {
		int countdown = 0;
		String result = "";
		while (countdown < allocatedSpace && employeeArray[countdown] != null) {
			result += (employeeArray[countdown] + "\n");
			countdown++;
		}
		return result;
	}
	
	/**
	 * Creates a deep copy of an existing EmployeeList
	 */
	public Object clone(){
		int countdown = 0;
		EmployeeList cloned = new EmployeeList(allocatedSpace);
		while (countdown < allocatedSpace && employeeArray[countdown] != null){
			cloned.add((Employee) (this.employeeArray[countdown].clone()));
			countdown++;
		}
		return cloned;
	}
}