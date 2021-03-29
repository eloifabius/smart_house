/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package itsudparis.application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.hp.hpl.jena.rdf.model.Model;
import itsudparis.tools.JenaEngine;

/**
 *
 * @author DO.ITSUDPARIS
 */
public class Main {
	
public static void main(String[] args) throws IOException {
    //on indique le chemin vers jena-log4j.properties (pour supprimer les warnings)
    //String log4jConfPath = "/Users/amelbouzeghoub/Documents/Enseignement/ASR2020-2021/jena10/apache-jena-2.10.0/jena-log4j.properties";
    //PropertyConfigurator.configure(log4jConfPath);
    //fin de la config log4j
    String NS = "";
    // lire le model a partir d'une ontologie
    Model model = JenaEngine.readModel("Data/smart.owl");
    if (model != null) {
    //lire le Namespace de l’ontologie
    NS = model.getNsPrefixURI("");
    
    // modifier le model
    // Ajouter une nouvelle femme dans le modele: Nora,50, estFilleDe Peter
    //JenaEngine.createInstanceOfClass(model, NS, "Femme","Nora");
    //JenaEngine.updateValueOfDataTypeProperty(model, NS,"Nora", "age", 50);
    //JenaEngine.updateValueOfObjectProperty(model, NS,"Nora", "estFilleDe", "Peter");
    // Ajouter un nouvel homme dans le modele: Rob, 51,seMarierAvec Nora
    //JenaEngine.createInstanceOfClass(model, NS, "resident","Popy");
    //JenaEngine.createInstanceOfClass(model, NS, "lit","Popy");
    //JenaEngine.updateValueOfDataTypeProperty(model, NS,"Rob", "age", 51);
    //JenaEngine.updateValueOfDataTypeProperty(model, NS,"Nayima", "nom", "Nayimatou");
    //JenaEngine.updateValueOfObjectProperty(model, NS,"Rob", "seMarierAvec", "Nora");
    //apply owl rules on the model
    //JenaEngine.updateValueOfDataTypeProperty(model, NS,"Capteur_TV", "nom", "tv_capteur");
    //JenaEngine.updateValueOfDataTypeProperty(model, NS,"Capteur_TV", "etat", false);
    List<String> allLines = Files.readAllLines(Paths.get("Data/DAY_1.txt"));

    String[] chaine = allLines.get(0).split(" ");
    for(int i = 0; i< chaine.length; i++) {
    	if(chaine[i].equals("1")) {
    		JenaEngine.updateValueOfDataTypeProperty(model, NS, InitIndividuals.getSensors(i), "state", 1);
    		JenaEngine.updateValueOfDataTypeProperty(model, NS, "moment", "moment", InsertTime.moment(64800));
    	}
    }
    
    Model owlInferencedModel =
    JenaEngine.readInferencedModelFromRuleFile(model, "Data/owlrules.txt");
    // apply our rules on the owlInferencedModel
    Model inferedModel =
    JenaEngine.readInferencedModelFromRuleFile(owlInferencedModel,"Data/rules.txt");
    // query on the model after inference
    String reults = JenaEngine.executeQueryFile(inferedModel,"Data/query.txt");
    System.out.println(reults);
    } else {
    System.out.println("Error when reading model from ontology");
    }
     
}
}

//JenaEngine.updateValueOfDataTypeProperty(inferedModel, ns, "Naima", "nom", "Naimatou");
//JenaEngine.createInstanceOfClass(model, ns, "Maison", "Maison1");
//JenaEngine.createInstanceOfClass(model, ns, "Resident", "Naima");
//JenaEngine.createInstanceOfClass(model, ns, "Resident", "Popy1");
//JenaEngine.addValueOfObjectProperty(inferedModel, ns, "Popy1", "Est_Localise_dans", "Maison1");
//JenaEngine.updateValueOfObjectProperty(inferedModel, ns , "Peter", "estFilsDe", "Femme1");
//JenaEngine.createInstanceOfClass(model, ns, "Femme", "abc");
