package com.bhanu.todolistapp.viewmodel

data class DialogUiState(
    val showDialog: Boolean = false,
    val taskTitle: String = "",
//    val taskDetail: String = "", // added new task
    val taskBody: String = ""
)
