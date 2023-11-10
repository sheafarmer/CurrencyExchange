import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Loop
        while (true) {

            //Information Converter

            System.out.println("Currency Converter");
            System.out.println(" ");
            System.out.println("Available; Euro, Dollar, Yen, Albanian Lek");
            System.out.println(" ");

            //Start Question

            Scanner input = new Scanner(System.in);
            System.out.println("Which Currency Would You Like To Convert?");
            String currency = input.nextLine();

            //Currencies Switch (Euro, Dollar, Yen, Lek)

            switch (currency) {

                //Euro Start

                case "Euro":
                    Scanner euro = new Scanner(System.in);
                    System.out.println("What Would You Like To Convert Euros To?");
                    String euros = euro.nextLine();

                    //Euro Switch And Different Exchange Rates

                    switch (euros) {

                        case "Dollar":
                            System.out.println("How Many Euro Would You Like To Convert To Dollar?");
                            Scanner euro_to_dollar = new Scanner(System.in);
                            System.out.print("€");
                            double euro_to_dollar_rate = euro_to_dollar.nextDouble();
                            System.out.println(" ");
                            System.out.println("$" + euro_to_dollar_rate * 1.07);
                            break;
                        case "Yen":
                            System.out.println("How Many Euro Would You Like To Convert To Yen");
                            System.out.println("Please Use Whole Values");
                            Scanner euro_to_yen = new Scanner(System.in);
                            System.out.print("€");
                            double euro_to_yen_rate = euro_to_yen.nextDouble();
                            System.out.println(" ");
                            System.out.println("¥" + euro_to_yen_rate * 160.90);
                            break;
                        default:
                            System.out.println("Please choose one of the currencies");

                            //currency exchange formula

                    }
                    break;

                    //Dollar Start

                case "Dollar":
                    Scanner dollar = new Scanner(System.in);
                    System.out.println("What would you like to convert Dollars to?");
                    String dollars = dollar.nextLine();

                    //Dollar Switch And Different Exchange Rates

                    switch (dollars) {
                        case "Euro":
                            System.out.println("How many dollar would you like to convert to euro");
                            System.out.println("Please Use Whole Values");
                            Scanner dollar_to_euro = new Scanner(System.in);
                            System.out.print("$");
                            double dollar_to_euro_rate = dollar_to_euro.nextDouble();
                            System.out.println(" ");
                            System.out.println("€" + dollar_to_euro_rate * 0.93);
                            break;
                        case "Yen":
                            System.out.println("How many yen would you like to convert to yen");
                            System.out.println("Please Use Whole Values");
                            Scanner dollar_to_yen = new Scanner(System.in);
                            System.out.print("$");
                            double dollar_to_yen_rate = dollar_to_yen.nextDouble();
                            System.out.println(" ");
                            System.out.println("¥" + dollar_to_yen_rate * 150.41);
                            break;
                        default:
                            System.out.println("Please choose one of the currencies");

                            //currency exchange formula
                    }
                    break;

                    //Yen Start

                case "Yen":
                    Scanner yen = new Scanner(System.in);
                    System.out.println("What would you like to convert Yen to?");
                    String yens = yen.nextLine();

                    //Yen Switch And Different Exchange Rates

                    switch (yens) {
                        case "Euro":
                            System.out.println("How many yen would you like to convert to euro");
                            System.out.println("Please Use Whole Values");
                            Scanner yen_to_euro = new Scanner(System.in);
                            System.out.print("¥");
                            double yen_to_euro_rate = yen_to_euro.nextDouble();
                            System.out.println(" ");
                            System.out.println("€" + yen_to_euro_rate * 0.0066);
                            break;
                        case "Dollar":
                            System.out.println("How many yen would you like to convert to dollar");
                            System.out.println("Please Use Whole Values");
                            Scanner yen_to_dollar = new Scanner(System.in);
                            System.out.print("¥");
                            double yen_to_dollar_rate = yen_to_dollar.nextDouble();
                            System.out.println(" ");
                            System.out.println("$" + yen_to_dollar_rate * 0.0062);
                            break;
                        default:
                            System.out.println("Please choose one of the currencies");
                    }
            }

        }
    }
}