package com.spring.mvc.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.spring.mvc.entities.FileUpload;


@Controller
public class FileUploadController {


	@GetMapping("/file-form")
	public String complexFormSubmission(){
		return "fileUpload";
	}
	
	//CommonsMultipartFile => use to handle files.
	@PostMapping("/upload-file")
	public String complexFormSubmission(@RequestParam("file") CommonsMultipartFile cmf, HttpServletRequest req, Model m){

	    try {
	    	String p = req.getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"uploads"+File.separator+cmf.getOriginalFilename();
			byte[] size = cmf.getBytes();
			FileOutputStream fos = new FileOutputStream(p);
			fos.write(size);
			fos.close();
			System.out.println(p);
			m.addAttribute("success","uploded..............");
			m.addAttribute("name",cmf.getOriginalFilename());
	    } catch (Exception e) {
			e.printStackTrace();
			m.addAttribute("error","error in uploading....");
		}
		





		return "showFileView";
	}
}
