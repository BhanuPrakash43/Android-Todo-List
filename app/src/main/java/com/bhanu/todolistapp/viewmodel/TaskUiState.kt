package com.bhanu.todolistapp.viewmodel

import com.bhanu.todolistapp.database.Task

data class TaskUiState(
    val tasks: List<Task>? = null,
    val errorMessage: String? = null,
    val taskToBeDeleted: Task? = null,
)
