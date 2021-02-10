package io.zerod.note.services

import io.zerod.note.entity.Note
import retrofit2.Call
import retrofit2.http.GET

interface NoteService {
    @GET("/courses")
    fun listCourses(): Call<List<Note>>
}