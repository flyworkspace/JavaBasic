package com.flyworkspace.javatest.genericity.student;

/**
 * Created by jinpengfei on 17-5-12.
 */
public class Student implements Comparable<Student>{
    private int id;

    public Student(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Student o) {
        return (id > o.id) ? 1 : ((id < o.id) ? -1 : 0);
    }
}