import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void option1All() {
        try {
            FileReader fr = new FileReader("OldDeliveries.txt");
            int i;
            while ((i = fr.read()) != -1)
                System.out.print((char) i);
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void option1Cables() {
        try {
            String line7 = Files.readAllLines(Paths.get("OldDeliveries.txt")).get(7);
            String line8 = Files.readAllLines(Paths.get("OldDeliveries.txt")).get(8);
            System.out.println(line7);
            System.out.println(line8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void option1Batteries() {
        try {
            String line5 = Files.readAllLines(Paths.get("OldDeliveries.txt")).get(5);
            String line6 = Files.readAllLines(Paths.get("OldDeliveries.txt")).get(6);
            System.out.println(line5);
            System.out.println(line6);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void option1PCBs() {
        try {
            String line3 = Files.readAllLines(Paths.get("OldDeliveries.txt")).get(3);
            String line4 = Files.readAllLines(Paths.get("OldDeliveries.txt")).get(4);
            System.out.println(line3);
            System.out.println(line4);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void option1Bulbs() {
        try {
            String line0 = Files.readAllLines(Paths.get("OldDeliveries.txt")).get(0);
            String line1 = Files.readAllLines(Paths.get("OldDeliveries.txt")).get(1);
            String line2 = Files.readAllLines(Paths.get("OldDeliveries.txt")).get(2);
            System.out.println(line0);
            System.out.println(line1);
            System.out.println(line2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String option2ProductEntry() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.mm.yyyy");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter product name");
        String productName = scan.next();
        System.out.println("Enter expiry date");
        String expiryDate = scan.next();
        System.out.println("Enter entry date");
        String entryDate = scan.next();
        Date entryDDate;
        try {
            entryDDate = new SimpleDateFormat("dd.MM.yyyy").parse(entryDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Enter manufacturer");
        String manufacturer = scan.next();
        System.out.println("Enter unit");
        String unit = scan.next();
        System.out.println("Enter available stock");
        int stock = scan.nextInt();
        System.out.println("Enter position (XY/ZZ/WW format,X-block name,Y-block number;Z-row number;W-position on row)");
        String position= scan.next();
        int availableItems= scan.nextInt();
        System.out.println("Enter comment(optional)");
        String comment = scan.next();
        System.out.println("Product was added successfully!");
        String newProduct = "Product name: "+ productName + " | " + "Expiry date: " + expiryDate + " | " + "Entry date: " + entryDDate + " | " + "Manufacturer: " + manufacturer +  " | "
                + "Unit: " + unit + " | " + "Stock: " + stock + " | " + "Position:" + position+ " | " + "Available items at shelf:" + comment;
        System.out.println(newProduct);
        return newProduct;

    }
    public static void option3CheckForDeliveries() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter date: ");
        String date = scan.next();
        switch (date) {
            case "05.05.2022":
                System.out.println("Light bulb-halogen LED E27 of 3W,45 mm neutral light| Expiry date: n/a | Entry date: 05.05.2022" +
                        "| Manufacturer: Kave Home | Unit: Item | Stock: 104 |Position: A3 / 5 / 2 | Available items at shelf: 500");
                break;
            case "07.05.2022":
                System.out.println("Light bulb-halogen LED E27 of 6W,120 mm warm light| Expiry date: n/a | Entry date: 07.05.2022" +
                        "| Manufacturer: Kave Home | Unit: Item | Stock: 99 |Position: A3 / 5 / 1 | Available items at shelf: 50");
                break;
            case "03.03.2022":
                System.out.println("PCB-Single Layer PCB| Expiry date: n/a | Entry date: 03.03.2022" +
                        "| Manufacturer: PCBWay | Unit: Item | Stock: 200 |Position: A1 / 5 / 1 | Available items at shelf: 150");
                break;
            case "07.03.2022":
                System.out.println("PCb-Multi-Layer PCB| Expiry date: n/a | Entry date: 07.03.2022" +
                        "| Manufacturer: PCBWay | Unit: Item | Stock: 30 |Position: A1 / 4 / 10 | Available items at shelf: 15");
                break;
            case "15.04.2022":
                System.out.println("Battery AAA | Expiry date: 10.10.2029 | Entry date: 15.04.2022 " +
                        "| Manufacturer: Duracell | Unit: Item | Stock: 600 | Position: A2 / 6 / 1 | Available items at shelf: 5000");
                break;
            case "17.04.2022":
                System.out.println("Battery AA | Expiry date: 1.10.2029 | Entry date: 17.04.2022 " +
                        "| Manufacturer: Toshiba | Unit: Item | Stock: 601 | Position: A2 / 6 / 2 | Available items at shelf: 7000");
                break;
            default:
                System.out.println("No deliveries during that day");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose what to do (1 - List items; 2 - Add new delivery; 3 - List deliveries for time period)");
        int userInput = scan.nextInt();
        if (userInput == 1) {       //a)
            System.out.println("1 List Light bulbs: 2 List PCBs : 3 List Batteries : 4 List cables : 5 List all");
            int secondQuestionOption1 = scan.nextInt();
            if (secondQuestionOption1 == 1) {
                option1Bulbs();
            } else if (secondQuestionOption1 == 2) {
                option1PCBs();
            } else if (secondQuestionOption1 == 3) {
                option1Batteries();
            } else if (secondQuestionOption1 == 4) {
                option1Cables();
            }else if (secondQuestionOption1 == 5) {
                option1All();
            }
        } else if (userInput == 2) {        //b)
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("NewDeliveries.txt"));
                writer.write(option2ProductEntry());
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Do you want to add more deliveries?");
            String answerOption2 = scan.next();
            if (answerOption2.equals("yes") || answerOption2.equals("Yes")) {
                while (true) {
                    try {
                        BufferedWriter wr = new BufferedWriter( new FileWriter("NewDeliveries.txt",true));
                        wr.write("\n");
                        wr.write(option2ProductEntry());
                        wr.close();
                        System.out.println("Do you want to add more deliveries?");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    answerOption2= scan.next();
                    if (answerOption2.equals("no")||answerOption2.equals("No")) {
                        break;
                    }
                }
            }
        }
        if (userInput == 3) {       //c)
            option3CheckForDeliveries();
        }
    }
}