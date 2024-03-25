public class Main {
    public static void main(String[] args) {
        Layer layer= new Layer();


        layer.addShape(new Circle(new Point(10,5),8,"RED",true));
        layer.addShape(new Rectangle(new Point(10,5),8,6,"RED",true));
        layer.addShape(new Circle(new Point(10,5),8,"RED", true));
        layer.addShape(new Square(new Point(10,5),8,"RED", true));

        layer.removeDuplicates();
        System.out.println(layer.getInfo());
    }
}
