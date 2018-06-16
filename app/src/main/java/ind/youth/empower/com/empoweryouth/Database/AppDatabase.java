package ind.youth.empower.com.empoweryouth.Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import ind.youth.empower.com.empoweryouth.Models.JobEntity;
import ind.youth.empower.com.empoweryouth.Models.NoteEntity;

@Database(entities = {NoteEntity.class, JobEntity.class},version = 1 ,exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    public static final String DATABASE_NAME="EmpowerYouth_Database.db";
    public static volatile AppDatabase instance;
    public static final Object LOCK = new Object();

    //add DAO inteface objects
    public abstract NotesDao notesDao();
    public abstract JobsDao jobsDao();

    public static AppDatabase getInstance(Context mContext) {
        if(instance==null)
        {
            synchronized (LOCK){
                if(instance == null ){
                    instance = Room.databaseBuilder(mContext.getApplicationContext(),
                            AppDatabase.class,DATABASE_NAME).build();
                }
            }
        }
        return instance;
    }
}
