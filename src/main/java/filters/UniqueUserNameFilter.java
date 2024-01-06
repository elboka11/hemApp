package filters;

import entities.User;
import services.users.UserService;
import services.users.UserServiceImpl;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

import static utiles.UserConstants.USERNAME;

@WebFilter(urlPatterns = "/users/create")
public class UniqueUserNameFilter extends HttpFilter {
    private final UserService userService = UserServiceImpl.getInstance();
    private static final String USERNAME_ERROR_PAGE = "/pages/errors/userNameError_page.jsp";

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        Optional<User> optionalUser = userService.readUsers().stream()
                .filter(user -> user.getUserName().equals(req.getParameter(USERNAME)))
                .findAny();
        if (optionalUser.isPresent()) {
            req.getRequestDispatcher(USERNAME_ERROR_PAGE).forward(req, res);
        } else {
            chain.doFilter(req, res);
        }
    }
}
