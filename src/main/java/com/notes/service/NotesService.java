package com.notes.service;

import java.util.UUID;

import com.notes.models.Note;

public interface NotesService {
	
	public UUID createNote(Note note);
	
	public Note readNote(UUID id);
	
	public Note updateNote(UUID id, Note note);
	
	public boolean deleteNote(UUID id);
	
	

}
