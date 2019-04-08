/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findandreplace;

/**
 *
 * @author michellewojdak
 */
public class NewFile {
    private int mark, grade;
    private String name;   
    //constructor
    public NewFile(String rname) {
        name = rname;
        grade = (int) (Math.random() * 4) + 9;
        mark = (int) (Math.random() * 50) + 50; 
    }
    //method to display all info of the Student onto the new file
    public String toString() {
        String output = "Name: " + name + "\n";
        output += "Grade: " + grade + "\n";
        output += "Mark: " + mark + "\n";
        return output;
    }
}
