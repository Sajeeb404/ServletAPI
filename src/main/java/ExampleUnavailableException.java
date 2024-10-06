import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet("/an")
public class ExampleUnavailableException extends GenericServlet {

        boolean isAvailable = false;

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        if (!isAvailable){
            throw new UnavailableException("This servlet is temporarily unavailable");
        }

        res.getWriter().write("Processing request.");
    }


}
