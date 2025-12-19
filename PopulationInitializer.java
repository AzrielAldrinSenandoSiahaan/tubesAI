import java.util.*;

/*
   Population Initializer untuk Algoritma Genetik
   Referensi: Inisialisasi populasi random dari "Genetic Algorithms in Search, Optimization and Machine Learning" (Goldberg, 1989)
 */
public class PopulationInitializer {
    private BoardState board;
    private Random random;

    public PopulationInitializer(BoardState board, Random random) {
        this.board = board;
        this.random = random;
    }
    
    public int[] generateIndividual() {
        int varCount = board.getVariableCount();
        int[] chromosome = new int[varCount];
        for (int i=0; i<chromosome.length; i++) {
            chromosome[i] = random.nextInt(2); // 0 atau 1
        }
        
        return chromosome;
    }
    
    public List<int[]> generatePopulation(int populationSize) {
        List<int[]> population = new ArrayList<>();
        for (int i= 0; i<populationSize; i++) {
            population.add(generateIndividual());
        }
        
        return population;
    }
}