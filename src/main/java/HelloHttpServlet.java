import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/helloHttp")
public class HelloHttpServlet extends HttpServlet {


//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//
//        resp.setContentType("text/html");
//        PrintWriter printWriter = resp.getWriter();
//
//        printWriter.println("<html> <body>");
//        printWriter.println("<h2> Hello world!.</h2>");
//        printWriter.println("</body> </html>");
//        printWriter.close();
//
//    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setStatus(HttpServletResponse.SC_OK);
        resp.getWriter().write("hellow world!");
        resp.getWriter().close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        String name = req.getParameter("name");
        resp.setStatus(HttpServletResponse.SC_OK);
        printWriter.println("<html> <body>");
        printWriter.println("<h2> Hello, "+ name + " ! </h2>");
        printWriter.println("</body> </html>");
        printWriter.close();


    }
}
