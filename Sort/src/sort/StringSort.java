package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by mr.lin on 2018/4/9.
 * 字符排序 面试题：
 * we attach the world
 * 按字符频率排序，相同频率按字典排序
 */
public class StringSort {

    public String sort() {
        String input = "we attach the world";

        char[] chars = input.toCharArray();

        HashMap<String, CharModel> map = new HashMap<String, CharModel>();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                CharModel model = map.get(String.valueOf(chars[i])) == null ? new CharModel(chars[i]) : map.get(String.valueOf(chars[i]));

                model.count++;

                map.put(String.valueOf(chars[i]), model);
            }
        }

        ArrayList<CharModel> list = new ArrayList<CharModel>();
        for (String string : map.keySet()) {
            list.add(map.get(string));
        }

        Collections.sort(list);


        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            stringBuffer.append(list.get(i).toString()).append("      ");
        }

        return stringBuffer.toString();
    }


    class CharModel implements Comparable<CharModel> {

        int count;
        char c;

        public CharModel(char c) {
            this.c = c;
        }

        @Override
        public int compareTo(CharModel o) {
            return o.count - count == 0 ? c - o.c : o.count - count;
        }

        @Override
        public String toString() {
            return String.valueOf(c) + count;
        }
    }
}
