package org.helloservlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLClassLoader;
import java.util.Arrays;

/**
 * Created by ekokuykin on 02.07.15.
 */
@WebServlet("/sample")
public class SampleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try (PrintWriter out = response.getWriter()) {

            out.println("Simple sample servlet");
            out.println(Arrays.toString(
                    ((URLClassLoader) SampleServlet.class.getClassLoader()).getURLs()));
            try {
                out.println(TextMessage.getText());
            } catch (NoClassDefFoundError e) {
                out.println(e.getMessage());
            }
            out.println("Some text after TextMessage");
        }
    }
}
