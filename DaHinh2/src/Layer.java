import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Layer {
    private List<Shape> shapes;

    public Layer() {
        this.shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * Get information about the shapes in the layer.
     *
     * @return Information about the shapes in the layer.
     */
    public String getInfo() {
        StringBuilder info = new StringBuilder("Layer of crazy shapes:\n");
        for (Shape shape : shapes) {
            info.append(shape.toString()).append("\n");
        }
        return info.toString();
    }

    /**
     * Remove all circles from the layer.
     */
    public void removeCircles() {
        Iterator<Shape> iterator = shapes.iterator();
        while (iterator.hasNext()) {
            Shape shape = iterator.next();
            if (shape instanceof Circle) {
                iterator.remove();
            }
        }
    }

    /**
     * Remove duplicate shapes from the layer.
     */
    public void removeDuplicates() {
        List<Shape> uniqueShapes = new ArrayList<>();
        for (Shape shape : shapes) {
            if (!uniqueShapes.contains(shape)) {
                uniqueShapes.add(shape);
            }
        }
        shapes.clear();
        shapes.addAll(uniqueShapes);
    }
}
