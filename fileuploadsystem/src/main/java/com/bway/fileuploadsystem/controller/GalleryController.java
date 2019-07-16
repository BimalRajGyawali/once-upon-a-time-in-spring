package com.bway.fileuploadsystem.controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GalleryController {

	
	@RequestMapping(value = "/gallerycontroller", method = RequestMethod.GET)
	public String getGallery(Model model) {
		
		File dir = new File("/home/bimal/Documents/SpringSTS/fileuploadsystem/src/main/webapp/resources");

		String[] images = dir.list();

	    model.addAttribute("images", images);

		return "gallery";

	}

}
