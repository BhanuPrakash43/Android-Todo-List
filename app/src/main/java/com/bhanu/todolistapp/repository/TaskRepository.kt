package com.bhanu.todolistapp.repository

import com.bhanu.todolistapp.database.Task
import com.bhanu.todolistapp.database.TaskAppDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class TaskRepository(taskAppDatabase: TaskAppDatabase) {

    private val taskDao = taskAppDatabase.taskDao()

    suspend fun addTask(title: String, body: String) {
        val task = Task(
            title = title,
            body = body
//            detail = detail    // new added
        )

        taskDao.addTask(task = task)
    }


    suspend fun getAllTasks(): List<Task> {
        var allTasks: List<Task>

        withContext(Dispatchers.IO) {
            allTasks = taskDao.getAllTask()
        }
        return allTasks
    }

    suspend fun deleteTask(id: Int) {
        withContext(Dispatchers.IO) {
            val task = taskDao.getTask(id = id)

            taskDao.deleteTask(task = task)
        }
    }
}