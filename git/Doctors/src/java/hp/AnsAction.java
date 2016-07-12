package hp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

public class AnsAction extends org.apache.struts.action.Action {
    
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        AnsBean ab=(AnsBean) form;
        String answer=ab.getAnswer();

         try{
        HttpSession h=request.getSession(false);
        String user=(String)h.getAttribute("username");
        String id=request.getParameter("qid");
        //h.setAttribute("answer",answer);

       // HttpSession h=request.getSession(false);
        //String user=(String)h.getAttribute("username");

        System.out.println("\n\n\n\n\n "+user);
        System.out.println("\n\n\n\n\n "+answer);
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/doc","root","pass");
        Statement st=con.createStatement();
       // int a=st.executeUpdate("insert into q(answer,responseby) values('"+answer+"','"+user+"')"); 
         int a=st.executeUpdate("update q set answer='"+answer+"' and responseby='"+user+"' where qid="+id );
        if(a>0)
            {
            System.out.println("abc");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        return mapping.findForward("ans");
    }
}
