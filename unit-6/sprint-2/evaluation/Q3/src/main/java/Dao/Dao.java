package Dao;

import Bean.Course;

public interface Dao {
    public void addCourse(Course course) ;
    public void getStudent(int roll_no);
    public void getCourse(int course_id);
}
