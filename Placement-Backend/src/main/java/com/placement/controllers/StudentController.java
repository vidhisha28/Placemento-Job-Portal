package com.placement.controllers;

import com.placement.dtos.JobApplyDTO;
import com.placement.dtos.Response;
import com.placement.dtos.StudentDTO;
import com.placement.dtos.StudentDetailsDTO;
import com.placement.entity.JobApplication;
import com.placement.entity.Student;
import com.placement.entity.Users;
import com.placement.services.JobApplyService;
import com.placement.services.StudentService;
import com.placement.services.UsersService;

import io.swagger.v3.oas.annotations.Operation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/students")
public class StudentController {

	@Autowired UsersService uservice;
	@Autowired StudentService sservice;
	@Autowired JobApplyService jservice;
	
	@PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	@Operation(summary = "Register new student")
	public ResponseEntity<?> save(@ModelAttribute StudentDTO dto) {
		Student std=StudentDTO.toEntity(dto);
		int cid=sservice.saveStudent(std, dto.getPhoto());
		Users user=new Users(dto.getEmail(),dto.getSname(),dto.getPwd(),cid,"Student",true);
		uservice.AddUser(user);
		return Response.success("Student Created Successfully");
	}
	
	@PutMapping(value="{id}",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<?> update(@PathVariable("id") int id,StudentDTO dto) {
		Student std=StudentDTO.toEntity(dto);
		Student existing=sservice.findById(id);
		std.setId(id);
		std.setPhoto(existing.getPhoto());
		sservice.updateStudent(std);
		return Response.success("Student updated successfully");
	}
	
	@GetMapping
	@Operation(summary = "List all students")
	public ResponseEntity<?> listAllStudents() {
		List<Student> result = sservice.findAll();
		return Response.success(result);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<?> findStudentById(@PathVariable("id") int id) {
		Student result = sservice.findById(id);
		return Response.success(result);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<?> DeleteStudentById(@PathVariable("id") int id) {
		sservice.deleteById(id);
		uservice.deleteUser(id);
		return Response.success("Student deleted successfully");
	}
	
	@PostMapping(value="upload",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<?> saveDetails(StudentDetailsDTO dto) {
		System.out.println(dto);
		sservice.updateDetails(dto);
		return Response.success("Student details updated Successfully");
	}
	
	@PostMapping("apply")
	public ResponseEntity<?> applyJob(@RequestBody JobApplyDTO dto) {
		jservice.saveApply(dto);
		return Response.success("Job applied Successfully");
	}
	
	@GetMapping("/applied/{sid}")
	public ResponseEntity<?> findApplicationsByStudentId(@PathVariable("sid") int sid) {
		List<JobApplication> result = jservice.listStudentApplications(sid);
		return Response.success(result);
	}
}
