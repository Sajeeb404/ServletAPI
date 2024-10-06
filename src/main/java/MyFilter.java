import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        String pass = request.getParameter("password");

        PrintWriter printWriter = response.getWriter();

        if (pass.equals("admin")){
            chain.doFilter(request, response);
        }else {
            response.setContentType("text/html");
            printWriter.print("Your username and password is wrong.");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
            requestDispatcher.include(request, response);
        }


    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
