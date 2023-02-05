public class Report implements Reportable {

    @Override
    public void reportUser(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}
