package metier.authentification;

import metier.admin.ServiceIHMAdmin;
import presentation.modele.Banque;

import java.util.Scanner;

public class ServiceIHM implements IServiceIHM{
    private Banque maBanque;
    private Scanner clavier;
    ServiceIHMAdmin sia = new ServiceIHMAdmin(maBanque,clavier);
    public ServiceIHM(Banque maBanque, Scanner clavier) {
        this.maBanque = maBanque;
        this.clavier = clavier;

    }
    @Override
    public int menuGlobal() {
        /*System.out.println("1- ajouter");
        System.out.println("2- modifier");
        System.out.println("3- supprimer");
        System.out.println("4- chercher");
        System.out.println("0- quitter");
        System.out.println("entrer votre choix : ");
        int choix = clavier.nextInt();
        switch (choix)
        {
            case 0:
            {
                System.out.println("quitter");
                break;
            }
            case 1:
            {

            }


        }*/
        return 0;
    }
}
