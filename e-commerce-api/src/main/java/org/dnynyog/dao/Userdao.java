package org.dnynyog.dao;

import org.dnynyog.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userdao extends JpaRepository<Users, Integer>{
	public Users findByFirstName(String firstName);
	public Users findByPassword(String password);
	public Users findByLoginName(String loginName);

}
