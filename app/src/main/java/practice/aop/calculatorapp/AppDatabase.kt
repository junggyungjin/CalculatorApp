package practice.aop.calculatorapp

import androidx.room.Database
import androidx.room.RoomDatabase
import practice.aop.calculatorapp.dao.HistoryDao
import practice.aop.calculatorapp.model.History

@Database(entities = [History::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun historyDao(): HistoryDao
}