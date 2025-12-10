// ListStackDriver.java
// Starter file for the Stack portion of the Data Structures assignment.
// DO NOT change the class name or the signature of main().
// Implement ONLY the method for your assigned task (e.g., runS4_ReverseWord).

import java.util.Scanner;

public class ListStackDriver {

    public static void main(String[] args) {
        // TODO: Uncomment EXACTLY ONE of the following lines,
        // then implement that method below.

        runS1_BrowserBackButton();
        runS2_TextEditorUndo();
        runS3_BalancedParentheses();
        runS4_ReverseWord();
        runS5_DirectoryNavigation();
        runS6_CalculatorHistory();
        runS7_PalindromeChecker();
        runS8_FunctionCallStack();
        runS9_StackOfPlates();
    }

    // S1 – Browser Back Button
    private static void runS1_BrowserBackButton() {
        // TODO: Implement task S1 here.
        System.out.println("----------S1----------");
        ListStack<String> pageURLs = new ListStack<>();

        //Push visited pages into pageURLs
        System.out.println("Page URL History: ");
        pageURLs.push("https://www.google.com");
        System.out.println(pageURLs.peek());
        pageURLs.push("https://www.youtube.com/");
        System.out.println(pageURLs.peek());
        pageURLs.push("https://www.typingclub.com/");
        System.out.println(pageURLs.peek());
        pageURLs.push("https://www.google.com/maps");
        System.out.println(pageURLs.peek());

        //Show that list changes when you press the "Back" button
        System.out.println("Current page: " + pageURLs.peek());
        System.out.println("Pressed \"Back\"");
        pageURLs.pop();
        System.out.println("Current page is now: " + pageURLs.peek());
        System.out.println("Pressed \"Back\"");
        pageURLs.pop();
        System.out.println("Current page is now: " + pageURLs.peek());
    }

    // S2 – Undo in a Text Editor
    private static void runS2_TextEditorUndo() {
        System.out.println("----------S2----------");
        // TODO: Implement task S2 here.
        ListStack<String> textDocument = new ListStack<>();

        //Pushing all new words into the stack list
        System.out.print("Words in document: ");
        textDocument.push("My");
        System.out.print(textDocument.peek() + " ");
        textDocument.push("name");
        System.out.print(textDocument.peek() + " ");
        textDocument.push("is");
        System.out.print(textDocument.peek() + " ");
        textDocument.push("Ruby");
        System.out.println(textDocument.peek());

        //Popping to undo a change
        textDocument.pop();
        System.out.println("Popped to undo a change\nLast word in doc is: " + textDocument.peek());
    }

    // S3 – Checking Balanced Parentheses
    private static void runS3_BalancedParentheses() {
        // TODO: Implement task S3 here.
        System.out.println("----------S3----------");
        ListStack<Character> parentheses = new ListStack<>();
        String test = "(5*8)+3)";
        System.out.println(test);
        boolean balanced = true;
        String isBalanced;

        for(char c: test.toCharArray()) {
            if(c == '(') {
                parentheses.push(c);
            }
            else if( c == ')') {
                if(parentheses.isEmpty()) { //Checks if there is a pair for ')'
                    balanced = false; //If stack is empty, there is no pair for ')'
                    break;
                }
                parentheses.pop();
            }
        }

        if(!parentheses.isEmpty()){   //If stack is not empty, there are parenthesis(s) left in stack without a pair
            balanced = false; //Balance is false because there are still parentheses(s) in stack
        }
        //Adding a loop to handle the message
        if(balanced){
            isBalanced = "Balanced";
        }
        else{
            isBalanced = "Not Balanced";
        }
        System.out.println("Balanced expression? -> " + isBalanced);
    }

    // S4 – Reversing a Word Using a Stack
    private static void runS4_ReverseWord() {
        // TODO: Implement task S4 here.
        System.out.println("----------S4----------");
        ListStack<Character> wordChars = new ListStack<>();

        //Pushing all characters of "magic" into stack
        wordChars.push('m');
        wordChars.push('a');
        wordChars.push('g');
        wordChars.push('i');
        wordChars.push('c');

        System.out.print("The reversed word of magic is: ");

        //Popping all characters to get a reversed word
        while(!wordChars.isEmpty()) {
            Character letter = wordChars.pop();
            System.out.print(letter);
        }
        System.out.println();
    }

