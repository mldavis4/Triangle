

public class Triangle extends GeometricObject{
  private double side1 = 1.0;
  private double side2 = 1.0;
  private double side3 = 1.0;
  
  public Triangle() {}
  
  public Triangle(double newSide1, double newSide2, double newSide3) {
  	side1=newSide1; 
  	side2=newSide2;
  	side3=newSide3;
  }
  	
  public double getSide1(){
	  	return this.side1;
  }
  public double getSide2(){
	  	return this.side2;
  }
  public double getSide3(){
	  	return this.side3;
  }

  public void setSide1(double newSide1){
	  this.side1=newSide1;
  }
  public void setSide2(double newSide2){
	  this.side2=newSide2;
  }
  public void setSide3(double newSide3){
	  this.side3=newSide3;
  }
  
  public double getPerimeter(){
	  	return side1+side2+side3;
  }
  public double getArea(){
	  	return (1/2)*side1*side2;
}

  public String toString(){
	  return "Triangle with sides "+"side1, "+"side2, and "+"side3";
  }
  }



