package onlineexamination.java;
import java.util.*;
public class project {
	
		// Online Examination Portal - Final Fixed Version with Password Fix
		
		    public static void main(String[] args) {
		        logA login = new logA();
		        reg register = new reg();
		        Scanner sc = new Scanner(System.in);

		        System.out.println("\nWelcome to Online Examination Portal !!");
		        System.out.println("\n1.Login\n2.SignUp");
		        System.out.println("\nEnter your option ");
		        int r = sc.nextInt();

		        if (r == 1) {
		            System.out.println("\nWelcome Back");
		            login.m1();
		        } else {
		            System.out.println("\nSignUp");
		            register.r1();
		        }
		    }
		}

		class reg {
		    Scanner sc = new Scanner(System.in);
		    menu mm = new menu();

		    void r1() {
		        System.out.println("\nEnter your Name:");
		        String name = sc.next();
		        System.out.println("Enter your Mail :");
		        String mail = sc.next();
		        System.out.println("Enter your Password :");
		        String pp = sc.next();

		        System.out.println("\nRegistration Successful !!");
		        System.out.println("\nLogin");

		        while (true) {
		            System.out.println("Enter your Mail");
		            String s = sc.next();
		            System.out.println("Enter your Password");
		            String p = sc.next();
		            if (s.equals(mail) && p.equals(pp)) {
		                mm.m2();
		                break;
		            } else {
		                System.out.println("You Entered Mail or Password are incorrect");
		            }
		        }
		    }
		}

		class logA {
		    Scanner sc = new Scanner(System.in);

		    public void m1() {
		        menu m = new menu();
		        String pswd = "1234";
		        System.out.println("Enter your Mail");
		        String s = sc.next();
		        while (true) {
		            System.out.println("Enter your Password");
		            String p = sc.next();
		            if (p.equals(pswd)) {
		                m.m2();
		                break;
		            } else {
		                System.out.println("You Entered Mail or Password are incorrect");
		            }
		        }
		    }
		}

		class abt {
		    void display() {
		        System.out.println("Name: Anmol Singh Negi");
		        System.out.println("Mail: anmolnegi242@gmail.com");
		    }
		}

		class menu {
		    sci scn = new sci();
		    eng e = new eng();
		    mat m = new mat();
		    abt a = new abt();
		    Scanner sc = new Scanner(System.in);

		    public void m2() {
		        System.out.println("\nLogin successful");
		        while (true) {
		            System.out.println("\n1.My Account\n2.Exam\n3.About\n4.Exit");
		            System.out.println("\nEnter your option");
		            int o = sc.nextInt();

		            if (o == 1) {
		                a.display();
		                System.out.println("\n1.Back\n2.Exit");
		                int g1 = sc.nextInt();
		                if (g1 == 2) break;
		            } else if (o == 2) {
		                System.out.println("\n1.Science\n2.English\n3.Maths");
		                System.out.println("\nSelect the Subject");
		                int su = sc.nextInt();
		                if (su == 1) {
		                    scn.s1();
		                } else if (su == 2) {
		                    e.el();
		                } else if (su == 3) {
		                    m.mati();
		                } else {
		                    System.out.println("Choose the correct one");
		                }
		                System.out.println("\n1.Back\n2.Exit");
		                int g2 = sc.nextInt();
		                if (g2 == 2) break;
		            } else if (o == 3) {
		                System.out.println("\n- Online Examination Portal -");
		                System.out.println("\nDesigned by:\nAnmol Singh Negi \nIntern At\nOasis Infobyte");
		                System.out.println("\n1.Back\n2.Exit");
		                int g3 = sc.nextInt();
		                if (g3 == 2) break;
		            } else if (o == 4) {
		                break;
		            } else {
		                System.out.println("Choose the correct one");
		            }
		        }
		    }
		}

		// Placeholder for quiz classes:
		class sci {
		    void s1() {
		        System.out.println("[Science quiz goes here]");
		    }
		}

		class eng {
		    void el() {
		        System.out.println("[English quiz goes here]");
		    }
		}

		class mat {
		    void mati() {
		        System.out.println("[Maths quiz goes here]");
		    }
		
}
