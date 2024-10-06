package HttpSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        Cookie ck[] = req.getCookies();

        if (ck != null){
            String name = ck[0].getValue();

            if (!name.equals("")|| name!=null){
                printWriter.println("<b> Welcome to Profile</b>");
                printWriter.println("<b> Welcome, "+ name);
            }
        }else {
            printWriter.println("Please login First!");
//        req.getRequestDispatcher("link.html").forward(req, resp);

        }
        req.getRequestDispatcher("link.html").include(req, resp);
        printWriter.close();


    }
}
