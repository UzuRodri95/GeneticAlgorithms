package proyecto;

import java.util.Random;

import org.opt4j.core.genotype.IntegerGenotype;
import org.opt4j.core.problem.Creator;

public class ProyectoCreator implements Creator<IntegerGenotype>
{
	public IntegerGenotype create(){
		
		IntegerGenotype genotipo = new IntegerGenotype(1,60);
		genotipo.init(new Random(), Data.NUM_GRUPOS_TOTAL);
		
		return genotipo;
	}
}
