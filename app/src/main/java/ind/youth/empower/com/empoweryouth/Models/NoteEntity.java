package ind.youth.empower.com.empoweryouth.Models;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "Notes")
public class NoteEntity {

    @PrimaryKey(autoGenerate = true)
    public int mID;

    public String mSubject;
    public String mCourse;
    public String mCollege;
    public String mUniversity;
    public String mLocation;
    public String mCost;
    public String mDetail;


    //Constructors
    @Ignore
    public NoteEntity() { }

    public NoteEntity(int mID, String mSubject, String mCourse, String mCollege, String mUniversity, String mLocation, String mCost, String detail) {
        this.mID = mID;
        this.mSubject = mSubject;
        this.mCourse = mCourse;
        this.mCollege = mCollege;
        this.mUniversity = mUniversity;
        this.mLocation = mLocation;
        this.mCost = mCost;
        this.mDetail = detail;
    }

    @Ignore
    public NoteEntity(String mSubject, String mCourse, String mCollege, String mUniversity, String mLocation, String mCost, String detail) {
        this.mSubject = mSubject;
        this.mCourse = mCourse;
        this.mCollege = mCollege;
        this.mUniversity = mUniversity;
        this.mLocation = mLocation;
        this.mCost = mCost;
        this.mDetail = detail;
    }


    //Getters

    public int getmID() {
        return mID;
    }

    public String getmSubject() {
        return mSubject;
    }

    public String getmCourse() {
        return mCourse;
    }

    public String getmCollege() {
        return mCollege;
    }

    public String getmUniversity() {
        return mUniversity;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmCost() {
        return mCost;
    }

    public String getmDetail() {
        return mDetail;
    }


    //Setters


    public void setmID(int mID) {
        this.mID = mID;
    }

    public void setmSubject(String mSubject) {
        this.mSubject = mSubject;
    }

    public void setmCourse(String mCourse) {
        this.mCourse = mCourse;
    }

    public void setmCollege(String mCollege) {
        this.mCollege = mCollege;
    }

    public void setmUniversity(String mUniversity) {
        this.mUniversity = mUniversity;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public void setmCost(String mCost) {
        this.mCost = mCost;
    }

    public void setmDetail(String mDetail) {
        this.mDetail = mDetail;
    }


    @Override
    public String toString() {
        return "NoteEntity{" +
                "mID=" + mID +
                ", mSubject='" + mSubject + '\'' +
                ", mCourse='" + mCourse + '\'' +
                ", mCollege='" + mCollege + '\'' +
                ", mUniversity='" + mUniversity + '\'' +
                ", mLocation='" + mLocation + '\'' +
                ", mCost='" + mCost + '\'' +
                ", mDetail='" + mDetail + '\'' +
                '}';
    }
}
