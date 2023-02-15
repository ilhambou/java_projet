package metier.authentification;

import metier.admin.ServiceIHMAdmin;
import presentation.modele.Admin;
import presentation.modele.Banque;
import presentation.modele.Utilisateur;

import java.util.Scanner;

public class Auth implements IAuth{
    private Banque maBanque;
    private Scanner clavier;
    public Auth(Banque maBanque, Scanner clavier) {
        this.maBanque = maBanque;
        this.clavier = clavier;
    }

    @Override
    public void seConnecter() {
        System.out.println("entrer votre nom : ");
        String nom = clavier.next();
        System.out.println("entrer votre psw : ");
        String psw = clavier.next();

        Utilisateur admin = Admin.getInstance();
        if(admin.getLogin().equals(nom) && admin.getMotDePasse().equals(psw))
        {
            //System.out.println("test");
            //ServiceIHM si = new ServiceIHM(maBanque,clavier);
            //si.menuGlobal();

            ServiceIHMAdmin sia = new ServiceIHMAdmin(maBanque, clavier);
            sia.menuGlobal();

        }
        else
        {
            System.out.println("mdp incorrect");
        }


    }

    @Override
    public void SeDéconnecter() {

    }
}
