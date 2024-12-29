package Paint_Brush;

import java.awt.*;

/**
 *
 * @author hayam tarek
 */
class Oval extends Shape {

    public Oval(Color color, Point startPoint, boolean isSolid, boolean isDotted, int strokeWidth) {
        super(color, startPoint, isSolid, isDotted, strokeWidth);
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(color);
        if (isDotted) {
            float[] dashPattern = {10, 10};
            g.setStroke(new BasicStroke(strokeWidth, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, dashPattern, 0));
        } else {
            g.setStroke(new BasicStroke(strokeWidth));
        }
        if (endPoint != null) {
            int x = Math.min(startPoint.x, endPoint.x);
            int y = Math.min(startPoint.y, endPoint.y);
            int width = Math.abs(endPoint.x - startPoint.x);
            int height = Math.abs(endPoint.y - startPoint.y);
            if (isSolid) {
                g.fillOval(x, y, width, height);
            } else {
                g.drawOval(x, y, width, height);
            }
        }
    }

}
