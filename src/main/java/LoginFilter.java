import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("LogginFilter initialized.");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

//        String remoteAddr = request.getRemoteAddr();
//        int remotePort = request.getRemotePort();
//        System.out.print("Request from IP: " + remoteAddr + " on port "+ remotePort);
        System.out.println("Login filter Request received");

        PrintWriter printWriter = response.getWriter();
        printWriter.print("Logging filter : Request rececived. ");
        chain.doFilter(request, response);
        printWriter.print("Logging filter : Response sent");
        System.out.println("loginn filter : response sent");

    }

    @Override
    public void destroy() {
        System.out.println("LoggingFilter destroyed.");
    }
}
