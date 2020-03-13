package com.code.servlet;

import com.code.jdbc.StudentJDBC;
import com.code.jdbc.TeacherJDBC;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addStudent")
public class AddStudent extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String userName = new String(req.getParameter("myname") .getBytes("utf-8"),"utf-8");
        System.out.println(new String(req.getParameter("myname") .getBytes("utf-8"),"utf-8"));
        String password = new String(req.getParameter("mypwd") .getBytes("iso8859-1"),"utf-8");
        System.out.println(new String(req.getParameter("mypwd") .getBytes("iso8859-1"),"utf-8"));
        TeacherJDBC teacherJDBC = new TeacherJDBC();
        StudentJDBC studentJDBC = new StudentJDBC();
        if(teacherJDBC.getTeacherIdentity(userName,password)){
            System.out.println("teacher");
            req.getRequestDispatcher("jsp/teacherManage.jsp").forward(req, resp);
        }else if(studentJDBC.getStudentIdentity(userName,password)){
            System.out.println("student");
            req.getRequestDispatcher("jsp/studentManage.jsp").forward(req, resp);
        }else{

        }


        req.getRequestDispatcher("jsp/login.jsp").forward(req, resp);
    }
}
