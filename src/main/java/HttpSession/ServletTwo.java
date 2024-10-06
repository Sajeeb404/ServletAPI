package HttpSession;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servletTwo")
public class ServletTwo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            resp.setContentType("text/html");
            PrintWriter printWriter = resp.getWriter();
            String name = req.getParameter("uname");

            printWriter.println("Hello, "+name);
            printWriter.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}