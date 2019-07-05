package com.stackroute.pe5;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {
    //checking the conditions to return in decreasing order
    @Override
    public int compare(Student student1, Student student2) {

        if(student1.getAge() == student2.getAge()) {
            if(student1.getName().compareTo(student2.getName()) == 0)
                return student1.getId().compareTo(student2.getId());

            else return student1.getName().compareTo(student2.getName());
        }

        else if(student1.getAge()>student2.getAge())
            return 1;

        else
            return -1;
    }
}
