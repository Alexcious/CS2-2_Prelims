/**
 * AUTHORS: Abella, Jahn Crystan - 2224514
 * David, Joshua Daniel - 2222551
 * Decena, Alexcious Norlan -
 * Molintas, Jonison Martel -
 * Tarlit, Ariel Jr. - 2221621
 * SUBMITTED TO: Mrs. Ma. Concepcion Clemente
 * DATE: 2/2/2023
 **/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainMenu {
    private static List<rowData> rowDataList = new ArrayList<>();
    static Scanner kbd = new Scanner(System.in);

    public static void printIntroduction() {
        System.out.println("Activity 0 - Information Management");
        System.out.println("\033[3mA Java Program for Reading Data\033[0m\n"); // change niyo nalang hehe
        System.out.println("Press enter to continue... ");
        kbd.nextLine();
    }

    public static void printMenu() {
        System.out.println("[1] Print the data");
        System.out.println("[2] Sort Data");
        System.out.println("[3] Filter Data");
        System.out.println("[4] Exit the program\n");

        System.out.println("Input your choice: ");
        runMainMenu();

    }

    public static void runMainMenu() {
        int choiceMenu;
        choiceMenu = kbd.nextInt();

        do {
            switch (choiceMenu) {
                case 1:
                    printData();
                case 2:
                    printSortDataMenu();
                    sortDataAccordingToColumns();
                case 3: {
                    printFilterData();
                    filterDataAccordingtoColumns();
                }
                case 4: {
                    System.out.println("Thank you for using our program!!");
                    System.exit(1);
                }
            }
            break;
        } while (choiceMenu != 5);
    }

    // Case [1]
    private static void printData() {
        System.out.println(rowDataList.toString());
        System.out.println("Press enter to continue...");
        kbd.nextLine();
        kbd.nextLine();
        printMenu();
    }

    public static void printSortDataMenu() {
        System.out.println("SORTING OF DATA\n");
        System.out.println("[1] Sort according to date");
        System.out.println("[2] Sort string data");
        System.out.println("[3] Sort integers/double data");
        System.out.println("[4] Back to Main Menu\n");
        System.out.println("Input your choice: ");
    }

    private static void sortDataAccordingToColumns() {
        int choiceSortData = kbd.nextInt();

        switch (choiceSortData) {
            case 1:
                System.out.println("[1] Location");
                System.out.println("[2] Operational Area");
                int c = kbd.nextInt();
                List<rowData> sortedNames;
                switch (c) {
                    case 1:
                        sortedNames = rowDataList.stream()
                                .sorted(Comparator.comparing(rowData::getLocation))
                                .collect(Collectors.toList());
                        System.out.println(sortedNames);
                        printSortDataMenu();
                        sortDataAccordingToColumns();
                        break;
                    case 2:
                        sortedNames = rowDataList.stream()
                                .sorted(Comparator.comparing(rowData::getOperationalArea))
                                .collect(Collectors.toList());
                        System.out.println(sortedNames);
                        printSortDataMenu();
                        sortDataAccordingToColumns();
                        break;
                }

            case 2:
                break; // sort string data
            case 3:
                break; // sort integers/double data
            case 4:
                printMenu();

                break;
        }

    }

    public static void printFilterData() {
        System.out.println("FILTERING DATA");

        System.out.println("[1] Material");
        System.out.println("[2] Operational Area");
        System.out.println("[3] Ownership");
        System.out.println("[4] Back to Main Menu\n");
        System.out.println("Input your choice: ");
    }

    private static void filterDataAccordingtoColumns() {
        int c = 0;
        List<rowData> distinctV;
        List<rowData> result;
        c = kbd.nextInt();

        int choice = 0;
        switch (c) {
            case 1:
                distinctV = rowDataList.stream().filter(distinctByKey(rowData::getMaterial)).collect(Collectors.toList());
                do {
                    showMaterialChoices(distinctV);
                    switch (choice) {
                        case 1 -> {
                            result = rowDataList.stream().filter(s -> s.getMaterial().equals(distinctV.get(0).getMaterial())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 2 -> {
                            result = rowDataList.stream().filter(s -> s.getMaterial().equals(distinctV.get(1).getMaterial())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 3 -> {
                            result = rowDataList.stream().filter(s -> s.getMaterial().equals(distinctV.get(2).getMaterial())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 4 -> {
                            result = rowDataList.stream().filter(s -> s.getMaterial().equals(distinctV.get(3).getMaterial())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 5 -> {
                            result = rowDataList.stream().filter(s -> s.getMaterial().equals(distinctV.get(4).getMaterial())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 6 -> {
                            result = rowDataList.stream().filter(s -> s.getMaterial().equals(distinctV.get(5).getMaterial())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 7 -> {
                            result = rowDataList.stream().filter(s -> s.getMaterial().equals(distinctV.get(6).getMaterial())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 8 -> {
                            result = rowDataList.stream().filter(s -> s.getMaterial().equals(distinctV.get(7).getMaterial())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 9 -> {
                            result = rowDataList.stream().filter(s -> s.getMaterial().equals(distinctV.get(8).getMaterial())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 10 -> {
                            result = rowDataList.stream().filter(s -> s.getMaterial().equals(distinctV.get(9).getMaterial())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 11 -> {
                            result = rowDataList.stream().filter(s -> s.getMaterial().equals(distinctV.get(10).getMaterial())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 12 -> {
                            result = rowDataList.stream().filter(s -> s.getMaterial().equals(distinctV.get(11).getMaterial())).toList();
                            printHeaders();
                            System.out.println(result);
                        }

                        case 13 -> {
                            System.out.println("dog");
                        }
                        default -> {
                        }
                    }
                    System.out.print("\nInput your choice: "); // pang stop ng loop
                    choice = kbd.nextInt();
                } while (choice != distinctV.size() + 1);
                break;

            case 2:
                distinctV = rowDataList.stream().filter(distinctByKey(rowData::getOperationalArea)).collect(Collectors.toList());

                do {
                    showOAChoices(distinctV);
                    switch (choice) {
                        case 1 -> {
                            result = rowDataList.stream().filter(s -> s.getOperationalArea().equals(distinctV.get(0).getOperationalArea())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 2 -> {
                            result = rowDataList.stream().filter(s -> s.getOperationalArea().equals(distinctV.get(1).getOperationalArea())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 3 -> {
                            result = rowDataList.stream().filter(s -> s.getOperationalArea().equals(distinctV.get(2).getOperationalArea())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 4 -> {
                            result = rowDataList.stream().filter(s -> s.getOperationalArea().equals(distinctV.get(3).getOperationalArea())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 5 -> {
                            result = rowDataList.stream().filter(s -> s.getOperationalArea().equals(distinctV.get(4).getOperationalArea())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 6 -> {
                            result = rowDataList.stream().filter(s -> s.getOperationalArea().equals(distinctV.get(5).getOperationalArea())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 7 -> {
                            result = rowDataList.stream().filter(s -> s.getOperationalArea().equals(distinctV.get(6).getOperationalArea())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 8 -> {
                            result = rowDataList.stream().filter(s -> s.getOperationalArea().equals(distinctV.get(7).getOperationalArea())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 9 -> {
                            result = rowDataList.stream().filter(s -> s.getOperationalArea().equals(distinctV.get(8).getOperationalArea())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 10 -> {
                            result = rowDataList.stream().filter(s -> s.getOperationalArea().equals(distinctV.get(9).getOperationalArea())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 11 -> {
                            result = rowDataList.stream().filter(s -> s.getOperationalArea().equals(distinctV.get(10).getOperationalArea())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 12 -> {
                            result = rowDataList.stream().filter(s -> s.getOperationalArea().equals(distinctV.get(11).getOperationalArea())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 13 -> {
                            result = rowDataList.stream().filter(s -> s.getOperationalArea().equals(distinctV.get(12).getOperationalArea())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 14 -> {
                            result = rowDataList.stream().filter(s -> s.getOperationalArea().equals(distinctV.get(13).getOperationalArea())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 15 -> {
                            printMenu();
                            runMainMenu();
                        }
                        default -> {
                        }
                    }
                    System.out.print("\nInput your choice: "); // pang stop ng loop
                    choice = kbd.nextInt();

                } while (choice != distinctV.size() + 1);
                break;

            case 3:
                distinctV = rowDataList.stream().filter(distinctByKey(rowData::getOwner)).collect(Collectors.toList());
                do {
                    showOwnershipChoices(distinctV);
                    switch (choice) {
                        case 1 -> {
                            result = rowDataList.stream().filter(s -> s.getOwner().equals(distinctV.get(0).getOwner())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 2 -> {
                            result = rowDataList.stream().filter(s -> s.getOwner().equals(distinctV.get(1).getOwner())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 3 -> {
                            result = rowDataList.stream().filter(s -> s.getOwner().equals(distinctV.get(2).getOwner())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 4 -> {
                            result = rowDataList.stream().filter(s -> s.getOwner().equals(distinctV.get(3).getOwner())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 5 -> {
                            result = rowDataList.stream().filter(s -> s.getOwner().equals(distinctV.get(4).getOwner())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 6 -> {
                            result = rowDataList.stream().filter(s -> s.getOwner().equals(distinctV.get(5).getOwner())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 7 -> {
                            result = rowDataList.stream().filter(s -> s.getOwner().equals(distinctV.get(6).getOwner())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 8 -> {
                            result = rowDataList.stream().filter(s -> s.getOwner().equals(distinctV.get(7).getOwner())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 9 -> {
                            result = rowDataList.stream().filter(s -> s.getOwner().equals(distinctV.get(8).getOwner())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 10 -> {
                            result = rowDataList.stream().filter(s -> s.getOwner().equals(distinctV.get(9).getOwner())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 11 -> {
                            result = rowDataList.stream().filter(s -> s.getOwner().equals(distinctV.get(10).getOwner())).toList();
                            printHeaders();
                            System.out.println(result);
                        }
                        case 12 -> {
                            result = rowDataList.stream().filter(s -> s.getOwner().equals(distinctV.get(11).getOwner())).toList();
                            printHeaders();
                            System.out.println(result);
                        }

                        case 13 -> printMenu();

                    }

                    System.out.print("\nInput your choice: "); // pang stop ng loop
                    choice = kbd.nextInt();
                } while (choice != distinctV.size() + 1);
                break;
            case 4:
                printMenu();
        }
    }

    private static void showOAChoices(List<rowData> list) {
        System.out.println("\t List of Operational Areas");
        for (int i = 1; i <= list.size() + 1; i++) {
            if (i == list.size() + 1) {
                System.out.printf("[%d] " + "Go Back\n", i);
                continue;
            }
            System.out.printf("[%d] " + list.get(i - 1).getOperationalArea(), i);
            System.out.println();
        }
    }

    private static void showMaterialChoices(List<rowData> list) {
        System.out.println("\t List of Materials");
        for (int i = 1; i <= list.size() + 1; i++) {
            if (i == list.size() + 1) {
                System.out.printf("[%d] " + "Go Back\n", i);
                continue;
            }
            System.out.printf("[%d] " + list.get(i - 1).getMaterial(), i);
            System.out.println();
        }
    }

    private static void showOwnershipChoices(List<rowData> list) {
        System.out.println("\t List of Ownerships");
        for (int i = 1; i <= list.size() + 1; i++) {
            if (i == list.size() + 1) {
                System.out.printf("[%d] " + "Go Back\n", i);
                continue;
            }
            System.out.printf("[%d] " + list.get(i - 1).getOwner(), i);
            System.out.println();
        }
    }


    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }

    private static void printHeaders() {
        System.out.printf("%n%-15s%-15s%-15s%-50s%-10s%-10s%-10s%-10s%-15s%-10s%-10s%-30s%-20s%-15s%-10s%-15s%-20s%-20s%-20s%n",
                "Object ID", "Facility ID", "Legacy ID", "Location", "Depth US", "Depth DS", "Height", "Invert US", "Invert DS",
                "Diameter", "Width", "Modified Date", "Material", "Form", "pSlope", "Admin Area", "Shape Length",
                "Operational Area", "Owner");
    }

    private static void readDataSet() {
        String line = "";
        int temp = -1;
        int i = 1;
        try {
            BufferedReader br = new BufferedReader(new FileReader("stormwater-pipes_3.csv"));
            // Reading the file line by line and stopping when it reaches the 1000th line.
            while (((line = br.readLine()) != null) && i <= 1000) {
                String[] rowData = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                String columnHeader = "location";

                if (temp == -1) {
                    temp = findColumn(rowData, columnHeader);
                    continue;
                }

                rowDataList.add(new rowData(rowData[0], rowData[1], rowData[2], rowData[3],
                        rowData[4], rowData[5], rowData[6], rowData[7], rowData[8], rowData[9],
                        rowData[10], rowData[11], rowData[12], rowData[13], rowData[14], rowData[15],
                        rowData[16], rowData[17], rowData[18]));
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static int findColumn(String[] rowData, String cHeader) {
        int x = 0;
        for (int i = 1; i <= rowData.length; i++) {
            if (rowData[i].equals(cHeader)) {
                x = i;
                return x;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        readDataSet();
        printIntroduction();
        printMenu();
    }
}
