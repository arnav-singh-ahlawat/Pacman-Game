package Pacman.Game;

import javax.swing.JFrame;

/*
 * The Pacman class represents the main entry point for the Pacman game.
 * It extends JFrame to create a window for displaying the game.
 */
public class launch extends JFrame{

    /*
     * Constructor for the Pacman class.
     * It initializes the game by adding a new instance of the Model class,
     * which contains the logic for the Pacman game.
     */
    public launch() {
        add(new build());
    }

    /*
     * The main method creates an instance of the Pacman class and sets up the game window.
     */
    public static void main(String[] args) {
        launch pac = new launch();
        pac.setVisible(true);
        pac.setTitle("Pacman");
        pac.setSize(380,420);
        pac.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pac.setLocationRelativeTo(null);
    }
}