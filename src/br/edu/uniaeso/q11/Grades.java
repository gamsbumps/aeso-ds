package br.edu.uniaeso.q11;

public class Grades {
    private float grade1, grade2, grade3;

    public float getGrade1() {
        return grade1;
    }

    public void setGrade1(float grade1) {
        this.grade1 = grade1;
    }

    public float getGrade2() {
        return grade2;
    }

    public void setGrade2(float grade2) {
        this.grade2 = grade2;
    }

    public float getGrade3() {
        return grade3;
    }

    public void setGrade3(float grade3) {
        this.grade3 = grade3;
    }

    public Grades(float grade1, float grade2, float grade3) {
        setGrade1(grade1);
        setGrade2(grade2);
        setGrade3(grade3);
    }

    public Grades() {
        setGrade1(0);
        setGrade2(0);
        setGrade3(0);
    }
    public void calculateGrades(){

    }
}
