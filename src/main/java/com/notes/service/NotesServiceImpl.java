package com.notes.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.notes.models.Note;
import com.notes.repository.NotesRepository;

public class NotesServiceImpl implements NotesService {

	@Autowired
	private NotesRepository notesRepository;

	@Override
	public UUID createNote(Note note) {
		UUID id = notesRepository.addNote(note);
		return id;
	}

	@Override
	public Note readNote(UUID id) {
		notesRepository.getNote(id);
		return null;
	}

	@Override
	public Note updateNote(UUID id, Note note) {
		if (notesRepository.getNote(id).isPresent()) {
			notesRepository.removeNote(id);
			notesRepository.addNotewithUUID(id, note);
			return note;
		} else {
			// throw new exception
			return null;
		}
	}

	@Override
	public boolean deleteNote(UUID id) {
		if (notesRepository.getNote(id).isPresent()) {
			notesRepository.removeNote(id);
			return true;
		} else {
			// throw new exception
			return false;
		}
	}

}
