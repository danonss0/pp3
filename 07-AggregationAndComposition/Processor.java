public class Processor {
    private String processorName;
    private float M;

    public Processor(String processorName, float M) {
        this.processorName = processorName
        this.M= M;
    }
    

    public String getProcessorName() {
        return processorName;
    }


    public float getM() {
        return M;
    }


    public float changeM(float x){
        return x;
    }
    
}
