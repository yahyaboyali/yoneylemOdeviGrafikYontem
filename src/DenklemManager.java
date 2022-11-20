public class DenklemManager {
    private Denklem denklem;

    public DenklemManager(Denklem denklem) {
        this.denklem = denklem;
    }
    public Result calculate() {
        for(int i = 0 ; i*denklem.getA()<= denklem.getN() ; i++) {
            if((denklem.getN()-(i*denklem.getA()))% denklem.getB()==0) {
                return new SuccessResult(new ResultOfDenklem(i,(denklem.getN()-(i* denklem.getA()))/denklem.getB()),"başarılı");
            }
        }
        return new ErrorResult("no solution");
    }
}
