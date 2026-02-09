import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectLister
{
    public static void main(String[] args)
    {
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        rectangles.add(new Rectangle(1, 5));
        rectangles.add(new Rectangle(2, 8));
        rectangles.add(new Rectangle(3, 2));
        rectangles.add(new Rectangle(8, 2));
        rectangles.add(new Rectangle(2, 1));
        rectangles.add(new Rectangle(4, 2));
        rectangles.add(new Rectangle(9, 2));
        rectangles.add(new Rectangle(3, 3));
        rectangles.add(new Rectangle(2, 4));
        rectangles.add(new Rectangle(1, 3));

        Filter filter = new BigRectangleFilter();

        System.out.println("Rectangles with perimeter greater than 10:");

        for (Rectangle r : rectangles)
        {
            if (filter.accept(r))
            {
                double perimeter = 2 * (r.getWidth() + r.getHeight());

                System.out.println("Width: " + r.getWidth() +
                        " Height: " + r.getHeight() +
                        " Perimeter: " + perimeter);
            }
        }
    }
}
