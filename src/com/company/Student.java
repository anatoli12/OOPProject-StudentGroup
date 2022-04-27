package com.company;

import java.util.HashMap;

public class Student {
    private String name;
    private int group;
    private String facul_num;
    private Year year;
    private Program program;
    private Status status;
    private double average_grade;
    private HashMap<Discipline, Double> discipline_grades;

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setFacul_num(String facul_num) {
        this.facul_num = facul_num;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setAverage_grade(double average_grade) {
        this.average_grade = average_grade;
    }

    public void setDiscipline_grades(HashMap<Discipline, Double> discipline_grades) {
        this.discipline_grades = discipline_grades;
    }

    public Student(String name, int group, String facul_num, Program program) {
        this.name = name;
        this.group = group;
        this.facul_num = facul_num;
        this.program = program;
    }

}
