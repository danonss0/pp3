public class Computer{
    private Processor processor;
    private String MACAdress;
    private String computerName;
    private boolean isOn;

    
    

    

    public Computer(){
        processor = new Processor("sdfa",3);
    }



    public void turnOn(){
        isOn=true;
    }
    public void setProcessor(Processor processor) {
        this.processor = processor;
    }



    public Processor getProcessor(){
        return processor;
    }


    @Override
    public String toString() {
        return "Computer name: "+processorName+" /nIs ON: "+M;
    }
    
    public static void main(String[] args) {
        Computer computer = new Computer();
        Processor processor = computer.getProcessor();
        System.out.println(processor.toString());
    }
}