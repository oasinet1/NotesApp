package com.notes.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.notes.models.Note;
@Service
public interface NotesService {
	
	public UUID createNote(Note note);
	
	public Note readNote(UUID id);
	
	public Note updateNote(UUID id, Note note);
	
	public boolean deleteNote(UUID id);
	
	public Note[] getAllNotes();
	

}
