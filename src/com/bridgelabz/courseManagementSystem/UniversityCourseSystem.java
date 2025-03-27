package com.bridgelabz.courseManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class UniversityCourseSystem {
    public static void main(String[] args) {
        // Creating different courses with their respective evaluation criteria
        ExamCourse math101 = new ExamCourse("Math", "Mathematics", 70);
        AssignmentCourse cs102 = new AssignmentCourse("Programming Fundamentals", "Computer Science", 5);
        ResearchCourse physicsResearch = new ResearchCourse("Quantum Computing", "Physics", "Quantum Mechanics");

        // Managing Exam-Based Courses
        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(math101);

        // Managing Assignment-Based Courses
        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addCourse(cs102);

        // Managing Research-Based Courses
        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(physicsResearch);

        // Display all courses by their types
        System.out.println("Exam-Based Courses");
        examCourses.displayAllCourses();

        System.out.println("Assignment-Based Courses");
        assignmentCourses.displayAllCourses();

        System.out.println("Research-Based Courses");
        researchCourses.displayAllCourses();

        // Using wildcard method to display all courses together
        List<CourseType> allCourses = new ArrayList<>();
        allCourses.add(math101);
        allCourses.add(cs102);
        allCourses.add(physicsResearch);

        System.out.println("All Courses (Using Wildcard Method)");
        CourseUtility.displayCourses(allCourses);
    }
}

/*
Exam-Based Courses
Exam Course: MathDepartment: MathematicsExam Weightage: 70%
Assignment-Based Courses
Assignment Course: Programming FundamentalsDepartment: Computer ScienceAssignments: 5
Research-Based Courses
Research Course: Quantum ComputingDepartment: PhysicsResearch Field: Quantum Mechanics
All Courses (Using Wildcard Method)
Exam Course: MathDepartment: MathematicsExam Weightage: 70%
Assignment Course: Programming FundamentalsDepartment: Computer ScienceAssignments: 5
Research Course: Quantum ComputingDepartment: PhysicsResearch Field: Quantum Mechanics

 */