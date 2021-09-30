public class ProcessGenerator implements ProcessGeneratorInterface{

    public ProcessGenerator(double probability, long seed){

    }

    public ProcessGenerator(double probability){

    }

    @Override
    public Process getNewProcess(int currentTime, int maxProcessTime, int maxPriority) {
        Process newJob = new Process(currentTime);
        return newJob;
    }

    @Override
    public boolean query() {
        return false;
    }
}
