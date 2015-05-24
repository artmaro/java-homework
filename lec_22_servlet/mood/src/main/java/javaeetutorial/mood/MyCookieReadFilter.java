package javaeetutorial.mood;

import com.sun.deploy.net.HttpRequest;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by ekokuykin on 24.05.15.
 */

@WebFilter(
        urlPatterns = {"/*"})
public class MyCookieReadFilter  implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        Cookie[] cookies = request.getCookies();
        if (cookies != null)
        {
            for(int i=0; i<cookies.length; i++)
            {
                Cookie cookie = cookies[i];
                System.out.println("cookie = " + cookie.getName() + " value = " + cookie.getValue());
            }
        }
        else
        {
            //do something else for firsttime visitors
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
