/*
 * Michelle Wojdak
 * To change student profile or add new ones
 * 04/05/2019
 */
package findandreplace;

import java.io.*;
import javax.swing.*;

public class FindandReplace {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String userChoice;
        userChoice = JOptionPane.showInputDialog("Would you like to edit current student mark or add new student \n"
                + "1- edit mark, 2- create new student file, 3- create randome student file");
        if(userChoice.equals("1")){
            String fileName;
            BufferedReader reader;
            BufferedWriter writer;
            try {          
                fileName = JOptionPane.showInputDialog("Please enter a file name: ");
                reader = new BufferedReader(new FileReader(fileName));
                String line = reader.readLine();
                String originalFileContent = "";
                String oldMark = "";
                String newMark = "";
                while(line != null){
                    oldMark = JOptionPane.showInputDialog("What is the students old mark");
                    newMark = JOptionPane.showInputDialog("What is the students new mark");
                    originalFileContent += line;
                    line = reader.readLine();
                }
            String modifiedFileContent = originalFileContent.replaceAll(oldMark, newMark);
            writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(modifiedFileContent);
            reader.close();
            writer.close();       
            }catch(FileNotFoundException j){
            System.out.print(j);
            }             
        }if(userChoice.equals("2")){
            try{
                String name= JOptionPane.showInputDialog("What is the student's name?");
                PrintWriter fileOut = new PrintWriter(new FileWriter(name + ".txt"));       
                String grade= JOptionPane.showInputDialog("What is the student's current grade?");
                String mark= JOptionPane.showInputDialog("What is the students current mark?");
                fileOut.println("Name: " + name + "\n"
                    + "Grade: " + grade + "\n"
                    + "Mark: " + mark);
                fileOut.println("Grade: " + grade);
                fileOut.println("Mark: " + mark);
                fileOut.close();
            }catch (FileNotFoundException e){
            System.out.print(e);
            }
        }if(userChoice.equals("3")){
            NewFile randomFile = new NewFile("Mason");
            PrintWriter fileOut = new PrintWriter(new FileWriter("random.txt"));
            fileOut.println("Test");
            fileOut.println(randomFile.toString());
            fileOut.close();       
        } 
    }
}