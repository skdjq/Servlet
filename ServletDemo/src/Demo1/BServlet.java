package Demo1;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
* 从ServletContext获取数据
* */
public class BServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
         * 1.获取ServletContext对象
         * 2.调用getAttribute方法获取数据
         * */
        ServletContext application = this.getServletContext();
        String name = (String)application.getAttribute("name");
        System.out.println(name);
    }
}
