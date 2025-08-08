package Strings;

public class BufferBuilderPerformance {
    public static void main(String[] args) {
        // String Builder
        long startTime = System.currentTimeMillis();
        StringBuilder sbl = new StringBuilder("Placement");
        for(int i=0; i<10000000; i++){
            sbl.append("Training");
        }
        System.out.println("Time taken by SBL: " +
                (System.currentTimeMillis() - startTime) + "ms");

        // String Buffer
        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("Placement");
        for(int i=0; i<10000000; i++){
            sbf.append("Training");
        }
        System.out.println("Time taken by SBf: " +
                (System.currentTimeMillis() - startTime) + "ms");
    }
}
