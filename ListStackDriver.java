// ListStackDriver.java
// Starter file for the Stack portion of the Data Structures assignment.
// DO NOT change the class name or the signature of main().
// Implement ONLY the method for your assigned task (e.g., runS4_ReverseWord).

public class ListStackDriver {

    public static void main(String[] args) {
        // TODO: Uncomment EXACTLY ONE of the following lines,
        // then implement that method below.

        runS1_BrowserBackButton();
        runS2_TextEditorUndo();
        //runS3_BalancedParentheses();
        runS4_ReverseWord();
        //runS5_DirectoryNavigation();
        runS6_CalculatorHistory();
        runS7_PalindromeChecker();
        //runS8_FunctionCallStack();
        //runS9_StackOfPlates();
    }

    // S1 – Browser Back Button
    private static void runS1_BrowserBackButton() {
        // TODO: Implement task S1 here.
        System.out.println("----------S1----------");
        ListStack<String> pageURLs = new ListStack<>();

        //Pushing pages i have visted into pageURLs
        System.out.println("Page URL History: ");
        pageURLs.push("https://www.google.com");
        System.out.println(pageURLs.peek());
        pageURLs.push("https://www.youtube.com/");
        System.out.println(pageURLs.peek());
        pageURLs.push("https://www.typingclub.com/");
        System.out.println(pageURLs.peek());
        pageURLs.push("https://www.google.com/maps");
        System.out.println(pageURLs.peek());

        //Showing the changes done to the list when you press the "Back" button
        System.out.println("Current page: " + pageURLs.peek());
        System.out.println("Pressed \"Back\" so we must pop: " + pageURLs.peek());
        pageURLs.pop();
        System.out.println("Current page is now: " + pageURLs.peek());
        System.out.println("Pressed \"Back\" again so we must pop: " + pageURLs.peek());
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
        textDocument.push("Hello Ruby!");
        System.out.print(textDocument.peek() + " ");
        textDocument.push("How are you?");
        System.out.print(textDocument.peek() + " ");
        textDocument.push("Are you okay?");
        System.out.println(textDocument.peek());

        //Popping to undo a change done to the text document
        System.out.println("Popping \"" + textDocument.peek() + "\" to undo a change");
        textDocument.pop();
    }

    // S3 – Checking Balanced Parentheses
    private static void runS3_BalancedParentheses() {
        // TODO: Implement task S3 here.
        System.out.println("----------S3----------");
        ListStack<Character> balancedParentheses = new ListStack<>();
        balancedParentheses.push('a');
        balancedParentheses.push('*');
        balancedParentheses.push('(');
        balancedParentheses.push('b');
        balancedParentheses.push('+');
        balancedParentheses.push('c');
        balancedParentheses.push(')');


        System.out.println(balancedParentheses);
    }

    // S4 – Reversing a Word Using a Stack
    private static void runS4_ReverseWord() {
        // TODO: Implement task S4 here.
        System.out.println("----------S4----------");
        ListStack<Character> wordChars = new ListStack<>();

        //Pushing all characters of the word "magic" individually
        wordChars.push('m');
        wordChars.push('a');
        wordChars.push('g');
        wordChars.push('i');
        wordChars.push('c');

        System.out.print("The reversed word of magic is: ");

        //Popping all characters in the list to get a reversed word
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
        System.out.println("Popping \"" + calculatorHistory.peek() + "\" to undo the last operation");
        calculatorHistory.pop();
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

    }

    // S9 – Stack of Plates (Capacity-Limited Stack)
    private static void runS9_StackOfPlates() {
        System.out.println("----------S9----------");
        // TODO: Implement task S9 here.
        ListStack<Integer> plates = new ListStack<>();
        int capacty = 5;
        if(plates.size() < capacty) {

        }



    }
}
