package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.Innlegg;

public class Blogg {

	protected Innlegg[] innleggtabell;
	protected int nesteledig;
	protected int antall;

	public Blogg() {
		this.innleggtabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		this.innleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {
		antall = 0;
            for (Innlegg innleggtabell1 : innleggtabell) {
                if (innleggtabell1 != null) {
                    antall++;
                }
            }
		return antall;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i < innleggtabell.length; i++) {
			if (innleggtabell[i] != null && innleggtabell[i].erLik(innlegg)) {
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		return finnInnlegg(innlegg) != -1;
	}

	public boolean ledigPlass() {
		for (int i = 0; i < innleggtabell.length; i++)
			if (innleggtabell[i] == null) {
				return true;
			}
		return false;
	}

	public boolean leggTil(Innlegg innlegg) {
		if (ledigPlass()) {
			innleggtabell[getAntall()] = innlegg;
			return true;
		}
		return false;
	}
	
	public String toString() {
		String utskrift = getAntall() + "\n";
		for (Innlegg innlegg : innleggtabell) {
			if (innlegg != null) {
				utskrift += innlegg.toString();
			}
		}
		return utskrift;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}