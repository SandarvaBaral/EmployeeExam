/*
    G00343312
    Sandarva Baral
    Group A
    Lab Exam
 */
package ie.gmit;

public class Employee {
    private String title;
    private String name;
    private String ppsNumber;
    private String phone;
    private String employmentType;
    private int age;

    public Employee(String title, String name, String ppsNumber, String phone, String employmentType, int age){
        setTitle(title);
        setName(name);
        setPpsNumber(ppsNumber);
        setPhone(phone);
        setEmploymentType(employmentType);
        setAge(age);
    }

    //Setters
    public void setTitle(String title) {
        if(title == "Mr" || title == "Mrs" || title == "Ms") {
            this.title = title;
        }else
            throw new IllegalArgumentException("Invalid Title, Must be Mr, Mrs or Ms");
    }

    public void setName(String name) {
        if(name.length() >= 3 && name.length() <= 25){
            this.name = name;
        }else
            throw new IllegalArgumentException("Name must have a minimum of 3 characters or maximum of 25");

    }

    public void setPpsNumber(String ppsNumber) {
        if(ppsNumber.length() == 8 ){
            this.ppsNumber = ppsNumber;
        }else
            throw new IllegalArgumentException("PPS Number must be 8 character long");
    }

    public void setPhone(String phone) {
        if(phone.length() == 9){
            this.phone = phone;
        }else
            throw new IllegalArgumentException("Phone number must be 9 character long");

    }

    public void setEmploymentType(String employmentType) {
        if(employmentType == "Full-Time" || employmentType == "Part-Time" || employmentType == "Contract"){
            this.employmentType = employmentType;
        }else
            throw new IllegalArgumentException("Invalid Employment Provided, Must be Full-Time, Part-Time or Contract");

    }

    public void setAge(int age) {
        if(age > 16){
            this.age = age;
        }else
            throw new IllegalArgumentException("Employee age must be over 16");

    }

    //Getters
    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getPpsNumber() {
        return ppsNumber;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public int getAge() {
        return age;
    }
}
