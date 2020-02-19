package com.notes.repository;

import java.util.HashMap;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.notes.models.Note;
@Repository
public class NotesRepository {

	HashMap<UUID, Note> persistenceLayer = new HashMap<UUID, Note>();

	public UUID addNote(Note note) {
		UUID id = UUID.randomUUID();
		persistenceLayer.put(id, note);
		return id;

	}
	
	public UUID addNotewithUUID(UUID id, Note note) {
		persistenceLayer.put(id,note);
		return id;
	}

	public boolean removeNote(UUID id) {
		if (persistenceLayer.containsKey(id)) {
			persistenceLayer.remove(id);
			return true;
		} else {
			return false;
		}
	}
	public Optional<Note> getNote(UUID id) {
		if(persistenceLayer.containsKey(id)) {
			Note note = persistenceLayer.get(id);
			return Optional.of(note);
		}else {
			return Optional.empty();
		}
	}
}
