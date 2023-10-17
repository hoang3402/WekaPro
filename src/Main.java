public class Main {
    public static void main(String[] args) throws Exception {
        // MyAprioriModel model = new MyAprioriModel(
        //         "D:\\Weka-3-8-6\\data\\weather.numeric.arff",
        //         "-N 10 -T 0 -C 0.9 -D 0.05 -U 1.0 -M 0.1 -S -1.0 -c -1",
        //         "-R 2-3"
        // );
        // model.mineAssociationRule();
        // System.out.println(model);
            
        // MyFPGrowthModel model = new MyFPGrowthModel(
        //         "D:\\Weka-3-8-6\\data\\weather.nominal.arff",
        //         "-P 2 -I -1 -N 10 -T 0 -C 0.7 -D 0.05 -U 1.0 -M 0.2",
        //         "-N -R first-last"
        // );
        // model.mineAssociationRule();
        // System.out.println(model);

        // MyDecisionTreeModel model = new MyDecisionTreeModel("D:\\Weka-3-8-6\\data\\iris.arff", "-C 0.25 -M 2",null);
        // model.buildDecisionTree();
        // model.CrossValidationDecisionTree(10);
        // System.out.println(model);

        MyKMeansModel model = new MyKMeansModel();
        model.buildKmeansModel("D:\\Weka-3-8-6\\data\\iris_train.arff");
        System.out.println(model);
    }
}