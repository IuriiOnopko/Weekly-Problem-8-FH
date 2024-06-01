package week07_part03;

import week07_part03.FHmapSC;
import week07_part03.utility.MillionSongDataSubset;
import week07_part03.utility.SongEntry;

import java.util.Scanner;

public class FindSong
{
    public static void main(String [] args)
    {
        // Parses the JSON input file.
        final String JSONFILE = "resources/example_json_input/msd_subset_short.json";
        MillionSongDataSubset msd = new MillionSongDataSubset(JSONFILE);

        // Retrieves the parsed objects.
        SongEntry[] allSongs = msd.getArrayOfSongs();

        // Displays the number of songs read from the input file.
        System.out.printf("Total number of songs read %d \n", allSongs.length);

        // Creates a hash table of SongEntry objects with the song title as key.
        FHmapSC<String, SongEntry> tableOfSongs = new FHmapSC<String, SongEntry>();

        // Iterates over "allSongs" and inserts each SongEntry object in the table by the song title.
        for (SongEntry songEntry : allSongs)
            tableOfSongs.insert(songEntry.getTitle(), songEntry);


        System.out.println("The number of elements in table " + tableOfSongs.getElementCount());

        // Prompts the user for a title to search for.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a title to search for. For example \"Blues Power\" or \"does not exist\":");
        String request = keyboard.nextLine();
        // Checks if the table contains the user's request as key
        boolean isFound = tableOfSongs.containsKey(request);
        // Displays a message based on whether the song is found.
        String message = isFound ? "found" : "not found";
        System.out.printf("Requested title \"%s\" is %s.\n", request,  message);

        request = keyboard.nextLine();
        // Checks if the table contains the user's request as key
        isFound = tableOfSongs.containsKey(request);
        // Displays a message based on whether the song is found.
        message = isFound ? "found" : "not found";
        System.out.printf("Requested title \"%s\" is %s.\n", request,  message);

        request = keyboard.nextLine();
        // Checks if the table contains the user's request as key
        isFound = tableOfSongs.containsKey(request);
        // Displays a message based on whether the song is found.
        message = isFound ? "found" : "not found";
        System.out.printf("Requested title \"%s\" is %s.\n", request,  message);
    }
}
