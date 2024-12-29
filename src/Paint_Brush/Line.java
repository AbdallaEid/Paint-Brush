package Paint_Brush;

import java.awt.*;

/**
 *
 * @author hayam tarek
 */
class Line extends Shape {

    public Line(Color color, Point startPoint, boolean isSolid, boolean isDotted, int strokeWidth) {
        super(color, startPoint, isSolid, isDotted, strokeWidth);
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(color);
        g.setStroke(new BasicStroke(strokeWidth));
        if (isDotted) {
            float[] dashPattern = {10, 10};
            g.setStroke(new BasicStroke(strokeWidth, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, dashPattern, 0));
        }
        if (endPoint != null) {
            g.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
        }
    }
}
