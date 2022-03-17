
//AthonticationServlet.java
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;

public class AthonticationServlet extends GenericServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String pass = "abhishek12345";
        String username, password;
        username = request.getParameter("username");
        password = request.getParameter("password");
        if (username.equals(username) && password.equals(pass)) {
            out.println("Login Successfull");
        } else {
            out.println("Login Unsuccessfull");
        }
    }
}
