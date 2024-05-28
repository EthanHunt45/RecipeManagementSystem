package DesignPatternsProject.CommandPattern;

import java.util.ArrayList;

public class InstructionCommand implements Command{
    static ArrayList<String> createInstructions() {
        System.out.println("<---------------------- Add Instructions ---------------------->");
        System.out.println("Add instruction and type 'done' when you are finished.");

        ArrayList<String> instructions = new ArrayList<>();

        String instruction = "";
        while (!instruction.equals("done")) {
            instruction = System.console().readLine();
            if (instruction == "done") break;
            instructions.add(instruction);
        }


        return instructions;
    }
    @Override
    public void execute() {
        createInstructions();
    }
}
