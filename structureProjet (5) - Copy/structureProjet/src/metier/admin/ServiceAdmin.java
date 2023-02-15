package metier.admin;

import presentation.modele.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class ServiceAdmin implements IServiceAdmin{
    Banque maBanque;
    Scanner clavier;

    public ServiceAdmin(Banque maBanque, Scanner clavier) {
        this.maBanque = maBanque;
        this.clavier = clavier;
    }

    @Override
    public Client nouveauClient() {
        System.out.println("entrer le nom : ");
        String nom=clavier.next();
        System.out.println("entrer le prenom : ");
        String prenom=clavier.next();
        System.out.println("entrer le login  : ");
        String login=clavier.next();
        System.out.println("entrer le mdp : ");
        String password=clavier.next();
        System.out.println("entrer le cin : ");
        String cin=clavier.next();
        System.out.println("entrer l emsi : ");
        String email=clavier.next();
        System.out.println("entrer le num de tel: ");
        String tel=clavier.next();
        System.out.println("Sexe: ");
        System.out.println("0- Homme");
        System.out.println("1- Femme");
        int s=clavier.nextInt();

        Client client=new Client(login,password,nom,prenom,email,cin,tel, Sexe.values()[s]);

        maBanque.getClientsDeBanque().add(client);
        return client;

    }

    @Override
    public Client nouveauCompteClientExistant() {
        return null;
    }

    @Override
    public Client chercherClientParId(Long id) {
        return null;
    }

    @Override
    public List<Client> chercherClientParNom(String nom) {
        return null;
    }

    @Override
    public List<Client> chercherClientParPrénom(String prenom) {
        return null;
    }

    @Override
    public Client chercherClientParCin(String cin) {
        return null;
    }

    @Override
    public Client chercherClientParEmail(String email) {
        return null;
    }

    @Override
    public Compte chercherCompteParId(Long idCompte) {
        return null;
    }

    @Override
    public List<Compte> chercherCompteParSolde(double solde) {
        return null;
    }

    @Override
    public List<Compte> chercherCompteParDateCreation(LocalDateTime date) {
        return null;
    }

    @Override
    public List<Compte> chercherCompteParPropriétaire(Client propriétaire) {
        return null;
    }

    @Override
    public Client modifierClient(String filtre) {
        return null;
    }

    @Override
    public boolean supprimerClient(Long id) {
        return false;
    }

    @Override
    public TableauDeBord calculerEtAfficherStatistiques() {
        return null;
    }

    @Override
    public List<Client> trierClientParNom() {
        return null;
    }

    @Override
    public List<Client> trierClientParCin() {
        return null;
    }

    @Override
    public List<Client> trierClientParEmail() {
        return null;
    }

    @Override
    public List<Client> trierClientParAdresse() {
        return null;
    }

    @Override
    public List<Client> trierClientParSoldeCompte() {
        return null;
    }

    @Override
    public List<Compte> trierComptesParSolde() {
        return null;
    }

    @Override
    public List<Compte> trierComptesParDateDeCreation() {
        return null;
    }

    @Override
    public List<Compte> trierComptesParNomPropriétaire() {
        return null;
    }
}
