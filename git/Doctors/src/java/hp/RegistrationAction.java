package hp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

public class RegistrationAction extends org.apache.struts.action.Action {
    
       @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        RegistrationBean rb=(RegistrationBean) form;
        String user=rb.getUser();
        String pass=rb.getPass();
        String role=rb.getRole();
        String exp=rb.getExp();
        String loc=rb.getLoc();
        String qual=rb.getQual();
        String cont=rb.getCont();
        String sp=rb.getSp();
        String privacy=rb.getPrivacy();

        HttpSession s=request.getSession(true);
        s.setAttribute("sp",sp);
        s.setAttribute("qual",qual);
        s.setAttribute("user",user);
        s.setAttribute("cont",cont);
        s.setAttribute("exp",exp);
        s.setAttribute("role",role);
        s.setAttribute("loc",loc);
        s.setAttribute("pass",pass);
        s.setAttribute("privacy",privacy);

        return mapping.findForward("ok");
        
    }
}
