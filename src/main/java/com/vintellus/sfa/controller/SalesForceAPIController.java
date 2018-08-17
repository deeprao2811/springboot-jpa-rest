package com.vintellus.sfa.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vintellus.sfa.model.Meeting;
import com.vintellus.sfa.repository.MeetingRepository;

@RestController
@RequestMapping("/objects")
public class SalesForceAPIController {
	
	@Autowired
	MeetingRepository meetingRepository;
	
	// Get a Single Meeting
	@GetMapping("/meeting/{id}")
	public Meeting getMeetingById(@PathVariable(value = "id") Long meetingId) {
	    return meetingRepository.findById(meetingId).get();
	}
	
	// Get All Meetings
	@GetMapping("/meeting")
	public Iterable<Meeting> getAllMeetings() {
	    return meetingRepository.findAll();
	}
	
	// Create a new Meeting
	@PostMapping("/meeting")
	public Meeting createNote(@Valid @RequestBody Meeting meeting) {
	    return meetingRepository.save(meeting);
	}
	
	// Delete a Meeting
	@DeleteMapping("/meeting/{id}")
	public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long meetingId) {
	    Meeting meeting = meetingRepository.findById(meetingId).get();

	    meetingRepository.delete(meeting);

	    return ResponseEntity.ok().build();
	}

}
