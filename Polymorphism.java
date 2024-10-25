class Shape
{
 void draw(){
 System.out.println("drawing shape");
}
 void erase(){ 
System.out.println("erasing shape");
}
}
 class Circle extends Shape
 {
 void draw(){ 
System.out.println("drawing circle");
}
 void erase(){ 
System.out.println("erasing circle");
}
 }
 class Triangle extends Shape
 {
 void draw(){ 
System.out.println("drawing triangle");
}
 void erase(){
 System.out.println("erasing triangle");
}
 }
 class Square extends Shape
 {
 void draw(){ 
System.out.println("drawing square");
}
 void erase(){ 
System.out.println("erasingsquare");
}
 }

 public class Polymorphism
 {
   public static void main(String[]args)
   {
     Shape S = new Shape();
     Shape c = new Circle();
     Shape t = new Triangle();
     Shape s = new Square();
     c.draw();
     c.erase();
     t.draw();
     t.erase();
     s.draw();
     s.erase();
   }
}