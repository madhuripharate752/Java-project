package polymorphismexample;
     class Shape {
         void Draw(){
             System.out.println("Drawing");
         }
     }
     class Triangle extends Shape{
         void Draw(){
             System.out.println("Draw the Triangle");
         }
     }
     class Circle extends Shape{
         void Draw(){
             System.out.println("Draw the Circle");
         }
     }
     class Square extends Shape{
         void Draw(){
             System.out.println("Draw the Square");
         }
     }
     class polymorphism{
         public static void main(String[] args) {
             Shape s = new Shape ();
             s.Draw();
             Shape s1 = new Circle();
             Shape s2 = new Triangle();
             Shape s3 = new Square();
             s1.Draw();
             s2.Draw();
             s3.Draw();
         }
     }