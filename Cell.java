
/**
 * The base rules for each "cell"
 * Joel Bannister
 * 16.05.22
 */
public class Cell
{

    boolean neighbour = false;
    boolean alive = true;
    
    private int WORLDSIZE;
    private final int DEAD = 0;
    private final int ALIVE = 1;
    private int world[][];
    private int worldCopy[][];

    public int getNeighborCells(int x, int y) {

    int neighbors = 0;

    for (int i = x - 1; i <= x + 1; i++) {
        for (int j = y - 1; j <= y + 1; j++) {

            if (world[i][j] == ALIVE && (x != i || y != j))
                neighbors += 1;
        }
    }

    return neighbors;
}

}


