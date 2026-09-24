public class TestDatabase {

    public static void main(String[] args) {

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("Driver MariaDB chargé !");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver MariaDB introuvable.");
        }
    }
}
