package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            // Kreiranje novog objekta i unos cinjenica
        	KlimaUredjaj k = new KlimaUredjaj();
        	k.setKvadratura(62);
        	k.setBrojProstorija("vise");
        	k.setRadNaNiskimTemperaturama(true);
            k.setMogucaUgradnjaNaZid(false);
        	
        	//Unosenje objekta u ES
            kSession.insert(k);
            
            //Pokretanje ES
            kSession.fireAllRules();
            
            //Ispis resenja
            System.out.println(k);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}
