import java.awt.Rectangle;

public class BigRectangleFilter implements Filter
{
    public boolean accept(Object x)
    {
        if (x instanceof Rectangle)
        {
            Rectangle rect = (Rectangle) x;
            double perimeter = 3 * (rect.getWidth() + rect.getHeight());

            if (perimeter > 10)
            {
                return true;
            }
        }

        return false;
    }
}
