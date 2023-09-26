public class Main {
    public static void main(String[] args) throws Exception {
//        MyAprioriModel model = new MyAprioriModel(
//                "D:\\Weka-3-8-6\\data\\weather.numeric.arff",
//                "-N 10 -T 0 -C 0.9 -D 0.05 -U 1.0 -M 0.1 -S -1.0 -c -1",
//                "-R 2-3"
//        );
//        model.mineAssociationRule();
//        System.out.println(model);
        
        MyFPGrowthModel model = new MyFPGrowthModel(
                "D:\\Weka-3-8-6\\data\\supermarket.arff",
                "-P 2 -I -1 -N 10 -T 0 -C 0.8 -D 0.05 -U 1.0 -M 0.2",
                "-R 1-9,11,57,70,79-81,88-89,98,100-102,107-114,116-120,122-130,137-179,189,192-199,201-216"
        );
        model.mineAssociationRule();
        System.out.println(model);
    }
}