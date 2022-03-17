package NumberThree;

public class HorseShoe {
    int horses = 0;

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
}
