package Paint_Brush;

import java.awt.*;

/**
 *
 * @author hayam tarek
 */
abstract class Shape {

    protected Color color;
    protected Point startPoint;
    protected Point endPoint;
    protected boolean isSolid;
    protected boolean isDotted;
    protected int strokeWidth;

    public Shape(Color color, Point startPoint, boolean isSolid, boolean isDotted, int strokeWidth) {
        this.color = color;
        this.startPoint = startPoint;
        this.isSolid = isSolid;
        this.isDotted = isDotted;
        this.strokeWidth = strokeWidth;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public abstract void draw(Graphics2D g);
}
