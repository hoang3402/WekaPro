import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.ConverterUtils.DataSource;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.NumericToNominal;
import weka.filters.unsupervised.attribute.Remove;

import java.io.IOException;

import static weka.core.Utils.splitOptions;

public class MyKnowledgeModel {
    DataSource source;
    Instances dataset;
    String[] model_options;
    String[] data_options;
    
    public MyKnowledgeModel() {}
    
    public MyKnowledgeModel(String filename,
                            String model_options,
                            String data_options) throws Exception {
        this.source = new DataSource(filename);
        this.dataset = source.getDataSet();
        this.model_options = splitOptions(model_options);
        this.data_options = splitOptions(data_options);
    }
    
    public Instances removeData(Instances originalData) throws Exception {
        Remove remove = new Remove();
        remove.setOptions(data_options);
        remove.setInputFormat(originalData);
        return Filter.useFilter(originalData, remove);  
    }
    
    public void SaveData(String filename) throws IOException {
        ArffSaver saver = new ArffSaver();
        saver.setInstances(dataset);
    }
    
    public Instances convertData(Instances originalData) throws Exception {
        NumericToNominal n2n = new NumericToNominal();
        n2n.setOptions(data_options);
        n2n.setInputFormat(originalData);
        return Filter.useFilter(originalData, n2n);
    }
}
