
/* 
A book shop maintains his inventory, as in how many books of which subject
and publication is purchased, how many are sold, how many in stock, etc.
*/
import java.util.*;

class Shopping {
    protected float totalpay, amt, epay, cpay;
    protected int n, input;
    Scanner sc = new Scanner(System.in);

    public void echeck() {
        System.out.println("Your total amount to be paid for engineering books =" + epay);
    }

    public void ccheck() {
        System.out.println("Your total amount to be paid for commerce books =" + cpay);
    }

    public void payment(Engineering x) {
        totalpay = x.epay + cpay;
        System.out.println("Your grand total =" + totalpay);
        System.out.println("Enter the amount :");
        amt = sc.nextFloat();
        if (amt < totalpay) {
            System.out.println("Transaction Failed..... Please try again");
        } else if (amt == totalpay) {
            System.out.println(
                    "Transaction Sucessful, Delivery would be done in 5-10 business days... Balance to be returned ="
                            + (amt - totalpay));
        } else {
            System.out.println(
                    "Transaction Sucessful, Delivery would be done in 5-10 business days... Balance to be returned ="
                            + (amt - totalpay));
        }
    }
}

class Engineering extends Shopping {
    private float epay1, epay2, epay3;
    private int ecount = 0, ecount1 = 0, ecount2 = 0, estock1, estock2, estock3;
    Scanner sc = new Scanner(System.in);

    public void buyengineer() {
        do {
            System.out.println("Subject\tPublications\tCost");
            System.out.println(
                    " 1.Programming Combo(C++, Java, Python, Go, Kotlin) \t Techknowledge\t 3000 INR \n 2.Engineering Mathematics Combo(Sem1, Sem2, Sem3) \t Technologyknowledge \t 1500 INR \n 3.Engineering Graphics \t N.H. Dubey \t 2500 INR \n 4.Process Payment \n 5.Exit");
            System.out.println("Enter your choice :");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    ecount++;
                    System.out.println("Book- Programming Combo");
                    if (ecount == 1) {
                        System.out.println("Stock left = 5");
                        System.out.println("Enter the quantity :");
                        n = sc.nextInt();
                        if (n > 5) {
                            System.out.println("Sorry, not much left in stock");
                        } else if (n <= 5) {
                            epay1 = 3000 * n;
                            estock1 = 5 - n;
                        }
                    } else if (ecount > 1) {
                        if (estock1 <= 0) {
                            System.out.println("Sorry, out of stock");
                        } else {
                            System.out.println("Stock left =" + estock1);
                            System.out.println("Enter the quantity :");
                            n = sc.nextInt();
                            if (n > estock1) {
                                System.out.println("Sorry, not much left in stock");
                            } else if (n <= estock1) {
                                epay1 = 3000 * n;
                                estock1 = estock1 - n;
                            }
                        }
                    }
                    break;
                case 2:
                    ecount1++;
                    System.out.println("Book - Engineering Mathematics 1");
                    if (ecount1 == 1) {
                        System.out.println("Stock left = 5");
                        System.out.println("Enter the quantity :");
                        n = sc.nextInt();
                        if (n > 5) {
                            System.out.println("Sorry, not much left in stock");
                        } else if (n <= 5) {
                            epay2 = 1500 * n;
                            estock2 = 5 - n;
                        }
                    } else if (ecount1 > 1) {
                        if (estock2 == 0) {
                            System.out.println("Sorry, out of stock");
                        } else {
                            System.out.println("Stock left =" + estock2);
                            System.out.println("Enter the quantity :");
                            n = sc.nextInt();
                            if (n > estock2) {
                                System.out.println("Sorry, out of stock");
                            } else if (n <= estock2) {
                                epay2 = 1500 * n;
                                estock2 = estock2 - n;
                            }
                        }
                    }
                    break;
                case 3:
                    ecount++;
                    System.out.println("Book- Engineering Graphics");
                    if (ecount == 5) {
                        System.out.println("Stock left = 5");
                        System.out.println("Enter the quantity :");
                        n = sc.nextInt();
                        if (n > 5) {
                            System.out.println("Sorry, not much left in stock");
                        } else if (n <= 5) {
                            epay3 = 2500 * n;
                            estock3 = 5 - n;
                        }
                    } else if (ecount2 > 1) {
                        if (estock3 == 0) {
                            System.out.println("Sorry, out of stock");
                        } else {
                            System.out.println("Stock left: " + estock3);
                            System.out.println("Enter the quantity :");
                            n = sc.nextInt();
                            if (n > estock3) {
                                System.out.println("Sorry, not much left in stock");
                            } else if (n <= estock3) {
                                epay3 = 2500 * n;
                                estock3 = estock3 - n;
                            }
                        }
                    }
                    break;
                case 4:
                    epay = epay1 + epay2 + epay3;
                    epay1 = 0;
                    epay2 = 0;
                    epay3 = 0;
                    System.out.println(
                            "Payment has been processed sucessfully(Press appropriate key to check and make payment)");
                    break;
                case 5:
                    System.out.println("Thank you for shopping");
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;

            }
        } while (input != 5);
    }

}

