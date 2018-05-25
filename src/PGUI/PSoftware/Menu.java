package PGUI.PSoftware;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Menu {
    public void showMenu(){
        Font f = new Font("SERIF", Font.BOLD,36);
        Font fpetit = new Font("SERIF", Font.BOLD,28);
        JFrame menu = new JFrame();
        menu.setTitle("JDamier");
        menu.setSize(1500,1000);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setLocationRelativeTo(null);
        JPanel menupanel = new JPanel();
        JPanel reglespanel = new JPanel();
        JPanel profilpanel = new JPanel();
        menupanel.setLayout(null);
        reglespanel.setLayout(null);
        profilpanel.setLayout(null);
        JLabel titregagneregles = new JLabel("Comment gagner :");
        JLabel descgagneregles = new JLabel("La partie se termine lorsqu’un joueur n’a plus de pions ou lorsqu’il ne reste qu’un pion a chaque joueur (match nul).");
        JLabel titreplateauregles = new JLabel("Le plateau :");
        JLabel descplateauregles = new JLabel("Le plateau de jeu est composé de 10 cases x 10 cases alternant une case blanche avec une case noire.");
        JLabel titrepieceregles = new JLabel("Les pièces :");
        JLabel titrepionregles = new JLabel("Le pion :");
        JLabel descpionregles = new JLabel("Le pion est la pièce de base du jeu de Dames. Chaque Joueur commence la partie avec 20 pions placés sur les cases noires de son côté.");
        JLabel titredameregles = new JLabel("La dame :");
        JLabel descdameregles1 = new JLabel("  Lorsqu’un pion parvient à atteindre la dernière rangée opposée à sa position de départ, il devient une dame.");
        JLabel descdameregles2 = new JLabel("La dame, contrairement au pion, peut se déplacer librement en avant et en arrière, franchir des espaces vides et changer de direction pour capturer une pièce adverse.");
        JLabel titrepriseregles = new JLabel("La prise :");
        JLabel descpriseregles1 = new JLabel("  Pour prendre un pion à son adversaire, il faut passer par-dessus le pion de celui-ci ce qui est possible uniquement s’il se trouve sur une case adjacente et que la case derrière lui est vide.");
        JLabel descpriseregles2 = new JLabel("La prise d’un pion est obligatoire et il est possible de prendre plusieurs pions en un seul tour. Pour cela, la case d’arrivée du pion après la prise doit être adjacente un pion adversaire qui a une case vide derrière lui.");
        JLabel profil = new JLabel("Profil");
        menu.setContentPane(menupanel);
        JButton boutonordi = new JButton("Partie contre l'ordinateur");
        JButton boutonjoueur = new JButton("Partie contre un autre joueur");
        JButton boutonprofil = new JButton("Profil");
        JButton boutonregles = new JButton("Règles");
        JButton boutonquitter = new JButton("Quitter");
        JButton boutonretourregles = new JButton("Retour");
        JButton boutonretourprofil = new JButton("Retour");
        JLabel titre = new JLabel("Les JDames");
        titre.setBounds(150,-20,200,280);
        titre.setFont(f);
        menupanel.add(titre);
        titregagneregles.setBounds(600,0,700,100);
        titregagneregles.setFont(f);
        reglespanel.add(titregagneregles);
        titreplateauregles.setBounds(650,150,700,100);
        titreplateauregles.setFont(f);
        reglespanel.add(titreplateauregles);
        titrepieceregles.setBounds(655,300,700,100);
        titrepieceregles.setFont(f);
        reglespanel.add(titrepieceregles);
        titrepionregles.setBounds(690,350,700,100);
        titrepionregles.setFont(fpetit);
        reglespanel.add(titrepionregles);
        titredameregles.setBounds(690,460,700,100);
        titredameregles.setFont(fpetit);
        reglespanel.add(titredameregles);
        titrepriseregles.setBounds(680, 580,700,100);
        titrepriseregles.setFont(f);
        reglespanel.add(titrepriseregles);
        descgagneregles.setBounds(410,50,750,150);
        reglespanel.add(descgagneregles);
        descplateauregles.setBounds(440,200,700,150);
        reglespanel.add(descplateauregles);
        descpionregles.setBounds(360,400,850,100);
        reglespanel.add(descpionregles);
        descdameregles1.setBounds(430,510,850,100);
        reglespanel.add(descdameregles1);
        descdameregles2.setBounds(320,530,850,100);
        reglespanel.add(descdameregles2);
        descpriseregles1.setBounds(200,640,1200,100);
        reglespanel.add(descpriseregles1);
        descpriseregles2.setBounds(130,660,1300,100);
        reglespanel.add(descpriseregles2);
        profil.setBounds(700,0,700,100);
        profil.setFont(f);
        profilpanel.add(profil);
        boutonordi.setBackground(Color.GRAY);
        boutonordi.setBounds(100,200,280,80);
        boutonordi.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        boutonjoueur.setBackground(Color.GRAY);
        boutonjoueur.setBounds(100,300,280,80);
        boutonjoueur.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        boutonprofil.setBackground(Color.GRAY);
        boutonprofil.setBounds(100,400,280,80);
        boutonprofil.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                menu.setContentPane(profilpanel);
                menu.repaint();
                menu.revalidate();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        boutonregles.setBackground(Color.GRAY);
        boutonregles.setBounds(100,500,280,80);
        boutonregles.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                menu.setContentPane(reglespanel);
                menu.repaint();
                menu.revalidate();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        boutonquitter.setBackground(Color.GRAY);
        boutonquitter.setBounds(100,600,280,80);
        boutonquitter.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit (0);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        boutonretourregles.setBackground(Color.GRAY);
        boutonretourregles.setBounds(610,800,280,80);
        boutonretourregles.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                menu.setContentPane(menupanel);
                menu.repaint();
                menu.revalidate();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        boutonretourprofil.setBackground(Color.GRAY);
        boutonretourprofil.setBounds(610,800,280,80);
        boutonretourprofil.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                menu.setContentPane(menupanel);
                menu.repaint();
                menu.revalidate();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        menupanel.add(boutonordi);
        menupanel.add(boutonjoueur);
        menupanel.add(boutonprofil);
        menupanel.add(boutonregles);
        menupanel.add(boutonquitter);
        reglespanel.add(boutonretourregles);
        profilpanel.add(boutonretourprofil);
        menu.setVisible(true);
    }
    public void showProfile(){

    }
    public void startGame(){

    }
    public void changeProfile(){

    }
    public void quit(){

    }
    public void options(){

    }
    public void selectProfile(){

    }
}
