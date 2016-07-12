package hp;

import com.mysql.jdbc.Connection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

import javax.servlet.http.HttpSession;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

public class AdminLoginAction extends org.apache.struts.action.Action {
    
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        AdminLoginBean ob=(AdminLoginBean)form;
            String user=ob.getUser();
            String pass=ob.getPass();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/doc","root","pass");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from doctors where name='"+user+"'and password='"+pass+"'");

            if(rs.next())
            {
                HttpSession hs=request.getSession(true);
                hs.setAttribute("username",user);
                String role=rs.getString(2);
                if(role.equalsIgnoreCase("admin"))
                {
                        //request.setAttribute("msg","Welcome Admin");
                     int a=st.executeUpdate("insert into Lcount values('"+user+"')");
                        return mapping.findForward("ad");
                }
            }
                else
                    request.setAttribute("msg","invalid username or password...Please try again!!!");
            
        return mapping.getInputForward();
    }
}
