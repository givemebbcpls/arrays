import java.io.IOException;

class TypeIn {
    static int typeinArraySize() {
        int sizeArray = 0;
        while(sizeArray == 0) {
            System.out.print("Type the length of array (should be greater than 0): ");
            sizeArray = getUserNum();
        }
        return sizeArray;
    }

    static int typeinNumLimit() {
        int limitNum = 0;
        System.out.print("Type number limits of array (should be greater than 0). If there is no number or 0, the default will be created with limits of Integer MAX value: ");
        limitNum = getUserNum();
        return limitNum;
    }

    static int typeinChoice() {
        int choiceNum = 0;
        while (choiceNum < 1 | choiceNum > 2) choiceNum = getUserNum();
        return choiceNum;
    }

    static int getUserNum() {
        StringBuilder typedNumber = new StringBuilder();
        int userNum = 0;
        notIntLabel: do {
            char inChar = 0;
            try {
                inChar = (char) System.in.read();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            while (inChar != 13) {
                if (inChar >= '0' & inChar <= '9') typedNumber.append(inChar);
                else {
                    try {
                        while (System.in.read() != 10);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    System.out.println("Wrong number. Please, retype.");
                    continue notIntLabel;
                }
                try {
                    inChar = (char) System.in.read();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

            userNum = Integer.parseInt(new String(typedNumber));
            try {
                System.in.read();
            } catch(IOException ex) {
                ex.printStackTrace();
            }
        } while (userNum < 0);

        return userNum;
    }
}