package review;

public class MobileDeveloper extends Developer {
    public  MobileDeveloper(){
        System.out.println("this is mobile constractor");
    }
    public static void main(String[] args) {
        Developer m1=new Developer("mosaab","mosaab.cp@gmail.com","0569030423","Cap","Howwara",2003,"Resturant");
     m1.print();
    }
}
