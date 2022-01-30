class ArraysAction {
    private int[] initializedArray;

    ArraysAction(int sizeArray) {
        defaultInit(sizeArray);
    }

    ArraysAction(int sizeArray, int limitNum) {
        init(sizeArray, limitNum);
    }

    int[] getArray() {
        return initializedArray;
    }

    //It initialize our array with size in paramener by random int's sequence, but with constructors' limits
    void init(int sizeArray, int limitNum) {
        initializedArray = new int[sizeArray];
        for (int i = 0; i < initializedArray.length; i++) {
            switch ((int)Math.round(Math.random() * 1)) {
                case 0:
                    initializedArray[i] = (int) (Math.random() * limitNum);      
                    break;
                case 1:
                    initializedArray[i] = (int) (Math.random() * -limitNum);
                    break;

            }
        }
    }

    //It initialize our array with size in parameter by random int's sequence
    void defaultInit(int size) {
        initializedArray = new int[size];
        for (int i = 0; i < initializedArray.length; i++) {
            switch ((int)Math.round(Math.random() * 1)) {
                case 0:
                    initializedArray[i] = (int) (Math.random() * Integer.MAX_VALUE);      
                    break;
                case 1:
                    initializedArray[i] = (int) (Math.random() * Integer.MIN_VALUE);
                    break;

            }
        }
    }

    void welcomeMenu() {
        System.out.println("\nThere is the list with methods that could be used: \n");
        System.out.println("1. Sum of numbers that at even index.");
        System.out.println("2. To change negatives numbers to zero in the array.");
        System.out.print("\nPlease, enter the number of method that you want to use: ");
    }

    void perfChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("The sum of numbers at even indexes: " + sumEvenIndex(initializedArray));
                break;
            case 2:
                int[] performedArray = negativeToZero(initializedArray);
                System.out.print("Changed array is: ");

                for (int printNum : performedArray) System.out.print(printNum + " ");
                System.out.println();
                break;
        }
    }

    int sumEvenIndex(int[] targetArray) {
        int sum = 0;
        for (int i = 0; i < targetArray.length; i += 2) sum += targetArray[i];
        return sum;
    }

    int[] negativeToZero(int[] targetArray) {
        int[] performedArray = new int[targetArray.length];
        for (int i = 0; i < targetArray.length; i++) {
            if (targetArray[i] < 0) performedArray[i] = 0;
            else performedArray[i] = targetArray[i];
        }
        return performedArray;
    }

    

    void representArray() {
        for (int num : initializedArray) System.out.print(num + " ");
        System.out.println();
    }
}