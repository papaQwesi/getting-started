import java.util.HashMap;

public class cycle{
    static int [] array;

    int numNodes;
    HashMap<Integer,Integer> nodes;

    public cycle(int numNodes){
        this.numNodes = numNodes;
        nodes = new HashMap<>(numNodes);

    }
       // asigning vector pairs 
    void direction(int parent, int child) {
        nodes.put(parent, child);

    }

    void cycleDetection() {

        array = new int[numNodes];


        for (int i : nodes.values()) {
            array[i] = i;
        }

        int index = 0;
        int count = 0;

        for (int i : nodes.keySet()) {
            int temp = i;
            index = index + 1;
            for (int j = index; j <= numNodes; j++) {
                try {
                    if (array[j] == temp) {
                        count++;
                    }
                } catch (Exception e) {
                }

            }

        }

        if (count != 0) {
            System.out.println("Cycle Detected");
        } else {
            System.out.println("No Cycle Detected");
        }

    }

    public static void main(String[] args) {

        cycle graph = new cycle(4);
        graph.direction(0, 1);
        graph.direction(0, 2);
        graph.direction(1, 2);
        graph.direction(2, 0);
        graph.direction(3, 3);

        graph.cycleDetection();

    }


}