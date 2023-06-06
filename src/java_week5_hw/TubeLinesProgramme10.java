package java_week5_hw;

import java.util.*;

/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class TubeLinesProgramme10 {

    public static void main(String[] args) {
        HashMap < String, Set<String>> lines = new HashMap<>();

        // Add Zone 1 stations and their respective lines

        Set<String> bakerlooLine = new HashSet<>();
        bakerlooLine.add("Oxford Circus");
        bakerlooLine.add("Piccadilly Circus");
        bakerlooLine.add("Charing Cross");
        lines.put("Bakerloo Line", bakerlooLine);

        Set<String> centralLine = new HashSet<>();
        centralLine.add("Oxford Circus");
        centralLine.add("Holborn");
        centralLine.add("Tottenham court Road");
        lines.put("Central Line", centralLine);

        Set<String> victoriaLine = new HashSet<>();
        victoriaLine.add("Oxford Circus");
        victoriaLine.add("Green Park");
        victoriaLine.add("Victoria");
        lines.put("victoria Line", victoriaLine);

        // Get station input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the zone 1 station name: ");
        String station = scanner.nextLine();

        // Query the lines passing through the station
        System.out.println("Line passing through " + station + ":");
        for(Map.Entry<String, Set<String>> entry : lines.entrySet()){
            String line = entry.getKey();
            Set<String> stations = entry.getValue();
            if( stations.contains(stations)){
                System.out.println(line);
            }
        }



    }

}
