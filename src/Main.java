public class Main {
    public static void main(String[] args) throws Exception {
        MyAprioriModel model = new MyAprioriModel(
                "D:\\Weka-3-8-6\\data\\weather.numeric.arff",
                "-N 10 -T 0 -C 0.9 -D 0.05 -U 1.0 -M 0.1 -S -1.0 -c -1",
                "-R 2-3"
        );
        model.mineAssociationRule();
        System.out.println(model);
    }
}