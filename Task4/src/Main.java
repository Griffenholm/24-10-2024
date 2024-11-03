import processing.core.PApplet;

public class Main extends PApplet {
    public static PApplet applet;

    public void setup() {

        applet = this;

        ShapeBuilder sb = new ShapeBuilder();
        Shape sq = new Square(100);
        Shape cir = new Circle(100);

        sb.addShape(sq);
        sb.addShape(cir);

        System.out.println("Square area: "+sq.getArea());
        System.out.println("Circle area: "+cir.getArea());

        System.out.println("TOTAL: "+sb.getTotalArea());

        cir.display();
    }

    public void settings() {
        size(700, 900);
    }

    public static void main(String[] args){
        String[] appletArgs = new String[]{"Main"};
        PApplet.main(appletArgs);

    }
}