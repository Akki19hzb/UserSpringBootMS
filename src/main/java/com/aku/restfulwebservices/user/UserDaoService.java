package com.aku.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	private static Integer userCount =3;
 
	static {
		users.add(new User(1, "Ram", new Date()));
		users.add(new User(2, "Laxman", new Date()));
		users.add(new User(3, "Sita", new Date()));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user) {
		System.out.println(user);
		if(user.getId()==null) {
			user.setId(++userCount);
		}
		users.add(user);
		
		return user;
	}
	
	public User findOne(int id) {
		for(User user : users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}
	
	public User deleteById(int id) {
		Iterator<User> itr = users.iterator();
		while (itr.hasNext()) {
			User user = itr.next();
			if (user.getId() == id) {
				itr.remove();
				return user;
			}
		}
		return null;
	}
}
