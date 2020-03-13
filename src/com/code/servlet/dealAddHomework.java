package com.code.servlet;

import com.code.jdbc.StudentJDBC;
import com.code.jdbc.TeacherJDBC;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/dealAddHomework")
public class dealAddHomework extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {




        TeacherJDBC teacherJDBC = new TeacherJDBC();
        boolean flag = teacherJDBC.addHomework(req.getParameter("title"),req.getParameter("content"));
        PrintWriter out = resp.getWriter();
        if(flag){
            out.println("<script>");
            out.println("alert('Add successful！');");
            out.println("</script>");
        }else{
            out.println("<script>");
            out.println("alert('Add fail！');");
            out.println("</script>");
        }

    }
}
