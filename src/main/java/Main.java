
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author johnk
 */
public class Main {

    public static void main(String[] args) {

        try {
            User user1 = new User("bob@test.com");
            System.out.println(user1.getEmail());
        } catch (Exception ex) {
            System.out.println("Couldn't set up user: " + ex.getMessage());
        }

        // basic exception example converting input
        String rawInput = JOptionPane.showInputDialog("Please enter a number");

        try {
            double inputAsDouble = Double.parseDouble(rawInput);

            System.out.println("Your number * 5 was " + inputAsDouble * 5);
        } catch (NumberFormatException ex) {
            System.out.println("That is not a number!");
            System.out.println(ex.getMessage());
        } catch (IllegalArgumentException ex) {
            System.out.println("Gotta enter something!");
        } catch (Exception ex) {
            System.out.println("Generic error here");
        } finally {
            System.out.println("Program finished");
        }
    }
}
