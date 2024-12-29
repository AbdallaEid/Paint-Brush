package Paint_Brush;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author hayam tarek
 */
public class DrawingPanel extends JPanel {

    private ArrayList<Shape> shapes = new ArrayList<>();
    private Shape currentShape;
    private BrushMode currentMode = BrushMode.Pencil;
    private Color currentColor = Color.BLACK;
    private boolean isSolid = false;
    private boolean isDotted = false;
    private int strokeWidth = 5;

    public DrawingPanel() {
        setBackground(Color.WHITE);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                switch (currentMode) {
                    case Line:
                        currentShape = new Line(currentColor, e.getPoint(), isSolid, isDotted, strokeWidth);
                        break;
                    case Rectangle:
                        currentShape = new Rectangle(currentColor, e.getPoint(), isSolid, isDotted, strokeWidth);
                        break;
                    case Oval:
                        currentShape = new Oval(currentColor, e.getPoint(), isSolid, isDotted, strokeWidth);
                        break;
                    case Pencil:
                        currentShape = new Pencil(currentColor, e.getPoint(), isSolid, isDotted, strokeWidth);
                        break;
                    case Eraser:
                        currentShape = new Eraser(currentColor, e.getPoint(), isSolid, isDotted, strokeWidth);
                        break;
                    default:
                        currentShape = null;
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getPoint().equals(currentShape.startPoint) && !(currentShape instanceof Rectangle)) {
                    currentShape = null;
                }
                if (currentShape != null) {
                    currentShape.setEndPoint(e.getPoint());
                    shapes.add(currentShape);
                    System.out.println(".mouseReleased()");
                    currentShape = null;
                    repaint();
                }
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (currentShape != null) {
                    if (currentShape instanceof Pencil) {
                        ((Pencil) currentShape).addPoint(e.getPoint());
                    }
                    if (currentShape instanceof Eraser) {
                        ((Eraser) currentShape).addErasePoint(e.getPoint());
                    }
                    currentShape.setEndPoint(e.getPoint());
                    repaint();
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (Shape shape : shapes) {
            shape.draw(g2);
        }

        if (currentShape != null) {
            currentShape.draw(g2);
        }
    }

    public void setStrokeWidth(int strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public void setCurrentMode(BrushMode mode) {
        this.currentMode = mode;
    }

    public void setCurrentColor(Color color) {
        this.currentColor = color;
    }

    public void setSolid(boolean isSolid) {
        this.isSolid = isSolid;
    }

    public void setDotted(boolean isDotted) {
        this.isDotted = isDotted;
    }

    public void clear() {
        shapes.clear();
        repaint();
    }

    public void undo() {
        if (!shapes.isEmpty()) {
            shapes.remove(shapes.size() - 1);
            repaint();
        }
    }
}
