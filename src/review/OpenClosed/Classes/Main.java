package review.OpenClosed.Classes;



import review.OpenClosed.InterFaces.IShape;

public class Main  {
    public static void main(String[] args) {

        IShape shape1 =new Rectangle(5,10);
        shape1.Shape();
        IShape shape2 =new Circel(7);
        shape2.Shape();
    }


}
