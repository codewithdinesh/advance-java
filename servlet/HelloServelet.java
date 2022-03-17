import javax.servlet.*;
import java.io.*;

public class HelloServelet extends GenericServlet {
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        PrintWriter pw = res.getWriter();

        res.setContentType("text/html");

        pw.println("<html><body>Hello world</body> </html>");
    }
}

// to run servlete program
