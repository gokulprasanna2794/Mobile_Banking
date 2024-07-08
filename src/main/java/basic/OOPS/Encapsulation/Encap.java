package basic.OOPS.Encapsulation;
class Employee {
    public int Empid;
    public String Ename;
    public String companyname;
    public String Location;

    public int getEmpid() {
        return Empid;
    }

    public void setEmpid(int empid) {
        Empid = empid;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }
}
public class Encap{
    public static void main(String[] args) {
        Employee ee= new Employee();
        ee.setEmpid(501);
        ee.setEname("PRASANNA");
        ee.setCompanyname("MUTHAYAMMAL");
        ee.setLocation("KAKAVERI");


        Employee ee1= new Employee();
        ee1.setEmpid(270);
        ee1.setEname("Gokulprasanna");
        ee1.setCompanyname("MUTHAYAMMAL");
        ee1.setLocation("NAMAKKAL");

        System.out.println(ee.getEmpid()+"\n"+ee.getEname()+"\n"+ee.getCompanyname()+"\n"+ee.getLocation());
        System.out.println(ee1.getEmpid()+"\n"+ee1.getEname()+"\n"+ee1.getCompanyname()+"\n"+ee1.getLocation());
    }
}
