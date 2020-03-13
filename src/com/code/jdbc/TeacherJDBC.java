package com.code.jdbc;

import com.code.model.StudentHomework;
import com.code.model.Teacher;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.sql.*;
import java.util.ArrayList;

public class TeacherJDBC {

    public ArrayList<StudentHomework> queryHomework(){
        JDBCControll jdbcControll = new JDBCControll();
        ArrayList<StudentHomework> homeworkList = new ArrayList<StudentHomework>();
        try {
            jdbcControll = new JDBCControll();
            String sqlString = "select * from s_homework";

            jdbcControll.excuteSQL(sqlString);
            while(jdbcControll.getResultSet().next()) {
                StudentHomework homework = new StudentHomework();
                homework.setHomeworkTitle(jdbcControll.getResultSet().getString(1));
                homework.setHomeworkContent(jdbcControll.getResultSet().getString(3));
                homework.setCreateTime(jdbcControll.getResultSet().getString(2));
                homeworkList.add(homework);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbcControll.closeMysql();
        }
        return homeworkList;
    }


    public ArrayList<StudentHomework> queryDetailHomework(String title){
        JDBCControll jdbcControll = new JDBCControll();
        ArrayList<StudentHomework> homeworkList = new ArrayList<StudentHomework>();
        try {
            jdbcControll = new JDBCControll();
            String sqlString = "select * from s_student_homework Where homework_title = '"+title+"'";

            jdbcControll.excuteSQL(sqlString);
            while(jdbcControll.getResultSet().next()) {
                StudentHomework homework = new StudentHomework();
                homework.setHomeworkTitle(jdbcControll.getResultSet().getString(2));
                homework.setHomeworkContent(jdbcControll.getResultSet().getString(3));
                homework.setCreateTime(jdbcControll.getResultSet().getString(4));
                homework.setUsername(jdbcControll.getResultSet().getString(1));
                homeworkList.add(homework);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbcControll.closeMysql();
        }
        return homeworkList;
    }


    public Boolean addHomework(String title,String content){
        JDBCControll jdbcControll = new JDBCControll();
        try {
            String sqlString = "INSERT INTO school.s_homework(title, content) VALUES ('" + title + "','"  + content + "')";
            return jdbcControll.excuteUpdateSQL(sqlString);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            jdbcControll.closeMysql();
        }
    }

    public Boolean getTeacherIdentity(String teacherName,String passWord){
        JDBCControll jdbcControll = new JDBCControll();


        try {
            String sqlString = "select * from s_teacher WHERE username = '"+teacherName+"'";

            jdbcControll.excuteSQL(sqlString);
            while(jdbcControll.getResultSet().next()) {

                if(jdbcControll.getResultSet().getString(4).equals(passWord)&&jdbcControll.getResultSet().getString(3).equals(teacherName)){
                    return true;
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbcControll.closeMysql();
        }



        return false;
    }

    public static void main(String[] args){
        TeacherJDBC teacherJDBC = new TeacherJDBC();
        ArrayList<StudentHomework> homeworkList =teacherJDBC.queryDetailHomework("homework1");
        for(int i = 0 ;i<homeworkList.size();i++){
            s(homeworkList.get(i).getUsername());
            s(homeworkList.get(i).getHomeworkTitle());
            s(homeworkList.get(i).getHomeworkContent());
            s(homeworkList.get(i).getCreateTime());
        }

    }

    public static void s(Object s){
        System.out.println(s);
    }

}


