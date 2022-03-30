package br.edu.uniaeso.q13;

public class Intervals {
    private int limitOne, limitTwo, sum, odds;

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

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getOdds() {
        return odds;
    }

    public void setOdds(int odds) {
        this.odds = odds;
    }
    public Intervals(){}
    public Intervals(int limitOne, int limitTwo, int sum, int odds) {
        setLimitOne(limitOne);
        setLimitTwo(limitTwo);
        setSum(sum);
        setOdds(odds);
    }
}
