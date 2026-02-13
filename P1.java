import java.util.*;
interface I{
    void dup(List<Integer> list);
}
class P1{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
            Set<Integer> set = new HashSet<>();
        I obj = (l)->{
          for(Integer i : l){
            set.add(i);
          }
        };
        obj.dup(list);
        System.out.println(set);
        System.out.println("null");
    

        for(int i =1;i<=5 ; i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    System.out.println("To see Difference");
    }
}