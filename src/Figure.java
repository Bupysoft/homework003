public class Figure {
    double height;
    double width;
    double length;

    public Figure() {
    }

    public Figure(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public double calculateVolume() {
        return length * width * height;
    }

    public double calculateSquare() {
        return 2 * (this.width * this.length + this.width * this.height + this.length * this.height);
    }
}
