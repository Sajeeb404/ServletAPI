import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class MyGenericServlet extends GenericServlet {



    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter printWriter = res.getWriter();

        String name = req.getParameter("name");
        if (name == null || name.isEmpty()){
            name = "world";

        }

        printWriter.print("<html> <body>");
        printWriter.print("<h1> hello," + name + "! </h1>");

        printWriter.write("<p> keep pushing forward!</p>" + name);
        printWriter.print("<footer> <p> Thank you for visiting! </p> </footer>");
        printWriter.print("</body> </html>");
//        printWriter.close();

    }


}
