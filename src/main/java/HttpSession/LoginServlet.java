package HttpSession;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        resp.setContentType("text/html");

        PrintWriter printWriter = resp.getWriter();


        String name = req.getParameter("name");
        String password = req.getParameter("password");

        if (password.equals("admin") && name.equals("admin") ){
            printWriter.println("You are successfully logged in!.");
            printWriter.println("Welcome, "+ name);

        req.getRequestDispatcher("link.html").include(req, resp);
            Cookie ck = new Cookie("name", name);
            ck.setMaxAge(7*24*60*60);
            resp.addCookie(ck);

        }else {
            printWriter.println("Sorry, User Name and Password Not match.");
            req.getRequestDispatcher("login.html").include(req, resp);
        }
        printWriter.close();
    }
}
