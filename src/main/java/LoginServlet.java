import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ui2016 on 6/30/2016.
 */
public class LoginServlet extends HttpServlet {

    private UserDao dao;

    @Override
    public void init() throws ServletException {
        dao = new UserMock();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getServletPath());
        if (req.getServletPath().equals("/login")) {
            String email = req.getParameter("email");
            String passw = req.getParameter("password");
            User user = dao.getUserByEmail(email);

            System.out.println("getParam email:" + email);
            System.out.println("getParam password:" + passw);
            System.out.println(user);

            if (null != email && null != passw && null != user) {
                if (passw.equals(user.getPassword())) {
                    req.getSession().setAttribute("user", email);
                    req.getSession().setAttribute("products", Products.getProducts());
                    resp.sendRedirect("/content");
                } else {
                    //incorrect login
                    resp.sendRedirect("/login");
                }
            } else {
                resp.sendRedirect("/login");
            }
        } else if (req.getServletPath().equals("/logout")) {
            req.getSession().removeAttribute("user");
            req.getSession().invalidate();
            resp.sendRedirect("/index");
        }
    }
}
