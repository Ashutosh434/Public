package A2;


    public class Testing {
        public static final Persistence p = new DatabasePersistence();
        public static void main(String[] args) {
            p.persist();
        }
    }
