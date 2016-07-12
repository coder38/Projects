package hp;

import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;


public class LoginAction extends org.apache.struts.action.Action {    
    
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        LoginBean ob=(LoginBean)form;
            String user=ob.getUser();
            String pass=ob.getPass();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/doc","root","pass");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from doctors where name='"+user+"'and password='"+pass+"'");

            if(rs.next())
            {
                 HttpSession h=request.getSession(true);
                h.setAttribute("username",user);
                String role=rs.getString(2);
                if (role.equalsIgnoreCase("user"))
                {
                      // request.setAttribute("msg","Welcome User");
                        int a=st.executeUpdate("insert into Lcount values('"+user+"')");
                        return mapping.findForward("us");
                }
            }
                else
                    request.setAttribute("msg","invalid username or password...Please try again!!!");
            
        return mapping.getInputForward();       
    }
}
