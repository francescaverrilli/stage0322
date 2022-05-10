package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.springframework.web.struts.ActionSupport;

import bo.CustomerBo;
import model.Customer;

public class ListCustomerAction extends ActionSupport{
	
	public ActionForward execute (ActionMapping mapping,ActionForm form,HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		CustomerBo customerBo=(CustomerBo) getWebApplicationContext().getBean("customerBo");
		
		DynaActionForm dynaCustoremListForm=(DynaActionForm)form;
		
		List<Customer> list=customerBo.findAllCustomer();
		
		dynaCustoremListForm.set("customerLis", list);
		
		
		return mapping.findForward("success");
	}

}
