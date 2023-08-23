package review;


public class Employee {
   private String name ;
    private  String emailAdrres;
    private String phone ;
    private  String department;
    private  String address;
    private int yearOfBrith;
    public  Employee( String name ,
    String emailAdrres,
    String phone ,
    String department,
    String address,
    int yearOfBrith){
       this.name=name;
       this.address=address;
       this.emailAdrres=emailAdrres;
       this.phone=phone;
       this.department=department;
       this.yearOfBrith=yearOfBrith;
    }
    public  Employee (){
        System.out.println("hello iam Eamployee without Parameter");
    }

    public void setName(String name) {
        this.name = name;
    }

    public  String getName() {
        return name;
    }

    public  String getEmailAdrres() {
        return emailAdrres;
    }

    public  String getPhone() {
        return phone;
    }

    public  String getDepartment() {
        return department;
    }

    public  String getAddress() {
        return address;
    }

    public  int getYearOfBrith() {
        return yearOfBrith;
    }

    public void setEmailAdrres(String emailAdrres) {
        this.emailAdrres = emailAdrres;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setYearOfBrith(int yearOfBrith) {
        this.yearOfBrith = yearOfBrith;
    }

    public static void main(String[] args) {


    }
}
