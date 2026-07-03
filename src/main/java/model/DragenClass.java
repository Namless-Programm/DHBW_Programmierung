package model;

import java.util.Objects;

public class DragenClass {
		
	private final String name;
	private final DragonType type;
	private int age;
	public DragenClass(String name, DragonType type, int age) {
		super();
		this.name = name;
		this.type = type;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DragenClass other = (DragenClass) obj;
		return age == other.age && Objects.equals(name, other.name) && type == other.type;
	}
	@Override
	public String toString() {
		return "DragenClass [name=" + name + ", type=" + type + ", age=" + age + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public DragonType getType() {
		return type;
	}
}
