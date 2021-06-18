package levis.ltt.com.roomdemo.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.RoomDatabase;
import android.support.annotation.NonNull;

import levis.ltt.com.roomdemo.dao.TaskDao;
import levis.ltt.com.roomdemo.dao.UserDao;
import levis.ltt.com.roomdemo.entity.Task;
import levis.ltt.com.roomdemo.entity.User;

@Database(entities = {User.class, Task.class}, version = 1, exportSchema = true)
public abstract class AppDatabase extends RoomDatabase {

    public abstract UserDao userDao();

    public abstract TaskDao taskDao();
}