package ind.youth.empower.com.empoweryouth.Database;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

import ind.youth.empower.com.empoweryouth.Models.NoteEntity;

@Dao
public interface NotesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertNote(NoteEntity noteEntity);

    @Insert(onConflict= OnConflictStrategy.REPLACE)
    void insertAll(List<NoteEntity> notes);

    @Delete
    void deleteNote(NoteEntity noteEntity);

    @Query("Delete From Notes")
    int deleteAll();

    @Query("Select * From Notes where mID =:id")
    NoteEntity getNoteById(int id);

    @Query("Select * From Notes order by mID DESC")
    LiveData<List<NoteEntity>> getAllNotes();
}