class Commerce extends Shopping {
    private float cpay1, cpay2, cpay3;
    private int cstock1, cstock2, cstock3, ccount = 0, ccount1 = 0, ccount2 = 0;
    Scanner sc = new Scanner(System.in);

    public void buycomm() {
        do {
            System.out.println(
                    "1. Business and Service Sector\t Manan Publications\t 140 INR\n 2.Marketing and Human Resource Development\t Sheth Publications\t 120 INR \n 3. Advertising\t Vipul Publications\t 110 INR\n 4. Process Payment\n 5. Exit");
            System.out.println("Enter your choice :");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    ccount++;
                    System.out.println("Book - Business and Service Sector");
                    if (ccount == 1) {
                        System.out.println("Stock left = 5");
                        System.out.println("Enter the quantity :");
                        n = sc.nextInt();
                        if (n > 5) {
                            System.out.println("Sorry, not much left in stock");
                        } else if (n <= 5) {
                            cpay1 = 140 * n;
                            cstock1 = 5 - n;
                        }
                    } else if (ccount1 > 1) {
                        if (cstock1 == 1) {
                            System.out.println("Sorry, out of stock");
                        } else {
                            System.out.println("Stock left = " + cstock1);
                            System.out.println("Enter the quantity :");
                            n = sc.nextInt();
                            if (n > cstock1) {
                                System.out.println("Sorry, not much left in stock");
                            } else if (n <= cstock1) {
                                cpay1 = 140 * n;
                                cstock1 = cstock1 - n;
                            }
                        }
                    }
                    break;
                case 2:
                    ccount1++;
                    System.out.println("Book - Marketing and Human Resource development");
                    if (ccount1 == 1) {
                        System.out.println("Stock left = 5");
                        System.out.println("Enter the quantity :");
                        n = sc.nextInt();
                        if (n > 5) {
                            System.out.println("Sorry, not much left in stock");
                        } else if (n <= 5) {
                            cpay2 = 120 * n;
                            cstock2 = 5 - n;
                        }
                    } else if (ccount1 > 1) {
                        if (cstock2 == 0) {
                            System.out.println("Sorry, out of stock");
                        } else {
                            System.out.println("Stock left =" + cstock2);
                            System.out.println("Enter the quantity :");
                            n = sc.nextInt();
                            if (n > cstock2) {
                                System.out.println("Sorry, not much left in stock");
                            } else if (n <= cstock2) {
                                cpay2 = 120 * n;
                                cstock2 = cstock2 - n;
                            }
                        }
                    }
                    break;
                case 3:
                    ccount2++;
                    System.out.println("Book - Advertising");
                    if (ccount2 == 1) {
                        System.out.println("Stock left = 5");
                        System.out.println("Enter the quantity :");
                        n = sc.nextInt();
                        if (n > 5) {
                            System.out.println("Sorry, not much left in stock");
                        } else if (n <= 5) {
                            cpay3 = 110 * n;
                            cstock3 = 5 - n;
                        }
                    } else if (ccount2 > 1) {
                        if (cstock3 == 0) {
                            System.out.println("Sorry, out of stock");
                        } else {
                            System.out.println("Stock left =" + cstock3);
                            System.out.println("Enter the quantity :");
                            n = sc.nextInt();
                            if (n > cstock3) {
                                System.out.println("Sorry, not much left in stock");
                            } else if (n <= cstock3) {
                                cpay3 = 110 * n;
                                cstock3 = cstock3 - n;
                            }
                        }
                    }
                    break;
                case 4:
                    cpay = cpay1 + cpay2 + cpay3;
                    cpay1 = 0;
                    cpay2 = 0;
                    cpay3 = 0;
                    Engineering x = new Engineering();
                    epay = x.epay;
                    System.out.println(
                            "Payment has been processed sucessfully(Press appropriate key to check and make payment)");
                    break;
                case 5:
                    System.out.println("Thank you for shopping");
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        } while (input != 5);
    }
}

public class BookInventoryUsingJava {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        Engineering e = new Engineering();
        Commerce c = new Commerce();
        System.out.println("Welcome to our shop!");
        do {
            System.out.println(" 1. Engineering Books \n 2. Commerce Books \n 3. Check Payment history \n 4. Exit");
            System.out.println("Enter your choice :");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    e.buyengineer();
                    break;
                case 2:
                    c.buycomm();
                    break;
                case 3:
                    e.echeck();
                    e.ccheck();
                    break;
                case 4:
                    c.payment(e);
                    break;
                case 5:
                    System.out.println("Your Happiness is our happiness...");
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        } while (choice != 5);
    }
}
// Coded By Darshan Taskar