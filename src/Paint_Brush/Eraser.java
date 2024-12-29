package Paint_Brush;

import java.awt.*;
import java.util.ArrayList;

/**
 *
 * @author hayam tarek
 */
public class Eraser extends Shape {

    private ArrayList<Point> erasePoints;

    public Eraser(Color color, Point startPoint, boolean isSolid, boolean isDotted, int strokeWidth) {
        super(color, startPoint, isSolid, isDotted, strokeWidth);
        this.erasePoints = new ArrayList<>();
        this.erasePoints.add(startPoint);
    }

    public void addErasePoint(Point point) {
        erasePoints.add(point);
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(Color.WHITE);
        g.setStroke(new BasicStroke(strokeWidth));
        for (int i = 0; i < erasePoints.size() - 1; i++) {
            Point p1 = erasePoints.get(i);
            Point p2 = erasePoints.get(i + 1);
            g.drawLine(p1.x, p1.y, p2.x, p2.y);
        }
    }

}
