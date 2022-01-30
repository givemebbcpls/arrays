class ArraysMain {
    public static void main(String[] args) {
        int sizeArray = TypeIn.typeinArraySize();
        int limitNum = TypeIn.typeinNumLimit();
        int choiceNum;
        ArraysAction arraysAction;
        
        if (limitNum == 0) arraysAction = new ArraysAction(sizeArray);
        else arraysAction = new ArraysAction(sizeArray, limitNum);
        arraysAction.representArray();

        arraysAction.welcomeMenu();
        choiceNum = TypeIn.typeinChoice();
        arraysAction.perfChoice(choiceNum);
    }
}