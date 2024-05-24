package secondaryref;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ap = new ClassPathXmlApplicationContext("secondaryref/Spring.xml");
		info bean = (info) ap.getBean("s");
		List mylist = bean.getMylist();

		for (Object list : mylist) {
			System.out.println(list);
		}

		Set myset = bean.getMyset();

		for (Object set : myset) {
			System.out.println(set);
		}
		Map mymap = bean.getMymap();

		Set keySet = mymap.keySet();
		for (Object key : keySet) {
			System.out.println(mymap.get(key));
		}
	}

}
