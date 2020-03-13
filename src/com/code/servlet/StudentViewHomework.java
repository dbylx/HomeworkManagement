package com.code.servlet;

import com.code.jdbc.TeacherJDBC;
import com.code.model.StudentHomework;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/studentViewHomework")
public class StudentViewHomework extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("I do this");
        TeacherJDBC teacherJDBC = new TeacherJDBC();
        ArrayList<StudentHomework> list = teacherJDBC.queryHomework();

        System.out.println("I do this");
        req.setAttribute("homeWorkList",list);
        req.getRequestDispatcher("jsp/queryHomework_student.jsp").forward(req, resp);
    }
}
