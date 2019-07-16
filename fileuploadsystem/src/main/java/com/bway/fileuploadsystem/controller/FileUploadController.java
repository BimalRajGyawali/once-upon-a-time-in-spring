package com.bway.fileuploadsystem.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {
	
	@RequestMapping(value = "/fileupload", method = RequestMethod.GET)
	public String getFileUploadForm()
	{
		
		return "upload";
	}
	
	
	@RequestMapping(value = "/fileupload", method = RequestMethod.POST)
	public String saveFile(@RequestParam("file") MultipartFile file , Model model ) throws IOException
	{
		 
		 FileOutputStream fileOutputStream = new FileOutputStream(
				 new File("/home/bimal/Documents/SpringSTS/fileuploadsystem/src/main/webapp/resources/"+file.getOriginalFilename()));
		
		
		 
		 fileOutputStream.write(file.getBytes());
		 
		 
		
		 

		 model.addAttribute("msg","File Uploaded Successfully");
		 
		 
	     fileOutputStream.close();	 
		 
		 return "upload";
	}
	

}
