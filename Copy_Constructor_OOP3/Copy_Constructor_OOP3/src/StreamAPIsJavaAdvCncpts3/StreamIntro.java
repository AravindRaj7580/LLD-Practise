package StreamAPIsJavaAdvCncpts3;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntro {
    public static void main(String[] args){
        //List<Integer> lst = List.of(11,2,3,45,5,6,76,8,72,9);
        List<Integer> lst1 = List.of(11,2,3,45,5,66,76,8,72,9);
        Stream<Integer> st1 = lst1.stream();
        System.out.println(st1.count());
        st1 = lst1.stream();
        long count = st1.filter((ele) -> ele % 2 == 0).count();
        List<Integer> lst2 = st1.filter((ele) -> ele % 2 == 0).collect(Collectors.toList());
//        st.close();
        System.out.println(count);
        System.out.println(lst2);
        st1.filter((ele) -> ele % 2 == 0).sorted().map((ele) -> ele * 10).collect(Collectors.toList());
        Optional<Integer> ans = st1.filter((ele) -> ele % 2 == 0).sorted().map((ele) -> ele * 10).findFirst();
        int ans1 = st1.reduce(0,(sum_so_far, ele) -> (sum_so_far + ele));
        if(ans.isPresent()){
            System.out.println(ans);
        }


    }



}
