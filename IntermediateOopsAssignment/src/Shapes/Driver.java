package Shapes;

public class Driver {
public static void main(String[] args) {
	Shape s;
	s=new Cube();
	s.draw();
	s=new Rectangle();
	s.draw();
	s=new Line();
	s.draw();
}
}
