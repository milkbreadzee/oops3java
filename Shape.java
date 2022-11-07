abstract class Shapes{
	abstract void numOfSides();
	
}

class Rectangle extends Shapes{
	void numOfSides(){
		System.out.println("Rectangle. no of sides = 4");
	}
}
class Hexagon extends Shapes{
	void numOfSides(){
		System.out.println("Hexagon. no of sides = 6");
	}
}

class Triangle extends Shapes{
	void numOfSides(){
		System.out.println("Triangle. no of sides = 3");
	}
}

public class Shape {
public static void main(String args[]){
	Triangle t = new Triangle();
	Rectangle r = new Rectangle();
	Hexagon h = new Hexagon();
	t.numOfSides();
	h.numOfSides();
	r.numOfSides();
}
}


