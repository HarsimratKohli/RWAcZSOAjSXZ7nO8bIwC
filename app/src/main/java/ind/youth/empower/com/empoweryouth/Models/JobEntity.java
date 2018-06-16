package ind.youth.empower.com.empoweryouth.Models;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "Jobs")
public class JobEntity {

    @PrimaryKey(autoGenerate = true)
    public long ID;

    public String Title;
    public String Location;
    public String Salary;
    public String Experience;
    public String Company;
    //Defines links to PAID or Unpaid icon
    public int Paid;
    public String Details;

    @Ignore
    public JobEntity() {
    }

    public JobEntity(long ID, String title, String location, String salary, String experience, String company, int paid, String details) {
        this.ID = ID;
        Title = title;
        Location = location;
        Salary = salary;
        Experience = experience;
        Company = company;
        Paid = paid;
        Details = details;
    }

    @Ignore
    public JobEntity(String title, String location, String salary, String experience, String company, int paid, String details) {
        Title = title;
        Location = location;
        Salary = salary;
        Experience = experience;
        Company = company;
        Paid = paid;
        Details = details;
    }

    //Getters

    public long getID() {
        return ID;
    }

    public String getTitle() {
        return Title;
    }

    public String getLocation() {
        return Location;
    }

    public String getSalary() {
        return Salary;
    }

    public String getExperience() {
        return Experience;
    }

    public String getCompany() {
        return Company;
    }

    public int getPaid() {
        return Paid;
    }

    public String getDetails() {
        return Details;
    }

    //Setters

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }

    public void setExperience(String experience) {
        Experience = experience;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public void setPaid(int paid) {
        Paid = paid;
    }

    public void setDetails(String details) {
        Details = details;
    }

    @Override
    public String toString() {
        return "JobEntity{" +
                "ID=" + ID +
                ", Title='" + Title + '\'' +
                ", Location='" + Location + '\'' +
                ", Salary='" + Salary + '\'' +
                ", Experience='" + Experience + '\'' +
                ", Company='" + Company + '\'' +
                ", Paid=" + Paid +
                ", Details='" + Details + '\'' +
                '}';
    }
}
