package NumberThree;

public class HorseShoe {
    private int horses = 0;

    public int getHorseshoe() {
        return horses;
    }

    public void setHorses(int horses) {
        if (horses > 0){
            this.horses = horses;
        }
        else{
            System.out.println("Number of horses cannot be lower than 1!");
        }
    }

    public HorseShoe() {
    }

    public HorseShoe(int horses) {
        this.setHorses(horses);
    }

    public int horseShoe(){
        return 4 * this.horses;
    }

    @Override
    public String toString() {
        return horseShoe() + "will be needed to be bought for " + horses
                + " horses.";
    }
}
