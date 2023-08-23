package review;

public class Developer  extends  Employee{
      static String projectName;
   public Developer(){
       System.out.println("this is Developer Constractor");
   }

    public Developer(String name, String emailAdrres, String phone, String department, String address, int yearOfBrith, String projectName) {
        super(name, emailAdrres, phone, department, address, yearOfBrith);
        this.projectName = projectName;
    }

    public void setProjectName(String projectName) {
        projectName = projectName;
    }

    public  String getProjectName() {
        return projectName;
    }

    public static void main(String[] args) {
        Developer d1= new Developer();
        d1.setName("Ali");
        System.out.println(d1.getName());
    }

    protected void print() {
        System.out.println(getName()+"  "+ getEmailAdrres()+" "+getPhone()+" "+getDepartment()+" "+getAddress() + " "+getYearOfBrith() +"  "+getProjectName());

    }
}
