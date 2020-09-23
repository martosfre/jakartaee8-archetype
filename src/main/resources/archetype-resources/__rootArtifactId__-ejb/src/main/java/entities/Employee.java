#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 
 */
package ${package}.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

/**
 * Class that represent the entity employee
 * 
 * @author martosfre - Marco A. Toscano Freire 21 sep. 2020 - 17:34:08<br>
 *         <br>
 *         <b>Soporte Matoosfe:</b>mtoscano@matoosfe.com
 */
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	@NotBlank
	@Column(name = "emp_name")
	private String empName;
	@NotBlank
	@Column(name = "emp_identification")
	private String empIdentification;

	public Employee() {

	}

	/**
	 * Employee Constructor
	 * 
	 * @param empId
	 * @param empName
	 * @param empIdentification
	 */
	public Employee(int empId, String empName, String empIdentification) {
		this.empId = empId;
		this.empName = empName;
		this.empIdentification = empIdentification;
	}

	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the empIdentification
	 */
	public String getEmpIdentification() {
		return empIdentification;
	}

	/**
	 * @param empIdentification the empIdentification to set
	 */
	public void setEmpIdentification(String empIdentification) {
		this.empIdentification = empIdentification;
	}

}
