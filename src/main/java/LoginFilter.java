import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ui2016 on 6/30/2016.
 */
public class LoginFilter implements Filter {

    private UserDao dao;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        dao = new UserMock();
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req  = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;

        String email = (String) req.getSession().getAttribute("user");
        User user = dao.getUserByEmail(email);

        if (user == null) {
            res.getWriter().println("You are not logged in!");
            return;
        }

        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {}
}
