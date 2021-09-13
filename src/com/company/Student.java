package com.company;

import java.util.Comparator;
import java.util.Objects;
import java.util.StringJoiner;

public class Student implements Comparable<Student> {
    int rank;
    String name;

    public Student(int r,String n){
        rank=r;
        name=n;
    }

    public int getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
                .add("rank=" + rank)
                .add("name='" + name + "'")
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return rank == student.rank &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, name);
    }

    @Override
    public int compareTo(Student o) {
        if(this.rank< o.rank)
            return -1;
        if(this.rank>o.rank)
            return 1;
        else
            return 0;
    }
}
