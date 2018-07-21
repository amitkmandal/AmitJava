package com.info.string;

public class Interview {
	
	private String fullName;
	public String getName(String fullName, String email) {
		this.fullName = fullName;
		String[] name = fullName.split(" ");
		if(name.length >= 3) {
			return name[0]+name[1].charAt(0)+name[2].charAt(0)+"@"+email;
			
		}else
			
		return name[0]+name[1].charAt(0)+"@"+email;
	}
	public static void main(String[] args) {
		System.out.println(new Interview().getName("Amit kumar Mandal", "example.com"));
	}

}
