package br.edu.uniaeso.q13;

import java.util.Scanner;

public class ConsoleGUI {
    private int txtLimitOne, txtLimitTwo;

    private Scanner scanner;
    private Intervals intervals;

    public int getTxtLimitOne() {
        return txtLimitOne;
    }

    public void setTxtLimitOne(int txtLimitOne) {
        this.txtLimitOne = txtLimitOne;
    }

    public int getTxtLimitTwo() {
        return txtLimitTwo;
    }

    public void setTxtLimitTwo(int txtLimitTwo) {
        this.txtLimitTwo = txtLimitTwo;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Intervals getIntervals() {
        return intervals;
    }

    public void setIntervals(Intervals intervals) {
        this.intervals = intervals;
    }

    public ConsoleGUI(){
        setScanner(new Scanner(System.in));
    }
    public void gui(){
        System.out.println("What's your first limit number? ");
        setTxtLimitOne(getScanner().nextInt());

        System.out.println("What's your second limit number? ");
        setTxtLimitTwo(getScanner().nextInt());

        setIntervals(new Intervals(getTxtLimitOne(), getTxtLimitTwo()));
        menu();
        int op = scanner.nextInt();

        if(op == 1){
            getIntervals().calculateIntegers();
        }else if(op == 2){
            getIntervals().countingIntegers();
        }else if(op == 3){
            getIntervals().countingOdds();
        }else{
            getIntervals().oddOrEven();
        }

    }
    public void menu(){
        System.out.println("Choose your option");
        System.out.println("1 - Sum Integers");
        System.out.println("2 - Count Integers");
        System.out.println("3 - Count odd numbers");
        System.out.println("4 - Tell ODD or EVEN in sequence");
    }
}
