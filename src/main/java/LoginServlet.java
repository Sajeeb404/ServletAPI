import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");
            System.out.println("hello");

        if ("admin".equals(username) && "admin".equals(password)){
            HttpSession session = req.getSession();
            session.setAttribute("username", username);
            resp.sendRedirect("welcome");
        }else {
            resp.sendRedirect("login.jsp");
        }

    }
}
