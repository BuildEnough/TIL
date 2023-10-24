import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ArrayListTest {
    public static void main(String[] args) {
        // 기본 길이(용량, capacity)가 10인 ArrayList 생성
        ArrayList list1 = new ArrayList(10);

        // ArrayList에는 객체만 저장가능한데 5도 되는 이유는
        // autoboxing에 의해 기본형이 참조형으로 자동변환되기 때문
        list1.add(5); // list1.add(new Integer(5));랑 같다
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        // list1에서 list를 새로 만든다, sublist는 읽기 전용이기 때문에 새로운 list를 만들어줘야한다
        ArrayList list2 = new ArrayList(list1.subList(1,4)); // 1 <= x < 4, 밑의 2줄과 동일
//    List sub = list1.subList(1, 4); // sub는 읽기만 가능 [4, 2, 0]
//    ArrayList list2 = new ArrayList(sub); // sub와 같은 내용의 ArrayList 생성
        print(list1, list2);

        // Collection은 인터페이스, Collections는 util클래스
        Collections.sort(list1);	// list1과 list2를 정렬한다.
        Collections.sort(list2);	// Collections.sort(List l)
        print(list1, list2);

        System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");
        print(list1, list2);

        list2.set(3, "AA");
        print(list1, list2);

        list1.add(0, "1"); // 0번쨰 자리의 1은 문자열 2번째 자리의 1은 숫자
        System.out.println(list1.indexOf("1")); // indexOf()는 지정된 객체의 위치(index)를 알려준다
        System.out.println();

        list1.remove(1); // index가 1인 객체를 삭제
        list1.remove(new Integer(1)); // 1을 삭제

        // list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
        System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));

        print(list1, list2);

        //  list2에서 list1에 포함된 객체들을 삭제한다.
        for(int i= list2.size()-1; i >= 0; i--) {
            if(list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1, list2);
    }

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1:"+list1);
        System.out.println("list2:"+list2);
        System.out.println();
    }
}