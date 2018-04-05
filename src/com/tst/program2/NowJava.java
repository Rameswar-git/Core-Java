package com.tst.program2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NowJava {

	public static void main(String[] args) {
		
		List<Staff> staff=Arrays.asList(new Staff("Rameswar",20),
				new Staff("Hari",20),
				new Staff("Shyam",20),
				new Staff("Sundar",20));
			

		List<StaffPublic> result=staff.stream().map(temp->{
					StaffPublic obj = new StaffPublic();
		            obj.setName(temp.getName());
		            obj.setAge(temp.getAge());
		            return obj;
		}).filter(x->"S".startsWith(x.getName())).collect(Collectors.toList());
		
		System.out.println(result);
		
	}

}

//.collect(Collectors.toList());






///filter(x->"S".startsWith(x.getName()))
