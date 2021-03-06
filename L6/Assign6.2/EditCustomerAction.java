// ------------ Start: EditCustomerAction.java-------------

package salesdept;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.struts.action.*;
import java.sql.*;

public class EditCustomerAction extends Action {

    public ActionForward execute (ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws  ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

	String customerId = "";
	CustomerInfoActionForm form = (CustomerInfoActionForm) actionForm;
	CustomerDBProcess custDBProcess = new CustomerDBProcess();
	CustomerDBObject cust = new CustomerDBObject();
	
	customerId = request.getParameter("customerId");
	System.out.println ("EditCustomerAction: Received Parameter" + customerId);

	cust = custDBProcess.getCustomer(customerId);

	System.out.println ("Adding CustomerId to Form" + customerId);
	//Copy to the form
	form.setCustomerId (customerId);
	form.setAge(Integer.toString(cust.getAge()));
	form.setOrderValue(Double.toString(cust.getOrderValue()));
	form.setLastName(cust.getLastName());
	form.setFirstName(cust.getFirstName());
	
	return mapping.findForward("success");
    }
}
// ------------ End: EditCustomerAction.java-------------
