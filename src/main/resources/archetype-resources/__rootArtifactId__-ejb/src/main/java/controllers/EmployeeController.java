#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controllers;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import ${package}.entities.Employee;

/**
 * Controller to manages employee operations
 * 
 * @author martosfre - Marco A. Toscano Freire 21 sep. 2020 - 20:25:25<br>
 *         <br>
 *         <b>Soporte Matoosfe:</b>mtoscano@matoosfe.com
 */
@Stateless
public class EmployeeController {

	@PersistenceContext(unitName = "jakartaee8-PU", type = PersistenceContextType.TRANSACTION)
	private EntityManager em;

	/**
	 * Method to add an employee
	 * 
	 * @param employee
	 * @return
	 */
	public String add(Employee employee) {
		em.persist(employee);
		return "Employee registered successful";
	}

}
