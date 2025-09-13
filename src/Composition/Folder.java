//Devaansh Mann
//CS 5800 - Homework 1

package Composition;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String fileName;
    private List<File> files;
    public List<Folder> subFolders;

    public Folder(String fileName){
        this.fileName = fileName;
        this.files = new ArrayList<File>();
        this.subFolders = new ArrayList<Folder>();
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public List<Folder> getSubFolders() {
        return subFolders;
    }

//    add file or subfolder
    public void addFile(File file){
        this.files.add(file);
    }
    public void addSubFolder(Folder subFolder){
        this.subFolders.add(subFolder);
    }

//    remove subfolder by name
    public void removeSubFolder(String fileName){
        subFolders.removeIf(f -> f.getFileName().equals(fileName));
    }

    public void setSubFolders(List<Folder> subFolders) {
        this.subFolders = subFolders;
    }

    public void print(String indentation){
        System.out.println(indentation + "+ " + this.fileName + " ");
        String childIndentation = indentation + "  ";

        for(Folder folder : subFolders) {
            folder.print(childIndentation);
        }

        for(File file : files){
            System.out.println(childIndentation + "   |--" + file.getName());
        }
    }
}
