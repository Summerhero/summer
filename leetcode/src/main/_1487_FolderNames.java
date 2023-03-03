package main;

import java.util.HashMap;
import java.util.Map;

/**
 * @author summer
 * @create 2023-03-03 11:04
 * @Description
 */
public class _1487_FolderNames {

    public static void main(String[] args) {

        _1487_FolderNames folderNames = new _1487_FolderNames();
//        String[] names = {"pes","fifa","gta","pes(2019)"};
//        String[] results = folderNames.getFolderNames(names);
//        for (String name : results) {
//            System.out.println(name);
//        }
        String[] names2 = {"gta","gta(1)","gta","avalon"};
        String[] results2 = folderNames.getFolderNames(names2);
        for (String name : results2) {
            System.out.println(name);
        }
    }


    public String[] getFolderNames(String[] names){
        // 参数校验 略
        // 定义文件名称 MAP
        Map<String,Integer> map = new HashMap<>();
        // 遍历文件名数组
        for (int i = 0; i < names.length; i++) {
            int k = 0;
            if(map.get(names[i]) != null){
                k = map.get(names[i]) + 1;
                while (map.containsKey(names[i] + "(" + k + ")")) {
                    ++k;
                }
            }
            map.put(names[i],k);
            names[i] = k == 0 ? names[i] : names[i] + "(" + k +")";
        }

          return names;
    }

}
