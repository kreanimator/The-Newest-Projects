public class Rectangle {
    public double rectangleHeight = 0;
    public double rectangleWidth = 0;
    public double area = 0;


    public Rectangle (double rectangleHeight, double rectangleWidth, double area){
        this.rectangleHeight = this.rectangleHeight + rectangleHeight;
        this.rectangleWidth = this.rectangleWidth + rectangleWidth;
        this.area = this.area + area;



    }

    public double getRectangleHeight() {
        return rectangleHeight;
    }

    public double getRectangleWidth() {
        return rectangleWidth;
    }
    public double getArea() {
        area = rectangleHeight*rectangleWidth;
        return area;
    }

}


