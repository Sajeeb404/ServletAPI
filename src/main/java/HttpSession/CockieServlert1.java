package HttpSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/coockie1")
public class CockieServlert1 extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        String name = req.getParameter("userName");
        printWriter.println("<html> <body>");
        printWriter.println("<h2> User Name is : "+ name);

        Cookie ck = new Cookie("uname", name);
        resp.addCookie(ck);

        printWriter.println("<form action ='coockie2' method='post'>");
        printWriter.println("<input type = 'submit' value = 'go'>");
        printWriter.println("</form>");
        printWriter.close();


    }
}