    // S5 – Directory Navigation (cd / cd ..)
    private static void runS5_DirectoryNavigation() {
        System.out.println("----------S5----------");
        // TODO: Implement task S5 here.
        ListStack<String> folderNames = new ListStack<>();

        //Test commands
       String[] commands = {"cd User", "cd OneDrive", "cd ..", "cd Downloads", "cd .."};

       //Looping through all test commands
       for(String command: commands) {
           System.out.println(command);
           if(command.equals("cd ..")){
               if(!folderNames.isEmpty()){ //Pop() as long as there are still folder names in stack
                   folderNames.pop();
                   System.out.println("Current folder is: " + folderNames.peek());
               }
           }
           else if(command.startsWith("cd ")){ //Push if command format is "cd folder"
               folderNames.push(command.substring(3)); //Get the folder name by using the substring function and add it to stack
               System.out.println("Current folder is: " + folderNames.peek());
           }
       }
    }

    // S6 – History of Calculator Operations
    private static void runS6_CalculatorHistory() {
        System.out.println("----------S6----------");
        // TODO: Implement task S6 here.
        ListStack<String> calculatorHistory = new ListStack<>();

        //Pushing all operations into the list
        System.out.print("Calculator history: ");
        calculatorHistory.push("5");
        System.out.print(calculatorHistory.peek());
        calculatorHistory.push("+");
        System.out.print(calculatorHistory.peek());
        calculatorHistory.push("3");
        System.out.print(calculatorHistory.peek());
        calculatorHistory.push("=");
        System.out.print(calculatorHistory.peek());
        calculatorHistory.push("8");
        System.out.println(calculatorHistory.peek());

        //Popping to undo the last operation
        calculatorHistory.pop();
        System.out.println("Popped last operation\nLast thing in calculator: " + calculatorHistory.peek());
    }

    // S7 – Palindrome Checker
    private static void runS7_PalindromeChecker() {
        System.out.println("----------S7----------");
        // TODO: Implement task S7 here.
        ListStack<Character> word = new ListStack<>();

        //Pushing all characters of "kayak" into the word list
        word.push('k');
        System.out.print(word.peek());
        word.push('a');
        System.out.print(word.peek());
        word.push('y');
        System.out.print(word.peek());
        word.push('a');
        System.out.print(word.peek());
        word.push('k');
        System.out.print(word.peek() + "\n");

        //Popping all characters to get the reversed word of "kayak"
        while (!word.isEmpty()) {
            System.out.print(word.pop());
        }
        System.out.println("\nThe word \"kayak\" is palindrome!");
    }

    // S8 – Function Call Stack Simulator
    private static void runS8_FunctionCallStack() {
        System.out.println("----------S8-----------");
        // TODO: Implement task S8 here.
        ListStack<String> functionNames = new ListStack<>();
        String[] tests = {"call stack", "call main", "return", "call PalindromeChecker", "return"};

        for(String test: tests) {
            System.out.println(test);
            if(test.startsWith("call ")) {
                functionNames.push(test.substring(5));

            }
            else if(test.equals("return")) {
                functionNames.pop();
            }
            System.out.println("Function at the top of stack: " + functionNames.peek());
        }
    }

    // S9 – Stack of Plates (Capacity-Limited Stack)
    private static void runS9_StackOfPlates() {
        System.out.println("----------S9----------");
        // TODO: Implement task S9 here.
        ListStack<String> plates = new ListStack<>();
        String[] tests = {"p1", "p2", "p3", "p4", "p5", "p6", "p7"};
        int capacty = 5;

        for(String test: tests) {
            if(plates.size() < capacty) {
                plates.push(test);
            }
            else if(plates.size() == capacty) {
                System.out.println("Cannot add more plates!");
                System.out.println("Last plate added was: " + plates.peek());
                break;
            }
        }
    }
}
