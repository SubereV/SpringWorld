package edu.fpt.spring.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import edu.fpt.spring.model.Permission;

@Repository
public class PermissionList {

	List<Permission> permissions;

	public PermissionList() {

	}

	public PermissionList(List<Permission> permissions) {
		super();
		this.permissions = permissions;
	}

	public List<Permission> getPermissions() {
		List<Permission> permissions = new ArrayList<Permission>();
		permissions.add(new Permission("m", "member"));
		permissions.add(new Permission("g", "guest"));
		permissions.add(new Permission("a", "admin"));
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

}