import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


public class SessionExampleServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();


        session.setAttribute("username", "Sajeeb");



        String name = (String) session.getAttribute("username");

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html> <body>");
        printWriter.println("<h2> User Name :" + name+ "</h2>");
        printWriter.println("<h2> User ID :" + session.getId() + "</h2>");
        printWriter.println("<h2> Session Creation Time: "+ session.getCreationTime()+ " </h2>");
        printWriter.close();




    }
}
