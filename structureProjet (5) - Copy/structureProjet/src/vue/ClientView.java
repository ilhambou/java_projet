package vue;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientView extends JFrame implements ActionListener {
    //declarer
    private Container myViewContainer;
    private JPanel titlePanel,formPanel,buttonsPannel;

    private JLabel lbl_title,lbl_login,lbl_pass,lbl_nom,lbl_prenom,lbl_email,lbl_cin,lbl_tel;

    private JButton btn_login,btn_cancel,btn_ajout;

    private JTextField txt_login,txt_nom,txt_prenom,txt_email,txt_cin,txt_tel;
    private JPasswordField txt_pass;


    //initialiser


    private void initLabels() {
        //---------------Label Titre-------------
        //initialisation du label tTitre
        lbl_title = new JLabel("Formulaire Client");
        //personnalisation du label titre
        //modif de la police du texte
        lbl_title.setFont(new Font("optima", Font.BOLD, 30));
        //modif de la couleur du texte
        lbl_title.setForeground(new Color(19, 149, 220, 255));
        //alignement du texte au label au centre
        lbl_title.setHorizontalAlignment(JLabel.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon());



        //---------------Label login-------------
        //initialisation du label tTitre
        lbl_login = new JLabel("login");
        //personnalisation du label titre
        //modif de la police du texte
        lbl_login.setFont(new Font("optima", Font.BOLD, 17));
        //modif de la couleur du texte
        lbl_login.setForeground(new Color(19, 149, 220, 255));
        //alignement du texte au label au centre
        lbl_login.setHorizontalAlignment(JLabel.CENTER);
        //ajout icone
        lbl_login.setIcon(new ImageIcon("/utilisateur.png"));
        /**Image icon = new ImageIcon(this.getClass().getResource("/utilisateur.png")).getImage();
         this.setIconImage(icon);**/


        //---------------Label password-------------
        //initialisation du label tTitre
        lbl_pass = new JLabel("password");
        //personnalisation du label titre
        //modif de la police du texte
        lbl_pass.setFont(new Font("optima", Font.BOLD, 17));
        //modif de la couleur du texte
        lbl_pass.setForeground(new Color(19, 149, 220, 255));
        //alignement du texte au label au centre
        lbl_pass.setHorizontalAlignment(JLabel.CENTER);
        //ajout icone
        //lbl_pass.setIcon(new ImageIcon(""));

        //---------------Label nom-------------
        //initialisation du label tTitre
        lbl_nom = new JLabel("nom");
        //personnalisation du label titre
        //modif de la police du texte
        lbl_nom.setFont(new Font("optima", Font.BOLD, 17));
        //modif de la couleur du texte
        lbl_nom.setForeground(new Color(19, 149, 220, 255));
        //alignement du texte au label au centre
        lbl_nom.setHorizontalAlignment(JLabel.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));

        //---------------Label prenom-------------
        //initialisation du label tTitre
        lbl_prenom = new JLabel("prenom");
        //personnalisation du label titre
        //modif de la police du texte
        lbl_prenom.setFont(new Font("optima", Font.BOLD, 17));
        //modif de la couleur du texte
        lbl_prenom.setForeground(new Color(19, 149, 220, 255));
        //alignement du texte au label au centre
        lbl_prenom.setHorizontalAlignment(JLabel.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));

        //---------------Label email-------------
        //initialisation du label tTitre
        lbl_email = new JLabel("email");
        //personnalisation du label titre
        //modif de la police du texte
        lbl_email.setFont(new Font("optima", Font.BOLD, 17));
        //modif de la couleur du texte
        lbl_email.setForeground(new Color(19, 149, 220, 255));
        //alignement du texte au label au centre
        lbl_email.setHorizontalAlignment(JLabel.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));

        //---------------Label cin-------------
        //initialisation du label tTitre
        lbl_cin = new JLabel("cin");
        //personnalisation du label titre
        //modif de la police du texte
        lbl_cin.setFont(new Font("optima", Font.BOLD, 17));
        //modif de la couleur du texte
        lbl_cin.setForeground(new Color(19, 149, 220, 255));
        //alignement du texte au label au centre
        lbl_cin.setHorizontalAlignment(JLabel.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));

        //---------------Label tel-------------
        //initialisation du label tTitre
        lbl_tel = new JLabel("username");
        //personnalisation du label titre
        //modif de la police du texte
        lbl_tel.setFont(new Font("optima", Font.BOLD, 17));
        //modif de la couleur du texte
        lbl_tel.setForeground(new Color(19, 149, 220, 255));
        //alignement du texte au label au centre
        lbl_tel.setHorizontalAlignment(JLabel.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));



    }

    private void initTextFields() {
        //---------------text login-------------
        //initialisation du label tTitre
        txt_login = new JTextField("");
        //personnalisation du label titre
        //modif de la police du texte
        txt_login.setFont(new Font("optima", Font.BOLD, 15));
        //modif de la couleur du texte
        txt_login.setForeground(new Color(19, 149, 220, 255 ));
        //alignement du texte au label au centre
        txt_login.setHorizontalAlignment(JTextField.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));

        //---------------text pass-------------
        //initialisation du label tTitre
        txt_pass = new JPasswordField("");
        //personnalisation du label titre
        //modif de la police du texte
        txt_pass.setFont(new Font("optima", Font.BOLD, 15));
        //modif de la couleur du texte
        txt_pass.setForeground(new Color(19, 149, 220, 255));
        //alignement du texte au label au centre
        txt_pass.setHorizontalAlignment(JPasswordField.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));

        //---------------text nom-------------
        //initialisation du label tTitre
        txt_nom = new JTextField("");
        //personnalisation du label titre
        //modif de la police du texte
        txt_nom.setFont(new Font("optima", Font.BOLD, 15));
        //modif de la couleur du texte
        txt_nom.setForeground(new Color(19, 149, 220, 255 ));
        //alignement du texte au label au centre
        txt_nom.setHorizontalAlignment(JTextField.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));

        //---------------text prenom-------------
        //initialisation du label tTitre
        txt_prenom = new JTextField("");
        //personnalisation du label titre
        //modif de la police du texte
        txt_prenom.setFont(new Font("optima", Font.BOLD, 15));
        //modif de la couleur du texte
        txt_prenom.setForeground(new Color(19, 149, 220, 255 ));
        //alignement du texte au label au centre
        txt_prenom.setHorizontalAlignment(JTextField.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));

        //---------------text email-------------
        //initialisation du label tTitre
        txt_email = new JTextField("");
        //personnalisation du label titre
        //modif de la police du texte
        txt_email.setFont(new Font("optima", Font.BOLD, 15));
        //modif de la couleur du texte
        txt_email.setForeground(new Color(19, 149, 220, 255 ));
        //alignement du texte au label au centre
        txt_email.setHorizontalAlignment(JTextField.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));

        //---------------text cin-------------
        //initialisation du label tTitre
        txt_cin = new JTextField("");
        //personnalisation du label titre
        //modif de la police du texte
        txt_cin.setFont(new Font("optima", Font.BOLD, 15));
        //modif de la couleur du texte
        txt_cin.setForeground(new Color(19, 149, 220, 255 ));
        //alignement du texte au label au centre
        txt_cin.setHorizontalAlignment(JTextField.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));

        //---------------text tel-------------
        //initialisation du label tTitre
        txt_tel = new JTextField("");
        //personnalisation du label titre
        //modif de la police du texte
        txt_tel.setFont(new Font("optima", Font.BOLD, 15));
        //modif de la couleur du texte
        txt_tel.setForeground(new Color(19, 149, 220, 255 ));
        //alignement du texte au label au centre
        txt_tel.setHorizontalAlignment(JTextField.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));


    }
    private void initButtons(){
        //---------------btn login-------------
        //initialisation du bouton login
        btn_login= new JButton("connecter");
        //personnalisation du label titre
        //modif de la police du texte
        btn_login.setFont(new Font("optima",Font.BOLD,17));
        //modif de la couleur du texte
        btn_login.setForeground(new Color(19, 149, 220, 255));
        //alignement du texte au label au centre
        btn_login.setHorizontalAlignment(JButton.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));
        btn_login.setBorderPainted(false);
        btn_login.addActionListener(this);


        //---------------btn cancel-------------
        //initialisation du bouton login
        btn_cancel= new JButton("annuler");
        //personnalisation du label titre
        //modif de la police du texte
        btn_cancel.setFont(new Font("optima",Font.BOLD,17));
        //modif de la couleur du texte
        btn_cancel.setForeground(new Color(19, 149, 220, 255));
        //alignement du texte au label au centre
        btn_cancel.setHorizontalAlignment(JButton.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));
        btn_cancel.setBorderPainted(false);
        btn_cancel.addActionListener(this);

        //btn_cancel.addActionListener(new EvenementGraphic);
        //---------------btn ajout-------------
        //initialisation du bouton login
        btn_ajout= new JButton("ajouter");
        //personnalisation du label titre
        //modif de la police du texte
        btn_ajout.setFont(new Font("optima",Font.BOLD,17));
        //modif de la couleur du texte
        btn_ajout.setForeground(new Color(19, 149, 220, 255));
        //alignement du texte au label au centre
        btn_ajout.setHorizontalAlignment(JButton.CENTER);
        //ajout icone
        //lbl_title.setIcon(new ImageIcon(""));
        btn_ajout.setBorderPainted(false);
        btn_ajout.addActionListener(this);
    }
    private void initPanels(){
        initLabels();
        initTextFields();
        //-----------Panneau titre--------------

        titlePanel= new JPanel();
        //changer la couleur du fond de mon panneau
        titlePanel.setBackground(new Color(202,211,242,105));
        //ajouter un padding(10,0,10,0)
        titlePanel.setBorder(new EmptyBorder(10,0,10,0));
        //affecter un FlowLayout a notre titlePannel pour ajouter les elements sous forme d un flux horizontal
        titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        //ajouter titre au cebntre
        titlePanel.add(lbl_title);
        //-----------Panneau formulaire--------------

        formPanel= new JPanel();
        //changer la couleur du fond de mon panneau
        formPanel.setBackground(new Color(255,255,255));
        formPanel.setLayout(new BorderLayout());
        formPanel.setBorder(new EmptyBorder(50,15,50,15));
        //ajouter un padding(10,0,10,0)
        //  titlePanel.setBorder(new EmptyBorder(10,0,10,0));
        JPanel westPannel=new JPanel();
        westPannel.setBackground(new Color(255,255,255));
        westPannel.setLayout(new GridLayout(7,20,30,30));
        westPannel.setBorder(new EmptyBorder(0,0,0,20));
        westPannel.add(lbl_login);
        westPannel.add(lbl_pass);
        westPannel.add(lbl_nom);
        westPannel.add(lbl_prenom);
        westPannel.add(lbl_email);
        westPannel.add(lbl_cin);
        westPannel.add(lbl_tel);


        JPanel centerPannel=new JPanel();
        centerPannel.setBackground(new Color(255,255,255));
        centerPannel.setLayout(new GridLayout(7,20,30,30));
        centerPannel.add(txt_login);
        centerPannel.add(txt_pass);
        centerPannel.add(txt_nom);
        centerPannel.add(txt_prenom);
        centerPannel.add(txt_email);
        centerPannel.add(txt_cin);
        centerPannel.add(txt_tel);


        formPanel.add(westPannel,BorderLayout.WEST);

        formPanel.add(centerPannel,BorderLayout.CENTER);





        //-----------Panneau buttons--------------
        initButtons();
        buttonsPannel= new JPanel();
        //changer la couleur du fond de mon panneau
        buttonsPannel.setBackground(new Color(202,211,242,105));
        //ajouter un padding(10,0,10,0)
        buttonsPannel.setBorder(new EmptyBorder(10,0,10,0));
        //affecter un flowLayout
        buttonsPannel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        //ajouter titre au centre
        buttonsPannel.add(btn_login);
        buttonsPannel.add(btn_cancel);
        buttonsPannel.add(btn_ajout);

    }

    public void initContainer(){
        //referencer ou attacher notre conteneur de base par la reference myViewContainer
        this.myViewContainer=this.getContentPane();
        //personnalisation de notre conteneur
        //affecter un BorderLayout a notre conteneur pour le decouper sous forme de Bords
        myViewContainer.setLayout(new BorderLayout());
        //ajouter les panneaux aux bords correspondants
        //initialiser et ajouter les panneaux aux bords correspondants
        initPanels();
        myViewContainer.add(titlePanel,BorderLayout.NORTH);
        myViewContainer.add(formPanel,BorderLayout.CENTER);

        myViewContainer.add(buttonsPannel,BorderLayout.SOUTH);



    }

    public ClientView(String title){
        //initialisation du conteneur principale
        initContainer();
        //titre
        setTitle(title);
        //dimensionner
        setSize(500,650);
        //la mettre au milieu
        setLocationRelativeTo(null);
        //fermer l application en fermant la fenetre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //fixer la taille de la fenetre
        setResizable(false);
        //rendre la fenetre visible
        setVisible(true);
    }
    /*public static void main(String[] args) {

        new ClientView("connexion");
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn_cancel)
        {
            System.out.println("au revoir");
        }
        if(e.getSource() == btn_login)
        {
            System.out.println("login");
        }

    }
}