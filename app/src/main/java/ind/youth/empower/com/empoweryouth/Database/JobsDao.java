package ind.youth.empower.com.empoweryouth.Database;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

import ind.youth.empower.com.empoweryouth.Models.JobEntity;

@Dao
public interface JobsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertJob(JobEntity jobEntity);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAllJobs(List<JobEntity> jobs);

    @Query("Select * from Jobs where ID = :id")
    JobEntity getJobById(long id);

    @Query(("Select * From Jobs where Location =:location"))
    JobEntity getJobByLocation(String location);

    @Query("Select * from Jobs where Title = :title")
    JobEntity getJobByTitle(String title);

    @Query("Select * from Jobs where Company = :company")
    JobEntity getJobByCompany(String company);

    @Query("Select * From Jobs order by Salary Desc")
    LiveData<List<JobEntity>> getAllJobs();
}
