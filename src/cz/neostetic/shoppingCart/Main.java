package cz.neostetic.shoppingCart;

public class Main {

    public static void main(String[] args) {

        int price = 0;
        if (args.length != 0) {
            for (String i : args) {
                switch (i) {
                    case "0":
                        System.out.println("Maslo");
                        price += 999;
                        break;
                    case "1":
                        System.out.println("Rohliky");
                        price += 5;
                        break;
                    case "2":
                        System.out.println("Pivo");
                        price += 12;
                        break;
                    case "3":
                        System.out.println("Cokolada");
                        price += 56;
                        break;
                    case "4":
                        System.out.println("Taska");
                        price += 23;
                        break;
                    case "5":
                        System.out.println("Taska 2");
                        price += 79;
                        break;
                    case "6":
                        System.out.println("Sunka");
                        price += 23;
                        break;
                    case "7":
                        System.out.println("Paprika");
                        price += 45;
                        break;
                    case "8":
                        System.out.println("Paprika 2");
                        price += 73;
                    case "9":
                        System.out.println("Chleba");
                        price += 100;
                        break;
                    default:
                        break;
                }
            }
            System.out.println("\n-------------------------\n"+price+" CZK");
        } else {
            System.out.println("0 = Maslo (999 CZK)");
            System.out.println("1 = Rohlik (5 CZK)");
            System.out.println("2 = Pivo (12 CZK)");
            System.out.println("3 = Cokolada (56 CZK)");
            System.out.println("4 = Taska (23 CZK)");
            System.out.println("5 = Taska 2 (79 CZK)");
            System.out.println("6 = Sunka (23 CZK)");
            System.out.println("7 = Paprika (45 CZK)");
            System.out.println("8 = Paprika 2 (73 CZK)");
            System.out.println("9 = Chleba (100 CZK)");
        }

    }

}
