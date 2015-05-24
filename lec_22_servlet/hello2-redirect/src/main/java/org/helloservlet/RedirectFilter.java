package org.helloservlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ekokuykin on 24.05.15.
 */
@WebFilter(
        urlPatterns = {"/greeting"})
public class RedirectFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String username = servletRequest.getParameter("username");
        if(username != null && username.equals("duke")){
            System.out.println("Forwarding to Duke page");
            servletRequest.getRequestDispatcher("duke").forward(servletRequest, servletResponse);
        }

        if(username != null && username.equals("hungry")){
            System.out.println("Forwarding to Duke page");
            ((HttpServletResponse)servletResponse).sendRedirect("http://localhost:8080/hungry");
            return;
        }


        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
