import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;


public class First implements Servlet {

    ServletConfig config;

    public First() throws ServletException {

        System.out.println("constructor in Servlet");

    }

//    HttpServlet

    //    private ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        System.out.println("Servlet initialized.");

    }


    @Override
    public void service( ServletRequest req, ServletResponse res) throws ServletException, IOException {


        System.out.println("hello");
        res.setContentType("text/html");
        PrintWriter printWriter = res.getWriter();
        printWriter.print("<br> Welcome to servlet <br>");





//        ServletContext context = req.getServletContext();
//        String app = context.getInitParameter("appName");
//        String shared = context.getInitParameter("sharedData");
//
//        res.setContentType("text/html");
//        PrintWriter printWriter = res.getWriter();
//        printWriter.write("<html> <body>");
//        printWriter.write("<h2>"+ app+ "</h2>");
//        printWriter.write("<h2>"+ shared+ "</h2>");
//        printWriter.write("</body> </html>");
//        printWriter.close();




//        String userName = req.getParameter("username");
//        String email = req.getParameter("email");


//        // Set attributes
//        req.setAttribute("userName", userName);
//        req.setAttribute("email", email);
//        req.setAttribute("attribute", "Some Custom Value");
//
//        // Forward the request to the second servlet
//        req.getRequestDispatcher("/second").forward(req, res);


//
//        String configValue = config.getInitParameter("configParam");
////        // Set response content type
//        res.setContentType("text/html");
//        PrintWriter out = res.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>Configuration Value: " + configValue + "</h1>");
//        out.println("</body></html>");
//        out.close();

//        res.setContentType("text/html");
//        PrintWriter printWriter = res.getWriter();
//        printWriter.write("<html><body>");
//        printWriter.write("<h1>Hello servlet  username is "+ userName +" and email is also "+email +" is attribute " +"</h1>");
//        printWriter.write("</body></html>");
//        printWriter.close();


    }

    @Override
    public void destroy() {
        // Cleanup code if needed
        System.out.println("destroy now i'm.");
    }

    @Override
    public String getServletInfo() {
        return "First Servlet";
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
}
