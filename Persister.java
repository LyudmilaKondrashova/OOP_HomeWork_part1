public class Persister extends User {

	public Persister(String name) {
		super(name);
	}

	public void save(Persister persister){
		System.out.println("Save user: " + persister.getName());
	}
}