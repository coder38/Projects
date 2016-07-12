
package hp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

public class IQAction extends org.apache.struts.action.Action {
    
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        IQBean iqb=(IQBean) form;
        String t1=iqb.getT1();
      
        try{
        HttpSession hs=request.getSession(false);
        String user=(String)hs.getAttribute("username");
       // HttpSession h=request.getSession(false);
        //String user=(String)h.getAttribute("username");

        System.out.println("\n\n\n\n\n "+user);
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/doc","root","pass");
        Statement st=con.createStatement();
        int a=st.executeUpdate("insert into q(query,askedby) values('"+t1+"','"+user+"')");
        if(a>0)
            {
            System.out.println("abc");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        return mapping.findForward("i");
    }
}
