package shop.watchawiki.api.PreSubject.repository;

import shop.watchawiki.api.PreSubject.domain.PreSubjectVO;

import java.util.HashMap;

public class PreSubjectDao {

    public static HashMap<Integer, PreSubjectVO> preSubList = new HashMap<Integer, PreSubjectVO>();

    public static void PreSubjects() {
        preSubList.put(100, new PreSubjectVO(100, "java"));
        preSubList.put(200, new PreSubjectVO(200, "파이썬"));
        preSubList.put(300, new PreSubjectVO(300, "C언어"));
        preSubList.put(400, new PreSubjectVO(400, "C++"));
    }
}
