package edu.fpt.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import edu.fpt.spring.model.Permission;
import edu.fpt.spring.model.PermissionList;
import edu.fpt.spring.model.User;

@Controller
@RequestMapping("user")
public class LoginController {

	@Autowired
	PermissionList permissions;

	@GetMapping
	public String loginForm() {
		return "user/login";
	}

	@PostMapping
	public String login(ModelMap model, User user) {
		model.addAttribute("user", user);
		return "user/detail";
	}

	@ModelAttribute("permissions")
	public List<Permission> getPermissions() {
		return permissions.getPermissions();
	}

}
