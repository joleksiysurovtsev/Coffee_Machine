package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private static int earnings = 550;
    private static int mlOfWater = 400;
    private static int mlOfMilk = 540;
    private static int gramsOfCoffeeBeans = 120;
    private static int disposableCups = 9;

    /**
     * To make an espresso coffee machine, you need 250 ml of water and 16 g of coffee beans. It costs $ 4.
     */
    private static boolean canMakeEspresso ( int mlOfWater , int gramsOfCoffeeBeans , int disposableCups ) {
        double waterCanCup = mlOfWater / 250;
        double coffeeCanCup = gramsOfCoffeeBeans / 16;
        if (disposableCups <= 0) {
            System.out.println( "Sorry, not enough disposable cups!" );
            return false;
        } else {
            if (waterCanCup < 1) {
                System.out.println( "Sorry, not enough water!" );
                return false;
            } else {
                if (coffeeCanCup < 1) {
                    System.out.println( "Sorry, not enough coffee beans!" );
                    return false;
                } else {
                    System.out.println( "I have enough resources, making you a coffee!" );
                }
            }
        }
        return true;
    }

    /**
     * To make a latte, the coffee maker needs 350 ml of water, 75 ml of milk and 20 g of coffee beans. It costs $ 7.
     */
    private static boolean canMakeLatte ( int mlOfWater , int mlOfMilk , int gramsOfCoffeeBeans , int disposableCups ) {
        int waterCanCup = mlOfWater / 350;
        int milkCanCup = mlOfMilk / 75;
        int coffeeCanCup = gramsOfCoffeeBeans / 20;

        if (disposableCups <= 0) {
            System.out.println( "Sorry, not enough disposable cups!" );
            return false;
        } else {
            if (waterCanCup < 1) {
                System.out.println( "Sorry, not enough water!" );
                return false;
            } else {
                if (coffeeCanCup < 1) {
                    System.out.println( "Sorry, not enough coffee beans!" );
                    return false;
                } else {
                    if (milkCanCup < 1) {
                        System.out.println( "Sorry, not enough milk!" );
                        return false;
                    } else {
                        System.out.println( "I have enough resources, making you a coffee!" );
                    }
                }
            }
        }
        return true;
    }


    /**
     * To make a cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk and 12 g of coffee. It costs $ 6.
     */
    private static boolean canMakeCappuccino ( int mlOfWater , int mlOfMilk , int gramsOfCoffeeBeans , int disposableCups ) {
        int waterCanCup = mlOfWater / 200;
        int milkCanCup = mlOfMilk / 100;
        int coffeeCanCup = gramsOfCoffeeBeans / 12;

        if (disposableCups <= 0) {
            System.out.println( "Sorry, not enough disposable cups!" );
            return false;
        } else {
            if (waterCanCup < 1) {
                System.out.println( "Sorry, not enough water!" );
                return false;
            } else {
                if (coffeeCanCup < 1) {
                    System.out.println( "Sorry, not enough coffee beans!" );
                    return false;
                } else {
                    if (milkCanCup < 1) {
                        System.out.println( "Sorry, not enough milk!" );
                        return false;
                    } else {
                        System.out.println( "I have enough resources, making you a coffee!" );
                    }
                }
            }
        }
        return true;
    }


    /**
     * check how many cups of coffee a coffee machine can make
     * проверка можно ли приготовить кофе
     */
    public static void yOrN ( int cupNum , int howMuchCup ) {
        if (cupNum == howMuchCup) {
            System.out.println( "Yes, I can make that amount of coffee" );
        } else {
            if (cupNum > howMuchCup) {
                System.out.println( "No, I can make only " + howMuchCup + " cup(s) of coffee" );
            } else {
                System.out.println( "Yes, I can make that amount of coffee (and even " + (howMuchCup - cupNum) + " more than that)" );
            }
        }
    }


    /**
     * fills the contents of the coffee machine
     */
    private static void fillTheCoffeeMachine ( int addMlOfWater , int addMlOfMilk , int addGramsOfCoffeeBeans , int addDisposableCups ) {
        mlOfWater += addMlOfWater;
        mlOfMilk += addMlOfMilk;
        gramsOfCoffeeBeans += addGramsOfCoffeeBeans;
        disposableCups += addDisposableCups;

    }


    /**
     * Prints coffee machine status
     */
    private static void coffeeMachineHas ( ) {
        System.out.println( "The coffee machine has:" );
        System.out.println( mlOfWater + " of water" );
        System.out.println( mlOfMilk + " of milk" );
        System.out.println( gramsOfCoffeeBeans + " of coffee beans" );
        System.out.println( disposableCups + " of disposable cups" );
        System.out.println( earnings + " of money" + '\n' );
    }


    /**
     * If the user writes “take,” the program should give him all the money that he earned from selling coffee.
     */
    private static void takeEarnings ( ) {
        System.out.println( "I gave you $" + earnings + '\n' );
        earnings = 0;

    }


    /**
     * Method of preparing a drink To make an espresso coffee machine,
     * you need 250 ml of water and 16 g of coffee beans. It costs $ 4.
     * To make a latte, the coffee maker needs 350 ml of water, 75 ml of milk and 20 g of coffee beans.
     * It costs $ 7. And to make a cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk and 12 g of coffee. It costs $ 6.
     */
    private static void makeBeverage ( String beverage ) {
        switch (beverage) {
            case "back":
                break;
            case "1":
                if (canMakeEspresso( mlOfWater , gramsOfCoffeeBeans , disposableCups )) {
                    mlOfWater -= 250;
                    gramsOfCoffeeBeans -= 16;
                    disposableCups--;
                    earnings += 4;
                }
                break;

            case "2":
                if (canMakeLatte( mlOfWater , mlOfMilk , gramsOfCoffeeBeans , disposableCups )) {
                    mlOfWater -= 350;
                    mlOfMilk -= 75;
                    gramsOfCoffeeBeans -= 20;
                    disposableCups--;
                    earnings += 7;

                }
                break;
            case "3":
                if (canMakeCappuccino( mlOfWater , mlOfMilk , gramsOfCoffeeBeans , disposableCups )) {
                    mlOfWater -= 200;
                    mlOfMilk -= 100;
                    gramsOfCoffeeBeans -= 12;
                    disposableCups--;
                    earnings += 6;

                }
                break;
        }
    }


    public static void main ( String[] args ) {
        Scanner sc = new Scanner( System.in );
        String back = "back";


        while (true) {
            System.out.println( "Write action (buy, fill, take, remaining, exit)" );
            String standardInput = sc.next( );
            if (standardInput.contains( "buy" )) {
            /* If the user writes “buy”, he must choose one of the three
            varieties of coffee that the coffee machine can prepare:
            espresso, latte or cappuccino.*/
                System.out.println( "What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino" );
                String beverage = sc.next( );
                makeBeverage( beverage );
                continue;
            }
            /*If the user writes "fill", the program should ask him
            how much water, milk, coffee and how many disposable cups
            he wants to add into the coffee machine.*/
            if (standardInput.contains( "fill" )) {
                System.out.println( '\n' + "Write how many ml of water do you want to add:" );
                int addMlOfWater = sc.nextInt( );

                System.out.println( "Write how many ml of milk do you want to add:" );
                int addMlOfMilk = sc.nextInt( );

                System.out.println( "Write how many grams of coffee beans do you want to add: " );
                int addGramsOfCoffeeBeans = sc.nextInt( );

                System.out.println( "Write how many disposable cups of coffee do you want to add: " );
                int addDisposableCups = sc.nextInt( );

                System.out.println( );
                fillTheCoffeeMachine( addMlOfWater , addMlOfMilk , addGramsOfCoffeeBeans , addDisposableCups );
                continue;
            }
            /* If you are another special worker and it is time to
            take the money from the coffee machine, input "take".*/
            if (standardInput.contains( "take" )) {
                takeEarnings( );
                continue;
            }
            if (standardInput.contains( "remaining" )) {
                coffeeMachineHas( );
            }
            if (standardInput.contains( "exit" )) {
                break;
            }
        }
    }
}

