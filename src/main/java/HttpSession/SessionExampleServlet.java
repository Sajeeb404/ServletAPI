package HttpSession;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/sessoin1")
public class SessionExampleServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        HttpSession session = req.getSession();

        session.setAttribute("exampleAttribute", "someValue");

        session.setAttribute("username", "Sajeeb");
        session.setAttribute("user", "Hridoy");
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html> <body>");
        printWriter.println("<h1> This is session ID:  "+ session.getId() + "</h1>");
        printWriter.println("<h1> This is session creation Time:  "+ session.getCreationTime() + "</h1>");
        printWriter.println("<h1> This is session attribute value:  "+ session.getAttribute("user") + "</h1>");
        Enumeration enumeration = session.getAttributeNames();
        while (enumeration.hasMoreElements()){
        printWriter.println("<h1> This is session attribute all names:  "+ enumeration.nextElement() + "</h1>");

        }
        printWriter.println("<h1> This is session last accessed time:  "+ session.getLastAccessedTime() + "</h1>");
        session.setMaxInactiveInterval(1);
        printWriter.println("<h1> This is session max inactive time:  "+ session.getMaxInactiveInterval() + "</h1>");
        printWriter.println("<h1> This is session servlet context path:  "+ session.getServletContext().getContextPath() + "</h1>");
        printWriter.println("<h1> This is session servlet context getServerInfo:  "+ session.getServletContext().getServerInfo() + "</h1>");
        printWriter.println("<h1> This is session servlet context getMajorVersion:  "+ session.getServletContext().getMajorVersion() + "</h1>");
        printWriter.println("<h1> This is session servlet context getMinorVersion:  "+ session.getServletContext().getMinorVersion() + "</h1>");
        printWriter.println("<h1> This is session servlet context getRequestCharacterEncoding:  "+ session.getServletContext().getRequestCharacterEncoding() + "</h1>");


        printWriter.println("<h1> This is session servlet new sesion true or false:  "+ session.isNew() + "</h1>");
        printWriter.println("</body></html>");

        printWriter.close();


    }



}
