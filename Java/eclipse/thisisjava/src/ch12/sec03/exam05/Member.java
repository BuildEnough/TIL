package ch12.sec03.exam05;


import lombok.Data;
import lombok.NonNull;

@Data
public class Member {
	private final String id;
	@NonNull private String name;
	private int age;

}
