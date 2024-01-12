//package DesignPatternLLD_BuilderDesignBasics;
//
//public class Builder {
//
//
//    private String name;
//    private int age;
//    private double psp;
//    private String universityName;
//    private String batch;
//    private long id;
//    private int gradYear;
//    private String phoneNumber;
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public double getPsp() {
//        return psp;
//    }
//
//    public String getUniversityName() {
//        return universityName;
//    }
//
//    public String getBatch() {
//        return batch;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public int getGradYear() {
//        return gradYear;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setPsp(double psp) {
//        this.psp = psp;
//    }
//
//    public void setUniversityName(String universityName) {
//        this.universityName = universityName;
//    }
//
//    public void setBatch(String batch) {
//        this.batch = batch;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public void setGradYear(int gradYear) {
//        this.gradYear = gradYear;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public Student build(){
//        if(getGradYear() < 2019){
//            System.out.println("Validation failed");
//        }
//        return new Student(this);
//    }
//}
