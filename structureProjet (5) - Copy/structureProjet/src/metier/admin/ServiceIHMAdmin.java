package metier.admin;

import presentation.modele.Banque;
import presentation.modele.Client;
import presentation.modele.Compte;
import presentation.modele.TableauDeBord;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class ServiceIHMAdmin implements IServiceIHMAdmin{
    private Banque maBanque;
    private Scanner clavier;
    private ServiceAdmin admin;
    public ServiceIHMAdmin(Banque maBanque, Scanner clavier) {
        this.maBanque = maBanque;
        this.clavier = clavier;
        this.admin = new ServiceAdmin(maBanque, clavier);

    }


    @Override
    public int menuModification() {
        return 0;
    }

    @Override
    public int menuRecherche() {
        return 0;
    }

    @Override
    public int menuInformations() {

        return 0;
    }

    @Override
    public int menuAjout() {
        return 0;
    }

    @Override
    public int menuSuppression() {
        return 0;
    }

    @Override
    public int tableauDeBord() {
        return 0;
    }

    @Override
    public int menuTrie() {
        return 0;
    }

    @Override
    public int menuComptabilité() {
        return 0;
    }

    @Override
    public int menuGlobal() {


        System.out.println("1- ajouter");
        System.out.println("2- afficher");
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
                admin.nouveauClient();
                break;

            }
            case 2:
            {

                break;
            }


        }




        return 0;
    }
}
