package com.bridgelabz.courseManagementSystem;
import java.util.*;

class CourseUtility {
    // Static method to display a list of any type of course using wildcards
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            course.displayCourseInfo();
        }
    }
}
