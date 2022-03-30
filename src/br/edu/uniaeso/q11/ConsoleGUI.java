package br.edu.uniaeso.q11;

import java.util.Scanner;

public class ConsoleGUI {
    private float txtGrade1, txtGrade2, txtGrade3;

    private Scanner scanner;
    private Grades grades;

    public float getTxtGrade1() {
        return txtGrade1;
    }

    public void setTxtGrade1(float txtGrade1) {
        this.txtGrade1 = txtGrade1;
    }

    public float getTxtGrade2() {
        return txtGrade2;
    }

    public void setTxtGrade2(float txtGrade2) {
        this.txtGrade2 = txtGrade2;
    }

    public float getTxtGrade3() {
        return txtGrade3;
    }

    public void setTxtGrade3(float txtGrade3) {
        this.txtGrade3 = txtGrade3;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Grades getGrades() {
        return grades;
    }

    public void setGrades(Grades grades) {
        this.grades = grades;
    }
    public ConsoleGUI(){
        setScanner(new Scanner(System.in));
    }
    public void gui(){
        System.out.println("First grade: ");
        setTxtGrade1(getScanner().nextFloat());

        System.out.println("Second grade: ");
        setTxtGrade2(getScanner().nextFloat());
        setGrades(new Grades(getTxtGrade1(), getTxtGrade2(), getTxtGrade3()));


        boolean result = getGrades().calculateGrades();
        if (result){
            System.out.println("PASSED!");
        }else{
            System.out.println("You're in the finals. Put your finals' grade: ");
            setTxtGrade3(getScanner().nextFloat());
            result = getGrades().calculateFinals();
            if(result){
                System.out.println("PASSED!");
            }else{
                System.out.println("FAILED!");
            }
        }




    }
}
