package br.edu.uniaeso.q13;

public class Intervals {
    private int limitOne, limitTwo;

    public int getLimitOne() {
        return limitOne;
    }

    public void setLimitOne(int limitOne) {
        if(limitOne < limitTwo){
            this.limitOne = limitOne;
        }else{
            if(limitOne < (limitTwo -1)) {
                System.out.println("There are no limits.");
            }
        }
    }

    public int getLimitTwo() {
        return limitTwo;
    }

    public void setLimitTwo(int limitTwo) {
        if(limitTwo > limitOne){
            this.limitTwo = limitTwo;
        }
    }

    public Intervals(){}
    public Intervals(int limitOne, int limitTwo) {
        setLimitOne(limitOne);
        setLimitTwo(limitTwo);
    }
    public void calculateIntegers(){
        if(getLimitOne() < getLimitTwo()){
            int sum = 0;
            for(int i = getLimitOne() + 1; i < getLimitTwo() - 1; i++){
                sum += i;
            }
            System.out.println(sum);
        }
    }
    public void countingIntegers(){
        if(getLimitOne() < getLimitTwo()){
            int counter = (getLimitOne() + 1) - (getLimitTwo() - 1);
            System.out.println(counter);
        }
    }
    public void countingOdds(){
        if(getLimitOne() < getLimitTwo()) {
            int sumOdds = 0;
            for (int i = getLimitOne() + 1; i < getLimitTwo() - 1; i++) {
                if (i % 2 == 1) {
                    sumOdds += i;
                }
            }
        }
    }
    public void oddOrEven() {
        if (getLimitOne() < getLimitTwo()) {
            for (int i = getLimitOne() + 1; i < getLimitTwo() - 1; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + ", EVEN NUMBER!");
                } else {
                    System.out.println(i + ", ODD NUMBER!");
                }
            }
        }
    }
}
