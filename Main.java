public class Main{
	public static void main(String[] args){
		Persister persister = new Persister("Bob");
		Report report = new Report();
		report.reportUser(persister);
		persister.save(persister);
	}
}