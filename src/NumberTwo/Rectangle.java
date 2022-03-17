package NumberTwo;

public class Rectangle {
    int side = 0;
    int height = 0;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side > 0){
            this.side = side;
        }
        else{
            System.out.println("Side cannot be lower than 1!");
        }

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0){
            this.height = height;
        }
        System.out.println("Height cannot be lower than 1!");

    }

    Rectangle(){
    }

    public Rectangle(int side, int height) {
        this.setSide(side);
        this.setHeight(height);
    }

    int area(){
        return this.side * this.height;
    }

}
