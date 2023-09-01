package model;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	private int id;
	private String name;
	private Map<Answer, User> answer;
	
	public Question() {
		super();
	}

	public Question(int id, String name, Map<Answer, User> answer) {
		super();
		this.id = id;
		this.name = name;
		this.answer = answer;
	}
	
	void displayInfo()
	{
		System.out.println("Answer Id :"+id);
		System.out.println("Qustion Name"+name);
		System.out.println("Answer are");
		
		Set<Entry<Answer, User>> set = answer.entrySet();
		Iterator<Entry<Answer, User>> itr = set.iterator();
		
		while (itr.hasNext()) {
			Entry<Answer, User> entry = itr.next();
			Answer ans = entry.getKey();
			User user = entry.getValue();
			
			System.out.println("Answer Information : ");			
			System.out.println(ans);
			System.out.println("Posted By : ");
			System.out.println(user);
		}
	}
	
}
