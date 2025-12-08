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
        runLL4_TextEditorLines();
        runLL5_RecentlyContacted();
        runLL6_ShoppingListAddAfter();
        runLL7_BusRouteStops();
        runLL8_EventScheduleSorted();
        runLL9_BugTrackerRemoveById();
        runLL10_PlaylistShuffleCopy();
    }

    // LL1 – Music Playlist Manager
    private static void runLL1_Playlist() {
        // TODO: Implement task LL1 here.
        // See the assignment handout for the scenario description
        System.out.println("----------LL1----------");
        CSLinkedList<String> playlist = new CSLinkedList<>();
        System.out.print("The initial list of songs: ");
        playlist.add("Mine");
        playlist.add("What 2 do");
        playlist.add("Sweet Insomnia");
        playlist.add("So Beautiful");
        playlist.add("1 Shot");
        playlist.add("Flower");
        System.out.println(playlist);

        //Insert a song at the top (index 0)
        playlist.add(0,"Bath");
        System.out.println(playlist);

        //Remove a song from the middle
        playlist.remove(playlist.size() /2);
        System.out.println(playlist);


    }

    // LL2 – To-Do List with Priorities
    private static void runLL2_TodoList() {
        // TODO: Implement task LL2 here.
        System.out.println("----------LL2----------");
        CSLinkedList<String> todo = new CSLinkedList<>();

        //Adding regular tasks to the list
        todo.add("Clean living room");
        todo.add("Finish homework assignments");
        todo.add("Return library books");
        System.out.println(todo);

        //Adding urgent tasks to the list at index 0
        todo.add("Pay the bills");
        todo.add(0,"Fix the car");
        System.out.println(todo);

        //Removing completed tasks by index
        todo.remove(0);
        todo.remove(0);
        System.out.println(todo);

        /*You can also create a loop to remove the number of tasks completed,
        assuming that the tasks from list will be completed in order from urgent tasks to regular tasks.
        The loop below shows how this is possible.

        numCompletedTask
        int numCompletedTasks = 2;
        int count = 0;
        while(count < numCompletedTasks) {
            todo.remove(0);
            count++;
        }
        System.out.println(todo);
         */



    }

    // LL3 – Course Waitlist (No Duplicates)
    private static void runLL3_CourseWaitlist() {
        // TODO: Implement task LL3 here.
        System.out.println("----------LL3----------");

        CSLinkedList<String> waitlist = new CSLinkedList<>();

        //Initial list (before adding new names and duplicates)
        System.out.print("Students on the waitlist: ");
        waitlist.add("Ruby");
        waitlist.add("Mason");
        waitlist.add("Bryan");
        waitlist.add("Olivia");
        System.out.println(waitlist);

        //Adding new student names on the waitlist
        System.out.print("Updated list of students on the waitlist: ");
        waitlist.addIfAbsent("Mason");
        waitlist.addIfAbsent("Ruby");
        waitlist.addIfAbsent("Lyric");
        waitlist.addIfAbsent("Kevin");
        System.out.println(waitlist);

    }

    // LL4 – Text Editor Line Manager
    private static void runLL4_TextEditorLines() {
        // TODO: Implement task LL4 here.
        System.out.println("----------LL4----------");
        CSLinkedList<String> lines = new CSLinkedList<>();

        //Initial lines in list
        System.out.print("Initial list of lines: ");
        lines.add("private static void runLL4_TextEditorLines(){ ");
        lines.add("System.out.println();");
        lines.add("}");
        System.out.println(lines);

        //Insert a new line in the middle
        System.out.println("After inserting a new line in the middle:");
        lines.add(lines.size() / 2, "CSLinkedList<String> lines = new CSLinkedList<>();");
        //for loop to print each line and their line number
        for(String line : lines) {
            System.out.println(lines.indexOf(line) + 1 + " -> " + line);
        }

        //Remove a line
        System.out.println("After removing a line:");
        lines.remove(1);
        //for loop to print each line and their line number
        for(String line : lines) {
            System.out.println(lines.indexOf(line) + 1 + " -> " + line);
        }


    }

    // LL5 – Recently Contacted Friends (Move to Front)
    private static void runLL5_RecentlyContacted() {
        // TODO: Implement task LL5 here.
        // You may add a helper method moveToFront(E item) to CSLinkedList if needed.
        System.out.println("----------LL5----------");
        CSLinkedList<String> recentlyContacted = new CSLinkedList<>();

        //List of people in contacts
        recentlyContacted.add("Kevin");
        recentlyContacted.add("Gilberto");
        recentlyContacted.add("Alina");
        recentlyContacted.add("May");
        recentlyContacted.add("Jason");
        recentlyContacted.add("Blake");
        System.out.println(recentlyContacted);

        //Recently contacted people will have their names moved to the front of the list
        recentlyContacted.moveToFront("Gilberto");
        recentlyContacted.moveToFront("Jason");
        recentlyContacted.moveToFront("Blake");
        System.out.println(recentlyContacted);

    }

    // LL6 – Shopping List: Insert After Item
    private static void runLL6_ShoppingListAddAfter() {
        // TODO: Implement task LL6 here.
        // You may add a helper method addAfter(E target, E newItem) to CSLinkedList if needed.
        System.out.println("----------LL6----------");
        CSLinkedList<String> shoppingList = new CSLinkedList<>();

        //Initial shopping list
        System.out.print("Initial shopping list: ");
        shoppingList.add("Rice");
        shoppingList.add("Beef");
        shoppingList.add("Cereal");
        shoppingList.add("Coffee");
        shoppingList.add("Bread");
        System.out.println(shoppingList);

        //If target is in list, insert newItem to the list after target item
        System.out.print("Inserting new items if target items are in list: ");
        shoppingList.addAfter("Coffee", "Sugar");
        shoppingList.addAfter("Cereal", "Milk");
        System.out.println(shoppingList);


    }

    // LL7 – Bus Route Stops
    private static void runLL7_BusRouteStops() {
        // TODO: Implement task LL7 here.
        System.out.println("----------LL7----------");
        CSLinkedList<String> busStops = new CSLinkedList<>();

        //List of bus stops
        busStops.add("Sun Valley");
        busStops.add("Antelope Valley");
        busStops.add("Shadow Pines");
        System.out.println(busStops);

        //Add a stop in the middle of list
        busStops.add(busStops.size() / 2, "Golden Valley");
        System.out.println(busStops);

        //Remove a stop that is closed
        busStops.remove("Shadow Pines");
        System.out.println(busStops);

    }

    // LL8 – Event Schedule (Insert by Time)
    private static void runLL8_EventScheduleSorted() {
        // TODO: Implement task LL8 here.
        // You may add a helper method addInOrder(E item, Comparator<E> cmp) to CSLinkedList if needed.
        System.out.println("----------LL8----------");
        CSLinkedList<String> events = new CSLinkedList<>();
        Comparator<String> timeCompare = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) { //Takes the time (ex: 09:00) of two events and compares them
                String a = o1.substring(0, 5);
                String b = o2.substring(0, 5);
                return a.compareTo(b);
            }
        };

        //list of events sorted in order using the addInOrder() method
        events.addInOrder("09:00 Breakfast", timeCompare);
        events.addInOrder("13:00 Math 262", timeCompare);
        events.addInOrder("12:00 Lunch", timeCompare);
        events.addInOrder("19:00 Comp 282", timeCompare);
        events.addInOrder("11:30 Philosophy 230", timeCompare);
        events.addInOrder("18:00 Dinner", timeCompare);
        System.out.println("Event schedule sorted: " + events);
    }

    // LL9 – Bug Tracker List (Remove by ID)
    private static void runLL9_BugTrackerRemoveById() {
        // TODO: Implement task LL9 here.
        // You may add a helper method removeFirstOccurrence(E item) to CSLinkedList if needed.
        System.out.println("----------LL9----------");

        //List of IDs with some duplicates
        CSLinkedList<String> bugtracker = new CSLinkedList<>();
        bugtracker.add("1257693"); // There are 2 IDs with the same number
        bugtracker.add("1154836");
        bugtracker.add("1257693");
        bugtracker.add("1586093"); // There are 3 IDs with the same number
        bugtracker.add("7304819");
        bugtracker.add("1586093");
        bugtracker.add("1586093");
        System.out.println("ID list: " + bugtracker);

        //Remove the first occurrence of different IDs
        bugtracker.removeFirstOccurrence("1586093");
        bugtracker.removeFirstOccurrence("1257693");
        System.out.println("Removing IDS: " + bugtracker);

    }

    // LL10 – Playlist Shuffle Copy
    private static void runLL10_PlaylistShuffleCopy() {
        // TODO: Implement task LL10 here.
        // You may add a helper method copy() to CSLinkedList if needed.
        System.out.println("----------LL10----------");
        CSLinkedList<String> playlist = new CSLinkedList<>();

        //Original playlist
        playlist.add("Dive");
        playlist.add("Flower");
        playlist.add("Un Village");
        playlist.add("Paper Hearts");
        System.out.println("playlist: " + playlist);

        //Copy of playlist
        CSLinkedList<String> playlistCopy = playlist.copy();
        System.out.println("Copy of playlist: " + playlistCopy);

        //Modifying the copy of playlist
        playlistCopy.add("Halo");
        playlistCopy.remove("Flower");
        System.out.println("Modifying copy of playlist: " + playlistCopy);


    }
}
