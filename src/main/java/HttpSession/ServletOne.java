package HttpSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servletOne")
public class ServletOne extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            resp.setContentType("text/html");

            PrintWriter printWriter = resp.getWriter();
            String name = req.getParameter("userName");

            printWriter.println("Welcome, "+ name);

            printWriter.println("<form action='servletTwo'>");
            printWriter.println("<input type = 'hidden' name ='uname' value='"+name+"'>");
            printWriter.println("<input type='submit' value='go'>");
            printWriter.println("</form>");
            printWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }


    }
}
