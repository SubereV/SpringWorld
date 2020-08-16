package edu.fpt.spring.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ImageController {
	
	@RequestMapping("upload")
	public String uploadForm() {
		return "uploadForm";
	}
	
	@PostMapping("upload")
	public String upload(ModelMap model, @RequestParam("image") MultipartFile image) {
		if (image.isEmpty()) {
			model.addAttribute("message","Please Import Image");
		}
		Path path = Paths.get("images");
		try {
			Files.copy(image.getInputStream(), path.resolve(image.getOriginalFilename()),StandardCopyOption.REPLACE_EXISTING);
			model.addAttribute("image", image);
			return "success";
		} catch (Exception e) {
			model.addAttribute("message","Error: " + e.getMessage());
		}
		return "uploadForm";
	}
}
