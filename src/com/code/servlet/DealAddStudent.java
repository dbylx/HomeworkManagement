package com.code.servlet;

import com.code.jdbc.StudentJDBC;
import com.code.jdbc.TeacherJDBC;
import com.code.model.Student;
import com.code.model.Teacher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/dealAddStudent")
public class DealAddStudent extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        StudentJDBC studentJDBC = new StudentJDBC();
        boolean flag = studentJDBC.addStudent(req.getParameter("usname"),req.getParameter("password"),req.getParameter("name"));
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
