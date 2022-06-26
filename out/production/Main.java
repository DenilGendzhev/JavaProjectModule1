import java.util.Scanner;

public class Main {

    public static void option1All(){
        System.out.println("Light bulb-halogen LED E27 of 3W,45 mm neutral light| Expiry date: n/a | Entry date: 05.05.2022" +
                "| Manufacturer: Kave Home | Unit: Item | Stock: 104 |Position: A3 / 5 / 2 | Available items at shelf: 500");
        System.out.println("Light bulb-halogen LED E27 of 6W,120 mm warm light| Expiry date: n/a | Entry date: 07.05.2022"+
                "| Manufacturer: Kave Home | Unit: Item | Stock: 99 |Position: A3 / 5 / 1 | Available items at shelf: 50");
        System.out.println();
        System.out.println("PCB-Single Layer PCB| Expiry date: n/a | Entry date: 03.03.2022"+
                "| Manufacturer: PCBWay | Unit: Item | Stock: 200 |Position: A1 / 5 / 1 | Available items at shelf: 150");
        System.out.println("PCb-Multi-Layer PCB| Expiry date: n/a | Entry date: 07.03.2022"+
                "| Manufacturer: PCBWay | Unit: Item | Stock: 30 |Position: A1 / 4 / 10 | Available items at shelf: 15");
        System.out.println();
        System.out.println("Battery AAA | Expiry date: 10.10.2029 | Entry date: 15.04.2022 " +
                "| Manufacturer: Duracell | Unit: Item | Stock: 600 | Position: A2 / 6 / 1 | Available items at shelf: 5000");
        System.out.println("Battery AA | Expiry date: 1.10.2029 | Entry date: 17.04.2022 " +
                "| Manufacturer: Toshiba | Unit: Item | Stock: 601 | Position: A2 / 6 / 2 | Available items at shelf: 7000");
    }

    public static void option1Batteries() {
        System.out.println("Battery AAA | Expiry date: 10.10.2029 | Entry date: 15.04.2022 " +
                "| Manufacturer: Duracell | Unit: Item | Stock: 600 | Position: A2 / 6 / 1 | Available items at shelf: 5000");
        System.out.println("Battery AA | Expiry date: 1.10.2029 | Entry date: 17.04.2022 " +
                "| Manufacturer: Toshiba | Unit: Item | Stock: 601 | Position: A2 / 6 / 2 | Available items at shelf: 7000");
    }
    public static void option1PCBs() {
        System.out.println("PCB-Single Layer PCB| Expiry date: n/a | Entry date: 03.03.2022"+
                "Manufacturer: PCBWay | Unit: Item | Stock: 200 |Position: A1 / 5 / 1 | Available items at shelf: 150");
        System.out.println("PCb-Multi-Layer PCB| Expiry date: n/a | Entry date: 07.03.2022"+
                "Manufacturer: PCBWay | Unit: Item | Stock: 30 |Position: A1 / 4 / 10 | Available items at shelf: 15");
    }
    public static void option1Bulbs() {
        System.out.println("Light bulb-halogen LED E27 of 3W,45 mm neutral light| Expiry date: n/a | Entry date: 05.05.2022" +
                "| Manufacturer: Kave Home | Unit: Item | Stock: 104 |Position: A3 / 5 / 2 | Available items at shelf: 500");
        System.out.println("Light bulb-halogen LED E27 of 6W,120 mm warm light| Expiry date: n/a | Entry date: 07.05.2022"+
                " | Manufacturer: Kave Home | Unit: Item | Stock: 99 |Position: A3 / 5 / 1 | Available items at shelf: 50");

    }

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please choose what to do (1 - List items; 2 - Add new delivery; 3 - List deliveries for time period)");
        int userInput= scan.nextInt();
        if(userInput==1){
            System.out.println("1 List Light bulbs: 2 List PCBs : 3 List Batteries : 4 List all");
            int secondQuestion=scan.nextInt();
            if (secondQuestion==1){
                option1Bulbs();
            }
            else if (secondQuestion==2) {
                option1PCBs();
            }
            else if (secondQuestion==3) {
                option1Batteries();
            } else if (secondQuestion==4) {
                option1All();
            }
        }
        else if(userInput==3){
            System.out.println("Enter a date: ");
            String date=scan.next();
            switch (date) {
                case "05.05.2022":
                    System.out.println("Light bulb-halogen LED E27 of 3W,45 mm neutral light| Expiry date: n/a | Entry date: 05.05.2022" +
                            "| Manufacturer: Kave Home | Unit: Item | Stock: 104 |Position: A3 / 5 / 2 | Available items at shelf: 500");
                case "07.05.2022":
                    System.out.println("Light bulb-halogen LED E27 of 6W,120 mm warm light| Expiry date: n/a | Entry date: 07.05.2022"+
                            "| Manufacturer: Kave Home | Unit: Item | Stock: 99 |Position: A3 / 5 / 1 | Available items at shelf: 50");
                case "03.03.2022":
                    System.out.println("PCB-Single Layer PCB| Expiry date: n/a | Entry date: 03.03.2022"+
                    "| Manufacturer: PCBWay | Unit: Item | Stock: 200 |Position: A1 / 5 / 1 | Available items at shelf: 150");
                case "07.03.2022":
                    System.out.println("PCb-Multi-Layer PCB| Expiry date: n/a | Entry date: 07.03.2022"+
                            "| Manufacturer: PCBWay | Unit: Item | Stock: 30 |Position: A1 / 4 / 10 | Available items at shelf: 15");
                case "15.04.2022":
                    System.out.println("Battery AAA | Expiry date: 10.10.2029 | Entry date: 15.04.2022 " +
                            "| Manufacturer: Duracell | Unit: Item | Stock: 600 | Position: A2 / 6 / 1 | Available items at shelf: 5000");
                case "17.04.2022":
                    System.out.println("Battery AA | Expiry date: 1.10.2029 | Entry date: 17.04.2022 " +
                            "| Manufacturer: Toshiba | Unit: Item | Stock: 601 | Position: A2 / 6 / 2 | Available items at shelf: 7000");
                default:
                    System.out.println("No deliveries during that day");
            }
        }
    }
}
//Light bulb - LED 75W | Expiry date: n/a | Entry date: 05.05.2021 | Manufacturer: Philips |
// Unit: Item | Stock: 104 |
// Position: A3 / 4 / 10 | Available items at shelf: 500 |