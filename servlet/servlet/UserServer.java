
import java.io.*;
import javax.servlet.*;

public class UserServer extends GenericServlet {
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        PrintWriter pw = res.getWriter();
        String username = req.getParameter("username");
        int lenghtStr = username.length();
        res.setContentType("text/html");
        pw.println("<html><body>lenghtStr</body> </html>");
    }
}

//to run servlete program
