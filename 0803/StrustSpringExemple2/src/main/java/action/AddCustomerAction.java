package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.struts.ActionSupport;

import bo.CustomerBo;
import ch.qos.logback.core.joran.util.beans.BeanUtil;
import form.CustomerForm;
import model.Customer;

public class AddCustomerAction extends ActionSupport{
	
	public ActionForward execute(ActionMapping mapping ,ActionForm form, HttpServletRequest request,HttpServletResponse response)
	
	throws Exception{
		
		CustomerBo customerBo=(CustomerBo) getWebApplicationContext().getBean("ustomerBo");
		
		CustomerForm customerForm=(CustomerForm)form;
		
		Customer customer=new Customer();
		
		BeanUtils.copyProperties(customer, customerForm);
		
		customerBo.addCustomer(customer);
		
		return mapping.findForward("success");
		
	}

}
