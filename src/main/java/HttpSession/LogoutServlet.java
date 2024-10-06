package HttpSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PipedReader;
import java.io.PrintWriter;


@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();


        Cookie ck = new Cookie("name","");
        ck.setMaxAge(0);
        resp.addCookie(ck);
        printWriter.print("you are successfully logged out!");
        req.getRequestDispatcher("link.html").include(req,resp);
    }
}
