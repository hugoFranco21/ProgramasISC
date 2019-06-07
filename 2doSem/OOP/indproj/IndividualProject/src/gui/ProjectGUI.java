/*Name: Hugo David Franco Avila
Date: April - 22 - 2018
This class is the GUI for my final project
*/

import logic.*;

public class ProjectGUI extends javax.swing.JFrame {
    Player playerOne = new Player("one");
    Player playerTwo = new Player("two");
    Board tictac = new Board(playerOne, playerTwo);
    int A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
    int A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
    int A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
    int A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
    int A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
    int A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
    int A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
    int A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
    int A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
    int A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
    int B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
    int B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
    int B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
    int B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
    int B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
    int B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
    int B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
    int B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
    int B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
    int B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
    int C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
    int C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
    int C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
    int C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
    int C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
    int C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
    int C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
    int C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
    int C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
    int C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
    int D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
    int D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
    int D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
    int D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
    int D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
    int D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
    int D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
    int D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
    int D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
    int D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
    int V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
    int V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
    int V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
    int V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
    int V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
    int V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
    int V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
    int V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
    int V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
    int V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
    int V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
    int V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
    int V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
    int V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
    int V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
    int V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
    int DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
    int DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
    int DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
    int DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
    int DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
    int DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
    int DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
    int DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
    int DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
    int DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
    int DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
    int DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
    int DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
    int DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
    int DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
    int DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
    int DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
    int DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
    int DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
    int DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
    
    
            
    
    
    
     /* Creates new form ProjectGUI
     */
    public ProjectGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UI = new javax.swing.JPanel();
        infoButton = new javax.swing.JButton();
        playButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();
        mainUI = new javax.swing.JLabel();
        namePanel = new javax.swing.JPanel();
        player1Name = new javax.swing.JTextField();
        player2Name = new javax.swing.JTextField();
        startGameButton = new javax.swing.JButton();
        nameUI = new javax.swing.JLabel();
        loadMatchPanel = new javax.swing.JPanel();
        exButton = new javax.swing.JButton();
        fileChooser = new javax.swing.JFileChooser();
        loadUI = new javax.swing.JLabel();
        gamePanel = new javax.swing.JPanel();
        p1Turn = new javax.swing.JTextField();
        p2Turn = new javax.swing.JTextField();
        opcPanel = new javax.swing.JPanel();
        restartButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        exitMatchButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        matchName = new javax.swing.JTextField();
        opcLabel = new javax.swing.JLabel();
        saveImg = new javax.swing.JLabel();
        optionsButton = new javax.swing.JButton();
        b101 = new javax.swing.JButton();
        b102 = new javax.swing.JButton();
        b103 = new javax.swing.JButton();
        b104 = new javax.swing.JButton();
        b105 = new javax.swing.JButton();
        b106 = new javax.swing.JButton();
        b107 = new javax.swing.JButton();
        b108 = new javax.swing.JButton();
        b109 = new javax.swing.JButton();
        b110 = new javax.swing.JButton();
        b111 = new javax.swing.JButton();
        b112 = new javax.swing.JButton();
        b113 = new javax.swing.JButton();
        b114 = new javax.swing.JButton();
        b115 = new javax.swing.JButton();
        b116 = new javax.swing.JButton();
        o101 = new javax.swing.JLabel();
        o102 = new javax.swing.JLabel();
        o103 = new javax.swing.JLabel();
        o104 = new javax.swing.JLabel();
        o105 = new javax.swing.JLabel();
        o106 = new javax.swing.JLabel();
        o107 = new javax.swing.JLabel();
        o108 = new javax.swing.JLabel();
        o109 = new javax.swing.JLabel();
        o110 = new javax.swing.JLabel();
        o111 = new javax.swing.JLabel();
        o112 = new javax.swing.JLabel();
        o113 = new javax.swing.JLabel();
        o114 = new javax.swing.JLabel();
        o115 = new javax.swing.JLabel();
        o116 = new javax.swing.JLabel();
        x101 = new javax.swing.JLabel();
        x102 = new javax.swing.JLabel();
        x103 = new javax.swing.JLabel();
        x104 = new javax.swing.JLabel();
        x105 = new javax.swing.JLabel();
        x106 = new javax.swing.JLabel();
        x107 = new javax.swing.JLabel();
        x108 = new javax.swing.JLabel();
        x109 = new javax.swing.JLabel();
        x110 = new javax.swing.JLabel();
        x111 = new javax.swing.JLabel();
        x112 = new javax.swing.JLabel();
        x113 = new javax.swing.JLabel();
        x114 = new javax.swing.JLabel();
        x115 = new javax.swing.JLabel();
        x116 = new javax.swing.JLabel();
        b201 = new javax.swing.JButton();
        b202 = new javax.swing.JButton();
        b203 = new javax.swing.JButton();
        b204 = new javax.swing.JButton();
        b205 = new javax.swing.JButton();
        b206 = new javax.swing.JButton();
        b207 = new javax.swing.JButton();
        b208 = new javax.swing.JButton();
        b209 = new javax.swing.JButton();
        b210 = new javax.swing.JButton();
        b211 = new javax.swing.JButton();
        b212 = new javax.swing.JButton();
        b213 = new javax.swing.JButton();
        b214 = new javax.swing.JButton();
        b215 = new javax.swing.JButton();
        b216 = new javax.swing.JButton();
        o201 = new javax.swing.JLabel();
        o202 = new javax.swing.JLabel();
        o203 = new javax.swing.JLabel();
        o204 = new javax.swing.JLabel();
        o205 = new javax.swing.JLabel();
        o206 = new javax.swing.JLabel();
        o207 = new javax.swing.JLabel();
        o208 = new javax.swing.JLabel();
        o209 = new javax.swing.JLabel();
        o210 = new javax.swing.JLabel();
        o211 = new javax.swing.JLabel();
        o212 = new javax.swing.JLabel();
        o213 = new javax.swing.JLabel();
        o214 = new javax.swing.JLabel();
        o215 = new javax.swing.JLabel();
        o216 = new javax.swing.JLabel();
        x201 = new javax.swing.JLabel();
        x202 = new javax.swing.JLabel();
        x203 = new javax.swing.JLabel();
        x204 = new javax.swing.JLabel();
        x205 = new javax.swing.JLabel();
        x206 = new javax.swing.JLabel();
        x207 = new javax.swing.JLabel();
        x208 = new javax.swing.JLabel();
        x209 = new javax.swing.JLabel();
        x210 = new javax.swing.JLabel();
        x211 = new javax.swing.JLabel();
        x212 = new javax.swing.JLabel();
        x213 = new javax.swing.JLabel();
        x214 = new javax.swing.JLabel();
        x215 = new javax.swing.JLabel();
        x216 = new javax.swing.JLabel();
        b301 = new javax.swing.JButton();
        b302 = new javax.swing.JButton();
        b303 = new javax.swing.JButton();
        b304 = new javax.swing.JButton();
        b305 = new javax.swing.JButton();
        b306 = new javax.swing.JButton();
        b307 = new javax.swing.JButton();
        b308 = new javax.swing.JButton();
        b309 = new javax.swing.JButton();
        b310 = new javax.swing.JButton();
        b311 = new javax.swing.JButton();
        b312 = new javax.swing.JButton();
        b313 = new javax.swing.JButton();
        b314 = new javax.swing.JButton();
        b315 = new javax.swing.JButton();
        b316 = new javax.swing.JButton();
        o301 = new javax.swing.JLabel();
        o302 = new javax.swing.JLabel();
        o303 = new javax.swing.JLabel();
        o304 = new javax.swing.JLabel();
        o305 = new javax.swing.JLabel();
        o306 = new javax.swing.JLabel();
        o307 = new javax.swing.JLabel();
        o308 = new javax.swing.JLabel();
        o309 = new javax.swing.JLabel();
        o310 = new javax.swing.JLabel();
        o311 = new javax.swing.JLabel();
        o312 = new javax.swing.JLabel();
        o313 = new javax.swing.JLabel();
        o314 = new javax.swing.JLabel();
        o315 = new javax.swing.JLabel();
        o316 = new javax.swing.JLabel();
        x301 = new javax.swing.JLabel();
        x302 = new javax.swing.JLabel();
        x303 = new javax.swing.JLabel();
        x304 = new javax.swing.JLabel();
        x305 = new javax.swing.JLabel();
        x306 = new javax.swing.JLabel();
        x307 = new javax.swing.JLabel();
        x308 = new javax.swing.JLabel();
        x309 = new javax.swing.JLabel();
        x310 = new javax.swing.JLabel();
        x311 = new javax.swing.JLabel();
        x312 = new javax.swing.JLabel();
        x313 = new javax.swing.JLabel();
        x314 = new javax.swing.JLabel();
        x315 = new javax.swing.JLabel();
        x316 = new javax.swing.JLabel();
        b401 = new javax.swing.JButton();
        b402 = new javax.swing.JButton();
        b403 = new javax.swing.JButton();
        b404 = new javax.swing.JButton();
        b405 = new javax.swing.JButton();
        b406 = new javax.swing.JButton();
        b407 = new javax.swing.JButton();
        b408 = new javax.swing.JButton();
        b409 = new javax.swing.JButton();
        b410 = new javax.swing.JButton();
        b411 = new javax.swing.JButton();
        b412 = new javax.swing.JButton();
        b413 = new javax.swing.JButton();
        b414 = new javax.swing.JButton();
        b415 = new javax.swing.JButton();
        b416 = new javax.swing.JButton();
        o401 = new javax.swing.JLabel();
        o402 = new javax.swing.JLabel();
        o403 = new javax.swing.JLabel();
        o404 = new javax.swing.JLabel();
        o405 = new javax.swing.JLabel();
        o406 = new javax.swing.JLabel();
        o407 = new javax.swing.JLabel();
        o408 = new javax.swing.JLabel();
        o409 = new javax.swing.JLabel();
        o410 = new javax.swing.JLabel();
        o411 = new javax.swing.JLabel();
        o412 = new javax.swing.JLabel();
        o413 = new javax.swing.JLabel();
        o414 = new javax.swing.JLabel();
        o415 = new javax.swing.JLabel();
        o416 = new javax.swing.JLabel();
        x401 = new javax.swing.JLabel();
        x402 = new javax.swing.JLabel();
        x403 = new javax.swing.JLabel();
        x404 = new javax.swing.JLabel();
        x405 = new javax.swing.JLabel();
        x406 = new javax.swing.JLabel();
        x407 = new javax.swing.JLabel();
        x408 = new javax.swing.JLabel();
        x409 = new javax.swing.JLabel();
        x410 = new javax.swing.JLabel();
        x411 = new javax.swing.JLabel();
        x412 = new javax.swing.JLabel();
        x413 = new javax.swing.JLabel();
        x414 = new javax.swing.JLabel();
        x415 = new javax.swing.JLabel();
        x416 = new javax.swing.JLabel();
        p1 = new javax.swing.JTextField();
        p2 = new javax.swing.JTextField();
        gameUI = new javax.swing.JLabel();
        secretPanel = new javax.swing.JPanel();
        thanks = new javax.swing.JTextField();
        developer = new javax.swing.JTextField();
        time = new javax.swing.JTextField();
        animals = new javax.swing.JTextField();
        closeButton = new javax.swing.JButton();
        winPanel = new javax.swing.JPanel();
        congrats = new javax.swing.JTextField();
        winPlay = new javax.swing.JTextField();
        won = new javax.swing.JTextField();
        clsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infoButton.setBackground(new java.awt.Color(130, 47, 147));
        infoButton.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        infoButton.setText("SUPER MEGA 3D TIC-TAC-TOE");
        infoButton.setBorderPainted(false);
        infoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoButtonActionPerformed(evt);
            }
        });
        UI.add(infoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));
        infoButton.setEnabled(false);

        playButton.setBackground(new java.awt.Color(255, 255, 255));
        playButton.setFont(new java.awt.Font("Eras Bold ITC", 0, 36)); // NOI18N
        playButton.setText("PLAY");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        UI.add(playButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 350, 90));

        exitButton.setBackground(new java.awt.Color(255, 255, 255));
        exitButton.setFont(new java.awt.Font("Eras Bold ITC", 0, 36)); // NOI18N
        exitButton.setText("EXIT");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        UI.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 350, 90));

        loadButton.setBackground(new java.awt.Color(255, 255, 255));
        loadButton.setFont(new java.awt.Font("Eras Bold ITC", 0, 36)); // NOI18N
        loadButton.setText("LOAD");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });
        UI.add(loadButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 350, 90));

        mainUI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/mainUI.png"))); // NOI18N
        UI.add(mainUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        namePanel.setBackground(new java.awt.Color(130, 47, 147));
        namePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        player1Name.setFont(new java.awt.Font("Eras Bold ITC", 0, 36)); // NOI18N
        player1Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player1NameActionPerformed(evt);
            }
        });
        namePanel.add(player1Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 390, 80));

        player2Name.setFont(new java.awt.Font("Eras Bold ITC", 0, 36)); // NOI18N
        namePanel.add(player2Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 390, 80));

        startGameButton.setFont(new java.awt.Font("Eras Bold ITC", 0, 36)); // NOI18N
        startGameButton.setText("Start");
        startGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameButtonActionPerformed(evt);
            }
        });
        namePanel.add(startGameButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 359, 120, 50));

        nameUI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/2DPvP.png"))); // NOI18N
        namePanel.add(nameUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        UI.add(namePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 820, 460));
        namePanel.setVisible(false);

        loadMatchPanel.setBackground(new java.awt.Color(130, 47, 147));
        loadMatchPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exButton.setText("Exit");
        exButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exButtonActionPerformed(evt);
            }
        });
        loadMatchPanel.add(exButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 80, 30));

        fileChooser.setCurrentDirectory(new java.io.File("C:\\ProgramasITC\\2doSem\\OOP\\indproj\\IndividualProject\\src\\matches"));
        fileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChooserActionPerformed(evt);
            }
        });
        loadMatchPanel.add(fileChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 610, 350));

        loadUI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/LoadUI.png"))); // NOI18N
        loadMatchPanel.add(loadUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        UI.add(loadMatchPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));
        loadMatchPanel.setVisible(false);

        gamePanel.setBackground(new java.awt.Color(130, 47, 147));
        gamePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p1Turn.setEditable(false);
        p1Turn.setFont(new java.awt.Font("Eras Bold ITC", 0, 16)); // NOI18N
        p1Turn.setText("Your Turn");
        gamePanel.add(p1Turn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        p2Turn.setEditable(false);
        p2Turn.setFont(new java.awt.Font("Eras Bold ITC", 0, 16)); // NOI18N
        p2Turn.setText("Your Turn");
        gamePanel.add(p2Turn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, -1, -1));
        p2Turn.setVisible(false);

        opcPanel.setBackground(new java.awt.Color(130, 47, 143));
        opcPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        restartButton.setBackground(new java.awt.Color(255, 255, 255));
        restartButton.setFont(new java.awt.Font("Eras Bold ITC", 0, 32)); // NOI18N
        restartButton.setText("Restart");
        restartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartButtonActionPerformed(evt);
            }
        });
        opcPanel.add(restartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 260, 60));

        saveButton.setBackground(new java.awt.Color(255, 255, 255));
        saveButton.setFont(new java.awt.Font("Eras Bold ITC", 0, 32)); // NOI18N
        saveButton.setText("Save & Exit");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        opcPanel.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 260, 70));

        exitMatchButton.setBackground(new java.awt.Color(255, 255, 255));
        exitMatchButton.setFont(new java.awt.Font("Eras Bold ITC", 0, 32)); // NOI18N
        exitMatchButton.setText("Exit");
        exitMatchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMatchButtonActionPerformed(evt);
            }
        });
        opcPanel.add(exitMatchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 260, 60));

        submitButton.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        opcPanel.add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 125, 42));
        submitButton.setVisible(false);

        matchName.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        opcPanel.add(matchName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 279, 50));
        matchName.setVisible(false);

        opcLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/opcPanel.png"))); // NOI18N
        opcPanel.add(opcLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        saveImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/saveMatch.png"))); // NOI18N
        opcPanel.add(saveImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        gamePanel.add(opcPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 370, 250));
        opcPanel.setVisible(false);

        optionsButton.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        optionsButton.setText("Options");
        optionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsButtonActionPerformed(evt);
            }
        });
        gamePanel.add(optionsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, 120, 50));

        b101.setBackground(new java.awt.Color(137, 40, 147));
        b101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b101ActionPerformed(evt);
            }
        });
        gamePanel.add(b101, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 30, 30));

        b102.setBackground(new java.awt.Color(137, 40, 147));
        b102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b102ActionPerformed(evt);
            }
        });
        gamePanel.add(b102, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 30, 30));

        b103.setBackground(new java.awt.Color(137, 40, 147));
        b103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b103ActionPerformed(evt);
            }
        });
        gamePanel.add(b103, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 30, 30));

        b104.setBackground(new java.awt.Color(137, 40, 147));
        b104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b104ActionPerformed(evt);
            }
        });
        gamePanel.add(b104, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 30, 30));

        b105.setBackground(new java.awt.Color(137, 40, 147));
        b105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b105ActionPerformed(evt);
            }
        });
        gamePanel.add(b105, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 30, 30));

        b106.setBackground(new java.awt.Color(137, 40, 147));
        b106.setToolTipText("");
        b106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b106ActionPerformed(evt);
            }
        });
        gamePanel.add(b106, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 30, 30));

        b107.setBackground(new java.awt.Color(137, 40, 147));
        b107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b107ActionPerformed(evt);
            }
        });
        gamePanel.add(b107, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 30, 30));

        b108.setBackground(new java.awt.Color(137, 40, 147));
        b108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b108ActionPerformed(evt);
            }
        });
        gamePanel.add(b108, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 30, 30));

        b109.setBackground(new java.awt.Color(137, 40, 147));
        b109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b109ActionPerformed(evt);
            }
        });
        gamePanel.add(b109, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 30, 30));

        b110.setBackground(new java.awt.Color(137, 40, 147));
        b110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b110ActionPerformed(evt);
            }
        });
        gamePanel.add(b110, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 30, 30));

        b111.setBackground(new java.awt.Color(137, 40, 147));
        b111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b111ActionPerformed(evt);
            }
        });
        gamePanel.add(b111, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 30, 30));

        b112.setBackground(new java.awt.Color(137, 40, 147));
        b112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b112ActionPerformed(evt);
            }
        });
        gamePanel.add(b112, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 30, 30));

        b113.setBackground(new java.awt.Color(137, 40, 147));
        b113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b113ActionPerformed(evt);
            }
        });
        gamePanel.add(b113, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 30, 30));

        b114.setBackground(new java.awt.Color(137, 40, 147));
        b114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b114ActionPerformed(evt);
            }
        });
        gamePanel.add(b114, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 30, 30));

        b115.setBackground(new java.awt.Color(137, 40, 147));
        b115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b115ActionPerformed(evt);
            }
        });
        gamePanel.add(b115, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 30, 30));

        b116.setBackground(new java.awt.Color(137, 40, 147));
        b116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b116ActionPerformed(evt);
            }
        });
        gamePanel.add(b116, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 30, 30));

        o101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o101, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));
        o101.setVisible(false);

        o102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o102, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));
        o102.setVisible(false);

        o103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o103, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));
        o103.setVisible(false);

        o104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o104, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));
        o104.setVisible(false);

        o105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o105, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));
        o105.setVisible(false);

        o106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o106, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));
        o106.setVisible(false);

        o107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o107, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));
        o107.setVisible(false);

        o108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o108, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));
        o108.setVisible(false);

        o109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o109, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));
        o109.setVisible(false);

        o110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o110, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));
        o110.setVisible(false);

        o111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o111, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));
        o111.setVisible(false);

        o112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o112, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));
        o112.setVisible(false);

        o113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o113, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));
        o113.setVisible(false);

        o114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o114, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));
        o114.setVisible(false);

        o115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o115, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));
        o115.setVisible(false);

        o116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o116, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, -1));
        o116.setVisible(false);

        x101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x101, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));
        x101.setVisible(false);

        x102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x102, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));
        x102.setVisible(false);

        x103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x103, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));
        x103.setVisible(false);

        x104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x104, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));
        x104.setVisible(false);

        x105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x105, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));
        x105.setVisible(false);

        x106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x106, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));
        x106.setVisible(false);

        x107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x107, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));
        x107.setVisible(false);

        x108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x108, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));
        x108.setVisible(false);

        x109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x109, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));
        x109.setVisible(false);

        x110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x110, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));
        x110.setVisible(false);

        x111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x111, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));
        x111.setVisible(false);

        x112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x112, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));
        x112.setVisible(false);

        x113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x113, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));
        x113.setVisible(false);

        x114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x114, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));
        x114.setVisible(false);

        x115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x115, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));
        x115.setVisible(false);

        x116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x116, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, -1));
        x116.setVisible(false);

        b201.setBackground(new java.awt.Color(137, 40, 147));
        b201.setToolTipText("");
        b201.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b201ActionPerformed(evt);
            }
        });
        gamePanel.add(b201, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 30, 30));

        b202.setBackground(new java.awt.Color(137, 40, 147));
        b202.setToolTipText("");
        b202.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b202ActionPerformed(evt);
            }
        });
        gamePanel.add(b202, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 30, 30));

        b203.setBackground(new java.awt.Color(137, 40, 147));
        b203.setToolTipText("");
        b203.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b203ActionPerformed(evt);
            }
        });
        gamePanel.add(b203, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 30, 30));

        b204.setBackground(new java.awt.Color(137, 40, 147));
        b204.setToolTipText("");
        b204.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b204ActionPerformed(evt);
            }
        });
        gamePanel.add(b204, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 30, 30));

        b205.setBackground(new java.awt.Color(137, 40, 147));
        b205.setToolTipText("");
        b205.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b205ActionPerformed(evt);
            }
        });
        gamePanel.add(b205, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 30, 30));

        b206.setBackground(new java.awt.Color(137, 40, 147));
        b206.setToolTipText("");
        b206.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b206ActionPerformed(evt);
            }
        });
        gamePanel.add(b206, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 30, 30));

        b207.setBackground(new java.awt.Color(137, 40, 147));
        b207.setToolTipText("");
        b207.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b207ActionPerformed(evt);
            }
        });
        gamePanel.add(b207, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 30, 30));

        b208.setBackground(new java.awt.Color(137, 40, 147));
        b208.setToolTipText("");
        b208.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b208ActionPerformed(evt);
            }
        });
        gamePanel.add(b208, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 30, 30));

        b209.setBackground(new java.awt.Color(137, 40, 147));
        b209.setToolTipText("");
        b209.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b209ActionPerformed(evt);
            }
        });
        gamePanel.add(b209, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 30, 30));

        b210.setBackground(new java.awt.Color(137, 40, 147));
        b210.setToolTipText("");
        b210.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b210ActionPerformed(evt);
            }
        });
        gamePanel.add(b210, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 30, 30));

        b211.setBackground(new java.awt.Color(137, 40, 147));
        b211.setToolTipText("");
        b211.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b211ActionPerformed(evt);
            }
        });
        gamePanel.add(b211, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 30, 30));

        b212.setBackground(new java.awt.Color(137, 40, 147));
        b212.setToolTipText("");
        b212.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b212ActionPerformed(evt);
            }
        });
        gamePanel.add(b212, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 30, 30));

        b213.setBackground(new java.awt.Color(137, 40, 147));
        b213.setToolTipText("");
        b213.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b213ActionPerformed(evt);
            }
        });
        gamePanel.add(b213, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 30, 30));

        b214.setBackground(new java.awt.Color(137, 40, 147));
        b214.setToolTipText("");
        b214.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b214ActionPerformed(evt);
            }
        });
        gamePanel.add(b214, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 30, 30));

        b215.setBackground(new java.awt.Color(137, 40, 147));
        b215.setToolTipText("");
        b215.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b215ActionPerformed(evt);
            }
        });
        gamePanel.add(b215, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 30, 30));

        b216.setBackground(new java.awt.Color(137, 40, 147));
        b216.setToolTipText("");
        b216.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b216ActionPerformed(evt);
            }
        });
        gamePanel.add(b216, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 30, 30));

        o201.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o201, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));
        o201.setVisible(false);

        o202.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o202, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));
        o202.setVisible(false);

        o203.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o203, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));
        o203.setVisible(false);

        o204.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o204, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));
        o204.setVisible(false);

        o205.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o205, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));
        o205.setVisible(false);

        o206.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o206, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));
        o206.setVisible(false);

        o207.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o207, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));
        o207.setVisible(false);

        o208.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o208, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));
        o208.setVisible(false);

        o209.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o209, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));
        o209.setVisible(false);

        o210.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o210, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));
        o210.setVisible(false);

        o211.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o211, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));
        o211.setVisible(false);

        o212.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o212, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, -1));
        o212.setVisible(false);

        o213.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o213, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));
        o213.setVisible(false);

        o214.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o214, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));
        o214.setVisible(false);

        o215.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o215, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));
        o215.setVisible(false);

        o216.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o216, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, -1));
        o216.setVisible(false);

        x201.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x201, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));
        x201.setVisible(false);

        x202.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x202, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));
        x202.setVisible(false);

        x203.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x203, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));
        x203.setVisible(false);

        x204.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x204, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));
        x204.setVisible(false);

        x205.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x205, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));
        x205.setVisible(false);

        x206.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x206, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));
        x206.setVisible(false);

        x207.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x207, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));
        x207.setVisible(false);

        x208.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x208, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));
        x208.setVisible(false);

        x209.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x209, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));
        x209.setVisible(false);

        x210.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x210, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));
        x210.setVisible(false);

        x211.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x211, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));
        x211.setVisible(false);

        x212.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x212, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, -1));
        x212.setVisible(false);

        x213.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x213, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));
        x213.setVisible(false);

        x214.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x214, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));
        x214.setVisible(false);

        x215.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x215, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));
        x215.setVisible(false);

        x216.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x216, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, -1));
        x216.setVisible(false);

        b301.setBackground(new java.awt.Color(137, 40, 147));
        b301.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b301ActionPerformed(evt);
            }
        });
        gamePanel.add(b301, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 30, 30));

        b302.setBackground(new java.awt.Color(137, 40, 147));
        b302.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b302ActionPerformed(evt);
            }
        });
        gamePanel.add(b302, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 30, 30));

        b303.setBackground(new java.awt.Color(137, 40, 147));
        b303.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b303ActionPerformed(evt);
            }
        });
        gamePanel.add(b303, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 30, 30));

        b304.setBackground(new java.awt.Color(137, 40, 147));
        b304.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b304ActionPerformed(evt);
            }
        });
        gamePanel.add(b304, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 30, 30));

        b305.setBackground(new java.awt.Color(137, 40, 147));
        b305.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b305ActionPerformed(evt);
            }
        });
        gamePanel.add(b305, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 30, 30));

        b306.setBackground(new java.awt.Color(137, 40, 147));
        b306.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b306ActionPerformed(evt);
            }
        });
        gamePanel.add(b306, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 30, 30));

        b307.setBackground(new java.awt.Color(137, 40, 147));
        b307.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b307ActionPerformed(evt);
            }
        });
        gamePanel.add(b307, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 30, 30));

        b308.setBackground(new java.awt.Color(137, 40, 147));
        b308.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b308ActionPerformed(evt);
            }
        });
        gamePanel.add(b308, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 30, 30));

        b309.setBackground(new java.awt.Color(137, 40, 147));
        b309.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b309ActionPerformed(evt);
            }
        });
        gamePanel.add(b309, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 30, 30));

        b310.setBackground(new java.awt.Color(137, 40, 147));
        b310.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b310ActionPerformed(evt);
            }
        });
        gamePanel.add(b310, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 30, 30));

        b311.setBackground(new java.awt.Color(137, 40, 147));
        b311.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b311ActionPerformed(evt);
            }
        });
        gamePanel.add(b311, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 30, 30));

        b312.setBackground(new java.awt.Color(137, 40, 147));
        b312.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b312ActionPerformed(evt);
            }
        });
        gamePanel.add(b312, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 30, 30));

        b313.setBackground(new java.awt.Color(137, 40, 147));
        b313.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b313ActionPerformed(evt);
            }
        });
        gamePanel.add(b313, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 30, 30));

        b314.setBackground(new java.awt.Color(137, 40, 147));
        b314.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b314ActionPerformed(evt);
            }
        });
        gamePanel.add(b314, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 30, 30));

        b315.setBackground(new java.awt.Color(137, 40, 147));
        b315.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b315ActionPerformed(evt);
            }
        });
        gamePanel.add(b315, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 30, 30));

        b316.setBackground(new java.awt.Color(137, 40, 147));
        b316.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b316ActionPerformed(evt);
            }
        });
        gamePanel.add(b316, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 30, 30));

        o301.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o301, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));
        o301.setVisible(false);

        o302.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o302, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));
        o302.setVisible(false);

        o303.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o303, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));
        o303.setVisible(false);

        o304.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o304, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, -1, -1));
        o304.setVisible(false);

        o305.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o305, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));
        o305.setVisible(false);

        o306.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o306, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));
        o306.setVisible(false);

        o307.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o307, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));
        o307.setVisible(false);

        o308.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o308, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));
        o308.setVisible(false);

        o309.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o309, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));
        o309.setVisible(false);

        o310.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o310, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));
        o310.setVisible(false);

        o311.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o311, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));
        o311.setVisible(false);

        o312.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o312, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, -1));
        o312.setVisible(false);

        o313.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o313, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));
        o313.setVisible(false);

        o314.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o314, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));
        o314.setVisible(false);

        o315.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o315, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, -1));
        o315.setVisible(false);

        o316.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o316, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, -1, -1));
        o316.setVisible(false);

        x301.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x301, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));
        x301.setVisible(false);

        x302.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x302, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));
        x302.setVisible(false);

        x303.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x303, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));
        x303.setVisible(false);

        x304.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x304, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, -1, -1));
        x304.setVisible(false);

        x305.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x305, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));
        x305.setVisible(false);

        x306.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x306, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));
        x306.setVisible(false);

        x307.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x307, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));
        x307.setVisible(false);

        x308.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x308, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));
        x308.setVisible(false);

        x309.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x309, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));
        x309.setVisible(false);

        x310.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x310, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));
        x310.setVisible(false);

        x311.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x311, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));
        x311.setVisible(false);

        x312.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x312, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, -1));
        x312.setVisible(false);

        x313.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x313, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));
        x313.setVisible(false);

        x314.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x314, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));
        x314.setVisible(false);

        x315.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x315, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, -1));
        x315.setVisible(false);

        x316.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x316, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, -1, -1));
        x316.setVisible(false);

        b401.setBackground(new java.awt.Color(137, 40, 147));
        b401.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b401ActionPerformed(evt);
            }
        });
        gamePanel.add(b401, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 30, 30));

        b402.setBackground(new java.awt.Color(137, 40, 147));
        b402.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b402ActionPerformed(evt);
            }
        });
        gamePanel.add(b402, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 30, 30));

        b403.setBackground(new java.awt.Color(137, 40, 147));
        b403.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b403ActionPerformed(evt);
            }
        });
        gamePanel.add(b403, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 30, 30));

        b404.setBackground(new java.awt.Color(137, 40, 147));
        b404.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b404ActionPerformed(evt);
            }
        });
        gamePanel.add(b404, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 30, 30));

        b405.setBackground(new java.awt.Color(137, 40, 147));
        b405.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b405ActionPerformed(evt);
            }
        });
        gamePanel.add(b405, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 30, 30));

        b406.setBackground(new java.awt.Color(137, 40, 147));
        b406.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b406ActionPerformed(evt);
            }
        });
        gamePanel.add(b406, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 30, 30));

        b407.setBackground(new java.awt.Color(137, 40, 147));
        b407.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b407ActionPerformed(evt);
            }
        });
        gamePanel.add(b407, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 30, 30));

        b408.setBackground(new java.awt.Color(137, 40, 147));
        b408.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b408ActionPerformed(evt);
            }
        });
        gamePanel.add(b408, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 30, 30));

        b409.setBackground(new java.awt.Color(137, 40, 147));
        b409.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b409ActionPerformed(evt);
            }
        });
        gamePanel.add(b409, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 30, 30));

        b410.setBackground(new java.awt.Color(137, 40, 147));
        b410.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b410ActionPerformed(evt);
            }
        });
        gamePanel.add(b410, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 30, 30));

        b411.setBackground(new java.awt.Color(137, 40, 147));
        b411.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b411ActionPerformed(evt);
            }
        });
        gamePanel.add(b411, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 30, 30));

        b412.setBackground(new java.awt.Color(137, 40, 147));
        b412.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b412ActionPerformed(evt);
            }
        });
        gamePanel.add(b412, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 30, 30));

        b413.setBackground(new java.awt.Color(137, 40, 147));
        b413.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b413ActionPerformed(evt);
            }
        });
        gamePanel.add(b413, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 30, 30));

        b414.setBackground(new java.awt.Color(137, 40, 147));
        b414.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b414ActionPerformed(evt);
            }
        });
        gamePanel.add(b414, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 30, 30));

        b415.setBackground(new java.awt.Color(137, 40, 147));
        b415.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b415ActionPerformed(evt);
            }
        });
        gamePanel.add(b415, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 30, 30));

        b416.setBackground(new java.awt.Color(137, 40, 147));
        b416.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b416ActionPerformed(evt);
            }
        });
        gamePanel.add(b416, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 30, 30));

        o401.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o401, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, -1));
        o401.setVisible(false);

        o402.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o402, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, -1, -1));
        o402.setVisible(false);

        o403.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o403, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, -1, -1));
        o403.setVisible(false);

        o404.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o404, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, -1, -1));
        o404.setVisible(false);

        o405.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o405, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));
        o405.setVisible(false);

        o406.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o406, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, -1, -1));
        o406.setVisible(false);

        o407.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o407, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, -1, -1));
        o407.setVisible(false);

        o408.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o408, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, -1, -1));
        o408.setVisible(false);

        o409.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o409, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));
        o409.setVisible(false);

        o410.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o410, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, -1, -1));
        o410.setVisible(false);

        o411.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o411, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));
        o411.setVisible(false);

        o412.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o412, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, -1, -1));
        o412.setVisible(false);

        o413.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o413, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, -1, -1));
        o413.setVisible(false);

        o414.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o414, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, -1, -1));
        o414.setVisible(false);

        o415.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o415, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, -1, -1));
        o415.setVisible(false);

        o416.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/oFig.png"))); // NOI18N
        gamePanel.add(o416, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, -1, -1));
        o416.setVisible(false);

        x401.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x401, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, -1));
        x401.setVisible(false);

        x402.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x402, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, -1, -1));
        x402.setVisible(false);

        x403.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x403, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, -1, -1));
        x403.setVisible(false);

        x404.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x404, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, -1, -1));
        x404.setVisible(false);

        x405.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x405, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));
        x405.setVisible(false);

        x406.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x406, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, -1, -1));
        x406.setVisible(false);

        x407.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x407, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, -1, -1));
        x407.setVisible(false);

        x408.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x408, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, -1, -1));
        x408.setVisible(false);

        x409.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x409, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));
        x409.setVisible(false);

        x410.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x410, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, -1, -1));
        x410.setVisible(false);

        x411.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x411, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));
        x411.setVisible(false);

        x412.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x412, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, -1, -1));
        x412.setVisible(false);

        x413.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x413, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, -1, -1));
        x413.setVisible(false);

        x414.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x414, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, -1, -1));
        x414.setVisible(false);

        x415.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x415, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, -1, -1));
        x415.setVisible(false);

        x416.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/xFig.png"))); // NOI18N
        gamePanel.add(x416, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, -1, -1));
        x416.setVisible(false);

        p1.setEditable(false);
        p1.setBackground(new java.awt.Color(130, 47, 147));
        p1.setFont(new java.awt.Font("Eras Bold ITC", 0, 16)); // NOI18N
        p1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        gamePanel.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 28));

        p2.setEditable(false);
        p2.setBackground(new java.awt.Color(130, 47, 147));
        p2.setFont(new java.awt.Font("Eras Bold ITC", 0, 16)); // NOI18N
        p2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2ActionPerformed(evt);
            }
        });
        gamePanel.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 125, 25));

        gameUI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICTAC/board.png"))); // NOI18N
        gamePanel.add(gameUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        UI.add(gamePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 820, 460));
        gamePanel.setVisible(false);

        secretPanel.setBackground(new java.awt.Color(137, 40, 147));
        secretPanel.setPreferredSize(new java.awt.Dimension(822, 462));

        thanks.setEditable(false);
        thanks.setBackground(new java.awt.Color(140, 40, 137));
        thanks.setFont(new java.awt.Font("Eras Bold ITC", 0, 30)); // NOI18N
        thanks.setForeground(new java.awt.Color(255, 255, 255));
        thanks.setText("Thanks for playing Super Mega 3D Tic Tac Toe");
        thanks.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        developer.setBackground(new java.awt.Color(140, 40, 137));
        developer.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        developer.setForeground(new java.awt.Color(255, 255, 255));
        developer.setText("This game was developed by Hugo David Franco Avila");
        developer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        time.setBackground(new java.awt.Color(140, 40, 137));
        time.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setText("The production of this game took over 18 hours");
        time.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeActionPerformed(evt);
            }
        });

        animals.setBackground(new java.awt.Color(140, 40, 137));
        animals.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        animals.setForeground(new java.awt.Color(255, 255, 255));
        animals.setText("No animals were harmed in the making of this game");
        animals.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        closeButton.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout secretPanelLayout = new javax.swing.GroupLayout(secretPanel);
        secretPanel.setLayout(secretPanelLayout);
        secretPanelLayout.setHorizontalGroup(
            secretPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secretPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(secretPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thanks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(developer, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(secretPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(animals, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        secretPanelLayout.setVerticalGroup(
            secretPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secretPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thanks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(developer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(animals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        UI.add(secretPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 820, 470));
        secretPanel.setVisible(false);

        winPanel.setBackground(new java.awt.Color(137, 40, 147));

        congrats.setEditable(false);
        congrats.setBackground(new java.awt.Color(137, 40, 147));
        congrats.setFont(new java.awt.Font("Eras Bold ITC", 0, 36)); // NOI18N
        congrats.setForeground(new java.awt.Color(255, 255, 255));
        congrats.setText("Congratulations");
        congrats.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        winPlay.setEditable(false);
        winPlay.setBackground(new java.awt.Color(137, 40, 147));
        winPlay.setFont(new java.awt.Font("Eras Bold ITC", 0, 36)); // NOI18N
        winPlay.setForeground(new java.awt.Color(255, 255, 255));
        winPlay.setText("Player");
        winPlay.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        winPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                winPlayActionPerformed(evt);
            }
        });

        won.setEditable(false);
        won.setBackground(new java.awt.Color(137, 40, 147));
        won.setFont(new java.awt.Font("Eras Bold ITC", 0, 36)); // NOI18N
        won.setForeground(new java.awt.Color(255, 255, 255));
        won.setText("You won!");
        won.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        clsButton.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        clsButton.setText("Close");
        clsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout winPanelLayout = new javax.swing.GroupLayout(winPanel);
        winPanel.setLayout(winPanelLayout);
        winPanelLayout.setHorizontalGroup(
            winPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winPanelLayout.createSequentialGroup()
                .addGroup(winPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(winPanelLayout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(congrats, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(winPanelLayout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(won, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(270, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, winPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(winPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, winPanelLayout.createSequentialGroup()
                        .addComponent(clsButton)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, winPanelLayout.createSequentialGroup()
                        .addComponent(winPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177))))
        );
        winPanelLayout.setVerticalGroup(
            winPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winPanelLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(congrats, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(winPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(won, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clsButton)
                .addGap(31, 31, 31))
        );

        UI.add(winPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 820, 470));
        winPanel.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_exitButtonActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        int i, j, k;
        exitButton.setVisible(false);
        infoButton.setVisible(false);
        loadButton.setVisible(false);
        playButton.setVisible(false);
        mainUI.setVisible(false);
        namePanel.setVisible(true);
        for(i = 0; i < 4; i++){
            for(j = 0; j < 4; j++){
                for(k = 0; k < 4; k++){
                    tictac.setValue(i, j, k, 0);
                }
            }
        }
    }//GEN-LAST:event_playButtonActionPerformed

    private void player1NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player1NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player1NameActionPerformed

    /*
    Players get put in the name select screen
    */
    private void startGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGameButtonActionPerformed
        namePanel.setVisible(false);
        gamePanel.setVisible(true);
        playerOne.setName(player1Name.getText());
        playerTwo.setName(player2Name.getText());
        if(tictac.getOpc() % 2 == 1){
            tictac.addOpc();
        }
        if(tictac.getPlay() % 2 == 1){
            tictac.addOpc();
        }
        p1.setText(playerOne.getName());
        p2.setText(playerTwo.getName());
    }//GEN-LAST:event_startGameButtonActionPerformed

    /*This method brings up the option to name the match*/
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

        opcLabel.setVisible(false);
        restartButton.setVisible(false);
        saveButton.setVisible(false);
        exitMatchButton.setVisible(false);
        submitButton.setVisible(true);
        matchName.setVisible(true);
        optionsButton.setEnabled(false);
        saveImg.setVisible(true);
        
    }//GEN-LAST:event_saveButtonActionPerformed

    /*This method brings up the option panel
    It will be important for discovering the easter egg!
    */
    private void optionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsButtonActionPerformed
        tictac.addOpc();
        if (tictac.getOpc() % 2 == 1 ){
            opcPanel.setVisible(true);
        } else{
            opcPanel.setVisible(false);
        }
        
        if(tictac.getOpc() >= 50){
            infoButton.setEnabled(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_optionsButtonActionPerformed

    private void exitMatchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMatchButtonActionPerformed
        restartUI();
    }//GEN-LAST:event_exitMatchButtonActionPerformed

    /*
    After the user chooses the match he wishes to load,
    that file will be deserialized, and casted to a board type.
    Then depending on the values the matrix has, the buttons will disable
    and images will be set
    */
    private void fileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChooserActionPerformed

        String name1 = null;
        FileHelper des = new FileHelper(name1);
        if (fileChooser.APPROVE_OPTION==0){
            name1 = fileChooser.getSelectedFile().getName();
            des.setName(name1);
        }
        tictac = (Board) des.deSerialize();
        playerOne = tictac.getPlayer1();
        playerTwo = tictac.getPlayer2();
        p1.setText(playerOne.getName());
        p2.setText(playerTwo.getName());
        gamePanel.setVisible(true);
        loadMatchPanel.setVisible(false);
                
        if(tictac.getValue(0,0,0) > 0){
            if(tictac.getValue(0,0,0) == 1){
                x101.setVisible(true);
            } else{
                o101.setVisible(true);
            }
            b101.setVisible(false);
        }
        
        if(tictac.getValue(0,0,1) > 0){
            if(tictac.getValue(0,0,1) == 1){
                x102.setVisible(true);
            } else{
                o102.setVisible(true);
            }
            b102.setVisible(false);
        }
        
        if(tictac.getValue(0,0,2) > 0){
            if(tictac.getValue(0,0,2) == 1){
                x103.setVisible(true);
            } else{
                o103.setVisible(true);
            }
            b103.setVisible(false);
        }
        
        if(tictac.getValue(0,0,3) > 0){
            if(tictac.getValue(0,0,3) == 1){
                x104.setVisible(true);
            } else{
                o104.setVisible(true);
            }
            b104.setVisible(false);
        }
        
        if(tictac.getValue(0,1,0) > 0){
            if(tictac.getValue(0,1,0) == 1){
                x105.setVisible(true);
            } else{
                o105.setVisible(true);
            }
            b105.setVisible(false);
        }
        
        if(tictac.getValue(0,1,1) > 0){
            if(tictac.getValue(0,1,1) == 1){
                x106.setVisible(true);
            } else{
                o106.setVisible(true);
            }
            b106.setVisible(false);
        }
        
        if(tictac.getValue(0,1,2) > 0){
            if(tictac.getValue(0,1,2) == 1){
                x107.setVisible(true);
            } else{
                o107.setVisible(true);
            }
            b107.setVisible(false);
        }
        
        if(tictac.getValue(0,1,3) > 0){
            if(tictac.getValue(0,1,3) == 1){
                x108.setVisible(true);
            } else{
                o108.setVisible(true);
            }
            b108.setVisible(false);
        }
        
        if(tictac.getValue(0,2,0) > 0){
            if(tictac.getValue(0,2,0) == 1){
                x109.setVisible(true);
            } else{
                o109.setVisible(true);
            }
            b109.setVisible(false);
        }
       
        if(tictac.getValue(0,2,1) > 0){
            if(tictac.getValue(0,2,1) == 1){
                x110.setVisible(true);
            } else{
                o110.setVisible(true);
            }
            b110.setVisible(false);
        }
        
        if(tictac.getValue(0,2,2) > 0){
            if(tictac.getValue(0,2,2) == 1){
                x111.setVisible(true);
            } else{
                o111.setVisible(true);
            }
            b111.setVisible(false);
        }
        
        if(tictac.getValue(0,2,3) > 0){
            if(tictac.getValue(0,2,3) == 1){
                x112.setVisible(true);
            } else{
                o112.setVisible(true);
            }
            b112.setVisible(false);
        }
        
        if(tictac.getValue(0,3,0) > 0){
            if(tictac.getValue(0,3,0) == 1){
                x113.setVisible(true);
            } else{
                o113.setVisible(true);
            }
            b113.setVisible(false);
        }
        
        if(tictac.getValue(0,3,1) > 0){
            if(tictac.getValue(0,3,1) == 1){
                x114.setVisible(true);
            } else{
                o114.setVisible(true);
            }
            b114.setVisible(false);
        }
        
        if(tictac.getValue(0,3,2) > 0){
            if(tictac.getValue(0,3,2) == 1){
                x115.setVisible(true);
            } else{
                o115.setVisible(true);
            }
            b115.setVisible(false);
        }
        
        if(tictac.getValue(0,3,3) > 0){
            if(tictac.getValue(0,3,3) == 1){
                x116.setVisible(true);
            } else{
                o116.setVisible(true);
            }
            b116.setVisible(false);
        }
        
        if(tictac.getValue(1,0,0) > 0){
            if(tictac.getValue(0,0,0) == 1){
                x201.setVisible(true);
            } else{
                o201.setVisible(true);
            }
            b201.setVisible(false);
        }
        
        if(tictac.getValue(1,0,1) > 0){
            if(tictac.getValue(1,0,1) == 1){
                x202.setVisible(true);
            } else{
                o202.setVisible(true);
            }
            b202.setVisible(false);
        }
        
        if(tictac.getValue(1,0,2) > 0){
            if(tictac.getValue(1,0,2) == 1){
                x203.setVisible(true);
            } else{
                o203.setVisible(true);
            }
            b203.setVisible(false);
        }
        
        if(tictac.getValue(1,0,3) > 0){
            if(tictac.getValue(1,0,3) == 1){
                x204.setVisible(true);
            } else{
                o204.setVisible(true);
            }
            b204.setVisible(false);
        }
        
        if(tictac.getValue(1,1,0) > 0){
            if(tictac.getValue(1,1,0) == 1){
                x205.setVisible(true);
            } else{
                o205.setVisible(true);
            }
            b205.setVisible(false);
        }
        
        if(tictac.getValue(1,1,1) > 0){
            if(tictac.getValue(1,1,1) == 1){
                x206.setVisible(true);
            } else{
                o206.setVisible(true);
            }
            b206.setVisible(false);
        }
        
        if(tictac.getValue(1,1,2) > 0){
            if(tictac.getValue(1,1,2) == 1){
                x207.setVisible(true);
            } else{
                o207.setVisible(true);
            }
            b207.setVisible(false);
        }
        
        if(tictac.getValue(1,1,3) > 0){
            if(tictac.getValue(1,1,3) == 1){
                x208.setVisible(true);
            } else{
                o208.setVisible(true);
            }
            b208.setVisible(false);
        }
        
        if(tictac.getValue(1,2,0) > 0){
            if(tictac.getValue(1,2,0) == 1){
                x209.setVisible(true);
            } else{
                o209.setVisible(true);
            }
            b209.setVisible(false);
        }
       
        if(tictac.getValue(1,2,1) > 0){
            if(tictac.getValue(1,2,1) == 1){
                x210.setVisible(true);
            } else{
                o210.setVisible(true);
            }
            b210.setVisible(false);
        }
        
        if(tictac.getValue(1,2,2) > 0){
            if(tictac.getValue(1,2,2) == 1){
                x211.setVisible(true);
            } else{
                o211.setVisible(true);
            }
            b211.setVisible(false);
        }
        
        if(tictac.getValue(1,2,3) > 0){
            if(tictac.getValue(1,2,3) == 1){
                x212.setVisible(true);
            } else{
                o212.setVisible(true);
            }
            b212.setVisible(false);
        }
        
        if(tictac.getValue(1,3,0) > 0){
            if(tictac.getValue(1,3,0) == 1){
                x213.setVisible(true);
            } else{
                o213.setVisible(true);
            }
            b213.setVisible(false);
        }
        
        if(tictac.getValue(1,3,1) > 0){
            if(tictac.getValue(1,3,1) == 1){
                x214.setVisible(true);
            } else{
                o214.setVisible(true);
            }
            b214.setVisible(false);
        }
        
        if(tictac.getValue(1,3,2) > 0){
            if(tictac.getValue(1,3,2) == 1){
                x215.setVisible(true);
            } else{
                o215.setVisible(true);
            }
            b215.setVisible(false);
        }
        
        if(tictac.getValue(1,3,3) > 0){
            if(tictac.getValue(1,3,3) == 1){
                x216.setVisible(true);
            } else{
                o216.setVisible(true);
            }
            b216.setVisible(false);
        }
        
        if(tictac.getValue(2,0,0) > 0){
            if(tictac.getValue(2,0,0) == 1){
                x301.setVisible(true);
            } else{
                o301.setVisible(true);
            }
            b301.setVisible(false);
        }
        
        if(tictac.getValue(2,0,1) > 0){
            if(tictac.getValue(2,0,1) == 1){
                x302.setVisible(true);
            } else{
                o302.setVisible(true);
            }
            b302.setVisible(false);
        }
        
        if(tictac.getValue(2,0,2) > 0){
            if(tictac.getValue(2,0,2) == 1){
                x303.setVisible(true);
            } else{
                o303.setVisible(true);
            }
            b303.setVisible(false);
        }
        
        if(tictac.getValue(2,0,3) > 0){
            if(tictac.getValue(2,0,3) == 1){
                x304.setVisible(true);
            } else{
                o304.setVisible(true);
            }
            b304.setVisible(false);
        }
        
        if(tictac.getValue(2,1,0) > 0){
            if(tictac.getValue(2,1,0) == 1){
                x305.setVisible(true);
            } else{
                o305.setVisible(true);
            }
            b305.setVisible(false);
        }
        
        if(tictac.getValue(2,1,1) > 0){
            if(tictac.getValue(2,1,1) == 1){
                x306.setVisible(true);
            } else{
                o306.setVisible(true);
            }
            b306.setVisible(false);
        }
        
        if(tictac.getValue(2,1,2) > 0){
            if(tictac.getValue(2,1,2) == 1){
                x307.setVisible(true);
            } else{
                o307.setVisible(true);
            }
            b307.setVisible(false);
        }
        
        if(tictac.getValue(2,1,3) > 0){
            if(tictac.getValue(2,1,3) == 1){
                x308.setVisible(true);
            } else{
                o308.setVisible(true);
            }
            b308.setVisible(false);
        }
        
        if(tictac.getValue(2,2,0) > 0){
            if(tictac.getValue(2,2,0) == 1){
                x309.setVisible(true);
            } else{
                o309.setVisible(true);
            }
            b309.setVisible(false);
        }
       
        if(tictac.getValue(2,2,1) > 0){
            if(tictac.getValue(2,2,1) == 1){
                x310.setVisible(true);
            } else{
                o310.setVisible(true);
            }
            b310.setVisible(false);
        }
        
        if(tictac.getValue(2,2,2) > 0){
            if(tictac.getValue(2,2,2) == 1){
                x311.setVisible(true);
            } else{
                o311.setVisible(true);
            }
            b311.setVisible(false);
        }
        
        if(tictac.getValue(2,2,3) > 0){
            if(tictac.getValue(2,2,3) == 1){
                x312.setVisible(true);
            } else{
                o312.setVisible(true);
            }
            b312.setVisible(false);
        }
        
        if(tictac.getValue(2,3,0) > 0){
            if(tictac.getValue(2,3,0) == 1){
                x313.setVisible(true);
            } else{
                o313.setVisible(true);
            }
            b313.setVisible(false);
        }
        
        if(tictac.getValue(2,3,1) > 0){
            if(tictac.getValue(2,3,1) == 1){
                x314.setVisible(true);
            } else{
                o314.setVisible(true);
            }
            b314.setVisible(false);
        }
        
        if(tictac.getValue(2,3,2) > 0){
            if(tictac.getValue(2,3,2) == 1){
                x315.setVisible(true);
            } else{
                o315.setVisible(true);
            }
            b315.setVisible(false);
        }
        
        if(tictac.getValue(2,3,3) > 0){
            if(tictac.getValue(2,3,3) == 1){
                x316.setVisible(true);
            } else{
                o316.setVisible(true);
            }
            b316.setVisible(false);
        }
        
        if(tictac.getValue(3,0,0) > 0){
            if(tictac.getValue(3,0,0) == 1){
                x401.setVisible(true);
            } else{
                o401.setVisible(true);
            }
            b401.setVisible(false);
        }
        
        if(tictac.getValue(3,0,1) > 0){
            if(tictac.getValue(3,0,1) == 1){
                x402.setVisible(true);
            } else{
                o402.setVisible(true);
            }
            b402.setVisible(false);
        }
        
        if(tictac.getValue(3,0,2) > 0){
            if(tictac.getValue(3,0,2) == 1){
                x403.setVisible(true);
            } else{
                o403.setVisible(true);
            }
            b403.setVisible(false);
        }
        
        if(tictac.getValue(3,0,3) > 0){
            if(tictac.getValue(3,0,3) == 1){
                x404.setVisible(true);
            } else{
                o404.setVisible(true);
            }
            b404.setVisible(false);
        }
        
        if(tictac.getValue(3,1,0) > 0){
            if(tictac.getValue(3,1,0) == 1){
                x405.setVisible(true);
            } else{
                o405.setVisible(true);
            }
            b405.setVisible(false);
        }
        
        if(tictac.getValue(3,1,1) > 0){
            if(tictac.getValue(3,1,1) == 1){
                x406.setVisible(true);
            } else{
                o406.setVisible(true);
            }
            b406.setVisible(false);
        }
        
        if(tictac.getValue(3,1,2) > 0){
            if(tictac.getValue(3,1,2) == 1){
                x407.setVisible(true);
            } else{
                o407.setVisible(true);
            }
            b407.setVisible(false);
        }
        
        if(tictac.getValue(3,1,3) > 0){
            if(tictac.getValue(3,1,3) == 1){
                x408.setVisible(true);
            } else{
                o408.setVisible(true);
            }
            b408.setVisible(false);
        }
        
        if(tictac.getValue(3,2,0) > 0){
            if(tictac.getValue(3,2,0) == 1){
                x409.setVisible(true);
            } else{
                o409.setVisible(true);
            }
            b409.setVisible(false);
        }
       
        if(tictac.getValue(3,2,1) > 0){
            if(tictac.getValue(3,2,1) == 1){
                x410.setVisible(true);
            } else{
                o410.setVisible(true);
            }
            b410.setVisible(false);
        }
        
        if(tictac.getValue(3,2,2) > 0){
            if(tictac.getValue(3,2,2) == 1){
                x411.setVisible(true);
            } else{
                o411.setVisible(true);
            }
            b411.setVisible(false);
        }
        
        if(tictac.getValue(3,2,3) > 0){
            if(tictac.getValue(3,2,3) == 1){
                x412.setVisible(true);
            } else{
                o412.setVisible(true);
            }
            b412.setVisible(false);
        }
        
        if(tictac.getValue(3,3,0) > 0){
            if(tictac.getValue(3,3,0) == 1){
                x413.setVisible(true);
            } else{
                o413.setVisible(true);
            }
            b413.setVisible(false);
        }
        
        if(tictac.getValue(3,3,1) > 0){
            if(tictac.getValue(3,3,1) == 1){
                x414.setVisible(true);
            } else{
                o414.setVisible(true);
            }
            b414.setVisible(false);
        }
        
        if(tictac.getValue(3,3,2) > 0){
            if(tictac.getValue(3,3,2) == 1){
                x415.setVisible(true);
            } else{
                o415.setVisible(true);
            }
            b415.setVisible(false);
        }
        
        if(tictac.getValue(3,3,3) > 0){
            if(tictac.getValue(3,3,3) == 1){
                x416.setVisible(true);
            } else{
                o416.setVisible(true);
            }
            b416.setVisible(false);
        }
        
        if(tictac.getPlay() % 2 == 0){
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        } else{
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        }
    }//GEN-LAST:event_fileChooserActionPerformed

    /*
       This method sets visible the loadPaanel
    */
    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        loadMatchPanel.setVisible(true);
        exitButton.setVisible(false);
        infoButton.setVisible(false);
        loadButton.setVisible(false);
        playButton.setVisible(false);
        mainUI.setVisible(false);
    }//GEN-LAST:event_loadButtonActionPerformed

    /*This method will serialize the board with the name the user desires*/
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        FileHelper fileser = new FileHelper(matchName.getText());
        fileser.saveMatch(tictac);
        restartUI();
        
    }//GEN-LAST:event_submitButtonActionPerformed

    /*
    The following description applies to every button on the board (64 in total)
    The getPlay method will determine if it was player one or player 2 who clicked.
    The matrix location will be set accordingly, and the Player counter
    will be incremented, so the other player can play.
    The game updates the values inside the 76 winning combinations, and calls the hasWon method
    to see if anyone has actually won
    */
    private void b101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b101ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x101.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o101.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(0,0,0,Player.play(tictac.getPlay()));
        b101.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
                
    }//GEN-LAST:event_b101ActionPerformed

    private void infoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoButtonActionPerformed
        infoButton.setVisible(false);
        playButton.setVisible(false);
        loadButton.setVisible(false);
        exitButton.setVisible(false);
        mainUI.setVisible(false);
        secretPanel.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_infoButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        restartUI();// TODO add your handling code here:
    }//GEN-LAST:event_closeButtonActionPerformed

    private void winPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_winPlayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_winPlayActionPerformed

    private void b102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b102ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x102.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o102.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(0,0,1,Player.play(tictac.getPlay()));
        b102.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b102ActionPerformed

    private void b103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b103ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x103.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o103.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(0,0,2,Player.play(tictac.getPlay()));
        b103.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b103ActionPerformed

    private void b104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b104ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x104.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o104.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(0,0,3,Player.play(tictac.getPlay()));
        b104.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b104ActionPerformed

    private void b105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b105ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x105.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o105.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(0,1,0,Player.play(tictac.getPlay()));
        b105.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b105ActionPerformed

    private void b106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b106ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x106.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o106.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(0,1,1,Player.play(tictac.getPlay()));
        b106.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b106ActionPerformed

    private void b107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b107ActionPerformed
       if(tictac.getPlay() % 2 == 0){
            x107.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o107.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(0,1,2,Player.play(tictac.getPlay()));
        b107.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b107ActionPerformed

    private void b108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b108ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x108.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o108.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(0,1,3,Player.play(tictac.getPlay()));
        b108.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b108ActionPerformed

    private void b109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b109ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x109.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o109.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(0,2,0,Player.play(tictac.getPlay()));
        b109.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b109ActionPerformed

    private void b110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b110ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x110.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o110.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(0,2,1,Player.play(tictac.getPlay()));
        b110.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b110ActionPerformed

    private void b111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b111ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x111.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o111.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(0,2,2,Player.play(tictac.getPlay()));
        b111.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b111ActionPerformed

    private void b112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b112ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x112.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o112.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(0,2,3,Player.play(tictac.getPlay()));
        b112.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b112ActionPerformed

    private void b113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b113ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x113.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o113.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(0,3,0,Player.play(tictac.getPlay()));
        b113.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b113ActionPerformed

    private void b114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b114ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x114.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o114.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(0,3,1,Player.play(tictac.getPlay()));
        b114.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b114ActionPerformed

    private void b115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b115ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x115.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o115.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(0,3,2,Player.play(tictac.getPlay()));
        b115.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b115ActionPerformed

    private void b116ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b116ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x116.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o116.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(0,3,3,Player.play(tictac.getPlay()));
        b116.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b116ActionPerformed

    private void b201ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b201ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x201.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o201.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(1,0,0,Player.play(tictac.getPlay()));
        b201.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b201ActionPerformed

    private void b202ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b202ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x202.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o202.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(1,0,1,Player.play(tictac.getPlay()));
        b202.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b202ActionPerformed

    private void b203ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b203ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x203.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o203.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(1,0,2,Player.play(tictac.getPlay()));
        b203.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b203ActionPerformed

    private void b204ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b204ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x204.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o204.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(1,0,3,Player.play(tictac.getPlay()));
        b204.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b204ActionPerformed

    private void b205ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b205ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x205.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o205.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(1,1,0,Player.play(tictac.getPlay()));
        b205.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b205ActionPerformed

    private void b206ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b206ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x206.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o206.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(1,1,1,Player.play(tictac.getPlay()));
        b206.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b206ActionPerformed

    private void b207ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b207ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x207.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o207.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(1,1,2,Player.play(tictac.getPlay()));
        b207.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b207ActionPerformed

    private void b208ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b208ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x208.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o208.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(1,1,3,Player.play(tictac.getPlay()));
        b208.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b208ActionPerformed

    private void b209ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b209ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x209.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o209.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(1,2,0,Player.play(tictac.getPlay()));
        b209.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b209ActionPerformed

    private void b210ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b210ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x210.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o210.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(1,2,1,Player.play(tictac.getPlay()));
        b210.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b210ActionPerformed

    private void b211ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b211ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x211.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o211.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(1,2,2,Player.play(tictac.getPlay()));
        b211.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b211ActionPerformed

    private void b212ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b212ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x212.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o212.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(1,2,3,Player.play(tictac.getPlay()));
        b212.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b212ActionPerformed

    private void b213ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b213ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x213.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o213.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(1,3,0,Player.play(tictac.getPlay()));
        b213.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b213ActionPerformed

    private void b214ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b214ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x214.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o214.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(1,3,1,Player.play(tictac.getPlay()));
        b214.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b214ActionPerformed

    private void b215ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b215ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x215.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o215.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(1,3,2,Player.play(tictac.getPlay()));
        b215.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b215ActionPerformed

    private void b216ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b216ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x216.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o216.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(1,3,3,Player.play(tictac.getPlay()));
        b216.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b216ActionPerformed

    private void b301ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b301ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x301.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o301.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(2,0,0,Player.play(tictac.getPlay()));
        b301.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b301ActionPerformed

    private void b302ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b302ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x302.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o302.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(2,0,1,Player.play(tictac.getPlay()));
        b302.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b302ActionPerformed

    private void b303ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b303ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x303.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o303.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(2,0,2,Player.play(tictac.getPlay()));
        b303.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b303ActionPerformed

    private void b304ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b304ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x304.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o304.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(2,0,3,Player.play(tictac.getPlay()));
        b304.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b304ActionPerformed

    private void b305ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b305ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x305.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o305.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(2,1,0,Player.play(tictac.getPlay()));
        b305.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b305ActionPerformed

    private void b306ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b306ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x306.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o306.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(2,1,1,Player.play(tictac.getPlay()));
        b306.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b306ActionPerformed

    private void b307ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b307ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x307.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o307.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(2,1,2,Player.play(tictac.getPlay()));
        b307.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b307ActionPerformed

    private void b308ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b308ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x308.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o308.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(2,1,3,Player.play(tictac.getPlay()));
        b308.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b308ActionPerformed

    private void b309ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b309ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x309.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o309.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(2,2,0,Player.play(tictac.getPlay()));
        b309.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b309ActionPerformed

    private void b310ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b310ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x310.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o310.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(2,2,1,Player.play(tictac.getPlay()));
        b310.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b310ActionPerformed

    private void b311ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b311ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x311.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o311.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(2,2,2,Player.play(tictac.getPlay()));
        b311.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b311ActionPerformed

    private void b312ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b312ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x312.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o312.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(2,2,3,Player.play(tictac.getPlay()));
        b312.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b312ActionPerformed

    private void b313ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b313ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x313.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o313.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(2,3,0,Player.play(tictac.getPlay()));
        b313.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b313ActionPerformed

    private void b314ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b314ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x314.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o314.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(2,3,1,Player.play(tictac.getPlay()));
        b314.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b314ActionPerformed

    private void b315ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b315ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x315.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o315.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(2,3,2,Player.play(tictac.getPlay()));
        b315.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b315ActionPerformed

    private void b316ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b316ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x316.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o316.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(2,3,3,Player.play(tictac.getPlay()));
        b316.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b316ActionPerformed

    private void b401ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b401ActionPerformed
       if(tictac.getPlay() % 2 == 0){
            x401.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o401.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(3,0,0,Player.play(tictac.getPlay()));
        b401.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b401ActionPerformed

    private void b402ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b402ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x402.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o402.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(3,0,1,Player.play(tictac.getPlay()));
        b402.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b402ActionPerformed

    private void b403ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b403ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x403.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o403.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(3,0,2,Player.play(tictac.getPlay()));
        b403.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b403ActionPerformed

    private void b404ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b404ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x404.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o404.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(3,0,3,Player.play(tictac.getPlay()));
        b404.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b404ActionPerformed

    private void b405ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b405ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x405.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o405.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(3,1,0,Player.play(tictac.getPlay()));
        b405.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b405ActionPerformed

    private void b406ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b406ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x406.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o406.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(3,1,1,Player.play(tictac.getPlay()));
        b406.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b406ActionPerformed

    private void b407ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b407ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x407.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o407.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(3,1,2,Player.play(tictac.getPlay()));
        b407.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b407ActionPerformed

    private void b408ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b408ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x408.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o408.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(3,1,3,Player.play(tictac.getPlay()));
        b408.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b408ActionPerformed

    private void b409ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b409ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x409.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o409.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(3,2,0,Player.play(tictac.getPlay()));
        b409.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b409ActionPerformed

    private void b410ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b410ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x410.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o410.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(3,2,1,Player.play(tictac.getPlay()));
        b410.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b410ActionPerformed

    private void b411ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b411ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x411.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o411.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(3,2,2,Player.play(tictac.getPlay()));
        b411.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b411ActionPerformed

    private void b412ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b412ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x412.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o412.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(3,2,3,Player.play(tictac.getPlay()));
        b412.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b412ActionPerformed

    private void b413ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b413ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x413.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o413.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(3,3,0,Player.play(tictac.getPlay()));
        b413.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b413ActionPerformed

    private void b414ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b414ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x414.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o414.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(3,3,1,Player.play(tictac.getPlay()));
        b414.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b414ActionPerformed

    private void b415ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b415ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x415.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o415.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(3,3,2,Player.play(tictac.getPlay()));
        b415.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b415ActionPerformed

    private void b416ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b416ActionPerformed
        if(tictac.getPlay() % 2 == 0){
            x416.setVisible(true);
            p1Turn.setVisible(false);
            p2Turn.setVisible(true);
        } else{
            o416.setVisible(true);
            p1Turn.setVisible(true);
            p2Turn.setVisible(false);
        }
        tictac.setValue(3,3,3,Player.play(tictac.getPlay()));
        b416.setVisible(false);
        tictac.addPlay();
        A1 = tictac.getValue(0,0,0)*tictac.getValue(0,0,1)*tictac.getValue(0,0,2)*tictac.getValue(0,0,3);
        A2 = tictac.getValue(0,1,0)*tictac.getValue(0,1,1)*tictac.getValue(0,1,2)*tictac.getValue(0,1,3);
        A3 = tictac.getValue(0,2,0)*tictac.getValue(0,2,1)*tictac.getValue(0,2,2)*tictac.getValue(0,2,3);
        A4 = tictac.getValue(0,3,0)*tictac.getValue(0,3,1)*tictac.getValue(0,3,2)*tictac.getValue(0,3,3);
        A5 = tictac.getValue(0,0,0)*tictac.getValue(0,1,0)*tictac.getValue(0,2,0)*tictac.getValue(0,3,0);
        A6 = tictac.getValue(0,0,1)*tictac.getValue(0,1,1)*tictac.getValue(0,2,1)*tictac.getValue(0,3,1);
        A7 = tictac.getValue(0,0,2)*tictac.getValue(0,1,2)*tictac.getValue(0,2,2)*tictac.getValue(0,3,2);
        A8 = tictac.getValue(0,0,3)*tictac.getValue(0,1,3)*tictac.getValue(0,2,3)*tictac.getValue(0,3,3);
        A9 = tictac.getValue(0,0,0)*tictac.getValue(0,1,1)*tictac.getValue(0,2,2)*tictac.getValue(0,3,3);
        A10 = tictac.getValue(0,0,3)*tictac.getValue(0,1,2)*tictac.getValue(0,2,1)*tictac.getValue(0,3,0);
        B1 = tictac.getValue(1,0,0)*tictac.getValue(1,0,1)*tictac.getValue(1,0,2)*tictac.getValue(1,0,3);
        B2 = tictac.getValue(1,1,0)*tictac.getValue(1,1,1)*tictac.getValue(1,1,2)*tictac.getValue(1,1,3);
        B3 = tictac.getValue(1,2,0)*tictac.getValue(1,2,1)*tictac.getValue(1,2,2)*tictac.getValue(1,2,3);
        B4 = tictac.getValue(1,3,0)*tictac.getValue(1,3,1)*tictac.getValue(1,3,2)*tictac.getValue(1,3,3);
        B5 = tictac.getValue(1,0,0)*tictac.getValue(1,1,0)*tictac.getValue(1,2,0)*tictac.getValue(1,3,0);
        B6 = tictac.getValue(1,0,1)*tictac.getValue(1,1,1)*tictac.getValue(1,2,1)*tictac.getValue(1,3,1);
        B7 = tictac.getValue(1,0,2)*tictac.getValue(1,1,2)*tictac.getValue(1,2,2)*tictac.getValue(1,3,2);
        B8 = tictac.getValue(1,0,3)*tictac.getValue(1,1,3)*tictac.getValue(1,2,3)*tictac.getValue(1,3,3);
        B9 = tictac.getValue(1,0,0)*tictac.getValue(1,1,1)*tictac.getValue(1,2,2)*tictac.getValue(1,3,3);
        B10 = tictac.getValue(1,0,3)*tictac.getValue(1,1,2)*tictac.getValue(1,2,1)*tictac.getValue(1,3,0);
        C1 = tictac.getValue(2,0,0)*tictac.getValue(2,0,1)*tictac.getValue(2,0,2)*tictac.getValue(2,0,3);
        C2 = tictac.getValue(2,1,0)*tictac.getValue(2,1,1)*tictac.getValue(2,1,2)*tictac.getValue(2,1,3);
        C3 = tictac.getValue(2,2,0)*tictac.getValue(2,2,1)*tictac.getValue(2,2,2)*tictac.getValue(2,2,3);
        C4 = tictac.getValue(2,3,0)*tictac.getValue(2,3,1)*tictac.getValue(2,3,2)*tictac.getValue(2,3,3);
        C5 = tictac.getValue(2,0,0)*tictac.getValue(2,1,0)*tictac.getValue(2,2,0)*tictac.getValue(2,3,0);
        C6 = tictac.getValue(2,0,1)*tictac.getValue(2,1,1)*tictac.getValue(2,2,1)*tictac.getValue(2,3,1);
        C7 = tictac.getValue(2,0,2)*tictac.getValue(2,1,2)*tictac.getValue(2,2,2)*tictac.getValue(2,3,2);
        C8 = tictac.getValue(2,0,3)*tictac.getValue(2,1,3)*tictac.getValue(2,2,3)*tictac.getValue(2,3,3);
        C9 = tictac.getValue(2,0,0)*tictac.getValue(2,1,1)*tictac.getValue(2,2,2)*tictac.getValue(2,3,3);
        C10 = tictac.getValue(2,0,3)*tictac.getValue(2,1,2)*tictac.getValue(2,2,1)*tictac.getValue(2,3,0);
        D1 = tictac.getValue(3,0,0)*tictac.getValue(3,0,1)*tictac.getValue(3,0,2)*tictac.getValue(3,0,3);
        D2 = tictac.getValue(3,1,0)*tictac.getValue(3,1,1)*tictac.getValue(3,1,2)*tictac.getValue(3,1,3);
        D3 = tictac.getValue(3,2,0)*tictac.getValue(3,2,1)*tictac.getValue(3,2,2)*tictac.getValue(3,2,3);
        D4 = tictac.getValue(3,3,0)*tictac.getValue(3,3,1)*tictac.getValue(3,3,2)*tictac.getValue(3,3,3);
        D5 = tictac.getValue(3,0,0)*tictac.getValue(3,1,0)*tictac.getValue(3,2,0)*tictac.getValue(3,3,0);
        D6 = tictac.getValue(3,0,1)*tictac.getValue(3,1,1)*tictac.getValue(3,2,1)*tictac.getValue(3,3,1);
        D7 = tictac.getValue(3,0,2)*tictac.getValue(3,1,2)*tictac.getValue(3,2,2)*tictac.getValue(3,3,2);
        D8 = tictac.getValue(3,0,3)*tictac.getValue(3,1,3)*tictac.getValue(3,2,3)*tictac.getValue(3,3,3);
        D9 = tictac.getValue(3,0,0)*tictac.getValue(3,1,1)*tictac.getValue(3,2,2)*tictac.getValue(3,3,3);
        D10 = tictac.getValue(3,0,3)*tictac.getValue(3,1,2)*tictac.getValue(3,2,1)*tictac.getValue(3,3,0);
        V1 = tictac.getValue(0,0,0)*tictac.getValue(1,0,0)*tictac.getValue(2,0,0)*tictac.getValue(3,0,0);
        V2 = tictac.getValue(0,0,1)*tictac.getValue(1,0,1)*tictac.getValue(2,0,1)*tictac.getValue(3,0,1);
        V3 = tictac.getValue(0,0,2)*tictac.getValue(1,0,2)*tictac.getValue(2,0,2)*tictac.getValue(3,0,2);
        V4 = tictac.getValue(0,0,3)*tictac.getValue(1,0,3)*tictac.getValue(2,0,3)*tictac.getValue(3,0,3);
        V5 = tictac.getValue(0,1,0)*tictac.getValue(1,1,0)*tictac.getValue(2,1,0)*tictac.getValue(3,1,0);
        V6 = tictac.getValue(0,1,1)*tictac.getValue(1,1,1)*tictac.getValue(2,1,1)*tictac.getValue(3,1,1);
        V7 = tictac.getValue(0,1,2)*tictac.getValue(1,1,2)*tictac.getValue(2,1,2)*tictac.getValue(3,1,2);
        V8 = tictac.getValue(0,1,3)*tictac.getValue(1,1,3)*tictac.getValue(2,1,3)*tictac.getValue(3,1,3);
        V9 = tictac.getValue(0,2,0)*tictac.getValue(1,2,0)*tictac.getValue(2,2,0)*tictac.getValue(3,2,0);
        V10 = tictac.getValue(0,2,1)*tictac.getValue(1,2,1)*tictac.getValue(2,2,1)*tictac.getValue(3,2,1);
        V11 = tictac.getValue(0,2,2)*tictac.getValue(1,2,2)*tictac.getValue(2,2,2)*tictac.getValue(3,2,2);
        V12 = tictac.getValue(0,2,3)*tictac.getValue(1,2,3)*tictac.getValue(2,2,3)*tictac.getValue(3,2,3);
        V13 = tictac.getValue(0,3,0)*tictac.getValue(1,3,0)*tictac.getValue(2,3,0)*tictac.getValue(3,3,0);
        V14 = tictac.getValue(0,3,1)*tictac.getValue(1,3,1)*tictac.getValue(2,3,1)*tictac.getValue(3,3,1);
        V15 = tictac.getValue(0,3,2)*tictac.getValue(1,3,2)*tictac.getValue(2,3,2)*tictac.getValue(3,3,2);
        V16 = tictac.getValue(0,3,3)*tictac.getValue(1,3,3)*tictac.getValue(2,3,3)*tictac.getValue(3,3,3);
        DV1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,0)*tictac.getValue(2,2,0)*tictac.getValue(3,3,0);
        DV2 = tictac.getValue(3,0,0)*tictac.getValue(2,1,0)*tictac.getValue(1,2,0)*tictac.getValue(0,3,0);
        DV3 = tictac.getValue(0,0,0)*tictac.getValue(1,0,1)*tictac.getValue(2,0,2)*tictac.getValue(3,0,3);
        DV4 = tictac.getValue(3,0,0)*tictac.getValue(2,0,1)*tictac.getValue(1,0,2)*tictac.getValue(0,0,3);
        DV5 = tictac.getValue(0,0,3)*tictac.getValue(1,1,3)*tictac.getValue(2,2,3)*tictac.getValue(3,3,3);
        DV6 = tictac.getValue(3,0,3)*tictac.getValue(2,1,3)*tictac.getValue(1,2,3)*tictac.getValue(0,3,3);
        DV7 = tictac.getValue(0,3,0)*tictac.getValue(1,3,1)*tictac.getValue(2,3,2)*tictac.getValue(3,3,3);
        DV8 = tictac.getValue(3,3,0)*tictac.getValue(2,3,1)*tictac.getValue(1,3,2)*tictac.getValue(0,3,3);
        DT1 = tictac.getValue(0,0,0)*tictac.getValue(1,1,1)*tictac.getValue(2,2,2)*tictac.getValue(3,3,3);
        DT2 = tictac.getValue(0,3,0)*tictac.getValue(1,2,1)*tictac.getValue(2,1,2)*tictac.getValue(3,0,3);
        DT3 = tictac.getValue(0,0,3)*tictac.getValue(1,1,2)*tictac.getValue(2,2,1)*tictac.getValue(3,3,0);
        DT4 = tictac.getValue(0,3,3)*tictac.getValue(1,2,2)*tictac.getValue(2,1,1)*tictac.getValue(3,0,0);
        DVI1 = tictac.getValue(0,1,0)*tictac.getValue(1,1,1)*tictac.getValue(2,1,2)*tictac.getValue(3,1,3);
        DVI2 = tictac.getValue(0,2,0)*tictac.getValue(1,2,1)*tictac.getValue(2,2,2)*tictac.getValue(3,2,3);
        DVI3 = tictac.getValue(0,1,3)*tictac.getValue(1,1,2)*tictac.getValue(2,1,1)*tictac.getValue(3,1,0);
        DVI4 = tictac.getValue(0,2,3)*tictac.getValue(1,2,2)*tictac.getValue(2,2,1)*tictac.getValue(3,2,0);
        DVI5 = tictac.getValue(0,0,1)*tictac.getValue(1,1,1)*tictac.getValue(2,2,1)*tictac.getValue(3,3,1);
        DVI6 = tictac.getValue(0,0,2)*tictac.getValue(1,1,2)*tictac.getValue(2,2,2)*tictac.getValue(3,3,2);
        DVI7 = tictac.getValue(0,3,1)*tictac.getValue(1,2,1)*tictac.getValue(2,1,1)*tictac.getValue(3,0,1);
        DVI8 = tictac.getValue(0,3,2)*tictac.getValue(1,2,2)*tictac.getValue(2,1,2)*tictac.getValue(3,0,2);
        hasWon();
    }//GEN-LAST:event_b416ActionPerformed

    private void clsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clsButtonActionPerformed
       restartUI();
    }//GEN-LAST:event_clsButtonActionPerformed

    private void exButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exButtonActionPerformed
       restartUI();
    }//GEN-LAST:event_exButtonActionPerformed

    /*This method will restart the board, however, players will be the same*/
    private void restartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartButtonActionPerformed
        int i, j, k;
        for(i = 0; i < 4; i++){
            for(j = 0; j < 4; j++){
                for(k = 0; k < 4; k++){
                    tictac.setValue(i,j,k,0);
                }
            }
        }
        b101.setVisible(true);
        b102.setVisible(true);
        b103.setVisible(true);
        b104.setVisible(true);
        b105.setVisible(true);
        b106.setVisible(true);
        b107.setVisible(true);
        b108.setVisible(true);
        b109.setVisible(true);
        b110.setVisible(true);
        b111.setVisible(true);
        b112.setVisible(true);
        b113.setVisible(true);
        b114.setVisible(true);
        b115.setVisible(true);
        b116.setVisible(true);
        b201.setVisible(true);
        b202.setVisible(true);
        b203.setVisible(true);
        b204.setVisible(true);
        b205.setVisible(true);
        b206.setVisible(true);
        b207.setVisible(true);
        b208.setVisible(true);
        b209.setVisible(true);
        b210.setVisible(true);
        b211.setVisible(true);
        b212.setVisible(true);
        b213.setVisible(true);
        b214.setVisible(true);
        b215.setVisible(true);
        b216.setVisible(true);
        b301.setVisible(true);
        b302.setVisible(true);
        b303.setVisible(true);
        b304.setVisible(true);
        b305.setVisible(true);
        b306.setVisible(true);
        b307.setVisible(true);
        b308.setVisible(true);
        b309.setVisible(true);
        b310.setVisible(true);
        b311.setVisible(true);
        b312.setVisible(true);
        b313.setVisible(true);
        b314.setVisible(true);
        b315.setVisible(true);
        b316.setVisible(true);
        b401.setVisible(true);
        b402.setVisible(true);
        b403.setVisible(true);
        b404.setVisible(true);
        b405.setVisible(true);
        b406.setVisible(true);
        b407.setVisible(true);
        b408.setVisible(true);
        b409.setVisible(true);
        b410.setVisible(true);
        b411.setVisible(true);
        b412.setVisible(true);
        b413.setVisible(true);
        b414.setVisible(true);
        b415.setVisible(true);
        b416.setVisible(true);
        x101.setVisible(false);
        x102.setVisible(false);
        x103.setVisible(false);
        x104.setVisible(false);
        x105.setVisible(false);
        x106.setVisible(false);
        x107.setVisible(false);
        x108.setVisible(false);
        x109.setVisible(false);
        x110.setVisible(false);
        x111.setVisible(false);
        x112.setVisible(false);
        x113.setVisible(false);
        x114.setVisible(false);
        x115.setVisible(false);
        x116.setVisible(false);
        o101.setVisible(false);
        o102.setVisible(false);
        o103.setVisible(false);
        o104.setVisible(false);
        o105.setVisible(false);
        o106.setVisible(false);
        o107.setVisible(false);
        o108.setVisible(false);
        o109.setVisible(false);
        o110.setVisible(false);
        o111.setVisible(false);
        o112.setVisible(false);
        o113.setVisible(false);
        o114.setVisible(false);
        o115.setVisible(false);
        o116.setVisible(false);
        x201.setVisible(false);
        x202.setVisible(false);
        x203.setVisible(false);
        x204.setVisible(false);
        x205.setVisible(false);
        x206.setVisible(false);
        x207.setVisible(false);
        x208.setVisible(false);
        x209.setVisible(false);
        x210.setVisible(false);
        x211.setVisible(false);
        x212.setVisible(false);
        x213.setVisible(false);
        x214.setVisible(false);
        x215.setVisible(false);
        x216.setVisible(false);
        o201.setVisible(false);
        o202.setVisible(false);
        o203.setVisible(false);
        o204.setVisible(false);
        o205.setVisible(false);
        o206.setVisible(false);
        o207.setVisible(false);
        o208.setVisible(false);
        o209.setVisible(false);
        o210.setVisible(false);
        o211.setVisible(false);
        o212.setVisible(false);
        o213.setVisible(false);
        o214.setVisible(false);
        o215.setVisible(false);
        o216.setVisible(false);
        x301.setVisible(false);
        x302.setVisible(false);
        x303.setVisible(false);
        x304.setVisible(false);
        x305.setVisible(false);
        x306.setVisible(false);
        x307.setVisible(false);
        x308.setVisible(false);
        x309.setVisible(false);
        x310.setVisible(false);
        x311.setVisible(false);
        x312.setVisible(false);
        x313.setVisible(false);
        x314.setVisible(false);
        x315.setVisible(false);
        x316.setVisible(false);
        o301.setVisible(false);
        o302.setVisible(false);
        o303.setVisible(false);
        o304.setVisible(false);
        o305.setVisible(false);
        o306.setVisible(false);
        o307.setVisible(false);
        o308.setVisible(false);
        o309.setVisible(false);
        o310.setVisible(false);
        o311.setVisible(false);
        o312.setVisible(false);
        o313.setVisible(false);
        o314.setVisible(false);
        o315.setVisible(false);
        o316.setVisible(false);
        x401.setVisible(false);
        x402.setVisible(false);
        x403.setVisible(false);
        x404.setVisible(false);
        x405.setVisible(false);
        x406.setVisible(false);
        x407.setVisible(false);
        x408.setVisible(false);
        x409.setVisible(false);
        x410.setVisible(false);
        x411.setVisible(false);
        x412.setVisible(false);
        x413.setVisible(false);
        x414.setVisible(false);
        x415.setVisible(false);
        x416.setVisible(false);
        o401.setVisible(false);
        o402.setVisible(false);
        o403.setVisible(false);
        o404.setVisible(false);
        o405.setVisible(false);
        o406.setVisible(false);
        o407.setVisible(false);
        o408.setVisible(false);
        o409.setVisible(false);
        o410.setVisible(false);
        o411.setVisible(false);
        o412.setVisible(false);
        o413.setVisible(false);
        o414.setVisible(false);
        o415.setVisible(false);
        o416.setVisible(false);
        tictac.setPlay(0);
        p1Turn.setVisible(true);
        p2Turn.setVisible(false);
        opcPanel.setVisible(false);
        tictac.addOpc();
    }//GEN-LAST:event_restartButtonActionPerformed

    private void p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2ActionPerformed

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeActionPerformed
    
    /*This function will restart the UI to its original state, as well as all the
    images and objects. As if it was just launched for the first time
    */
    private void restartUI(){
        int i, j, k;
        mainUI.setVisible(true);
        playButton.setVisible(true);
        loadButton.setVisible(true);
        infoButton.setVisible(true);
        exitButton.setVisible(true);
        namePanel.setVisible(false);
        gamePanel.setVisible(false);
        opcPanel.setVisible(false);
        saveImg.setVisible(false);
        matchName.setVisible(false);
        submitButton.setVisible(false);
        optionsButton.setEnabled(true);
        restartButton.setVisible(true);
        exitMatchButton.setVisible(true);
        saveButton.setVisible(true);
        if(tictac.getOpc() % 2 == 1){
            tictac.addOpc();//So opcPanel sets to not visible
        }
        if(tictac.getPlay() % 2 == 1){
            tictac.addOpc();//So player 1 is the one who plays first
        }
        secretPanel.setVisible(false);
        for(i = 0; i < 4; i++){
            for(j = 0; j < 4; j++){
                for(k = 0; k < 4; k++){
                    tictac.setValue(i, j, k, 0);//this will fill the matrix with 0
                }
            }
        }
        b101.setEnabled(true);
        b102.setEnabled(true);
        b103.setEnabled(true);
        b104.setEnabled(true);
        b105.setEnabled(true);
        b106.setEnabled(true);
        b107.setEnabled(true);
        b108.setEnabled(true);
        b109.setEnabled(true);
        b110.setEnabled(true);
        b111.setEnabled(true);
        b112.setEnabled(true);
        b113.setEnabled(true);
        b114.setEnabled(true);
        b115.setEnabled(true);
        b116.setEnabled(true);
        b201.setEnabled(true);
        b202.setEnabled(true);
        b203.setEnabled(true);
        b204.setEnabled(true);
        b205.setEnabled(true);
        b206.setEnabled(true);
        b207.setEnabled(true);
        b208.setEnabled(true);
        b209.setEnabled(true);
        b210.setEnabled(true);
        b211.setEnabled(true);
        b212.setEnabled(true);
        b213.setEnabled(true);
        b214.setEnabled(true);
        b215.setEnabled(true);
        b216.setEnabled(true);
        b301.setEnabled(true);
        b302.setEnabled(true);
        b303.setEnabled(true);
        b304.setEnabled(true);
        b305.setEnabled(true);
        b306.setEnabled(true);
        b307.setEnabled(true);
        b308.setEnabled(true);
        b309.setEnabled(true);
        b310.setEnabled(true);
        b311.setEnabled(true);
        b312.setEnabled(true);
        b313.setEnabled(true);
        b314.setEnabled(true);
        b315.setEnabled(true);
        b316.setEnabled(true);
        b401.setEnabled(true);
        b402.setEnabled(true);
        b403.setEnabled(true);
        b404.setEnabled(true);
        b405.setEnabled(true);
        b406.setEnabled(true);
        b407.setEnabled(true);
        b408.setEnabled(true);
        b409.setEnabled(true);
        b410.setEnabled(true);
        b411.setEnabled(true);
        b412.setEnabled(true);
        b413.setEnabled(true);
        b414.setEnabled(true);
        b415.setEnabled(true);
        b416.setEnabled(true);
        b101.setVisible(true);
        b102.setVisible(true);
        b103.setVisible(true);
        b104.setVisible(true);
        b105.setVisible(true);
        b106.setVisible(true);
        b107.setVisible(true);
        b108.setVisible(true);
        b109.setVisible(true);
        b110.setVisible(true);
        b111.setVisible(true);
        b112.setVisible(true);
        b113.setVisible(true);
        b114.setVisible(true);
        b115.setVisible(true);
        b116.setVisible(true);
        b201.setVisible(true);
        b202.setVisible(true);
        b203.setVisible(true);
        b204.setVisible(true);
        b205.setVisible(true);
        b206.setVisible(true);
        b207.setVisible(true);
        b208.setVisible(true);
        b209.setVisible(true);
        b210.setVisible(true);
        b211.setVisible(true);
        b212.setVisible(true);
        b213.setVisible(true);
        b214.setVisible(true);
        b215.setVisible(true);
        b216.setVisible(true);
        b301.setVisible(true);
        b302.setVisible(true);
        b303.setVisible(true);
        b304.setVisible(true);
        b305.setVisible(true);
        b306.setVisible(true);
        b307.setVisible(true);
        b308.setVisible(true);
        b309.setVisible(true);
        b310.setVisible(true);
        b311.setVisible(true);
        b312.setVisible(true);
        b313.setVisible(true);
        b314.setVisible(true);
        b315.setVisible(true);
        b316.setVisible(true);
        b401.setVisible(true);
        b402.setVisible(true);
        b403.setVisible(true);
        b404.setVisible(true);
        b405.setVisible(true);
        b406.setVisible(true);
        b407.setVisible(true);
        b408.setVisible(true);
        b409.setVisible(true);
        b410.setVisible(true);
        b411.setVisible(true);
        b412.setVisible(true);
        b413.setVisible(true);
        b414.setVisible(true);
        b415.setVisible(true);
        b416.setVisible(true);
        x101.setVisible(false);
        x102.setVisible(false);
        x103.setVisible(false);
        x104.setVisible(false);
        x105.setVisible(false);
        x106.setVisible(false);
        x107.setVisible(false);
        x108.setVisible(false);
        x109.setVisible(false);
        x110.setVisible(false);
        x111.setVisible(false);
        x112.setVisible(false);
        x113.setVisible(false);
        x114.setVisible(false);
        x115.setVisible(false);
        x116.setVisible(false);
        o101.setVisible(false);
        o102.setVisible(false);
        o103.setVisible(false);
        o104.setVisible(false);
        o105.setVisible(false);
        o106.setVisible(false);
        o107.setVisible(false);
        o108.setVisible(false);
        o109.setVisible(false);
        o110.setVisible(false);
        o111.setVisible(false);
        o112.setVisible(false);
        o113.setVisible(false);
        o114.setVisible(false);
        o115.setVisible(false);
        o116.setVisible(false);
        x201.setVisible(false);
        x202.setVisible(false);
        x203.setVisible(false);
        x204.setVisible(false);
        x205.setVisible(false);
        x206.setVisible(false);
        x207.setVisible(false);
        x208.setVisible(false);
        x209.setVisible(false);
        x210.setVisible(false);
        x211.setVisible(false);
        x212.setVisible(false);
        x213.setVisible(false);
        x214.setVisible(false);
        x215.setVisible(false);
        x216.setVisible(false);
        o201.setVisible(false);
        o202.setVisible(false);
        o203.setVisible(false);
        o204.setVisible(false);
        o205.setVisible(false);
        o206.setVisible(false);
        o207.setVisible(false);
        o208.setVisible(false);
        o209.setVisible(false);
        o210.setVisible(false);
        o211.setVisible(false);
        o212.setVisible(false);
        o213.setVisible(false);
        o214.setVisible(false);
        o215.setVisible(false);
        o216.setVisible(false);
        x301.setVisible(false);
        x302.setVisible(false);
        x303.setVisible(false);
        x304.setVisible(false);
        x305.setVisible(false);
        x306.setVisible(false);
        x307.setVisible(false);
        x308.setVisible(false);
        x309.setVisible(false);
        x310.setVisible(false);
        x311.setVisible(false);
        x312.setVisible(false);
        x313.setVisible(false);
        x314.setVisible(false);
        x315.setVisible(false);
        x316.setVisible(false);
        o301.setVisible(false);
        o302.setVisible(false);
        o303.setVisible(false);
        o304.setVisible(false);
        o305.setVisible(false);
        o306.setVisible(false);
        o307.setVisible(false);
        o308.setVisible(false);
        o309.setVisible(false);
        o310.setVisible(false);
        o311.setVisible(false);
        o312.setVisible(false);
        o313.setVisible(false);
        o314.setVisible(false);
        o315.setVisible(false);
        o316.setVisible(false);
        x401.setVisible(false);
        x402.setVisible(false);
        x403.setVisible(false);
        x404.setVisible(false);
        x405.setVisible(false);
        x406.setVisible(false);
        x407.setVisible(false);
        x408.setVisible(false);
        x409.setVisible(false);
        x410.setVisible(false);
        x411.setVisible(false);
        x412.setVisible(false);
        x413.setVisible(false);
        x414.setVisible(false);
        x415.setVisible(false);
        x416.setVisible(false);
        o401.setVisible(false);
        o402.setVisible(false);
        o403.setVisible(false);
        o404.setVisible(false);
        o405.setVisible(false);
        o406.setVisible(false);
        o407.setVisible(false);
        o408.setVisible(false);
        o409.setVisible(false);
        o410.setVisible(false);
        o411.setVisible(false);
        o412.setVisible(false);
        o413.setVisible(false);
        o414.setVisible(false);
        o415.setVisible(false);
        o416.setVisible(false);
        winPanel.setVisible(false);
        p1Turn.setVisible(true);
        p2Turn.setVisible(false);
        tictac.setPlay(0);
        loadMatchPanel.setVisible(false);
        player1Name.setText("");
        player2Name.setText("");
    }
    
    /*This function tests if any of the winning combinations has bee triggered by any
    of the players. If player one won, it will set visible the winPanel and
    display a message. The same applies to plaer 2.
    If there are no more moves available (the whole board is filled), the computer will determine
    a tie. After any of the three results happened, it will write the result to a file called stats.txt
    */
    private void hasWon(){
        if(A1 == 1 || A2 == 1 || A3 == 1 || A4 == 1 || A5 == 1 || A6 == 1 || A7 == 1 || A8 == 1 || A9 == 1 || A10 == 1 || B1 == 1 || B2 == 1 || B3 == 1 || B4 == 1 || B5 == 1 || B6 == 1 || B7 == 1 || B8 == 1 || B9 == 1 || B10 == 1 || C1 == 1 || C2 == 1 || C3 == 1 || C4 == 1 || C5 == 1 || C6 == 1 || C7 == 1 || C8 == 1 || C9 == 1 || C10 == 1 || D1 == 1 || D2 == 1 || D3 == 1 || D4 == 1 || D5 == 1 || D6 == 1 || D7 == 1 || D8 == 1 || D9 == 1 || D10 == 1 || DT1 == 1 || DT2 == 1 || DT3 == 1 || DT4 == 1 || DV1 == 1 || DV2 == 1 || DV3 == 1 || DV4 == 1 || DV5 == 1 || DV6 == 1 || DV7 == 1 || DV8 == 1 || V1 == 1 || V2 == 1 || V3 == 1 || V4 == 1 || V5 == 1 || V6 == 1 || V7 == 1 || V8 == 1 || V9 == 1 || V10 == 1 || V11 == 1 || V12 == 1 || V13 == 1 || V14 == 1 || V15 == 1 || V16 == 1 || DVI1 == 1 || DVI2 == 1 || DVI3 == 1 || DVI4 == 1 || DVI5 == 1 || DVI6 == 1 || DVI7 == 1 || DVI8 == 1){
            FileHelper file = new FileHelper("stats");
            file.write(playerOne.getName() + " defeated " + playerTwo.getName());
            gamePanel.setVisible(false);
            winPanel.setVisible(true);
            winPlay.setText(playerOne.getName());
        } else if(A1 == 16 || A2 == 16 || A3 == 16 || A4 == 16 || A5 == 16 || A6 == 16 || A7 == 16 || A8 == 16 || A9 == 16 || A10 == 16 || B1 == 16 || B2 == 16 || B3 == 16 || B4 == 16 || B5 == 16 || B6 == 16 || B7 == 16 || B8 == 16 || B9 == 16 || B10 == 16 || C1 == 16 || C2 == 16 || C3 == 16 || C4 == 16 || C5 == 16 || C6 == 16 || C7 == 16 || C8 == 16 || C9 == 16 || C10 == 16 || D1 == 16 || D2 == 16 || D3 == 16 || D4 == 16 || D5 == 16 || D6 == 16 || D7 == 16 || D8 == 16 || D9 == 16 || D10 == 16 || DT1 == 16 || DT2 == 16 || DT3 == 16 || DT4 == 16 || DV1 == 16 || DV2 == 16 || DV3 == 16 || DV4 == 16 || DV5 == 16 || DV6 == 16 || DV7 == 16 || DV8 == 16 || V1 == 16 || V2 == 16 || V3 == 16 || V4 == 16 || V5 == 16 || V6 == 16 || V7 == 16 || V8 == 16 || V9 == 16 || V10 == 16 || V11 == 16 || V12 == 16 || V13 == 16 || V14 == 16 || V15 == 16 || V16 == 16 || DVI1 == 16 || DVI2 == 16 || DVI3 == 16 || DVI4 == 16 || DVI5 == 16 || DVI6 == 16 || DVI7 == 16 || DVI8 == 16){
            FileHelper file = new FileHelper("stats");
            file.write(playerTwo.getName() + " defeated " + playerOne.getName());
            gamePanel.setVisible(false);
            winPanel.setVisible(true);
            winPlay.setText(playerTwo.getName());
        } else if(A1 > 0 && A2 > 0 && A3 > 0 && A4 > 0 && A5 > 0 && A6 > 0 && A7 > 0 && A8 > 0 && A9 > 0 && A10 > 0 && B1 > 0 && B2 > 0 && B3 > 0 && B4 > 0 && B5 > 0 && B6 > 0 && B7 > 0 && B8 > 0 && B9 > 0 && B10 > 0 && C1 > 0 && C2 > 0 && C3 > 0 && C4 > 0 && C5 > 0 && C6 > 0 && C7 > 0 && C8 > 0 && C9 > 0 && C10 > 0 && D1 > 0 && D2 > 0 && D3 > 0 && D4 > 0 && D5 > 0 && D6 > 0 && D7 > 0 && D8 > 0 && D9 > 0 && D10 > 0 && DT1 > 0 && DT2 > 0 && DT3 > 0 && DT4 > 0 && DV1 > 0 && DV2 > 0 && DV3 > 0 && DV4 > 0 && DV5 > 0 && DV6 > 0 && DV7 > 0 && DV8 > 0 && V1 > 0 && V2 > 0 && V3 > 0 && V4 > 0 && V5 > 0 && V6 > 0 && V7 > 0 && V8 > 0 && V9 > 0 && V10 > 0 && V11 > 0 && V12 > 0 && V13 > 0 && V14 > 0 && V15 > 0 && V16 > 0 && DVI1 > 0 && DVI2 > 0 && DVI3 > 0 && DVI4 > 0 && DVI5 > 0 && DVI6 > 0 && DVI7 > 0 && DVI8 > 0){
            FileHelper file = new FileHelper("stats");
            file.write("There was a tie between " + playerOne.getName() + " and " + playerTwo.getName());
            gamePanel.setVisible(false);
            winPanel.setVisible(true);
            winPlay.setText("You guys tied");
            won.setText("That is probably harder than actually winning, good job!");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProjectGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel UI;
    private javax.swing.JTextField animals;
    private javax.swing.JButton b101;
    private javax.swing.JButton b102;
    private javax.swing.JButton b103;
    private javax.swing.JButton b104;
    private javax.swing.JButton b105;
    private javax.swing.JButton b106;
    private javax.swing.JButton b107;
    private javax.swing.JButton b108;
    private javax.swing.JButton b109;
    private javax.swing.JButton b110;
    private javax.swing.JButton b111;
    private javax.swing.JButton b112;
    private javax.swing.JButton b113;
    private javax.swing.JButton b114;
    private javax.swing.JButton b115;
    private javax.swing.JButton b116;
    private javax.swing.JButton b201;
    private javax.swing.JButton b202;
    private javax.swing.JButton b203;
    private javax.swing.JButton b204;
    private javax.swing.JButton b205;
    private javax.swing.JButton b206;
    private javax.swing.JButton b207;
    private javax.swing.JButton b208;
    private javax.swing.JButton b209;
    private javax.swing.JButton b210;
    private javax.swing.JButton b211;
    private javax.swing.JButton b212;
    private javax.swing.JButton b213;
    private javax.swing.JButton b214;
    private javax.swing.JButton b215;
    private javax.swing.JButton b216;
    private javax.swing.JButton b301;
    private javax.swing.JButton b302;
    private javax.swing.JButton b303;
    private javax.swing.JButton b304;
    private javax.swing.JButton b305;
    private javax.swing.JButton b306;
    private javax.swing.JButton b307;
    private javax.swing.JButton b308;
    private javax.swing.JButton b309;
    private javax.swing.JButton b310;
    private javax.swing.JButton b311;
    private javax.swing.JButton b312;
    private javax.swing.JButton b313;
    private javax.swing.JButton b314;
    private javax.swing.JButton b315;
    private javax.swing.JButton b316;
    private javax.swing.JButton b401;
    private javax.swing.JButton b402;
    private javax.swing.JButton b403;
    private javax.swing.JButton b404;
    private javax.swing.JButton b405;
    private javax.swing.JButton b406;
    private javax.swing.JButton b407;
    private javax.swing.JButton b408;
    private javax.swing.JButton b409;
    private javax.swing.JButton b410;
    private javax.swing.JButton b411;
    private javax.swing.JButton b412;
    private javax.swing.JButton b413;
    private javax.swing.JButton b414;
    private javax.swing.JButton b415;
    private javax.swing.JButton b416;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton clsButton;
    private javax.swing.JTextField congrats;
    private javax.swing.JTextField developer;
    private javax.swing.JButton exButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton exitMatchButton;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JLabel gameUI;
    private javax.swing.JButton infoButton;
    private javax.swing.JButton loadButton;
    private javax.swing.JPanel loadMatchPanel;
    private javax.swing.JLabel loadUI;
    private javax.swing.JLabel mainUI;
    private javax.swing.JTextField matchName;
    private javax.swing.JPanel namePanel;
    private javax.swing.JLabel nameUI;
    private javax.swing.JLabel o101;
    private javax.swing.JLabel o102;
    private javax.swing.JLabel o103;
    private javax.swing.JLabel o104;
    private javax.swing.JLabel o105;
    private javax.swing.JLabel o106;
    private javax.swing.JLabel o107;
    private javax.swing.JLabel o108;
    private javax.swing.JLabel o109;
    private javax.swing.JLabel o110;
    private javax.swing.JLabel o111;
    private javax.swing.JLabel o112;
    private javax.swing.JLabel o113;
    private javax.swing.JLabel o114;
    private javax.swing.JLabel o115;
    private javax.swing.JLabel o116;
    private javax.swing.JLabel o201;
    private javax.swing.JLabel o202;
    private javax.swing.JLabel o203;
    private javax.swing.JLabel o204;
    private javax.swing.JLabel o205;
    private javax.swing.JLabel o206;
    private javax.swing.JLabel o207;
    private javax.swing.JLabel o208;
    private javax.swing.JLabel o209;
    private javax.swing.JLabel o210;
    private javax.swing.JLabel o211;
    private javax.swing.JLabel o212;
    private javax.swing.JLabel o213;
    private javax.swing.JLabel o214;
    private javax.swing.JLabel o215;
    private javax.swing.JLabel o216;
    private javax.swing.JLabel o301;
    private javax.swing.JLabel o302;
    private javax.swing.JLabel o303;
    private javax.swing.JLabel o304;
    private javax.swing.JLabel o305;
    private javax.swing.JLabel o306;
    private javax.swing.JLabel o307;
    private javax.swing.JLabel o308;
    private javax.swing.JLabel o309;
    private javax.swing.JLabel o310;
    private javax.swing.JLabel o311;
    private javax.swing.JLabel o312;
    private javax.swing.JLabel o313;
    private javax.swing.JLabel o314;
    private javax.swing.JLabel o315;
    private javax.swing.JLabel o316;
    private javax.swing.JLabel o401;
    private javax.swing.JLabel o402;
    private javax.swing.JLabel o403;
    private javax.swing.JLabel o404;
    private javax.swing.JLabel o405;
    private javax.swing.JLabel o406;
    private javax.swing.JLabel o407;
    private javax.swing.JLabel o408;
    private javax.swing.JLabel o409;
    private javax.swing.JLabel o410;
    private javax.swing.JLabel o411;
    private javax.swing.JLabel o412;
    private javax.swing.JLabel o413;
    private javax.swing.JLabel o414;
    private javax.swing.JLabel o415;
    private javax.swing.JLabel o416;
    private javax.swing.JLabel opcLabel;
    private javax.swing.JPanel opcPanel;
    private javax.swing.JButton optionsButton;
    private javax.swing.JTextField p1;
    private javax.swing.JTextField p1Turn;
    private javax.swing.JTextField p2;
    private javax.swing.JTextField p2Turn;
    private javax.swing.JButton playButton;
    private javax.swing.JTextField player1Name;
    private javax.swing.JTextField player2Name;
    private javax.swing.JButton restartButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel saveImg;
    private javax.swing.JPanel secretPanel;
    private javax.swing.JButton startGameButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField thanks;
    private javax.swing.JTextField time;
    private javax.swing.JPanel winPanel;
    private javax.swing.JTextField winPlay;
    private javax.swing.JTextField won;
    private javax.swing.JLabel x101;
    private javax.swing.JLabel x102;
    private javax.swing.JLabel x103;
    private javax.swing.JLabel x104;
    private javax.swing.JLabel x105;
    private javax.swing.JLabel x106;
    private javax.swing.JLabel x107;
    private javax.swing.JLabel x108;
    private javax.swing.JLabel x109;
    private javax.swing.JLabel x110;
    private javax.swing.JLabel x111;
    private javax.swing.JLabel x112;
    private javax.swing.JLabel x113;
    private javax.swing.JLabel x114;
    private javax.swing.JLabel x115;
    private javax.swing.JLabel x116;
    private javax.swing.JLabel x201;
    private javax.swing.JLabel x202;
    private javax.swing.JLabel x203;
    private javax.swing.JLabel x204;
    private javax.swing.JLabel x205;
    private javax.swing.JLabel x206;
    private javax.swing.JLabel x207;
    private javax.swing.JLabel x208;
    private javax.swing.JLabel x209;
    private javax.swing.JLabel x210;
    private javax.swing.JLabel x211;
    private javax.swing.JLabel x212;
    private javax.swing.JLabel x213;
    private javax.swing.JLabel x214;
    private javax.swing.JLabel x215;
    private javax.swing.JLabel x216;
    private javax.swing.JLabel x301;
    private javax.swing.JLabel x302;
    private javax.swing.JLabel x303;
    private javax.swing.JLabel x304;
    private javax.swing.JLabel x305;
    private javax.swing.JLabel x306;
    private javax.swing.JLabel x307;
    private javax.swing.JLabel x308;
    private javax.swing.JLabel x309;
    private javax.swing.JLabel x310;
    private javax.swing.JLabel x311;
    private javax.swing.JLabel x312;
    private javax.swing.JLabel x313;
    private javax.swing.JLabel x314;
    private javax.swing.JLabel x315;
    private javax.swing.JLabel x316;
    private javax.swing.JLabel x401;
    private javax.swing.JLabel x402;
    private javax.swing.JLabel x403;
    private javax.swing.JLabel x404;
    private javax.swing.JLabel x405;
    private javax.swing.JLabel x406;
    private javax.swing.JLabel x407;
    private javax.swing.JLabel x408;
    private javax.swing.JLabel x409;
    private javax.swing.JLabel x410;
    private javax.swing.JLabel x411;
    private javax.swing.JLabel x412;
    private javax.swing.JLabel x413;
    private javax.swing.JLabel x414;
    private javax.swing.JLabel x415;
    private javax.swing.JLabel x416;
    // End of variables declaration//GEN-END:variables
}
