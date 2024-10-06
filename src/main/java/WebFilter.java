import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class WebFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        PrintWriter printWriter = response.getWriter();
        printWriter.print("filter is invoked before.");

        chain.doFilter(request, response);
        printWriter.print("filter is invoked after");

    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
