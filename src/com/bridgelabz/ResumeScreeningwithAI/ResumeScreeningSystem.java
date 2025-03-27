package com.bridgelabz.ResumeScreeningwithAI;

import java.util.List;

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        // Create resumes for different job roles
        SoftwareEngineer se = new SoftwareEngineer("Sanya Khanna", 2, "Java, C++");
        DataScientist ds = new DataScientist("Sehajpreet Kaur", 5, "Java, Javascript, SQL");
        ProductManager pm = new ProductManager("Bhawishya", 3, "E-commerce, SaaS");

        // Processing resumes
        Resume<SoftwareEngineer> resumeSE = new Resume<>(se);
        Resume<DataScientist> resumeDS = new Resume<>(ds);
        Resume<ProductManager> resumePM = new Resume<>(pm);

        resumeSE.processResume();
        resumeDS.processResume();
        resumePM.processResume();

        // Screen multiple resumes using wildcard
        System.out.println("Screening Multiple Resumes");
        screenResumes(List.of(se, ds, pm));
    }

    // Wildcard method to screen resumes for any job role
    public static void screenResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            resume.displayResume();
        }
    }
}

/*
Processing Resume for Sanya Khanna...
Software Engineer Resume
Candidate: Sanya Khanna
Experience: 2 years
Skills: Java, C++
Processing Resume for Sehajpreet Kaur...
Data Scientist Resume
Candidate: Sehajpreet Kaur
Experience: 5 years
Data Tools: Java, Javascript, SQL
Processing Resume for Bhawishya...
Product Manager Resume
Candidate: Bhawishya
Experience: 3 years
Domain Expertise: E-commerce, SaaS
Screening Multiple Resumes
Software Engineer Resume
Candidate: Sanya Khanna
Experience: 2 years
Skills: Java, C++
Data Scientist Resume
Candidate: Sehajpreet Kaur
Experience: 5 years
Data Tools: Java, Javascript, SQL
Product Manager Resume
Candidate: Bhawishya
Experience: 3 years
Domain Expertise: E-commerce, SaaS
 */