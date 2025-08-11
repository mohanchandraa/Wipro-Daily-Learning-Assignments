class Marks {
    void countMarks() { 
        System.out.println("Marks are counted");
     }
}

class Result {
    void resultOutcome() { 
        System.out.println("Results are published");
    }
}

public class SingleResponseP {
    public static void main(String[] args) {
        Marks m = new Marks();
        m.countMarks();

        Result r = new Result();
        r.resultOutcome();
    }
}