package filters;

import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;


@WebFilter(urlPatterns = "/login" )
public class LoginFilter extends HttpFilter {

}

