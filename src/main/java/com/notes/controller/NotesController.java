package com.notes.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.notes.models.Note;
import com.notes.service.NotesService;

@Controller
@RequestMapping("note")
public class NotesController {
	
	@Autowired
	private NotesService notesService;

	@RequestMapping(value ="/create",  method = RequestMethod.POST )
	public ResponseEntity<UUID> createNote(@RequestBody Note note){
		UUID generatedUuid = notesService.createNote(note);
		return ResponseEntity.ok(generatedUuid);
		
	}
	
	@RequestMapping(value ="/readAll", method = RequestMethod.GET )
	public ResponseEntity<Note[]> readAllNotes(){
		
		return ResponseEntity.ok(notesService.getAllNotes());
		
	} 
	
	
	//read
	
	//readAll
	
	//update
	
	//delete
	
	
	
}
