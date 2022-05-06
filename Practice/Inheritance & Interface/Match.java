class Cricket {
    String name;
    int age;

    void SetData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void Display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Match extends Cricket {
    int NumberOfODI, NumberOfTest;

    void SetData(String name, int age, int odi, int test) {
        super.SetData(name, age);
        this.NumberOfODI = odi;
        this.NumberOfTest = test;
    }

    void Display() {
        super.Display();
        System.out.println("Number of ODI: " + NumberOfODI);
        System.out.println("Number of test: " + NumberOfTest);
    }

    public static void main(String[] args) {
        Match player[] = new Match[5];
        for (int i = 0; i < 5; i++) {
            player[i] = new Match();
        }

        // for (int i = 0; i < 5; i++) {
        // System.out.println("Set data for player " + i + 1);
        // player[i].SetData();
        // }

        for (int i = 0; i < 5; i++) {
            player[i].name = args[0 + (i * 4)];
            player[i].age = Integer.parseInt(args[1 + (i * 4)]);
            player[i].NumberOfODI = Integer.parseInt(args[2 + (i * 4)]);
            player[i].NumberOfTest = Integer.parseInt(args[3 + (i * 4)]);
            player[i].SetData(player[i].name, player[i].age, player[i].NumberOfODI, player[i].NumberOfTest);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Displaying details for player " + i + 1);
            player[i].Display();
        }
    }
}