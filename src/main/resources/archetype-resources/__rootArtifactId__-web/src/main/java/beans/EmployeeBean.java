#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 
 */
package ${package}.beans;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import ${package}.controllers.EmployeeController;
import ${package}.entities.Employee;

/**
 * ManagedBean to controls the Employee Form
 * 
 * @author martosfre - Marco A. Toscano Freire 21 sep. 2020 - 17:46:13<br>
 *         <br>
 *         <b>Soporte Matoosfe:</b>mtoscano@matoosfe.com
 */
@Named
@ViewScoped
public class EmployeeBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private EmployeeController employeeController;

	private Employee employee;

	public EmployeeBean() {
		this.employee = new Employee();
	}

	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	/**
	 * Method to save an employee
	 */
	public void saveEmployee() {
		String message = employeeController.add(employee);
		FacesMessage messageJSF = new FacesMessage(message);
		messageJSF.setSeverity(FacesMessage.SEVERITY_INFO);
		FacesContext.getCurrentInstance().addMessage(null, messageJSF);
	}

}
