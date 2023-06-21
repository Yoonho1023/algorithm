package org.fullSearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DivideElectricity {
    // int n -> 송전탑의 갯수
    // int[][] wires -> 전선 정보

    // 생각으로는 트리구조를 만들어야한다.
    //
    public int solution(int n, int[][] wires) {
        int size = wires.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int first = wires[i][0];
            int second = wires[i][1];
            list.add(second);
            map.put(first, list);

        }
        int answer = -1;
        return answer;
    }
}
