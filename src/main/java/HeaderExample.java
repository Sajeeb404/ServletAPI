import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/httpTest")
public class HeaderExample extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    resp.setContentType("text/html");

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html><body)");
        printWriter.println("<h1> HTTP Header </h1>");
        printWriter.println("<table border='1'>");
        printWriter.println("<tr> <th> Header Name </th> <th> Header Value</th> </tr>");
        Enumeration<String> headerNames = req.getHeaderNames();

        while (headerNames.hasMoreElements()){
            String headerName = headerNames.nextElement();
            String headerValue = req.getHeader(headerName);
            printWriter.println("<tr><td>"+ headerName + "</td> <td>"+ headerValue + "</td> </tr>" );

        }

        printWriter.println("</table>");
        printWriter.println("</body> </html>");
        printWriter.close();

    }



}
