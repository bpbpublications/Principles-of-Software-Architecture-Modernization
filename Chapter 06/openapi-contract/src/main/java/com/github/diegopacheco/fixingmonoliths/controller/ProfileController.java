package com.github.diegopacheco.fixingmonoliths.controller;

import com.github.diegopacheco.fixingmonoliths.contract.v1.ProfileContract;
import com.github.diegopacheco.fixingmonoliths.contract.v1.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/service/profile")
public class ProfileController implements ProfileContract {

	private String pattern = "yyyy-MM-dd";
	private SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);

	@GetMapping("/user/{id}")
	@Override
	public User getUserById(@PathVariable UUID id) {
		// We are just echoing the User back from the UUID
		// This is just a sample, regular service would do validations(Service), and call database(DAO).
		return new User(id,dateFormat.format(new Date()),"default-"+id+"@company.io");
	}

	@Override
	@GetMapping("/user/batch/{ids}")
	@ResponseStatus(HttpStatus.OK)
	public List<User> getUserByIds(@PathVariable List<UUID> ids) {
		// We are just echoing the List<User> back from the UUIDs
		// This is just a sample, regular service would do validations(Service), and call database(DAO).
		List<User> result = ids.stream().map( (u)-> {
			String normalize = u.toString().replaceAll("-","_");
			return new User(u,dateFormat.format(new Date()),"default"+normalize+"@company.io");
		}).collect(Collectors.toList());
		return result;
	}
}

