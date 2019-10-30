package life.majiang.community;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Administrator on 2019/9/18.
 */
public class TestShuangMaoHao {
    public static void main(String[] args) {
        List<String> al = Arrays.asList("a", "b", "c", "d");
//        al.forEach(TestShuangMaoHao::printValur);
        Consumer<String> comsumer = TestShuangMaoHao::printValur;
        al.forEach(x -> comsumer.accept(x));
    }

    public static void  printValur(String str){
        System.out.println("print value : "+str);
    }
}
