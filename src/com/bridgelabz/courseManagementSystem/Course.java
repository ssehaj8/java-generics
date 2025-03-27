package com.bridgelabz.courseManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Course<T extends CourseType> {
    private List<T> courseList = new ArrayList<>(); // Stores courses of type T

    public void addCourse(T course) {
        courseList.add(course);
    }

    public void displayAllCourses() {
        for (T course : courseList) {
            course.displayCourseInfo();
        }
    }
}

