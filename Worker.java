class Worker {     private String name;     protected double salaryRate;     public Worker(String name, double salaryRate) {         this.name = name;         this.salaryRate = salaryRate; 
    } 
    public double computePay(int hours) {         return hours * salaryRate; 
    } 
} 
class DailyWorker extends Worker {     public DailyWorker(String name, double salaryRate) {         super(name, salaryRate); 
    } 
    public double computePay(int hours) { 
        if (hours >= 8) {             return 800.0;         } else if (hours >= 4) {             return 400.0;         } else {             return 0.0; 
        } 
    } 
} 
class SalariedWorker extends Worker { 
    public SalariedWorker(String name, double salaryRate) {         super(name, salaryRate); 
    } 
    @Override     public double computePay(int hours) { 
        if (hours >= 40) {             return hours * salaryRate;         } else if (hours >= 7) {             return 4000.0;         } else if (hours >= 4) {             return 2000.0; 
        } else {             return 0.0; 
        } 
    } 
} 
class WorkerTest {     public static void main(String[] args) { 
        Worker dailyWorker = new DailyWorker("Rushil", 100.0); 
        Worker salariedWorker = new SalariedWorker("Rahul", 500.0); int dailyHoursWorked = 8;         int salariedHoursWorked = 34;         double dailyPay = dailyWorker.computePay(dailyHoursWorked); 
        double salariedPay = salariedWorker.computePay(salariedHoursWorked); 
 
        System.out.println("Daily Worker Pay: Rs." + dailyPay); 
        System.out.println("Salaried Worker Pay: Rs." + salariedPay); 
    } 
} 
