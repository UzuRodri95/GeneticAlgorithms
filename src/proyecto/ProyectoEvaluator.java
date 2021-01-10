package proyecto;

import java.util.ArrayList;

import org.opt4j.core.Objective.Sign;
import org.opt4j.core.Objectives;
import org.opt4j.core.problem.Evaluator;

public class ProyectoEvaluator implements Evaluator<ArrayList<Integer>>
{
	public Objectives evaluate(ArrayList<Integer> fenotipo) {
		//VARIABLE QUE GUARDA EL COSTE TOTAL DE CADA UNA DE LAS VACUNAS
		//{VACUNA 1, VACUNA 2, VACUNA 3}
		int costeFinalIndividual [] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		//VAMOS A PONER OBJETIVOS A LOS CUALES VAMOS A ASPIRAR
		Objectives objectives = new Objectives();
		
		int costeTotal = 0;
		int vacunados = 0;
		
		for(int i= 0; i < fenotipo.size(); i++) {
			
			costeFinalIndividual[i] = Data.matrizCostes[fenotipo.get(i)-1][i];
			
			// CALCULAMOS EL TOTAL QUE NOS VA A COSTAR LA COMBINACION DE VACUNAS 1 + VACUNAS 2 + VACUNAS 3 A LO LARGO DE LOS FENOTIPOS
			costeTotal += costeFinalIndividual[i];
			
			if(fenotipo.get(i) == 1 || fenotipo.get(i) == 2) {
				vacunados += Data.arrayVoluntarios[i];
			}
		}
		
		//MINIMIZAMOS EL COSTE TOTAL
		objectives.add("COSTE TOTAL", Sign.MIN, costeTotal);
		
		//MAXIMIZAMOS LOS VACUNADOS
		objectives.add("VACUNADOS", Sign.MAX, vacunados);

		return objectives;
	}
}