import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final Random RANDOM = new Random();
    public static int generateRandomNumber(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Min should be less than or equal to Max");
        }
        return RANDOM.nextInt((max - min) + 1) + min;
    }
    public static String generateRandomEmail() {
        String characters = "abcdefghijklmnopqrstuvwxyz0123456789";
        String[] domains = {"gmail.com", "yahoo.com", "hotmail.com", "example.com"};
        Random random = new Random();

        // Generate random username
        int usernameLength = random.nextInt(7) + 6; // Username length between 6 and 12 characters
        StringBuilder username = new StringBuilder(usernameLength);
        for (int i = 0; i < usernameLength; i++) {
            username.append(characters.charAt(random.nextInt(characters.length())));
        }

        // Select a random domain
        String domain = domains[random.nextInt(domains.length)];

        // Combine to form the email address
        return username.toString() + "@" + domain;
    }

    public static double generateRandomSalary() {
        Random random = new Random();
        return 5000 + (random.nextDouble() * (30000 - 5000));
    }



    public static void main(String[] args) {
        String[] WORKERS_FIRST_NAMES = {
                "James", "John", "Robert", "Michael", "William", "David", "Richard", "Joseph", "Thomas", "Charles",
                "Mary", "Patricia", "Jennifer", "Linda", "Elizabeth", "Barbara", "Meriam", "Jessica", "Sarah", "Karen"
        };


        String[] LAST_NAMES = {
                "Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", "Davis", "Rodriguez", "Martinez",
                "Hernandez", "Lopez", "Gonzalez","Smith","Johnson","Williams","Brown","Jones","Garcia","Miller"
        };
        String[] MANAGERS_NAMES = {
                "Paul Niksui","Martin Theron","Murali Gowda","Nima Roy","Iqbal Hussain","Manu Sharma","Wang Liu", "Wang Liu",
                "Amelia Zoe","Jaden Dough","Jasna Kaur","Nitin Joshi","Jyothi Reddy","Nicolus Den","Ali Baig","Sanvi Pandey",
                "Anuj Chettiar","Nitin Joshi"
                ,"Nicolus Den"
                ,"Ali Baig"
        };


        String[] FACTORIES_NAMES = {
                "Global Industries", "Advanced Technologies", "Modern Manufacturing", "Superior Solutions", "Dynamic Corporation", "Innovative Systems", "Prime Products", "Alpha Developments", "Pro Works", "Eco Developments"
        };

        String[] DEPARTMENTS_NAMES = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

        int min = 1;
        int max = 100;

        // Generate and print 10 random numbers between min and max


        Factory[] factories = new Factory[20];
        Worker[] workers = new Worker[20];
        Department[] departments = new Department[26];
        for(int i = 0; i < 20; i++){
            int registrationNumber = generateRandomNumber(min, max);
            String randomEmail = generateRandomEmail();
            Random s = new Random();
            int low = 60000;
            int high = 100000;
            int managerSalary =s.nextInt(high-low) + low;
            Random b = new Random();
            int l = 6000;
            int h = 10000;
            int bonus =b.nextInt(high-low) + low;
            GeneralManager gm = new GeneralManager(MANAGERS_NAMES[i], (i+1)*5-10, randomEmail,"General Managaer",managerSalary,bonus,1000, 9000000);
            for(int k=0;k<workers.length;k++){
                String rndEmail = generateRandomEmail();
                double workerSalary = generateRandomSalary();
                float floatValueSalary = (float) workerSalary;
                Worker worker = new Worker(WORKERS_FIRST_NAMES[k]+" "+ LAST_NAMES[k], 20+k, rndEmail, String.valueOf(k), floatValueSalary);
                workers[k] = worker;
            }
            //workers[i] = new Worker[WORKERS_FIRST_NAMES.length];
            for(int j = 0; j < 26; j++){
                high=80000;
                managerSalary =s.nextInt(high-low) + low;
                Manager m = new Manager(MANAGERS_NAMES[j%19], (j+1)*5-10, randomEmail,"Manager",managerSalary,bonus);
                Department d = new Department(DEPARTMENTS_NAMES[j], workers, m,  FactorySpeciality.findById(j%4));
                departments[j] = d;

            }
            Factory f = new Factory( registrationNumber, FACTORIES_NAMES[i%10], gm, departments);
            factories[i]=f;
        }

        for (int t = 0; t < 5; t++) {
            System.out.println(factories[t]);
            factories[t].printDepartmentsInfo();
            factories[t].averageSalaryReport();
        }

    }
}