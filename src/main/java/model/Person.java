package model;
/*   RajUser created on 9/21/2019 
inside the package - model  */

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;
    private String lname;
    private int age;

    private String fname;

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }



}
