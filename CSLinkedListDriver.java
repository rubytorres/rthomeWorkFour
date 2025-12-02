// CSLinkedListDriver.java
// Starter file for the Linked List portion of the Data Structures assignment.
// DO NOT change the class name or the signature of main().
// Implement ONLY the method for your assigned task (e.g., runLL3_CourseWaitlist).

import java.util.Comparator;

public class CSLinkedListDriver {

    public static void main(String[] args) {
        // TODO: Uncomment EXACTLY ONE of the following lines,
        // then implement that method below.

        runLL1_Playlist();
        runLL2_TodoList();
        runLL3_CourseWaitlist();
        //runLL4_TextEditorLines();
        //runLL5_RecentlyContacted();
        //runLL6_ShoppingListAddAfter();
        //runLL7_BusRouteStops();
        //runLL8_EventScheduleSorted();
        //runLL9_BugTrackerRemoveById();
        //runLL10_PlaylistShuffleCopy();
    }

    // LL1 – Music Playlist Manager
    private static void runLL1_Playlist() {
        // TODO: Implement task LL1 here.
        // See the assignment handout for the scenario description.
        System.out.println("----------LL1----------");
        CSLinkedList<String> playlist = new CSLinkedList<>();
        System.out.print("List of songs in playlist: ");
        playlist.add("Mine");
        playlist.add("What 2 do");
        playlist.add("Sweet Insomnia");
        playlist.add("So Beautiful");
        playlist.add("1 Shot");
        playlist.add("Flower");
        System.out.println(playlist);

        //Inserting a song at the top (index 0)
        System.out.print("Adding a new song to the top: ");
        playlist.add(0,"Bath");
        System.out.println(playlist);

        //Removing a song from the middle
        System.out.print("Removing a song from the middle: ");
        playlist.remove(playlist.size() /2);
        System.out.println(playlist + "\n");


    }

    // LL2 – To-Do List with Priorities
    private static void runLL2_TodoList() {
        // TODO: Implement task LL2 here.
        System.out.println("----------LL2----------");
        CSLinkedList<String> todo = new CSLinkedList<>();

        //Adding regular tasks to the list
        System.out.print("Adding regular tasks: ");
        todo.add("Cleam living room");
        todo.add("Finish homework assignments");
        todo.add("Return library books");
        System.out.println(todo);

        //Adding urgent tasks to the list at index 0
        System.out.print("Adding urgent tasks: ");
        todo.add(0,"Pay the bills");
        todo.add(0,"Fix the car");
        System.out.println(todo);

        //Removing completed tasks by index
        System.out.print("Removing completed tasks:");

        int numTasksCompleted = 3;
        int count = 0;
        while(count < numTasksCompleted) {
            todo.remove(0);
            count++;
        }
        System.out.println(todo + "\n");




    }

    // LL3 – Course Waitlist (No Duplicates)
    private static void runLL3_CourseWaitlist() {
        // TODO: Implement task LL3 here.
        System.out.println("----------LL3----------");

        CSLinkedList<String> waitlist = new CSLinkedList<>();

        System.out.print("Names of students on waitlist: ");
        String[] students = {"Ruby", "Michelle", "Ruby", "Mason", "Lyric", "Brian", "Lyric"};
        for(String name : students){
            waitlist.addIfAbsent(name);
        }
        System.out.println(waitlist);



    }

    // LL4 – Text Editor Line Manager
    private static void runLL4_TextEditorLines() {
        // TODO: Implement task LL4 here.
    }

    // LL5 – Recently Contacted Friends (Move to Front)
    private static void runLL5_RecentlyContacted() {
        // TODO: Implement task LL5 here.
        // You may add a helper method moveToFront(E item) to CSLinkedList if needed.
    }

    // LL6 – Shopping List: Insert After Item
    private static void runLL6_ShoppingListAddAfter() {
        // TODO: Implement task LL6 here.
        // You may add a helper method addAfter(E target, E newItem) to CSLinkedList if needed.
    }

    // LL7 – Bus Route Stops
    private static void runLL7_BusRouteStops() {
        // TODO: Implement task LL7 here.
    }

    // LL8 – Event Schedule (Insert by Time)
    private static void runLL8_EventScheduleSorted() {
        // TODO: Implement task LL8 here.
        // You may add a helper method addInOrder(E item, Comparator<E> cmp) to CSLinkedList if needed.
    }

    // LL9 – Bug Tracker List (Remove by ID)
    private static void runLL9_BugTrackerRemoveById() {
        // TODO: Implement task LL9 here.
        // You may add a helper method removeFirstOccurrence(E item) to CSLinkedList if needed.
    }

    // LL10 – Playlist Shuffle Copy
    private static void runLL10_PlaylistShuffleCopy() {
        // TODO: Implement task LL10 here.
        // You may add a helper method copy() to CSLinkedList if needed.
    }
}
