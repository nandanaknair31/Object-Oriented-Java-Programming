class WrongAge extends Exception {
    public WrongAge(String message) {
        super(message);
    }
}

class Father {
    int fage;
    
    public Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Father's age cannot be negative");
        }
        fage = age;
    }
}

class Son extends Father {
    int sage;
    
    public Son(int fatherage, int sonage) throws WrongAge {
        super(fatherage); 
        if (sonage >= fatherage) {
            throw new WrongAge("Son's age cannot be greater than or equal to Father's age");
        }
        sage = sonage;
    }
}

class Family {
    public static void main(String args[]) {
        try {
            // First test case (valid)
            Father f = new Father(40);
            Son s = new Son(40, 20);
            System.out.println("Father's Age : " + f.fage + "\nSon's Age : " + s.sage);
            
           // Father f2 = new Father(-10); 
            Son s2 = new Son(40, 100);   // Will not be reached
        } catch (WrongAge e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
