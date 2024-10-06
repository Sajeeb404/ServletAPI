import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        HttpSession session = req.getSession(false);
        String username= (session != null) ? (String) session.getAttribute("username") :null;
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        if (username != null){
            printWriter.println("<h1> Welcome, "+ username + "</h1>");
            printWriter.println("<a href='logout'>Logout</a>");
        }else {
            printWriter.println("<h1> Please log in first. </h1>");
            printWriter.println("<a href='login.jsp'> Login </a>");
        }
            printWriter.close();


    }
}
