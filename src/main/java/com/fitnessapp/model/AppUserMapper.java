package com.fitnessapp.model;

import org.springframework.stereotype.Component;

@Component
public class AppUserMapper {
//	public AppUser convertToAppUser(UserDetails user) {
//		
//		String username = user.getUsername();
//		String password = user.getPassword();
//		List<String> roles = user.getAuthorities().stream().map(grantedAuthority -> {
//			return grantedAuthority.getAuthority();
//		}).toList();
//		
//
//		AppUser appUser = new AppUser();
//		appUser.setUsername(username);
//		appUser.setPassword(password);
//		appUser.setRoles(roles);
//		
//		return appUser;
//	}
//	
//	public UserDetails convertToUserDetails(AppUser appUser) {
//		String username = appUser.getUsername();
//		String password = appUser.getPassword();
//		List<GrantedAuthority> authorities = appUser.getRoles().stream().map(role -> {
//			return new SimpleGrantedAuthority(role);
//		}).collect(Collectors.toList());
//		
//		UserDetails user = new User(username, password, authorities);
//		
//		return user;
//	}
}
