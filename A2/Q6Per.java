package A2;

class M{
    public static void main(String[] args) {
        Persistence obj1 = new FilePersistence();
        obj1.persist();
        Persistence obj2 = new DatabasePersistence();
        obj2.persist();
    }
}
abstract class Persistence{
    abstract void persist();
}
class FilePersistence extends Persistence{
    @Override
    void persist() {
        System.out.println("File Persistence");
    }
}
class DatabasePersistence extends Persistence{
    @Override
    void persist() {
        System.out.println("Database Persistence");
    }
}

