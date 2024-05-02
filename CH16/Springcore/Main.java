package CH16.Springcore;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Main {
	@Bean
	public Employee em1()
	{
		Employee em1=new Employee(461,"saketh");
		return em1;
	}
	@Bean
	public Office of1()
	{
		Office  o=new Office();
		o.setOname("tinku");
		o.setEmp(em1());
		o.setOid(461);
		List<String> l=new ArrayList<String>();
		l.add("HTMl");
		l.add("CSS");
		o.setProjects(l);
		Map<Integer, String> m=new LinkedHashMap<Integer, String>();
		m.put(101, "Sai");
		m.put(102, "bunny");
		o.setPdate(m);
		return o;
	}

}
