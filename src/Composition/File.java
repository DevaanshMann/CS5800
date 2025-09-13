//Devaansh Mann
//CS 5800 - Homework 1.

package Composition;

import java.util.ArrayList;
import java.util.List;

class File {
    private String fileName;

    public File(String name) {
        this.fileName = name;
    }

    public String getName() {
        return fileName;
    }

    public void setName(String name) {
        this.fileName = name;
    }

    public void print(){
        System.out.println(fileName);
    }
}
