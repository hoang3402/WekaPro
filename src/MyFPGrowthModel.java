import weka.associations.FPGrowth;
import weka.core.Instances;

public class MyFPGrowthModel extends MyKnowledgeModel {
    Instances newDataset;
    FPGrowth fpgrowth;
    
    public MyFPGrowthModel(){}
    
    public MyFPGrowthModel(String filename, String model_options, String data_options) throws Exception{
        super(filename, model_options, data_options);
        this.fpgrowth = new FPGrowth();
    }
    
    public void mineAssociationRule() throws Exception {
        newDataset = convert2Binary(this.dataset);
        fpgrowth.setOptions(this.model_options);
        fpgrowth.buildAssociations(newDataset);
    }
    
    @Override
    public String toString(){
        return fpgrowth.toString();
    }
}
