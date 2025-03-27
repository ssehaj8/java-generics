package com.bridgelabz.courseManagementSystem;

abstract class CourseType {
    private String courseName;
    private String department;

    public CourseType(String courseName, String department) {
        this.courseName = courseName;
        this.department = department;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDepartment() {
        return department;
    }

    public abstract void displayCourseInfo();
}


class ExamCourse extends CourseType {
    private int examWeightage;

    public ExamCourse(String courseName, String department, int examWeightage) {
        super(courseName, department);
        this.examWeightage = examWeightage;
    }

    @Override
    public void displayCourseInfo() {
        System.out.println("Exam Course: " + getCourseName() + "Department: " + getDepartment() + "Exam Weightage: " + examWeightage + "%");
    }
}


class AssignmentCourse extends CourseType {
    private int numberOfAssignments;

    public AssignmentCourse(String courseName, String department, int numberOfAssignments) {
        super(courseName, department);
        this.numberOfAssignments = numberOfAssignments;
    }

    @Override
    public void displayCourseInfo() {
        System.out.println("Assignment Course: " + getCourseName() + "Department: " + getDepartment() + "Assignments: " + numberOfAssignments);
    }
}

class ResearchCourse extends CourseType {
    private String researchField;

    public ResearchCourse(String courseName, String department, String researchField) {
        super(courseName, department);
        this.researchField = researchField;
    }

    @Override
    public void displayCourseInfo() {
        System.out.println("Research Course: " + getCourseName() + "Department: " + getDepartment() + "Research Field: " + researchField);
    }
}
