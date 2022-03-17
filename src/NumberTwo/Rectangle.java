package NumberTwo;

public class Rectangle {
    int side = 0;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side > 0){
            this.side = side;
        }

    }

    Rectangle(){
    }

    public Rectangle(int side) {
        this.setSide(side);
    }

}
