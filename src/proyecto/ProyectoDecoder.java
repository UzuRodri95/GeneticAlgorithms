package proyecto;

import java.util.ArrayList;

import org.opt4j.core.genotype.IntegerGenotype;
import org.opt4j.core.problem.Decoder;

public class ProyectoDecoder implements Decoder<IntegerGenotype, ArrayList<Integer>>
{
	public ArrayList<Integer> decode(IntegerGenotype genotipo){
		ArrayList<Integer> fenotipo = new ArrayList<Integer>();
		
		for (Integer i : genotipo) {
			fenotipo.add(i);
		}
		
		return fenotipo;
	}
}
